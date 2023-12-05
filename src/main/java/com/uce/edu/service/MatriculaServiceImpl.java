package com.uce.edu.service;

import com.uce.edu.repository.IMatriculaRepository;
import com.uce.edu.repository.IPropietarioRepository;
import com.uce.edu.repository.IVehiculoRepository;
import com.uce.edu.repository.model.Matricula;
import com.uce.edu.repository.model.Propietario;
import com.uce.edu.repository.model.TipoVehiculo;
import com.uce.edu.repository.model.Vehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
@Service
public class MatriculaServiceImpl implements IMatriculaService {
    @Autowired
    private IMatriculaRepository iMatriculaRepository;
    @Autowired
    private IPropietarioRepository iPropietarioRepository;
    @Autowired
    private IVehiculoRepository iVehiculoRepository;

    @Override
    public Matricula buscar(String id) {
        return this.iMatriculaRepository.seleccionar(id);
    }

    @Override
    public void eliminar(String id) {
        this.iMatriculaRepository.eliminar(id);
    }

    @Override
    public void guardar(Matricula propietario) {
        this.iMatriculaRepository.insertar(propietario);
    }

    @Override
    public void actualizar(Matricula propietario) {
        this.iMatriculaRepository.actualizar(propietario);
    }

    @Override
    public void generar(String cedula, String placa) {
        Propietario propietario = this.iPropietarioRepository.seleccionar(cedula);
        Vehiculo vehiculo = this.iVehiculoRepository.seleccionar(placa);

        BigDecimal valorMatricula = calcularValor(vehiculo);
//        if(valorMatricula.compareTo(new BigDecimal("'2200")) >=0 ){
//            valorMatricula = calcularDescuento(valorMatricula);
//        }

        Matricula matricula = new Matricula();
        matricula.setVehiculo(vehiculo);
        matricula.setPropietario(propietario);
        matricula.setFechaMatricula(LocalDate.now());
        matricula.setValor(valorMatricula);

        this.iMatriculaRepository.insertar(matricula);

    }

    private BigDecimal calcularValor(Vehiculo vehiculo) {
        if (vehiculo.getTipo().toString().equals("PESADO")) {
            BigDecimal valorMatricula = vehiculo.getPrecio().multiply(new BigDecimal("0.25"));
            return vehiculo.getPrecio().add(valorMatricula);
        }
        if (vehiculo.getTipo().equals(TipoVehiculo.LIVIANO)) {
            BigDecimal valorMatricula = vehiculo.getPrecio().multiply(new BigDecimal("0.20"));
            return vehiculo.getPrecio().add(valorMatricula);
        }
        return null;
    }

    private BigDecimal calcularDescuento(BigDecimal valor) {
        if (valor.compareTo(new BigDecimal("2200")) >= 1) {
            BigDecimal valorMatricula = valor.multiply(new BigDecimal("0.95"));
            return valorMatricula;
        }
        return null;
    }
}
