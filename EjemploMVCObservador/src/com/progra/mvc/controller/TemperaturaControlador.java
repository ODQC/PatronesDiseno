/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.progra.mvc.controller;

import com.progra.mvc.modelo.TemperaturaModelo;
import com.progra.mvc.view.TemperaturaVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Dario
 */
public class TemperaturaControlador implements Observer, ActionListener {
    private TemperaturaModelo temperaturaModelo;
    private TemperaturaVista temperaturaVista;

    public TemperaturaControlador(TemperaturaModelo temperaturaModelo, TemperaturaVista temperaturaVista) {
        this.temperaturaModelo = temperaturaModelo;
        this.temperaturaVista = temperaturaVista;
        this.temperaturaModelo.addObserver(this);
        this.temperaturaVista.getjButton1().addActionListener(this);
        this.temperaturaVista.getjButton2().addActionListener(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        temperaturaVista.getjTextField1().setText(Double.toString(temperaturaModelo.getTemperatura()));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource().equals(temperaturaVista.getjButton1())){
           temperaturaModelo.setF(temperaturaModelo.getTemperatura() + 1.0);
       } else if (e.getSource().equals(temperaturaVista.getjButton2())){
           temperaturaModelo.setF(temperaturaModelo.getTemperatura() - 1.0);
       }
    }
    
    
    public void iniciarVista(){
        temperaturaVista.setTitle("Ejemplo MVC con observador de Java");
        temperaturaVista.setLocationRelativeTo(null);
        temperaturaVista.setDefaultCloseOperation(temperaturaVista.EXIT_ON_CLOSE);
    }
    
    
    
    
    
}
