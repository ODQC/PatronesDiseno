/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantillapatron;

/**
 *
 * @author Dario
 */
public class Facebook extends Network {

    @Override
    boolean logIn(String username, String password) {
        System.out.println("\n Chequeando credenciales");
        System.out.println("\n Bienvenido, " + username);
        System.out.println("Se logueo correctamente a Facebook");
        //verificar la contrasena
        simularLatencia();
        return Boolean.TRUE;      
    }

    @Override
    void logOut(String username, String password) {
        System.out.println("El usuario cerro sesion en Facebook");
    }
    
    private void simularLatencia(){
        try{
            int i = 0;
            System.out.println();
            while(i < 10){
                System.out.println(".");
                Thread.sleep(500);
                i++;
            }
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }
    
}
