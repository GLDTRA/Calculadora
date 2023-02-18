package OutrasOperacoes;

import OperacoesBasicas.OperacaoBasica;

public class OutrasOperacoes extends OperacaoBasica implements IOutrasOperacoes{
    float num1, num2;

    public OutrasOperacoes(float num1, float num2){
        super(num1, num2);
    }

    public OutrasOperacoes(float num1){}

    public OutrasOperacoes(){}

    @Override
    public double exponenciacao(){
        return Math.pow(num1, num2);
    }

    @Override
    public double raiz(){
        return Math.sqrt(num1);
    }
    @Override
    public double porcentagem(){
        return Multiplicar()/100;
    }

    @Override
    public float getNum1() {
        return num1;
    }

    @Override
    public void setNum1(float num1) {
        this.num1 = num1;
    }


    @Override
    public float getNum2() {
        return num2;
    }

    @Override
    public void setNum2(float num2) {
        this.num2 = num2;
    }
}
