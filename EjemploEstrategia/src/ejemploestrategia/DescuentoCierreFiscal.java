/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploestrategia;

import java.math.BigDecimal;

/**
 *
 * @author Dario
 */
public class DescuentoCierreFiscal implements Descuentos{

    @Override
    public BigDecimal aplicarDescuento(BigDecimal monto) {
        return monto.multiply(BigDecimal.valueOf(0.5));
    }

    
    
}
