package com.uce.edu.service;

import com.uce.edu.repository.model.Vehiculo;

public interface IVehiculoService {
    Vehiculo buscar(String placa);
    void eliminar(String placa);
    void guardar(Vehiculo vehiculo);
    void actualizar(Vehiculo vehiculo);

}
