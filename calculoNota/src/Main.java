/**
 * main class.
 */
public final class Main {

  private Main() {
  }

  /**
   * Método principal para executar os testes.
   *
   * @param args Argumentos de linha de comando.
  */
  public static void main(final String[] args) {
    final double notaJoaoAp1 = 8.0;
    final double notaJoaoAp2 = 7.5;
    final double notaMariaAp1 = 5.0;
    final double notaMariaAp2 = 6.0;
    final double notaMariaAs = 8.0;
    final double notaCarlosAp1 = 3.0;
    final double notaCarlosAp2 = 4.5;
    final double notaCarlosAs = 5.5;

    // Cenário 1: Aluno aprovado sem AS
    System.out.println(Calculadora.calcularResultado("João",
            notaJoaoAp1, notaJoaoAp2, null));

    // Cenário 2: Aluno faz AS e é aprovado
    System.out.println(Calculadora.calcularResultado("Maria",
            notaMariaAp1, notaMariaAp2, notaMariaAs));

    // Cenário 3: Aluno faz AS e ainda é reprovado
    System.out.println(Calculadora.calcularResultado("Carlos",
            notaCarlosAp1, notaCarlosAp2, notaCarlosAs));
  }
}
