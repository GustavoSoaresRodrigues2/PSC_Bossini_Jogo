public class JogoV2 {
  public static void main(String[] args) throws Exception{
    Personagem p = new Personagem();
    var soninho = new Personagem(0, 0, 10);
    var fominha = new Personagem(5, 10, 5);
    var energetico = new Personagem(10, 8, 10);

    p.nome = "Christian";

    while(true) {

      p.cacar();
      p.comer();
      p.dormir();
      p.exibirEstado();

      System.out.println("******************");
      
      Thread.sleep(8000);
    }
  }
}
