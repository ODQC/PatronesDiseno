/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantillapatron;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dario
 */
public class PlantillaPatron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese usuario: ");
            String userName = bufferedReader.readLine();
            System.out.println("Ingrese contrasena: ");
            String password = bufferedReader.readLine();
            
            Network network;
            System.out.println("Escoja la red social: 1. Facebook  2.Twitter");
            int eleccion = Integer.parseInt(bufferedReader.readLine());
            if(eleccion == 1){
                network = new Facebook();
                network.logIn(userName, password);
            }else{
                network = new Twitter();
                network.logIn(userName, password);
            }
            
        } catch (Exception ex) {
           ex.printStackTrace();
        }
    }
    
}
