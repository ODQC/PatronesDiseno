/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptadorpatron;

/**
 *
 * @author Dario
 */
public class DetalleDatosCliente {
    private String nombreBanco;
    private String nombreCuentaAfiliado;
    private long numeroCuenta;

    /**
     * @return the nombreBanco
     */
    public String getNombreBanco() {
        return nombreBanco;
    }

    /**
     * @param nombreBacdo the nombreBanco to set
     */
    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    /**
     * @return the nombreCuentaAfiliado
     */
    public String getNombreCuentaAfiliado() {
        return nombreCuentaAfiliado;
    }

    /**
     * @param nombreCuentaAfiliado the nombreCuentaAfiliado to set
     */
    public void setNombreCuentaAfiliado(String nombreCuentaAfiliado) {
        this.nombreCuentaAfiliado = nombreCuentaAfiliado;
    }

    /**
     * @return the numeroCuenta
     */
    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * @param numeroCuenta the numeroCuenta to set
     */
    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
}
