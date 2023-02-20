package Moeda;

import OperacoesBasicas.OperacaoBasica;

import java.lang.Math;

public class ConversorDeMoeda extends OperacaoBasica {
    private float moeda;
    public ConversorDeMoeda(float moeda) {
        super();
        this.moeda = moeda;
    }
    public ConversorDeMoeda(){}

    public double ConverterDolar(){
        OperacaoBasica operacaoBasica = new OperacaoBasica(this.moeda, 5.16F);
        return operacaoBasica.Multiplicar();
    }
    public double ConverterEuro(){
       OperacaoBasica operacaoBasica = new OperacaoBasica(this.moeda, 5.57F);
       return operacaoBasica.Multiplicar();
    }
    public double ConverterReaisDolar(){
        OperacaoBasica operacaoBasica = new OperacaoBasica(this.moeda, 5.16F);
        return operacaoBasica.Dividir();

    }
    public double ConverterReaisEuro(){
        OperacaoBasica operacaoBasica = new OperacaoBasica(this.moeda, 5.57F);
        return operacaoBasica.Dividir();
    }

    public double getMoeda() {
        return moeda;
    }

    public void setMoeda(float moeda) {
        this.moeda = moeda;
    }
}
