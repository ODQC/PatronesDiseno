/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptadorpatron;

/**
 *
 * @author Dario
 */
public class AdaptadorPatron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TarjetaCredito tarjetaCredito = new ClienteBancario();
        tarjetaCredito.getDetalleDatosCliente();
        System.out.println(tarjetaCredito.getTarjetaCredito());
    }
    
}
