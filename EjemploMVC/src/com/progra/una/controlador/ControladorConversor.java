/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.progra.una.controlador;

import com.progra.una.vista.VistaConversor;
import com.progra.una.modelo.ModeloConversor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Dario
 */
public class ControladorConversor implements ActionListener {

    private VistaConversor v;
    private ModeloConversor m;

    public ControladorConversor(VistaConversor v, ModeloConversor m) {
        this.v = v;
        this.m = m;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double cantidad = 0;
        //validar que no sea blanco
        if (!v.getTxtCantidad().getText().isEmpty()) {
            cantidad = Double.parseDouble(v.getTxtCantidad().getText());
            m.setCantidad(cantidad);
            m.setTipoCambio(580);
        }
        
        if(e.getSource().equals(v.getBtnADolares())){
            v.getResultado().setText(cantidad + " dolares a colones son: " + m.convertirColonesADolares() + " colones");
        }else if(e.getSource().equals(v.getBtnAColones())){
            v.getResultado().setText(cantidad + " colones a dolares son: " + m.convertirDolaresAColones()+ " dolares");
        }
    }

}
