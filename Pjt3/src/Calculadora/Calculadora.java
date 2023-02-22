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
import static java.lang.System.*;

public class Calculadora {
    static final Scanner ler = new Scanner(System.in);

    private void MetodoOperacaoBasica(int num) {
        try {
            OperacaoBasica opBas = new OperacaoBasica();
            out.println("Digite um 1o numero:");
            opBas.setNum1(ler.nextFloat());
            out.println("Digite um 2o numero:");
            opBas.setNum2(ler.nextFloat());
            if (num == 1) {
                opBas.Soma();
                out.println("Número " + opBas.getNum1() + " + " + opBas.getNum2() + " = " + opBas.Soma() + "\n");
            } else if (num == 2) {
                out.println("Número " + opBas.getNum1() + " - " + opBas.getNum2() + " = " + opBas.Diminuir() + "\n");
            } else if (num == 3) {
                out.println("Número " + opBas.getNum1() + " x " + opBas.getNum2() + " = " + opBas.Multiplicar() + "\n");
            } else if (num == 4) {
                out.println("Número " + opBas.getNum1() + " + " + opBas.getNum2() + " = " + opBas.Dividir() + "\n");
            } else
                out.println("Número inválido");
        } catch (InputMismatchException e) {
            err.println("\nExceção: " + e);
            out.println("Tipagem inesperada, favor digitar um número inteiro!.");
            out.println("Tente novamente!");
        }
    }

    private void MetodoOutrasOperacaoes(int num) {
        try {
            OutrasOperacoes outrasOperacoes = new OutrasOperacoes();
            if (num == 1) {
                out.println("Digite um 1o numero para a exponenciação:");
                outrasOperacoes.setNum1(ler.nextFloat());
                out.println("Digite um 2o numero:");
                outrasOperacoes.setNum2(ler.nextFloat());
                out.println("Exponenciação: " + outrasOperacoes.exponenciacao() + "\n");
            } else if (num == 2) {
                out.println("Digite um 1 numero para a raiz:");
                outrasOperacoes.setNum1(ler.nextFloat());
                out.println("Raiz quadrada: " + outrasOperacoes.raiz() + "\n");
            } else if (num == 3) {
                out.println("Digite o valor:");
                float value = ler.nextFloat();
                out.println("Digite o valor da porcentagem:");
                float value1 = ler.nextFloat();
                OutrasOperacoes outrasOperacoes1 = new OutrasOperacoes(value, value1);
                out.printf("Porcentagem: %.2f\n", outrasOperacoes1.porcentagem());
            } else out.println("Valor inválido!");
        } catch (InputMismatchException e) {
            err.println("\nExceção: " + e);
            out.println("Tipagem inesperada, favor digitar um número!");
            out.println("Tente novamente!");
        }
    }

    private void MetodoConversorMoeda(int num) {
        try {
            ConversorDeMoeda conversorDeMoeda = new ConversorDeMoeda();
            if (num == 1) {
                out.println("Digite quantidade de Reais:");
                conversorDeMoeda.setMoeda(ler.nextFloat());
                out.printf("Dólar: %.2f\n", conversorDeMoeda.ConverterReaisDolar());
            } else if (num == 2) {
                out.println("Digite quantidade de Dólar:");
                conversorDeMoeda.setMoeda(ler.nextFloat());
                out.printf("Real: %.2f\n", conversorDeMoeda.ConverterDolar());
            } else if (num == 3) {
                out.println("Digite quantidade de Reais:");
                conversorDeMoeda.setMoeda(ler.nextFloat());
                out.printf("Euro: %.2f\n", conversorDeMoeda.ConverterReaisEuro());
            } else if (num == 4) {
                out.println("Digite quantidade de Euro:");
                conversorDeMoeda.setMoeda(ler.nextFloat());
                out.printf("Real: %.2f\n", conversorDeMoeda.ConverterEuro());
            } else out.println("Valor inválido!");
        } catch (InputMismatchException e) {
            err.println("\nExceção: " + e);
            out.println("Tipagem inesperada, favor digitar um número!");
            out.println("Tente novamente!");
        }
    }

    private void MetodoArea(int num) {
        try {
            CalcularArea calcularArea = new CalcularArea();
            if (num == 1) {
                out.println("Digite a altura do triângulo: ");
                calcularArea.setNum1(ler.nextFloat());
                out.println("Digite a base do triângulo:");
                calcularArea.setNum2(ler.nextFloat());
                out.println("Um Triângulo com base " + calcularArea.getNum2() +
                        " e altura " + calcularArea.getNum1() + " terá uma área de " + calcularArea.AreaTriangulo());
            } else if (num == 2) {
                out.println("Digite a altura do retângulo: ");
                calcularArea.setNum1(ler.nextFloat());
                out.println("Digite a base do retângulo:");
                calcularArea.setNum2(ler.nextFloat());
                out.println("Um retângulo com base " + calcularArea.getNum2() +
                        " e altura " + calcularArea.getNum1() + " terá uma área de " + calcularArea.AreaRetangulo());
            } else if (num == 3) {
                out.println("Digite o raio do círculo:");
                calcularArea.setNum1(ler.nextFloat());
                out.println("Um círculo com raio " + calcularArea.getNum1() + " terá uma área de " + calcularArea.AreaCirculo());
            } else out.println("Valor inválido!");
        } catch (InputMismatchException e) {
            err.println("\nExceção: " + e);
            out.println("Tipagem inesperada, favor digitar um número!.");
            out.println("Tente novamente!");
        }
    }

