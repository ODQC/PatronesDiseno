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
public class EjemploCompuesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DepartamentoFinanzas finanzas = new DepartamentoFinanzas(1, "Finanzas");
        DepartamentoVentas ventas = new DepartamentoVentas(2, "Ventas");
        
        DepartamentoJefatura departamentoJefatura = new DepartamentoJefatura(3, "Gerencia");
        
        
        departamentoJefatura.agregarDepartamento(finanzas);
        departamentoJefatura.agregarDepartamento(ventas);
        
        departamentoJefatura.imprimirDepartamento();
        
    }
    
}
