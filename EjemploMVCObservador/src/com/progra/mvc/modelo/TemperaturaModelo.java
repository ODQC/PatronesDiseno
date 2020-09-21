/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.progra.mvc.modelo;

import java.util.Observable;

/**
 *
 * @author Dario
 */
public class TemperaturaModelo extends Observable {
    private double temperatura;

    public TemperaturaModelo() {
        this.temperatura = 32.0;
    }
    
    public void setF(double tempF){
        temperatura = tempF;
        setChanged();
        notifyObservers();
    }
    
    public void setC(double tempC){
        //formula de celsius a farenheit
        temperatura = tempC * 9.0 / 5.0 + 32.0;
        setChanged();
        notifyObservers();
    }

    
    
    /**
     * @return the temperatura
     */
    public double getTemperatura() {
        return temperatura;
    }

    /**
     * @param temperatura the temperatura to set
     */
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
    
    
}
