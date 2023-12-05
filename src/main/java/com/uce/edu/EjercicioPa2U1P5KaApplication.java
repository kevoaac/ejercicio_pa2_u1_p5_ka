package com.uce.edu;

import com.uce.edu.repository.model.Matricula;
import com.uce.edu.repository.model.Propietario;
import com.uce.edu.repository.model.TipoVehiculo;
import com.uce.edu.repository.model.Vehiculo;
import com.uce.edu.service.IMatriculaService;
import com.uce.edu.service.IPropietarioService;
import com.uce.edu.service.IVehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootApplication
public class EjercicioPa2U1P5KaApplication implements CommandLineRunner {
	@Autowired
	private IPropietarioService iPropietarioService;
	@Autowired
	private IVehiculoService iVehiculoService;
	@Autowired
	private IMatriculaService iMatriculaService;
	public static void main(String[] args) {
		SpringApplication.run(EjercicioPa2U1P5KaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Vehiculo v1 = new Vehiculo();
		v1.setMarca("Toyota");
		v1.setPlaca("PA01");
		v1.setTipo(TipoVehiculo.LIVIANO);
		v1.setPrecio(new BigDecimal(10000));

		Propietario p1 = new Propietario();
		p1.setNombre("Luis");
		p1.setApellido("Pinchao");
		p1.setGenero("Masculino");
		p1.setCedula("123456");

		this.iPropietarioService.guardar(p1);
		this.iVehiculoService.guardar(v1);

		System.out.println(">>Propietario insertado");
		Propietario propietario = this.iPropietarioService.buscar("123456");
		System.out.println(propietario);

		System.out.println(">>Propietario Actualizado");
		Propietario pAux = new Propietario();
		pAux.setNombre("Fernando");
		pAux.setApellido("Pinchao");
		pAux.setCedula("123456");
		pAux.setGenero("Indefinido");
		this.iPropietarioService.actualizar(pAux);

		System.out.println(this.iPropietarioService.buscar("123456"));

		System.out.println("Creando matricula...");
		Matricula matricula = new Matricula();
		matricula.setFechaMatricula(LocalDate.now());
		matricula.setPropietario(p1);
		matricula.setVehiculo(v1);
		matricula.setId("999");
		//this.iMatriculaService.generar("123456", "PA01");

		System.out.println("Buscando matricula");
		System.out.println(this.iMatriculaService.buscar("999"));


	}
}
