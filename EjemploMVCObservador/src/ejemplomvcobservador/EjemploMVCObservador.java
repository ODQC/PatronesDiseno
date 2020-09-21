/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomvcobservador;

import com.progra.mvc.controller.TemperaturaControlador;
import com.progra.mvc.modelo.TemperaturaModelo;
import com.progra.mvc.view.TemperaturaVista;

/**
 *
 * @author Dario
 */
public class EjemploMVCObservador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TemperaturaModelo temperaturaModelo = new TemperaturaModelo();
        TemperaturaVista temperaturaVista = new TemperaturaVista();
        TemperaturaControlador temperaturaControlador = new TemperaturaControlador(temperaturaModelo, temperaturaVista);
        temperaturaControlador.iniciarVista();
        temperaturaVista.setVisible(true);
    }
    
}
