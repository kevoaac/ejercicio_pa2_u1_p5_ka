package com.uce.edu.repository;

import com.uce.edu.repository.model.Matricula;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository{
    List<Matricula> base = new ArrayList<>();
    @Override
    public Matricula seleccionar(String id) {

        for(Matricula matricula: base){
            if(matricula.getId().equals(id)){
                Matricula nuevaMatricula = new Matricula();
                nuevaMatricula.setId(matricula.getId());
                nuevaMatricula.setFechaMatricula(matricula.getFechaMatricula());
                nuevaMatricula.setValor(matricula.getValor());
                nuevaMatricula.setPropietario(matricula.getPropietario());
                nuevaMatricula.setVehiculo(matricula.getVehiculo());
                return nuevaMatricula;
            }
        }
        return null;
    }

    public Matricula seleccionarEliminar(String id) {
        for(Matricula matricula: base){
            if(matricula.getId().equals(id)){
                return matricula;
            }
        }
        return null;
    }

    @Override
    public void eliminar(String id) {
        Matricula matricula = this.seleccionar(id);
        this.base.remove(matricula);
    }

    @Override
    public void insertar(Matricula matricula) {
        this.base.add(matricula);
    }

    @Override
    public void actualizar(Matricula matricula) {
        Matricula mat = this.seleccionarEliminar(matricula.getId());
        this.base.remove(mat);
        this.base.add(matricula);
    }
}
