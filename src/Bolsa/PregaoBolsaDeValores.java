package Bolsa;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PregaoBolsaDeValores {

    public static void main(String[] args) {
        List<Acao> acoes = new ArrayList<>();
        acoes.add(new Acao("AAPL", 150.00));
        acoes.add(new Acao("GOOGL", 2500.00));
        acoes.add(new Acao("AMZN", 3400.00));

        List<Investidor> investidores = new ArrayList<>();
        investidores.add(new Investidor("João Silva", 10000.00));
        investidores.add(new Investidor("Maria Santos", 15000.00));
        investidores.add(new Investidor("Toninho Mendes", 20000.00));

        for (int i = 1; i <= 10; i++) {
            System.out.println("Iteração " + i);
            for (Acao acao : acoes) {
                double novoPreco = gerarNovoPreco(acao.getPreco());
                acao.setPreco(novoPreco);
                System.out.println(acao.getSimbolo() + ": $" + acao.getPreco());
            }

            for (Investidor investidor : investidores) {
                Acao acaoAleatoria = acoes.get(new Random().nextInt(acoes.size()));
                double valorInvestido = new Random().nextDouble() * investidor.getSaldo();
                investidor.comprarAcao(acaoAleatoria, valorInvestido);
            }
        }

        
        for (Investidor investidor : investidores) {
            System.out.println(investidor.getNome() + " - Saldo final: $" + investidor.getSaldo());
        }
    }

    private static double gerarNovoPreco(double precoAtual) {
        Random rand = new Random();
        double variacao = (rand.nextDouble() - 0.5) * 10; // Variação aleatória de -5 a 5
        return precoAtual + variacao;
    }
}


	
