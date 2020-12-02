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
public class debito extends tipoCuenta {
    
    public debito(int num_tarjeta, int[] fechavencimiento, double saldo, int NIP, int cod_seguridad) {
        super(num_tarjeta, fechavencimiento, saldo, NIP, cod_seguridad);
    }
    
}
