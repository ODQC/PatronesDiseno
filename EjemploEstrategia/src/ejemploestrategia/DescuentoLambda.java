/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploestrategia;


/**
 *
 * @author Dario
 */
import java.math.BigDecimal;
import java.util.function.UnaryOperator;

public interface DescuentoLambda extends UnaryOperator<BigDecimal> {

    default DescuentoLambda combine(DescuentoLambda after) {
        return value -> after.apply(this.apply(value));
    }

    static DescuentoLambda navidad() {
        return (monto) -> monto.multiply(BigDecimal.valueOf(0.9));
    }

    static DescuentoLambda annoNuevo() {
        return (monto) -> monto.multiply(BigDecimal.valueOf(0.8));
    }

    static DescuentoLambda fiscal() {
        return (monto) -> monto.multiply(BigDecimal.valueOf(0.5));
    }
}
