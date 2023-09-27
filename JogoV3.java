import java.util.Random;

import javax.swing.JOptionPane;

public class JogoV3 {
    public static void main(String[] args) throws Exception {
        var p = new Personagem("Gustavo");
        var gerador = new Random();

        for (;;) {
            int num = gerador.nextInt(3) + 1;

            switch (num) {
                case 1:
                    p.cacar();
                    break;
                case 2:
                    p.dormir();
                    break;
                case 3:
                    p.comer();
                    break;        
                default:
                JOptionPane.showMessageDialog(null, "Erro Inesperado!");
                    break;
            }
            
            p.exibirEstado();

            Thread.sleep(3000);
        }
    }
}
