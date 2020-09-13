package com.progra.una.vista;


import com.progra.una.controlador.ControladorConversor;
import com.progra.una.modelo.ModeloConversor;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dario
 */
public class VistaConversor extends JFrame{

    private JLabel aviso;
    private JTextField txtCantidad;
    private JButton btnAColones;
    private JButton btnADolares;
    private JLabel resultado;
    private JPanel jpanel;
    
    public VistaConversor() {
        super("Calculo de Tipo de cambio");
        setLocationRelativeTo(null);
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        ModeloConversor m = new ModeloConversor();
        ControladorConversor c = new ControladorConversor(this, m);
        
        aviso = new JLabel();
        
        txtCantidad = new JTextField(25);
        
        btnAColones = new JButton();
        
        btnADolares = new JButton();
        
        btnAColones.setText("De dolares a colones");
        
        
        btnAColones.addActionListener(c);
        
        btnADolares.addActionListener(c);
        
        btnADolares.setText("De colones a dolares");
        
        resultado = new JLabel();
        
        resultado.setText("       ");
        
        resultado.setToolTipText("Aqui se despliega el resultado");
        
        aviso.setFont(new Font("Tahoma", 0, 18));
        
        aviso.setText("Resultado");
        
        jpanel = new JPanel(new FlowLayout());
        
        jpanel.add(aviso);
        jpanel.add(txtCantidad);
        jpanel.add(btnAColones);
        jpanel.add(btnADolares);
        jpanel.add(resultado);
        
        getContentPane().add(jpanel);
        
        setVisible(true);
    }
    
    
     /**
     * @return the aviso
     */
    public JLabel getAviso() {
        return aviso;
    }

    /**
     * @param aviso the aviso to set
     */
    public void setAviso(JLabel aviso) {
        this.aviso = aviso;
    }

    /**
     * @return the txtCantidad
     */
    public JTextField getTxtCantidad() {
        return txtCantidad;
    }

    /**
     * @param txtCantidad the txtCantidad to set
     */
    public void setTxtCantidad(JTextField txtCantidad) {
        this.txtCantidad = txtCantidad;
    }

    /**
     * @return the btnAColones
     */
    public JButton getBtnAColones() {
        return btnAColones;
    }

    /**
     * @param btnAColones the btnAColones to set
     */
    public void setBtnAColones(JButton btnAColones) {
        this.btnAColones = btnAColones;
    }

    /**
     * @return the btnADolares
     */
    public JButton getBtnADolares() {
        return btnADolares;
    }

    /**
     * @param btnADolares the btnADolares to set
     */
    public void setBtnADolares(JButton btnADolares) {
        this.btnADolares = btnADolares;
    }

    /**
     * @return the resultado
     */
    public JLabel getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(JLabel resultado) {
        this.resultado = resultado;
    }
    
}
