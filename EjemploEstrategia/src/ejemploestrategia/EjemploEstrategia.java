/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploestrategia;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dario
 */
public class EjemploEstrategia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Descuentos descuentoCierreFiscal = new DescuentoCierreFiscal();
        BigDecimal descuentoAplicado = descuentoCierreFiscal.aplicarDescuento(BigDecimal.valueOf(100000));
        System.out.println("Descuento cierre fiscal:" + descuentoAplicado);

        Descuentos descuentoNavidad = new DescuentoNavidad();
        BigDecimal descuentoAplicado2 = descuentoNavidad.aplicarDescuento(BigDecimal.valueOf(100000));
        System.out.println("Descuento navidad:" + descuentoAplicado2);

        //Usando lambdas
        
        List<DescuentoLambda> descuentos = new ArrayList<>();
        descuentos.add(amount -> amount.multiply(BigDecimal.valueOf(0.9)));
        descuentos.add(amount -> amount.multiply(BigDecimal.valueOf(0.8)));
        descuentos.add(amount -> amount.multiply(BigDecimal.valueOf(0.5)));

        DescuentoLambda descuentoCombinado = descuentos
                .stream()
                .reduce(v -> v, DescuentoLambda::combine);

        System.out.println(descuentoCombinado.apply(BigDecimal.valueOf(100000)));

    }

}
