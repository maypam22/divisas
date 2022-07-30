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
        //dolar a euro
        if(div == 0 && div1 == 0){
            resultado = moneda * 0.98;
        }
        //dolar a dolar
        else if(div == 0 && div1 == 1){
            resultado = moneda;
        }
        //dolar a peso mexicanos
        else if(div == 0 && div1 == 2){
            resultado = moneda * 20.46;
        }
        //dolar a pesos colombianos
        else if(div == 0 && div1 == 3){
            resultado = moneda * 4467.80;
        }
        //dolar a soles
        else if(div == 0 && div1 == 4){
            resultado = moneda * 3.92;
        }

        //euro a euro
        else if(div == 1 && div1 == 0){
            resultado = moneda;
        }
        //euro a dolar
        else if(div == 1 && div1 == 1){
            resultado = moneda * 1.02;
        }
        //euro a pesos mexicanos
        else if(div == 1 && div1 == 2){
            resultado = moneda * 20.91;
        }
        //euro a pesos colombianos
        else if(div == 1 && div1 == 3){
            resultado = moneda * 4567.66;
        }
        //euro a soles
        else if(div == 1 && div1 == 4){
            resultado = moneda * 4;
        }
        //peso mexicano a euro
        else if(div == 2 && div1 == 0){
            resultado = moneda * 0.048;
        }
        //peso mexicano a dolar
        else if(div == 2 && div1 == 1){
            resultado = moneda * 0.049;
        }
        //peso mexicano a peso mexicano
        else if(div == 2 && div1 == 2){
            resultado = moneda;
        }
        //

        return resultado;
    }
}
