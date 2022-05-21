package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroProjeto {
    public static void main(String[] args) {

        Gato gato = new Gato();
        System.out.println(gato);

        livro livro1 = new livro("O problema dos 3 corpos", 300);
        System.out.println(livro1);
    }
}

class livro{
    private String nome;
    private Integer numPagnias;

    public livro(String nome, Integer numPagnias) {
        this.nome = nome;
        this.numPagnias = numPagnias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPagnias() {
        return numPagnias;
    }

    public void setNumPagnias(Integer numPagnias) {
        this.numPagnias = numPagnias;
    }

    @Override
    public String toString() {
        return "livro{" +
                "nome='" + nome + '\'' +
                ", numPagnias=" + numPagnias +
                '}';
    }
}