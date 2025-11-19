import java.util.Scanner;


public class MostrarNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, ingresa el primer numero: ");
        double numero1 = sc.nextDouble();
        System.out.println("Por favor, ingresa el segundo numero: ");
        double numero2 = sc.nextDouble();
        System.out.println("Los numeros ingresados son:");
        System.out.println("Número 1: " + numero1);
        System.out.println("Número 2: " + numero2);
        sc.close();
    }
}
