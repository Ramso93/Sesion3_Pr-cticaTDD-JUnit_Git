/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ramso
 */
public class Cuenta {
    private double saldo;
    private String numCuenta;
    private String dniTitular;
    
    Cuenta(double saldo, String numCuenta, String dniTitular){
        this.saldo = saldo;
        this.numCuenta = numCuenta;
        this.dniTitular = dniTitular;
    }
    
    public void retirar(double cantidad)throws Exception{
        
        if(cantidad<=0){
            throw new Exception("No se puede retirar cantidades negativas");
        }else if(this.getSaldo()<cantidad){
            
        }else{
            this.saldo = this.saldo-cantidad;
        }
    }
    public void ingresar(double cantidad)throws Exception{
        
        if(cantidad<=0){
            throw new Exception("No se puede ingresar cantidades negativas");
        }else{
            this.saldo = this.saldo+cantidad;
        }
    }
    public double getSaldo(){
        return this.saldo;
    }
    public String getNumCuenta(){
        return this.numCuenta;
    }
    
}
