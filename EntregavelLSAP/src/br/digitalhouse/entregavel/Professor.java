package br.digitalhouse.entregavel;
//Projeto Entregável
//Feito por Lucas S.A. Pereira
//Mobile Android 03
public abstract class Professor {
    String nome;
    String sobrenome;
    Integer tempocasa;
    Integer codigoprofessor;


    @Override
    public boolean equals(Object professor) {
        if (((Professor)professor).getCodigoprofessor().equals(this.getCodigoprofessor())) {
            return true;
        } else {
            return false;
        }
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

    public Integer getTempocasa() {
        return tempocasa;
    }

    public void setTempocasa(Integer tempocasa) {
        this.tempocasa = tempocasa;
    }

    public Integer getCodigoprofessor() {
        return codigoprofessor;
    }

    public void setCodigoprofessor(Integer codigoprofessor) {
        this.codigoprofessor = codigoprofessor;
    }



}
