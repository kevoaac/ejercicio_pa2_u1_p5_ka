package com.uce.edu.repository;

import com.uce.edu.repository.model.Propietario;

public interface IPropietarioRepository {
    Propietario seleccionar(String cedula);
    void eliminar(String cedula);
    void insertar(Propietario propietario);
    void actualizar(Propietario propietario);
}
