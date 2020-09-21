/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplocompuesto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dario
 */
//compuesta
public class DepartamentoJefatura implements Departamento {

    private Integer id;
    private String nombre;
    
    private List<Departamento> departamentosHijos;

    public DepartamentoJefatura() {
    }

    public DepartamentoJefatura(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.departamentosHijos = new ArrayList<>();
    }
    
    
    public void agregarDepartamento(Departamento d){
        this.departamentosHijos.add(d);
    }
   
      public void removerDepartamento(Departamento d){
        this.departamentosHijos.remove(d);
    }
   
    

    @Override
    public void imprimirDepartamento() {
        departamentosHijos.forEach(Departamento::imprimirDepartamento);
    }

}
