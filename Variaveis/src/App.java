import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Random sorteio = new Random();
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero entre 1 e 2"));
        int resultado = sorteio.nextInt(numero) + 1;

        JOptionPane.showMessageDialog(null, "O número escolhido foi: " + resultado);
    }
}


// Random gerador = new Random();
//         int facesDado = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas faces tem o dado?"));
//         int resultado = gerador.nextInt(facesDado) + 1;
        
//         // int numero = gerador.nextInt(6) + 1;
//         JOptionPane.showMessageDialog(null, "Você tirou " + resultado); 
