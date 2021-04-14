package dev.nicollas;

public class Aluno {
    public long RA;
    public String nome;

    public Aluno(long RA, String nome) {
        this.RA = RA;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "RA=" + RA +
                ", nome='" + nome + '\'' +
                '}';
    }
}
