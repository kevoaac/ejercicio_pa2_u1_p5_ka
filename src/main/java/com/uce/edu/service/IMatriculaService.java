package com.uce.edu.service;

import com.uce.edu.repository.model.Matricula;
import com.uce.edu.repository.model.Propietario;
import com.uce.edu.repository.model.Vehiculo;

public interface IMatriculaService {
    Matricula buscar(String id);
    void eliminar(String id);
    void guardar(Matricula matricula);
    void actualizar(Matricula matricula);
    void generar(String cedula, String placa);
}
