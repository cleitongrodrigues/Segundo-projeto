import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Double peso;
        Double altura;
        Double imc;

        System.out.println("Digite seu peso");
        Scanner p = new Scanner(System.in);
        peso = p.nextDouble();

        System.out.println("Digite sua altura");
        Scanner a = new Scanner(System.in);
        altura = a.nextDouble();

        imc = peso / (altura * altura);

        System.out.println("Seu peso é: " + peso + " e sua altura é " + altura + " e seu IMC é: " + imc);
    }
}
