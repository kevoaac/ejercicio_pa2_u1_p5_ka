package com.uce.edu.repository.model;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
@Component
public class Matricula {
    private String id;
    private LocalDate fechaMatricula;
    private BigDecimal valor;
    private Propietario propietario;
    private Vehiculo vehiculo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(LocalDate fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Matricula{" +
                "id='" + id + '\'' +
                ", fechaMatricula=" + fechaMatricula +
                ", valor=" + valor +
                ", propietario=" + propietario +
                ", vehiculo=" + vehiculo +
                '}';
    }
}
