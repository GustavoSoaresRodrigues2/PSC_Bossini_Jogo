public class JogoV1 {
  public static void main(String[] args) {
    var p = new Personagem();
    p.nome = "John";
    p.energia = 10;
    p.fome = 0;
    p.sono = 0;
    p.cacar();
    p.comer();
    p.dormir();
    int a = 2;
    // a++;
    // ++a;
    System.out.println(a++);
    System.out.println(++a);
  }
}
