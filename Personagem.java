import javax.swing.JOptionPane;

public class Personagem {

  String nome;
  private int energia = 00;
  private int fome = 0;
  private int sono = 0;

  Personagem() {
    JOptionPane.showMessageDialog(
      null, 
      "Construindo um personagem..."
    );
  }

  Personagem(String nome) {
    this.nome = nome;
    JOptionPane.showMessageDialog(
      null, 
      "Construindo um personagem com o nome: " + nome
    );
  }

  Personagem(int energia, int fome, int sono) {
    if (energia >= 0 && energia <= 10) {
      this.energia = energia;
      if (fome >= 0 && fome <= 10) {
        this.fome = fome;
      }
      if (sono >= 0 && sono <= 10) {
        this.sono = sono;
      }
    }
  }

  void cacar() {
    if (energia >= 2) {
      energia -= 2;
      JOptionPane.showMessageDialog(null, nome + " caçando");
    } else {
      JOptionPane.showMessageDialog(null, nome + " sem energia para caçar");
    }

    fome = Math.min(fome + 1, 10);
    sono = sono + 1 > 10 ? 10 : sono + 1;
  }

  void Morrer(int i) {
    if (energia == 0) {
      JOptionPane.showMessageDialog(null, nome + " morreu");
      i = 0;
    }
  }

  void comer() {
    if (fome >= 1) {
      JOptionPane.showMessageDialog(null, nome + " está comendo");
      --fome;
      energia = Math.min(energia + 1, 10);
    } else {
      JOptionPane.showMessageDialog(null, nome + " sem fome");
    }
  }

  void dormir() {
    if (sono >= 1) {
      JOptionPane.showMessageDialog(null, nome + " dormindo");
      sono--;
      energia = energia + 1 <= 10 ? energia + 1 : 10;
    } else {
      JOptionPane.showMessageDialog(null, nome + " sem sono");
    }
  }

  

  void exibirEstado() {
    
    System.out.printf(
      "%s -> e: %d, f: %d, s: %d\n",
      nome,
      energia,
      fome,
      sono
    );
  }
}




