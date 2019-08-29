package br.digitalhouse.entregavel;
//Projeto Entregável
//Feito por Lucas S.A. Pereira
//Mobile Android 03
import java.util.ArrayList;
import java.util.List;

public class Curso {
    String nome;
    ProfAdjunto padjunto;
    ProfTitular ptitular;
    List<Aluno> lista = new ArrayList<>();
    Integer qtdmax;
    Integer codigocurso;

    public Curso(String nome, ProfAdjunto padjunto, ProfTitular ptitular, List<Aluno> lista, Integer qtdmax, Integer codigocurso) {
        this.nome = nome;
        this.padjunto = padjunto;
        this.ptitular = ptitular;
        this.lista = lista;
        this.qtdmax = qtdmax;
        this.codigocurso = codigocurso;
    }

    public Curso(String nome, Integer qtdmax, Integer codigocurso) {
        this.nome = nome;
        this.qtdmax = qtdmax;
        this.codigocurso = codigocurso;
    }

    public Boolean adicionarUmAluno(Aluno umAluno) {
        if (lista.size() <= qtdmax) {
            lista.add(umAluno);
            return true;

        } else {
            return false;


        }


    }



    public void excluirAluno(Aluno umAluno) {
        lista.remove(umAluno);
    }




    public Integer getQtdmax() {
        return qtdmax;
    }

    public void setQtdmax(Integer qtdmax) {
        this.qtdmax = qtdmax;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ProfAdjunto getPadjunto() {
        return padjunto;
    }

    public void setPadjunto(ProfAdjunto padjunto) {
        this.padjunto = padjunto;
    }

    public ProfTitular getPtitular() {
        return ptitular;
    }

    public void setPtitular(ProfTitular ptitular) {
        this.ptitular = ptitular;
    }

    public List<Aluno> getLista() {
        return lista;
    }

    public void setLista(List<Aluno> lista) {
        this.lista = lista;
    }

    public Integer getCodigocurso() {
        return codigocurso;
    }

    public void setCodigocurso(Integer codigocurso) {
        this.codigocurso = codigocurso;
    }


    @Override
    public boolean equals(Object curso) {
        if (((Curso) curso).getCodigocurso().equals(this.getCodigocurso())) {

            return true;
        } else {
            return false;
        }
    }
}
