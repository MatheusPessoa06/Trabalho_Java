import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double numero = entrada.nextInt();
        double resultado = 0;

        if(numero % 2==0){
            resultado = numero*numero;
        }else{
            resultado = numero*numero*numero;
        }
        System.out.println("Resultado: "+resultado);
    }
}