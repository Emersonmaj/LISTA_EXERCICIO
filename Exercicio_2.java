import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double h, b, B, area;
        System.out.println("bote a altura do trapezio: ");
        h = ler.nextFloat();
        System.out.println("bote a parte menor do trapezio: ");
        b = ler.nextFloat();
        System.out.println("bote a parte maior do trapezio: ");
        B = ler.nextFloat();
        area = (h * (b + B)) / 2.0f;
        System.out.println("a area do trapezio é: " + area);
        System.out.println("a area arredondada é: " + Math.round(area));
    }
}

