import java.util.Scanner;
import javax.swing.JOptionPane;
public class atividade {
    public static void main(String[] args) {
        float n1, n2, media;
        try (Scanner var = new Scanner(System.in)) {
            System.out.println(" Digite nota 1: ");
            n1= var.nextInt();
            System.out.println(" Digite nota 2: ");
            n2= var.nextInt();
        }
        media = (n1 + n2) /2;
       
    
        JOptionPane.showMessageDialog(null, "Resultado: " + media);
    }
        









}










