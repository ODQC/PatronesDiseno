/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noticias;

/**
 *
 * @author Dario
 */
public class Noticias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AgenciaNoticias observable = new AgenciaNoticias();
        NoticiaCanal observer = new NoticiaCanal();
        observable.agregarObservador(observer);
        observable.setNoticia("Nueva noticia");
        observable.setNoticia("Nueva noticia 2");
        System.out.println(observer.getNoticia());
    }
    
}