    private void MetodoDate() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        out.println("Digite a data inicial:");
        String data1 = ler.next();
        Date dataBase = sdf.parse(data1);
        out.println("Digite a data final:");
        String data2 = ler.next();
        Date vencimento = sdf.parse(data2);
        CalculadoraDatas calculadoraDatas = new CalculadoraDatas(dataBase, vencimento);
        out.println("Diferenças para as datas inseridas:" +
                "\nDiferença em milissegundos: " + calculadoraDatas.diferencaMS() +
                "\nDiferença em segundos: " + calculadoraDatas.diferencaSegundos() +
                "\nDiferença em minutos: " + calculadoraDatas.diferencaMinutos() +
                "\nDiferença em horas: " + calculadoraDatas.diferencaHoras() +
                "\nDiferença em dias: " + calculadoraDatas.diferencaDias());
    }

    private boolean sair() {
        boolean loop = true;
        int sair;
        do {
            out.println("Você deseja continuar?\n1 - Voltar para o menu inicial\n6 - Sair");
            sair = ler.nextInt();
            if (sair == 1) {
                loop = true;
            } else if (sair == 6) {
                loop = false;
            } else out.println("número inválido, tente novamente");
        } while (sair != 1 && sair != 6);
        return loop;
    }


    public static void main(String[] args) throws ParseException {
        Calculadora t = new Calculadora();
        ArrayList<Integer> opcao = new ArrayList<>();
        boolean loop = true;
        opcao.add(0,0);
        out.println("\n**   Bem vindo!!   **\n\n**   A calculadora! :D  **\n\n");
        do{
            try{
                if(opcao.size() == 0){
                    out.println("Digite um número de 1, 2, 3, 4, 5 ou 6, sendo:\n\n1 - Operações básicas\n2 - Outras operações\n3 - Conversor Moeda\n4 - Áreas\n5 - Datas\n6 - Sair");
                    opcao.add(0, ler.nextInt());
                }
                else{
                    out.println("Digite um número de 1, 2, 3, 4, 5 ou 6, sendo:\n\n1 - Operações básicas\n2 - Outras operações\n3 - Conversor Moeda\n4 - Áreas\n5 - Datas\n6 - Sair");//to do escrever
                    opcao.set(0, ler.nextInt());
                }

                if(opcao.get(0) == 1){
                    out.println("Digite um numero para as operações matemáticas:" +
                            "\n1 - Soma" +
                            "\n2 - Subtração" +
                            "\n3 - Multiplicação" +
                            "\n4 - Divisão");
                    opcao.add(1, ler.nextInt());
                    switch (opcao.get(1)) {
                        case 1 -> t.MetodoOperacaoBasica(1);
                        case 2 -> t.MetodoOperacaoBasica(2);
                        case 3 -> t.MetodoOperacaoBasica(3);
                        case 4 -> t.MetodoOperacaoBasica(4);
                        default -> t.MetodoOperacaoBasica(0);
                    }
                    t.sair();
                }
                else if(opcao.get(0) == 2){
                    out.println("Digite um numero para as outras operações:" +
                            "\n1 - Exponenciação " +
                            "\n2 - Raiz quadrada" +
                            "\n3 - Porcenatagem");
                    opcao.add(1, ler.nextInt());
                    switch (opcao.get(1)){
                        case 1 -> t.MetodoOutrasOperacaoes(1);
                        case 2 -> t.MetodoOutrasOperacaoes(2);
                        case 3 -> t.MetodoOutrasOperacaoes(3);
                        default -> t.MetodoOutrasOperacaoes(0);
                    }
                    loop = t.sair();
                }

                else if (opcao.get(0) == 3){
                    out.println("Digite um numero para a Conversor Moeda:" +
                            "\n1 - Conversor de Real para Dolar "+
                            "\n2 - Conversor de Dolar para Real"+
                            "\n3 - Conversor de Reais para Euro" +
                            "\n4 - Conversor de Euro para Real");
                    opcao.add(1, ler.nextInt());
                    switch(opcao.get(1)){
                        case 1 -> t.MetodoConversorMoeda(1);
                        case 2 -> t.MetodoConversorMoeda(2);
                        case 3 -> t.MetodoConversorMoeda(3);
                        case 4 -> t.MetodoConversorMoeda(4);
                        default -> t.MetodoConversorMoeda(0);
                    }
                    loop = t.sair();
                }
                else if(opcao.get(0) == 4) {
                    out.println("Digite um número para os cálculos de área:" +
                            "\n1 - Área de triângulo" +
                            "\n2 - Área de retângulo" +
                            "\n3 - Área de círculo");
                    opcao.add(1, ler.nextInt());
                    switch (opcao.get(1)) {
                        case 1 -> t.MetodoArea(1);
                        case 2 -> t.MetodoArea(2);
                        case 3 -> t.MetodoArea(3);
                        default -> t.MetodoArea(0);
                    }
                    loop = t.sair();
                }
                else if(opcao.get(0) == 5){
                    t.MetodoDate();
                    loop = t.sair();
                }
                else if (opcao.get(0) > 6) System.out.println("Digite outro número!\nNúmero inválido");
                else if(opcao.get(0)==6){
                    loop=false;
                }
            }catch(InputMismatchException e){
                err.println("\nExceção: " + e);
                out.println("Opção inválida.");
                ler.nextLine();
                out.println("Tente novamente.");
            }
        }while(loop);
        System.out.println("\n**   Muito Obrigado por usar nosso programa!   **\n\n**   Até breve!   **");
    }
}
