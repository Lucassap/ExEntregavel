package br.digitalhouse.entregavel;

import java.util.List;

public class DigitalHouseManager {
    List<Aluno> dhalunos;
    List<Professor> dhprofessores;
    List<Matricula> dhmatriculas;
    List<Curso> dhcursos;


    public DigitalHouseManager(List<Aluno> dhalunos, List<Professor> dhprofessores, List<Matricula> dhmatriculas, List<Curso> dhcursos) {
        this.dhalunos = dhalunos;
        this.dhprofessores = dhprofessores;
        this.dhmatriculas = dhmatriculas;
        this.dhcursos = dhcursos;
    }

    public void registrarCurso(String nome, Integer codigoCurso, Integer quantidadeMaximaDeAlunos) {
        Curso reg = new Curso(nome, codigoCurso, quantidadeMaximaDeAlunos);
        dhcursos.add(reg);

    }

    public void excluirCurso(Integer codigoCurso) {
        for (int i = 0; i < dhcursos.size(); i++) {
            if (dhcursos.get(i).getCodigocurso() == codigoCurso) {
                dhcursos.remove(i);
                return;
            } else {
                System.out.println("Curso não encontrado");
            }

        }

    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer quantidadeDeHoras){
        ProfAdjunto reg = new ProfAdjunto(nome,sobrenome,0, codigoProfessor,quantidadeDeHoras);
        dhprofessores.add(reg);



    }

    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade){
        ProfTitular reg = new ProfTitular(nome,sobrenome,0,codigoProfessor,especialidade);
        dhprofessores.add(reg);


    }


    public void excluirProfessor(Integer codigoProfessor) {
        for (int i = 0; i < dhcursos.size(); i++) {
            if (dhprofessores.get(i).getCodigoprofessor() == codigoProfessor) {
                dhprofessores.remove(i);
                return;
            } else {
                System.out.println("Professor não encontrado");
            }

        }

    }

    public void matricularAluno(String nome, String sobrenome, Integer codigoAluno){
        Aluno reg = new Aluno(nome,sobrenome,codigoAluno);

    }

    public void matricularAluno(Integer codigoAluno, Integer codigoCurso){
        Integer auxcodigoaluno;



        for (int i = 0; i <dhalunos.size() ; i++) {
            if (dhalunos.get(i).getCodigoaluno() == codigoAluno) {
                auxcodigoaluno = dhalunos.get(i).getCodigoaluno();
            }

        }

        for (int a = 0; a <dhcursos.size() ; a++) {
            if(dhcursos.get(a).getCodigocurso() == codigoCurso){
                if(dhcursos.get(a).getQtdmax() != 0){

                }


            }

        }

    }


    public List<Aluno> getDhalunos() {
        return dhalunos;
    }

    public void setDhalunos(List<Aluno> dhalunos) {
        this.dhalunos = dhalunos;
    }

    public List<Professor> getDhprofessores() {
        return dhprofessores;
    }

    public void setDhprofessores(List<Professor> dhprofessores) {
        this.dhprofessores = dhprofessores;
    }

    public List<Matricula> getDhmatriculas() {
        return dhmatriculas;
    }

    public void setDhmatriculas(List<Matricula> dhmatriculas) {
        this.dhmatriculas = dhmatriculas;
    }

    public List<Curso> getDhcursos() {
        return dhcursos;
    }

    public void setDhcursos(List<Curso> dhcursos) {
        this.dhcursos = dhcursos;
    }
}
