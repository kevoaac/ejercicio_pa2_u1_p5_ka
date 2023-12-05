package com.uce.edu.service;

import com.uce.edu.repository.model.Propietario;

public interface IPropietarioService {
    Propietario buscar(String cedula);
    void eliminar(String cedula);
    void guardar(Propietario propietario);
    void actualizar(Propietario propietario);
}
