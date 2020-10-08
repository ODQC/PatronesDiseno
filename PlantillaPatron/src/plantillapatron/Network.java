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
public abstract class Network {
    String username;
    String password;
    
    abstract boolean logIn(String username, String password);
    abstract void logOut(String username, String password);
}
