package ej12;

/**
 *
 * @author hinda
 */
public class CuentaCorriente extends Cuenta {

    private static double INTERES = 0.15;
    private double sladoMinimo;
    
    public CuentaCorriente(double sladoMinimo, Cliente cliente) {
        super(cliente);
        this.sladoMinimo = sladoMinimo;
    }
      
    
    public double getSladoMinimo() {
        return sladoMinimo;
    }
    
    public void setSladoMinimo(double sladoMinimo) {
        this.sladoMinimo = sladoMinimo;
    }
    
    @Override
    public String toString() {
        return "CuentaCorriente{" + "sladoMinimo=" + sladoMinimo + '}';
    }
    
    @Override
    public void actualizarSaldo() {
        if(getSaldo()>1000){
            this.setSaldo(getSaldo()+(sladoMinimo*INTERES));
        }else{
            this.setSaldo(getSaldo()+(this.getSaldo()+INTERES));
        }
        
    }
    
    @Override
    public void retirar(double s) {
        if(getSaldo()-s>sladoMinimo){
            setSaldo(getSaldo()-s);
        }
         
    }
    
}
