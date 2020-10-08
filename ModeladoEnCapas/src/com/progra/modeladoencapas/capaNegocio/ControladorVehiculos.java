/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.progra.modeladoencapas.capaNegocio;

import com.progra.modeladoencapas.capaAccesoDatos.DbVehiculos;
import com.progra.modeladoencapas.capaentidades.Vehiculo;
import com.progra.modeladoencapas.capapresentacion.FrmVehiculos;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dario
 */
public class ControladorVehiculos {

    private FrmVehiculos frm;
    private DbVehiculos dbVehiculos;

    public ControladorVehiculos(FrmVehiculos frm) {
        this.frm = frm;
        dbVehiculos = new DbVehiculos();
        this.frm.getBtnRegistrar().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        this.frm.getBtnLeer().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeerActionPerformed(evt);
            }
        });
        
         this.frm.getBtnLimpiar().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
    }

    public void registrar(Vehiculo vehiculo, JTable jtable) {
        try {
            
            jtable.setModel(dbVehiculos.registrar(vehiculo, jtable));
        } catch (Exception e) {

        }
    }

    public List<Vehiculo> actualizarTabla(JTable tabla) {
        List<Vehiculo> listaVehiculos = new ArrayList<>();
        try {
            listaVehiculos = dbVehiculos.leerTodo(tabla);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return listaVehiculos;
        }
    }

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        Vehiculo v = new Vehiculo();
        v.setMarca(frm.getTxtMarca().getText());
        v.setModel(frm.getTxtModelo().getText());
        v.setColor(frm.getTxtColor().getText());

        this.registrar(v, frm.getjTable1());

    }

    private void btnLeerActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        List<Vehiculo> listaVehiculos = this.actualizarTabla(this.frm.getjTable1());

        DefaultTableModel tabla = new DefaultTableModel();

        tabla.addColumn("Marca");

        tabla.addColumn("Modelo");

        tabla.addColumn("Color");

        for (Vehiculo v : listaVehiculos) {

            Object[] registro = {
                v.getMarca(),
                v.getModel(),
                v.getColor()
            };
        
            tabla.addRow(registro);
        }
        
        this.frm.getjTable1().setModel(tabla);
        
      

    }
    
     private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        
        DefaultTableModel defaultTableModel = (DefaultTableModel) this.frm.getjTable1().getModel();
        
      /*  for(int i=0; i<=defaultTableModel.getRowCount()-1; i++){
            defaultTableModel.removeRow(i);
        }*/
      
      defaultTableModel.setRowCount(0);
        
    }   

}
