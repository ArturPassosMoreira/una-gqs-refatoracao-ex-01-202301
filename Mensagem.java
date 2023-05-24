import java.util.Scanner;

public class Mensagem {

  public boolean realizaPerguntaVacinaEmDia(Pessoa pessoa, Scanner scanner) {
    int contador = 0;
    boolean erroTentativas = false;

    do {
      System.out.println("\nSeu cart�o de vacina esta em dia? Digite SIM ou NAO ?");
      pessoa.cartaoVacinaEmDia = scanner.next().toUpperCase();
      if (pessoa.cartaoVacinaEmDia.equals("SIM") || pessoa.cartaoVacinaEmDia.equals("NAO")) {
        break;
      } else {
        contador++;
        System.out.println("\nDigito invalido! Digite SIM ou NAO.");
        if (contador == 3) {
          erroTentativas = true;
          break;
        }
      }
    } while (true);

    return erroTentativas;
  }

  public boolean realizaPerguntaTeveSintomasRecenmente(Pessoa pessoa, Scanner scanner) {
    int contador = 0;
    boolean erroTentativas = false;

    do {
      System.out
          .println("\nTeve algum dos sintomas recentemente? (dor de cabe�a, febre,nausea, dor articular, gripe)" +
              "Digite SIM ou NAO");
      pessoa.teveSintomasRecentemente = scanner.next().toUpperCase();
      if (pessoa.teveSintomasRecentemente.equals("SIM") || pessoa.teveSintomasRecentemente.equals("NAO")) {
        break;
      } else {
        contador++;
        System.out.println("\nDigito invalido! Digite SIM ou NAO.");
        if (contador == 3) {
          erroTentativas = true;
          break;
        }
      }
    } while (true);

    return erroTentativas;
  }

  public boolean realizaPerguntaTeveContatoPessoasAssintomaticas(Pessoa pessoa, Scanner scanner) {
    int contador = 0;
    boolean erroTentativas = false;

    do {
      System.out
          .println("\nTeve contato com pessoas com sintomas gripais nos ultimos dias?" +
              "Digite SIM ou NAO");
      pessoa.teveContatoComPessoasSintomaticas = scanner.next().toUpperCase();
      if (pessoa.teveContatoComPessoasSintomaticas.equals("SIM")
          || pessoa.teveContatoComPessoasSintomaticas.equals("NAO")) {
        break;
      } else {
        contador++;
        System.out.println("\nDigito invalido! Digite SIM ou NAO.");
        if (contador == 3) {
          erroTentativas = true;
          break;
        }
      }
    } while (true);

    return erroTentativas;
  }

  public boolean realizaPerguntaEstaRetornandoViagemExterior(Pessoa pessoa, Scanner scanner) {
    int contador = 0;
    boolean erroTentativas = false;

    do {
      System.out
          .println("\nEsta retornando de viagem do exterior?" +
              "Digite SIM ou NAO");
      pessoa.estaRetornandoViagem = scanner.next().toUpperCase();
      if (pessoa.estaRetornandoViagem.equals("SIM")
          || pessoa.estaRetornandoViagem.equals("NAO")) {
        break;
      } else {
        contador++;
        System.out.println("\nDigito invalido! Digite SIM ou NAO.");
        if (contador == 3) {
          erroTentativas = true;
          break;
        }
      }
    } while (true);

    return erroTentativas;
  }

  public void imprimirRelatorioFinal(Pessoa pessoa) {
    System.out.println("\nNome: " + pessoa.nome);
    System.out.println("Idade: " + pessoa.idade + " anos");
    System.out.println("Cart�o Vacinal em Dia: " + pessoa.cartaoVacinaEmDia);
    System.out.println("Teve sintomas recentemente: " + pessoa.teveSintomasRecentemente);
    System.out.println("Teve contato com pessoas infectadas: " + pessoa.teveContatoComPessoasSintomaticas);
    System.out.println("Esta retornando de viagem: " + pessoa.estaRetornandoViagem);
    System.out.println("Porcentagem infec��o: " + pessoa.porcentagemInfeccao);
    System.out.println("Orienta��o Final: " + pessoa.orientacaoFinal);
  }

  public void imprimirMensagemErro() {
    System.out.println("N�o foi possivel realizar o diagnostico." +
        "\nGentileza procurar ajuda medica caso aparessa algum sintoma .");
  }
}