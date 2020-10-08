/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamate;

import com.progra.utilitario.mate.MateUtils;
import com.progra.utilitario.unique.UniqueId;

/**
 *
 * @author Dario
 */
public class Programamate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("La raiz cuadrada de 25 es: " + MateUtils.raizCuadrada(25.0));
        
        System.out.println("Dos elevado a la 5 es : " + MateUtils.potencia(2.0, 5.0));
        
        System.out.println("Genera un id unico: " + UniqueId.generateUniqueId());
    }
    
}
