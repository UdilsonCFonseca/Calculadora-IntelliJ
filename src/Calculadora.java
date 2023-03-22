import java.util.Scanner;

public class Calculadora {
    private double numero1;
    private double numero2;
    private double resultado;

    public void soma() {
        resultado = numero1 + numero2;
    }

    public void subtracao() {
        resultado = numero1 - numero2;
    }

    public void multiplicacao() {
        resultado = numero1 * numero2;
    }

    public void divisao() {
        if (numero2 != 0) {
            resultado = numero1 / numero2;
        } else {
            System.out.println("Não é possível dividir por zero.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("Calculadora simples em Java");
        System.out.println("---------------------------");

        System.out.print("Digite o primeiro número: ");
        calculadora.numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        calculadora.numero2 = scanner.nextDouble();

        System.out.println("---------------------------");
        System.out.println("Selecione a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("---------------------------");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                calculadora.soma();
                break;
            case 2:
                calculadora.subtracao();
                break;
            case 3:
                calculadora.multiplicacao();
                break;
            case 4:
                calculadora.divisao();
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        System.out.println("---------------------------");
        System.out.println("Resultado: " + calculadora.resultado);
        System.out.println("---------------------------");

        scanner.close();
    }
}