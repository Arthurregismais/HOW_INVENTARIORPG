package com.example.invetariorpgv09;


public class Consumiveis extends Itens {
        private float efeitoDuracao;
        private boolean efeitoPassivo;
        private byte quantidadeUsos;

        Consumiveis(String nome, int valor, int quantidade, String categoria, String subcategoria, String descricao, float efeitoDuracao, boolean efeitoPassivo, byte quantidadeUsos) {
            super(nome, valor, quantidade, categoria, subcategoria, descricao);
            this.efeitoDuracao = efeitoDuracao;
            this.efeitoPassivo = efeitoPassivo;
            this.quantidadeUsos = quantidadeUsos;
        }

        // Métodos getters e setters

        public float getEfeitoDuracao() {
            return efeitoDuracao;
        }

        public void setEfeitoDuracao(float efeitoDuracao) {
            this.efeitoDuracao = efeitoDuracao;
        }

        public boolean isEfeitoPassivo() {
            return efeitoPassivo;
        }

        public void setEfeitoPassivo(boolean efeitoPassivo) {
            this.efeitoPassivo = efeitoPassivo;
        }

        public byte getQuantidadeUsos() {
            return quantidadeUsos;
        }

        public void setQuantidadeUsos(byte quantidadeUsos) {
            this.quantidadeUsos = quantidadeUsos;
        }

        public void usarItem() {
            if (quantidadeUsos > 0) {
                quantidadeUsos--;
        }
    }
}
