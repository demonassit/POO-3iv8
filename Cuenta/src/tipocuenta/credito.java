/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipocuenta;

/**
 *
 * @author demon
 */
public class credito extends tipoCuenta {
    
    private double limcredito;
    

    
    
    public credito(int num_tarjeta, int[] fechavencimiento, double saldo, int NIP, 
            int cod_seguridad, double limcredito) {
        super(num_tarjeta, fechavencimiento, saldo, NIP, cod_seguridad);
        this.limcredito = limcredito;
    }
    
    

    public double getLimcredito() {
        return limcredito;
    }

    public void setLimcredito(double limcredito) {
        this.limcredito = limcredito;
    }
    
    
    
}
