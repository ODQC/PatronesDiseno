/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplocompuesto;

/**
 *
 * @author Dario
 */

//Nodo o clase Hija
public class DepartamentoFinanzas implements Departamento {

    private Integer id;
    private String nombre;

    public DepartamentoFinanzas() {
    }
    
   
    public DepartamentoFinanzas(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
    @Override
    public void imprimirDepartamento() {
        System.out.println(getClass().getSimpleName());
    }
    
}
