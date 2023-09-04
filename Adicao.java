import java.util.Scanner;

public class Adicao {
    public static void main(String [] args) {
        // Declarar variável
        // reserva um pedaço de memória para usarmos quando querem reutiliza-la
        // double n1;
        // double n2;
        // double result;

        // Entrada / System.in é em referência a entrada padrão (Teclado)
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Primeiro número: ");
        double n1 = sc.nextInt();
        
        System.out.print("Segundo número: ");
        double n2 = sc.nextInt();
        double result = n1 + n2;
        System.out.print("A Soma é: " + result);

    }
}