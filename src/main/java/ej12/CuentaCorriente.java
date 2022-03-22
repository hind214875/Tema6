package ej12;

/**
 *
 * @author hinda
 */
public class CuentaCorriente extends Cuenta {

    private double interes = 0.15;
    private double sladoMinimo;
    
    public CuentaCorriente(double sladoMinimo, Cliente cliente,double interes) {
        super(cliente);
        this.sladoMinimo = sladoMinimo;
        this.interes=interes;
    }
      
    
    public double getSladoMinimo() {
        return sladoMinimo;
    }
    
    public void setSladoMinimo(double sladoMinimo) {
        this.sladoMinimo = sladoMinimo;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
    
    
    @Override
    public String toString() {
        return super.toString()+
                "CuentaCorriente{" + "sladoMinimo=" + sladoMinimo + '}';
    }
    
    @Override
    public void actualizarSaldo() {
        if(getSaldo()>1000){
            this.setSaldo(getSaldo()+(sladoMinimo*interes));
        }else{
            this.setSaldo(getSaldo()+(this.getSaldo()+interes));
        }
        
    }
    
    @Override
    public void retirar(double s) {
        if(getSaldo()-s>sladoMinimo){
            setSaldo(getSaldo()-s);
        }
         
    }
    
}
