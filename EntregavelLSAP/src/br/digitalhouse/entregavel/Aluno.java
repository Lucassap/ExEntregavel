package br.digitalhouse.entregavel;
//Projeto Entregável
//Feito por Lucas S.A. Pereira
//Mobile Android 03
public class Aluno {
    String nome;
    String sobrenome;
    Integer codigoaluno;


    public Aluno(String nome, String sobrenome, Integer codigoaluno) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codigoaluno = codigoaluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getCodigoaluno() {
        return codigoaluno;
    }

    public void setCodigoaluno(Integer codigoaluno) {
        this.codigoaluno = codigoaluno;
    }


    @Override
    public boolean equals(Object aluno) {
        if (((Aluno)aluno).getCodigoaluno().equals(this.getCodigoaluno())) {
            return true;
        } else {
            return false;
        }
    }
}
