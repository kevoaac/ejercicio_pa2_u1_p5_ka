package com.uce.edu.repository;

import com.uce.edu.repository.model.Matricula;

public interface IMatriculaRepository {
    Matricula seleccionar(String id);
    void eliminar(String id);
    void insertar(Matricula matricula);
    void actualizar(Matricula matricula);
}
