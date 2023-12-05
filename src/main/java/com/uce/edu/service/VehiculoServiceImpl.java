package com.uce.edu.service;

import com.uce.edu.repository.IVehiculoRepository;
import com.uce.edu.repository.model.Vehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehiculoServiceImpl implements IVehiculoService{
    @Autowired
    private IVehiculoRepository iVehiculoRepository;
    @Override
    public Vehiculo buscar(String id) {
        return this.iVehiculoRepository.seleccionar(id);
    }

    @Override
    public void eliminar(String id) {
        this.iVehiculoRepository.eliminar(id);
    }

    @Override
    public void guardar(Vehiculo propietario) {
        this.iVehiculoRepository.insertar(propietario);
    }

    @Override
    public void actualizar(Vehiculo propietario) {
        this.iVehiculoRepository.actualizar(propietario);
    }
}
