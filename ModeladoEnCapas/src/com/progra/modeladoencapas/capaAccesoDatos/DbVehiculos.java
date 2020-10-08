/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.progra.modeladoencapas.capaAccesoDatos;

import com.progra.modeladoencapas.capaentidades.Vehiculo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dario
 */
public class DbVehiculos {

    private List<Vehiculo> listaVehiculos = new ArrayList<>();

    public DefaultTableModel registrar(Vehiculo v, JTable jtable) {
        DefaultTableModel modeloTabla = (DefaultTableModel) jtable.getModel();

        Object[] datosRegistro = {
            v.getMarca(),
            v.getModel(),
            v.getColor()
        };

        modeloTabla.addRow(datosRegistro);
        return modeloTabla;
    }

    public List<Vehiculo> leerTodo(JTable jtable) {

        for (int i = 0; i < jtable.getRowCount(); i++) {
            Vehiculo v = new Vehiculo();
            v.setMarca(jtable.getValueAt(i, 0).toString());
            v.setModel(jtable.getValueAt(i, 1).toString());
            v.setColor(jtable.getValueAt(i, 2).toString());

            listaVehiculos.add(v);
        }

        return listaVehiculos;
    }
}
