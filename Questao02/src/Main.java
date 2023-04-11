import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero para converter: ");
        int valor = entrada.nextInt();
        entrada.nextLine();

        double cel = 0, fah = 0, kel = 0;
        System.out.println("Digite C se o valor for em Celsius,  F para Fahrenheit e K para Kelvin:");
        String condicao = entrada.nextLine();

        switch (condicao) {
            case "c":
                cel = valor;
                fah = (valor * 1.8) + 32;
                kel = valor + 273.15;
                break;
            case "f":
                fah = valor;
                kel = (fah - 32) / 1.8 + 273.15;
                cel = (fah - 32) / 1.8;
                break;
            case "k":
                kel = valor;
                fah = (kel - 273.15) * 1.8 + 32;
                cel = kel - 273.15;
                break;
            default:
                System.out.println("Valor invalido. Encerrando...");
        }
        System.out.println("Valor em Celsius: " + cel + "°c");
        System.out.println("Valor em Fahrenheit: "+ fah+ "°f");
        System.out.println("Valor em Kelvin: "+ kel + "k");
    }
}