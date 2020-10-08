/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptadorpatron;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Dario
 */
public class ClienteBancario extends DetalleDatosCliente implements TarjetaCredito{

    @Override
    public void getDetalleDatosCliente() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Digite el nombre del cliente de la cuenta: ");
            String cuentaAfiliado = br.readLine();
            System.out.println("\n");
            
            System.out.println("Digite la cuenta bancaria: ");
            long numeroCuenta = Long.parseLong(br.readLine());
            System.out.println("\n");
            
            System.out.println("Digite el nombre del banco: ");
            String nombreBanco = br.readLine();
            System.out.println("\n");
            
            setNombreBanco(nombreBanco);
            setNombreCuentaAfiliado(cuentaAfiliado);
            setNumeroCuenta(numeroCuenta);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public String getTarjetaCredito() {
        return ("El numero de cuenta de " + getNumeroCuenta() + " de " + getNombreCuentaAfiliado() + " en " 
                + getNombreBanco() + " es valido y esta autenticando para el uso de tarjeta de credito" );
    }
    
}
