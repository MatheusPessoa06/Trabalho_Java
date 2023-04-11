import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine().toLowerCase();
        //entrada.nextLine();
        System.out.println("Digite seu Sobrenome: ");
        String sobrenome = entrada.nextLine().toLowerCase();

        if(sobrenome.equals("wayne")){
            System.out.println("Acesso liberado, Sr. Wayne");
        }else if(sobrenome.equals("kent")){
            System.out.println("Sai dai, mane");
        }else if(nome.equals("diana")){
            System.out.println("Bem-vinda, Princesa de Themyscara");
        }else{
            System.out.println("Sai fora!");
        }
    }
}