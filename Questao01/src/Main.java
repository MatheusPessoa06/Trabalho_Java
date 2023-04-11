import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite 1 para somar, 2 para subtrair, 3 para multiplicar e 4 para dividir");
        int num = entrada.nextInt();
        float num1, num2, resultado;

        switch(num){
            case 1:
                System.out.println("Digite o primeiro numero: ");
                num1 = entrada.nextInt();
                entrada.nextLine();
                System.out.println("Digite o segundo numero: ");
                num2 = entrada.nextInt();

                resultado = num1+num2;

                System.out.println("Resultado: "+ resultado);
                break;
            case 2:
                System.out.println("Digite o primeiro numero: ");
                num1 = entrada.nextInt();
                entrada.nextLine();
                System.out.println("Digite o segundo numero: ");
                num2 = entrada.nextInt();

                resultado = num1 - num2;

                System.out.println("Resultado: "+ resultado);
                break;
            case 3:
                System.out.println("Digite o primeiro numero: ");
                num1 = entrada.nextInt();
                entrada.nextLine();
                System.out.println("Digite o segundo numero: ");
                num2 = entrada.nextInt();

                resultado = num1 * num2;

                System.out.println("Resultado: "+ resultado);
                break;
            case 4:
                System.out.println("Digite o primeiro numero: ");
                num1 = entrada.nextInt();
                entrada.nextLine();
                System.out.println("Digite o segundo numero: ");
                num2 = entrada.nextInt();

                resultado = num1/num2;

                System.out.println("Resultado: "+ resultado);
                break;
            default:
                System.out.println("Opcao Invalida. Encerrando...");

        }
    }
}