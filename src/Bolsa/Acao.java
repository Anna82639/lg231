package Bolsa;

public class Acao {
        private String simbolo;
        private double preco;
    
        public Acao(String simbolo, double preco) {
            this.simbolo = simbolo;
            this.preco = preco;
        }
    
        public String getSimbolo() {
            return simbolo;
        }
    
        public double getPreco() {
            return preco;
        }
    
        public void setPreco(double preco) {
            this.preco = preco;
        }
    }
    

