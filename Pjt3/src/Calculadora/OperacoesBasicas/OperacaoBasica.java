package OperacoesBasicas;

import OperacoesBasicas.IoperacaoBasica;

public class OperacaoBasica implements IoperacaoBasica {

    private float num1, num2;
    @Override
    public float Soma(){
       return this.num1 + this.num2;

    }
    @Override
    public float Diminuir(){
        return this.num1 - this.num2;
    }
    @Override
    public float Multiplicar(){
        return this.num1 * this.num2;
    }
    @Override
    public float Dividir(){
        return this.num1 / this.num2;
    }

    public OperacaoBasica(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public OperacaoBasica(){}

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }


}
