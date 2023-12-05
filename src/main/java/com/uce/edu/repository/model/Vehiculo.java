package com.uce.edu.repository.model;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
@Component
public class Vehiculo {
    private String marca;
    private String placa;
    private TipoVehiculo tipo;
    private BigDecimal precio;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public TipoVehiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVehiculo tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", placa='" + placa + '\'' +
                ", tipo=" + tipo +
                ", precio=" + precio +
                '}';
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
}
