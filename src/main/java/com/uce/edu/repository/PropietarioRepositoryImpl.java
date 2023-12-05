package com.uce.edu.repository;

import com.uce.edu.repository.model.Propietario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository{
    List<Propietario> base = new ArrayList<>();
    @Override
    public Propietario seleccionar(String cedula) {

        for(Propietario propietario: base){
            if(propietario.getCedula().equals(cedula)){
                Propietario nuevoPropietario = new Propietario();
                nuevoPropietario.setNombre(propietario.getNombre());
                nuevoPropietario.setApellido(propietario.getApellido());
                nuevoPropietario.setGenero(propietario.getGenero());
                nuevoPropietario.setCedula(propietario.getCedula());
                return nuevoPropietario;
            }
        }
        return null;
    }

    public Propietario seleccionarEliminar(String cedula) {
        for(Propietario propietario: base){
            if(propietario.getCedula().equals(cedula)){
                return propietario;
            }
        }
        return null;
    }

    @Override
    public void eliminar(String cedula) {
        Propietario propietario = this.seleccionar(cedula);
        this.base.remove(propietario);
    }

    @Override
    public void insertar(Propietario propietario) {
        this.base.add(propietario);
    }

    @Override
    public void actualizar(Propietario propietario) {
        Propietario prop = this.seleccionarEliminar(propietario.getCedula());
        this.base.remove(prop);
        this.base.add(propietario);
    }
}
