import javax.swing.JOptionPane;

public class Adicao {
    public static void main(String [] args) {
        // Declarar variável
        // reserva um pedaço de memória para usarmos quando queremos reutiliza-la
        double n1;
        double n2;
        double result;

        // Pegando valores
        n1 = 
            Double.parseDouble(
                JOptionPane.showInputDialog(
                        "Primeiro número: "
                )
            );

        n2 =
            Double.parseDouble(
                JOptionPane.showInputDialog(
                    "Segundo número: "
                )
            );

        // Operação
        result = n1 + n2;

        // Exibir Resultado
        JOptionPane.showMessageDialog(
            null, "A Soma é: " + result
        );
    }
}