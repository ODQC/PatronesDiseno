/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.progra.una.modelo;

/**
 *
 * @author Dario
 */
public class ModeloConversor {
    private double tipoCambio;
    private double cantidad;
    private double resultado;

    public ModeloConversor() {
        this.cantidad = 0;
        this.tipoCambio = 0;
        this.resultado = 0;
    }

    public double getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(double tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    public double convertirColonesADolares(){
        resultado = cantidad/tipoCambio;
        return resultado;
    }
    
     public double convertirDolaresAColones(){
        resultado = cantidad*tipoCambio;
        return resultado;
    }
    
}
