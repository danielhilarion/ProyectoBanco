/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos.cdt;

import productos.CDT;

/**
 *
 * @author alejonba0498
 */
public class CdtPensionado extends CDT{
     public CdtPensionado() {
        
    }
    
    private CdtPensionado(CdtPensionado cdt) {
        super(cdt); 
    }

    @Override
    public CDT clone() {
        return new CdtPensionado(this);
    }
    
    
    
    
}