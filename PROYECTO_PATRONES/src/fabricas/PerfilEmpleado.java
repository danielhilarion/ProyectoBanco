
package fabricas;

import productos.CDT;
import productos.CreditoRotativo;
import productos.CuentaAhorro;
import productos.CuentaCorriente;
import productos.TarjetaCredito;
import productos.TarjetaDebito;


public class PerfilEmpleado implements IBanco {
   
    public CuentaAhorro crearCuentaAhorros(){
        
         return new CuentaAhorro();
     }
    public CuentaCorriente crearCuentaCorriente(){
        
        return new CuentaCorriente();
    }
    public TarjetaCredito crearTarjetaCredito(){
        return new TarjetaCredito();
        
    }
    public TarjetaDebito crearTarjetaDebito(){
        
        return new TarjetaDebito();
    }
    public CDT crearCDT(){
       return new CDT(); 
    }
    public CreditoRotativo crearRotativo(){
      return new CreditoRotativo();  
    }
    
    
    
    
}
