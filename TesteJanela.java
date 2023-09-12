import javax.swing.*;

public class TesteJanela {
    public static void main(String[] args) {
        String text;

        text = JOptionPane.showInputDialog("Escreva algo: ");

        JFrame frame = new JFrame("JTextArea Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea textAreal = new JTextArea(text);
        textAreal.setSize(640,480);
        textAreal.setVisible(true);

        JScrollPane scrollPane = new JScrollPane(textAreal);
        frame.add(scrollPane);
        frame.pack();
        frame.setVisible(true);
    }
}
