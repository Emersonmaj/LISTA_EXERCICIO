import java.util.Scanner;

public class Exercicios_5 {
    public static void main(String[] args) {
        Scanner pagamento = new Scanner(System.in);
        double val, sal;

        System.out.println("Digite quantas horas você trabalhou: ");
          val = pagamento.nextDouble();
          sal = (val * 10.25);

        System.out.println("O seu salário será de: " + sal + " reais");

        if (sal < 50.00)
          System.out.println("Atenção, dirija-se à direção do Hotel!");

    }
}

