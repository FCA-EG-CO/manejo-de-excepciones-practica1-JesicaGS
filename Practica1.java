import java.util.Scanner;
// Escriba un programa Java para crear un metodo que tome un número entero como parámetro
// y produzca una excepción si el número es impar.
public class Practica1 {
    public static int numEntero( int n) {
        if (n % 2 != 0)
            throw new ArithmeticException("El número no puede ser impar");
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Introduzca un número entero:");
       int n = sc.nextInt();
       numEntero(n);

        try {
            if (n%2 == 0) {
                System.out.println("El número es par");
            }
        } catch (ArithmeticException ex) {
            System.out.println("El número es impar");
        }
    }
}
