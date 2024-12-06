import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int peso;
        System.out.println("Digite seu peso: ");
        Scanner p = new Scanner(System.in);
        peso = p.nextInt();

        String nome;
        System.out.println("Qual o seu nome?");
        Scanner name = new Scanner(System.in);
        nome = name.next();

        System.out.println("Oi " + nome + " seu peso é " + peso);
    }
}
