public class CalculoPorcentagem {
  public void calculaPorcentagem(Pessoa pessoa) {
    if (pessoa.estaRetornandoViagem.equals("SIM")) {
      pessoa.porcentagemInfeccao += 30;
      pessoa.orientacaoFinal = "Voce ficara� sob observa��o por 05 dias.";
    }

    if (pessoa.cartaoVacinaEmDia.equals("NAO")) {
      pessoa.porcentagemInfeccao += 10;
    }

    if (pessoa.teveSintomasRecentemente.equals("SIM")) {
      pessoa.porcentagemInfeccao += 30;
    }

    if (pessoa.teveContatoComPessoasSintomaticas.equals("SIM")) {
      pessoa.porcentagemInfeccao += 30;
    }
  }
}
