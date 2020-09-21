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
public class NoticiaCanal implements Canal {
    private String noticia;

    @Override
    public void actualizar(Object noticia) {
        this.setNoticia((String) noticia);
    }

    private void setNoticia(String noticia) {
        this.noticia = noticia;
    }

    /**
     * @return the noticia
     */
    public String getNoticia() {
        return noticia;
    }
    
    
}
