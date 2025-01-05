import java.util.Scanner;

public class Calculadora {
    public static void main(String[]args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double numero1 = Scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double numero2 = Scanner.nextDouble();

        System.out.println("Escolha a operação (+, -, *, /):");
        char operacao = Scanner.next().charAt(0);

        double resultado = 0;

            switch (operacao) {
                case '+':
                    resultado=numero1 + numero2;
                    break;
                        case '-':
                            resultado=numero1 - numero2;
                            break;
                                case '*':
                                    resultado=numero1 * numero2;
                                    break;
                case '/':
                    if (numero2 !=0) {
                        resultado = numero1 / numero2;
                    }else{
                        System.out.println("Erro: Divisão por zero não é uma opção.");
                        return;
                    }
                    break;
                
                    default:
                    System.out.println("Operação inválida.");
                    return;
            }
            System.out.println("O resultado e: "+ resultado);
    }
}