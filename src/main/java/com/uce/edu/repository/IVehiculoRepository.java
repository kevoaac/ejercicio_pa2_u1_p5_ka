package com.uce.edu.repository;

import com.uce.edu.repository.model.Vehiculo;

public interface IVehiculoRepository {
    Vehiculo seleccionar(String placa);
    void eliminar(String placa);
    void insertar(Vehiculo vehiculo);
    void actualizar(Vehiculo vehiculo);
}
