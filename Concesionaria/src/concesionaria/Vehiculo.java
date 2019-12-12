/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionaria;

/**
 *
 * @author CltControl
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private double motor;
    private int almacenamiento;
    private String carroceria;

    public Vehiculo(String marca, String modelo, double motor, int almacenamiento, String carroceria) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.almacenamiento = almacenamiento;
        this.carroceria = carroceria;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getMotor() {
        return motor;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }
    
    
}
