/**
 * Classe utilitária para calcular o resultado dos alunos.
 */
public final class Calculadora {

  /**
   * Construtor privado para evitar instanciação.
  */
  private Calculadora() {
  }

  /**
  * Calcula o resultado de um aluno com base nas notas.
  *
  * @param nome Nome do aluno.
  * @param ap1 Nota da primeira avaliação.
  * @param ap2 Nota da segunda avaliação.
  * @param as  Nota da avaliação substitutiva (se houver).
  * @return String formatada com o nome,média e status de aprovação.
  */

  public static String calcularResultado(
          final String nome,
          final double ap1,
          final double ap2,
          final Double as
  ) {
    double nota1 = ap1;
    double nota2 = ap2;
    final double mediaMinima = 7.0;

    if (as != null) {
      if (nota1 < nota2) {
        nota1 = Math.max(nota1, as);
      } else {
        nota2 = Math.max(nota2, as);
      }
    }
    double media = (nota1 + nota2) / 2;
    boolean aprovado = media >= mediaMinima;

    return String.format(
            "Aluno: %s | Média: %.2f | %s",
            nome, media, (aprovado ? "Aprovado" : "Reprovado")
    );
  }
}
