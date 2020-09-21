/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noticias;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dario
 */
public class AgenciaNoticias {
    private String noticia;
    private List<Canal> canales = new ArrayList();
    
    public void agregarObservador(Canal canal){
        this.canales.add(canal);
    }
    
    public void setNoticia(String noticia){
        this.noticia = noticia;
        for(Canal c: this.canales){
            c.actualizar(this.noticia);
        }
    }
    
    
}
