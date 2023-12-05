package com.uce.edu.service;


import com.uce.edu.repository.IPropietarioRepository;
import com.uce.edu.repository.model.Propietario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropietarioServiceImpl implements IPropietarioService {
    @Autowired
    private IPropietarioRepository iPropietarioRepository;
    @Override
    public Propietario buscar(String cedula) {
        return this.iPropietarioRepository.seleccionar(cedula);
    }

    @Override
    public void eliminar(String cedula) {
        this.iPropietarioRepository.eliminar(cedula);
    }

    @Override
    public void guardar(Propietario propietario) {
        this.iPropietarioRepository.insertar(propietario);
    }

    @Override
    public void actualizar(Propietario propietario) {
        this.iPropietarioRepository.actualizar(propietario);
    }
}
