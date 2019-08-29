package br.digitalhouse.entregavel;
//Projeto Entregável
//Feito por Lucas S.A. Pereira
//Mobile Android 03
import java.util.Date;

public class Matricula {
    Aluno maluno;
    Date mdata;
    Curso mcurso;


    public Matricula(Aluno maluno, Date mdata, Curso mcurso) {
        this.maluno = maluno;
        this.mdata = mdata;
        this.mcurso = mcurso;
    }

    public Aluno getMaluno() {
        return maluno;
    }

    public void setMaluno(Aluno maluno) {
        this.maluno = maluno;
    }

    public Date getMdata() {
        return mdata;
    }

    public void setMdata(Date mdata) {
        this.mdata = mdata;
    }

    public Curso getMcurso() {
        return mcurso;
    }

    public void setMcurso(Curso mcurso) {
        this.mcurso = mcurso;
    }
}
