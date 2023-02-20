import Area.CalcularArea;
import Datas.CalculadoraDatas;
import Moeda.ConversorDeMoeda;
import OperacoesBasicas.OperacaoBasica;
import OutrasOperacoes.OutrasOperacoes;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    final Scanner ler = new Scanner(System.in);
    private void MetodoOperacaoBasica(int num){
        try {
            OperacaoBasica opBas = new OperacaoBasica();
            System.out.println("Digite um 1o numero:");
            opBas.setNum1(ler.nextFloat());
            System.out.println("Digite um 2o numero:");
            opBas.setNum2(ler.nextFloat());
            if (num == 1) {
                opBas.Soma();
                System.out.println("Número " + opBas.getNum1() + " + " + opBas.getNum2() + " = " + opBas.Soma() + "\n");
            } else if (num == 2) {
                System.out.println("Número " + opBas.getNum1() + " - " + opBas.getNum2() + " = " + opBas.Diminuir() + "\n");
            } else if (num == 3) {
                System.out.println("Número " + opBas.getNum1() + " x " + opBas.getNum2() + " = " + opBas.Multiplicar() + "\n");
            } else if (num == 4) {
                System.out.println("Número " + opBas.getNum1() + " + " + opBas.getNum2() + " = " + opBas.Dividir() + "\n");
            } else
                System.out.println("Número inválido");
        }catch(InputMismatchException e){
            System.err.println("\nExceção: " + e);
            System.out.println("Tipagem inesperada, favor digitar um número inteiro!.");
            System.out.println("Tente novamente!");
        }
    }

    private void MetodoOutrasOperacaoes(int num){
        try{
            OutrasOperacoes outrasOperacoes = new OutrasOperacoes();
            if (num == 1) {
                System.out.println("Digite um 1o numero para a exponenciação:");
                outrasOperacoes.setNum1(ler.nextFloat());
                System.out.println("Digite um 2o numero:");
                outrasOperacoes.setNum2(ler.nextFloat());
                System.out.println("Exponenciação: " + outrasOperacoes.exponenciacao() + "\n");
            } else if (num == 2) {
                System.out.println("Digite um 1 numero para a raiz:");
                outrasOperacoes.setNum1(ler.nextFloat());
                System.out.println("Raiz quadrada: " + outrasOperacoes.raiz() + "\n");
            } else if (num == 3) {
                System.out.println("Digite o valor:");
                float value = ler.nextFloat();
                System.out.println("Digite o valor da porcentagem:");
                float value1 = ler.nextFloat();
                OutrasOperacoes outrasOperacoes1 = new OutrasOperacoes(value, value1);
                System.out.printf("Porcentagem: %.2f\n", outrasOperacoes1.porcentagem());
            } else System.out.println("Valor inválido!");
        }catch(InputMismatchException e){
            System.err.println("\nExceção: " + e);
            System.out.println("Tipagem inesperada, favor digitar um número inteiro!.");
            System.out.println("Tente novamente!");
        }
    }

    private void MetodoConversorMoeda(int num){
        try{
            ConversorDeMoeda conversorDeMoeda = new ConversorDeMoeda();
            if(num == 1){
                System.out.println("Digite quantidade de Reais:");
                conversorDeMoeda.setMoeda(ler.nextFloat());
                System.out.printf("Dólar: %.2f\n" ,conversorDeMoeda.ConverterReaisDolar());
            }
            else if(num == 2){
                System.out.println("Digite quantidade de Dólar:");
                conversorDeMoeda.setMoeda(ler.nextFloat());
                System.out.printf("Real: %.2f\n" ,conversorDeMoeda.ConverterDolar());
            }
            else if(num == 3){
                System.out.println("Digite quantidade de Reais:");
                conversorDeMoeda.setMoeda(ler.nextFloat());
                System.out.printf("Euro: %.2f\n" ,conversorDeMoeda.ConverterReaisEuro());
            }
            else if(num == 4){
                System.out.println("Digite quantidade de Euro:");
                conversorDeMoeda.setMoeda(ler.nextFloat());
                System.out.printf("Real: %.2f\n" ,conversorDeMoeda.ConverterEuro());
            }
            else System.out.println("Valor inválido!");
        }catch(InputMismatchException e){
            System.err.println("\nExceção: " + e);
            System.out.println("Tipagem inesperada, favor digitar um número inteiro!.");
            System.out.println("Tente novamente!");
        }
    }
    public static void main(String[] args) throws ParseException {
        float num1, num2, resultado=0;
        Calculadora t = new Calculadora();
        ArrayList<Integer> opcao = new ArrayList<>();
        boolean loop = true;
        opcao.add(0,0);
        Scanner ler = new Scanner(System.in);
        System.out.println("\n**   Bem vindo!!   **\n\n**   A calculadora! :D  **\n\n");
        do{
            try{
                if(opcao.size() == 0){
                    System.out.println("Digite um número de 1, 2, 3, 4, 5 ou 6, sendo:\n\n1 - Operações básicas\n2 - Outras operações\n3 - Conversor Moeda\n4 - Áreas\n5 - Datas\n6 - Sair");
                    opcao.add(0, ler.nextInt());
                }
                else{
                    System.out.println("Digite um número de 1, 2, 3, 4, 5 ou 6, sendo:\n\n1 - Operações básicas\n2 - Outras operações\n3 - Conversor Moeda\n4 - Áreas\n5 - Datas\n6 - Sair");//to do escrever
                    opcao.set(0, ler.nextInt());
                }

                if(opcao.get(0) == 1){
                    System.out.println("Digite um numero para as operações matemáticas:" +
                            "\n1 - Soma" +
                            "\n2 - Subtração" +
                            "\n3 - Multiplicação" +
                            "\n4 - Divisão");
                    opcao.add(1, ler.nextInt());
                    switch (opcao.get(1)) {
                        case 1 ->
                            t.MetodoOperacaoBasica(1);
                        case 2 ->
                            t.MetodoOperacaoBasica(2);
                        case 3 ->
                            t.MetodoOperacaoBasica(3);
                        case 4 ->
                            t.MetodoOperacaoBasica(4);
                        default ->
                            t.MetodoOperacaoBasica(0);
                    }
                    System.out.println("Você deseja continuar?\n1 - Voltar para o menu inicial\n6 - Sair");
                    int sair = ler.nextInt();
                    if(sair==6){
                        loop = false;
                    }
                }
                else if(opcao.get(0) == 2){
                    System.out.println("Digite um numero para as outras operações:" +
                            "\n1 - Exponenciação " +
                            "\n2 - Raiz quadrada" +
                            "\n3 - Porcenatagem");
                    opcao.add(1, ler.nextInt());
                    switch (opcao.get(1)){
                        case 1 ->
                            t.MetodoOutrasOperacaoes(1);
                        case 2 ->
                            t.MetodoOutrasOperacaoes(2);
                        case 3 ->
                            t.MetodoOutrasOperacaoes(3);
                        default ->
                                t.MetodoOutrasOperacaoes(0);
                    }
                    System.out.println("Você deseja continuar?\n1 - Voltar para o menu inicial\n6 - Sair");
                    int sair = ler.nextInt();
                    if(sair==6){
                    loop = false;
                    }
                }

                else if (opcao.get(0) == 3){
                    System.out.println("Digite um numero para a Conversor Moeda:" +
                            "\n1 - Conversor de Real para Dolar "+
                            "\n2 - Conversor de Dolar para Real"+
                            "\n3 - Conversor de Reais para Euro" +
                            "\n4 - Conversor de Euro para Real");
                    opcao.add(1, ler.nextInt());
                    switch(opcao.get(1)){
                        case 1 ->
                            t.MetodoConversorMoeda(1);
                        case 2 ->
                            t.MetodoConversorMoeda(2);
                        case 3 ->
                            t.MetodoConversorMoeda(3);
                        case 4 ->
                            t.MetodoConversorMoeda(4);
                        default -> t.MetodoConversorMoeda(0);
                    }
                    System.out.println("Você deseja continuar?\n1 - Voltar para o menu inicial\n6 - Sair");
                    int sair = ler.nextInt();
                    if(sair==6){
                    loop = false;
                    }
                }
                if(opcao.get(0) == 4){
                    System.out.println("Digite um número para os cálculos de área:" +
                            "\n1 - Área de triângulo" +
                            "\n2 - Área de retângulo" +
                            "\n3 - Área de círculo" +
                            "\n0 - Voltar ao menu anterior");
                    opcao.add(1, ler.nextInt());
                    switch (opcao.get(1)) {
                        case 1:
                            CalcularArea calcAreaTriangulo = new CalcularArea();
                            System.out.println("Digite a base do triângulo:");
                            calcAreaTriangulo.setNum1(ler.nextFloat());
                            System.out.println("Digite a altura do triângulo");
                            calcAreaTriangulo.setNum2(ler.nextFloat());
                            resultado = calcAreaTriangulo.AreaTriangulo();
                            System.out.println("Um triângulo com base " + calcAreaTriangulo.getNum1() + " e altura " + calcAreaTriangulo.getNum2() + " terá uma área de " + resultado);
                            break;
                        case 2:
                            CalcularArea calcAreaRetangulo = new CalcularArea();
                            System.out.println("Digite a base do retângulo:");
                            calcAreaRetangulo.setNum1(ler.nextFloat());
                            System.out.println("Digite a altura do retângulo");
                            calcAreaRetangulo.setNum2(ler.nextFloat());
                            resultado = calcAreaRetangulo.AreaRetangulo();
                            System.out.println("Um retângulo com base " + calcAreaRetangulo.getNum1() + " e altura " + calcAreaRetangulo.getNum2() + " terá uma área de " + resultado);
                            break;
                        case 3:
                            CalcularArea calcAreaCirculo = new CalcularArea();
                            System.out.println("Digite o raio do círculo:");
                            calcAreaCirculo.setNum1(ler.nextFloat());
                            resultado = calcAreaCirculo.AreaCirculo();
                            System.out.println("Um círculo com raio " + calcAreaCirculo.getNum1() + " terá uma área de " + resultado);
                            break;
                        default:
                            opcao.set(0, 7);
                            break;
                }
                    System.out.println("Você deseja continuar?\n1 - Voltar para o menu inicial\n6 - Sair");
                    int sair = ler.nextInt();
                    if(sair==6){
                        loop = false;
                    }
                }
                else if(opcao.get(0) == 5){
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    System.out.println("Digite a data inicial:");
                    String data1 = ler.next();
                    Date dataBase = sdf.parse(data1);
                    System.out.println("Digite a data final:");
                    String data2 = ler.next();
                    Date vencimento = sdf.parse(data2);
                    CalculadoraDatas calcDatas = new CalculadoraDatas(dataBase, vencimento);
                    System.out.println("Diferenças para as datas inseridas:" +
                            "\nDiferença em milissegundos: " + calcDatas.diferencaMS() +
                            "\nDiferença em segundos: " + calcDatas.diferencaSegundos() +
                            "\nDiferença em minutos: " + calcDatas.diferencaMinutos() +
                            "\nDiferença em horas: " + calcDatas.diferencaHoras() +
                            "\nDiferença em dias: " + calcDatas.diferencaDias());
                    System.out.println("Você deseja continuar?\n1 - Voltar para o menu inicial\n6 - Sair");
                    int sair = ler.nextInt();
                    if(sair==6){
                        loop = false;
                    }
                }
                else if (opcao.get(0) > 6) System.out.println("Digite outro número!\nNúmero inválido");
                else if(opcao.get(0)==6){
                    loop=false;
                }
            }
            catch(InputMismatchException e){
                System.err.println("\nExceção: " + e);
                System.out.println("Opção inválida.");
                ler.nextLine();
                System.out.println("Tente novamente.");
            }
        }while(loop);

        System.out.println("\n**   Muito Obrigado por usar nosso programa!   **\n\n**   Até breve!   **");
    }


}
