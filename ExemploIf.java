import javax.swing.*;

public class ExemploIf extends JFrame {
    public static void main(String[] args) {
        double nota;

        nota = Double.parseDouble(
            JOptionPane.showInputDialog("Digite o valor da nota: ")
        );

        if (nota >= 70)
            JOptionPane.showMessageDialog(
                null, "Aprovado !");


    }
}