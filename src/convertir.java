import java.awt.*;

public class convertir {

    private  double moneda;
    private double resultado;
    private int div;
    private int div1;

    public convertir() {
    }

    public double getMoneda() {
        return moneda;
    }

    public void setMoneda(double moneda) {
        this.moneda = moneda;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public int getDiv() {
        return div;
    }

    public void setDiv(int div) {
        this.div = div;
    }

    public int getDiv1() {
        return div1;
    }

    public void setDiv1(int div1) {
        this.div1 = div1;
    }

    public double conversor(){
        if(div == 0 && div1 == 0){
            resultado = moneda * 0.98;
        }
        else if(div == 0 && div1 == 1){
            resultado = moneda;
        }
        else if(div == 0 && div1 == 2){
            resultado = moneda * 20.46;
        }
        else if(div == 0 && div1 == 3){
            resultado = moneda * 4467.80;
        }
        else if(div == 0 && div1 == 4){
            resultado = moneda * 3.92;
        }

        return resultado;
    }
}
