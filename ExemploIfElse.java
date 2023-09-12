// import java.util.Scanner;

public class ExemploIfElse {
    public static void main(String[] args) {

        java.util.Scanner sc = 
            new java.util.Scanner(System.in);

        double nota;

        System.out.println("Digite a nota: ");
        nota = sc.nextDouble();

        if (nota >= 70) 
            System.out.println("Aprovado !");
         else 
            System.out.println("Reprovado !");
        
    }
}
