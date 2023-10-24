package Bolsa;

public class Investidor {

    
        private String nome;
        private double saldo;
    
        public Investidor(String nome, double saldo) {
            this.nome = nome;
            this.saldo = saldo;
        }
    
        public String getNome() {
            return nome;
        }
    
        public double getSaldo() {
            return saldo;
        }
    
        public void comprarAcao(Acao acao, double valorInvestido) {
            double precoAcao = acao.getPreco();
            int quantidadeComprada = (int) (valorInvestido / precoAcao);
            double custoTotal = quantidadeComprada * precoAcao;
    
            if (saldo >= custoTotal) {
                saldo -= custoTotal;
                System.out.println(nome + " comprou " + quantidadeComprada + " ações de " + acao.getSimbolo());
            }
        }
    
}
