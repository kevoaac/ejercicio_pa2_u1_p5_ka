package com.uce.edu.repository;

import com.uce.edu.repository.model.Vehiculo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository
{
    List<Vehiculo> base = new ArrayList<>();
    @Override
    public Vehiculo seleccionar(String placa) {

        for(Vehiculo vehiculo: base){
            if(vehiculo.getPlaca().equals(placa)){
                Vehiculo nuevoVehiculo = new Vehiculo();
                nuevoVehiculo.setMarca(vehiculo.getMarca());
                nuevoVehiculo.setPrecio(vehiculo.getPrecio());
                nuevoVehiculo.setPlaca(vehiculo.getPlaca());
                nuevoVehiculo.setTipo(vehiculo.getTipo());
                return nuevoVehiculo;
            }
        }
        return null;
    }

    public Vehiculo seleccionarEliminar(String placa) {
        for(Vehiculo vehiculo: base){
            if(vehiculo.getPlaca().equals(placa)){
                return vehiculo;
            }
        }
        return null;
    }

    @Override
    public void eliminar(String placa) {
        Vehiculo vehiculo = this.seleccionar(placa);
        this.base.remove(vehiculo);
    }

    @Override
    public void insertar(Vehiculo vehiculo) {
        this.base.add(vehiculo);
    }

    @Override
    public void actualizar(Vehiculo vehiculo) {
        Vehiculo vehic = this.seleccionarEliminar(vehiculo.getPlaca());
        this.base.remove(vehic);
        this.base.add(vehiculo);
    }
}
