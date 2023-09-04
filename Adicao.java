import java.util.Scanner;

public class Adicao {
    public static void main(String [] args) {
        // Declarar variável
        // reserva um pedaço de memória para usarmos quando queremos reutiliza-la
        double n1;
        double n2;
        double result;

        // Entrada / System.in é em referência a entrada padrão (Teclado)
        Scanner sc = new Scanner(System.in);
             
        // Pegando valores
        System.out.print("Primeiro número: ");
        n1 = sc.nextDouble();

        System.out.print("Segundo número: ");
        n2 = sc.nextDouble();

        // Processo
        result = n1 + n2;
   
        // Saída
        System.out.print("A Soma é: " + result);

    }
}