public class JogoV2 {
  public static void main(String[] args) throws Exception{
    Personagem p = new Personagem();
    p.nome = "John";
    p.energia = 10;
    p.fome = 0;
    p.sono = 0;
    while(true){
      p.cacar();
      p.comer();
      p.dormir();
      p.exibirEstado();
      System.out.println("******************");
      Thread.sleep(8000);
    }
  }
}
