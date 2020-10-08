/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.progra.modeladoencapas.capaentidades;

/**
 *
 * @author Dario
 */
public class Vehiculo {
    private String marca;
    
    private String model;
    
    private String color;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String model, String color) {
        this.marca = marca;
        this.model = model;
        this.color = color;
    }
    
    

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
}
