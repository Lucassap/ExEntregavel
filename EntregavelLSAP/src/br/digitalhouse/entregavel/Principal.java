package br.digitalhouse.entregavel;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        List<Aluno> dhalunos = new ArrayList<Aluno>();
        List<Professor> dhprofessor = new ArrayList<Professor>();
        List<Matricula> dhmatricula = new ArrayList<Matricula>();
        List<Curso> dhcurso = new ArrayList<Curso>();


        DigitalHouseManager dhmg = new DigitalHouseManager(dhalunos, dhprofessor, dhmatricula, dhcurso);

        dhmg.registrarProfessorAdjunto("Lucas", "Pereira", 100, 100);
        dhmg.registrarProfessorTitular("Carlos", "Aquino", 25, "Biologia");
        dhmg.registrarProfessorAdjunto("Mariano", "Carvalho", 205, 100);
        dhmg.registrarProfessorTitular("Michael", "Jailson", 101, "Coaching Quântico");

        dhmg.registrarCurso("Full Stack", 20001, 3);
        dhmg.registrarCurso("Android", 20002, 2);

        dhmg.matricularAluno("Mario", "Betânio", 100);
        dhmg.matricularAluno("Maria", "Betânia", 15);
        dhmg.matricularAluno("Mario", "Lima", 1);
        dhmg.matricularAluno("José", "Guedes", 150);
        dhmg.matricularAluno("Antônio", "Alvarez", 135);


        dhmg.alocarProfessores(20001, 21, 100);
        dhmg.alocarProfessores(20002, 101, 205);

        dhmg.matricularAluno(100,20001 );
        dhmg.matricularAluno(15, 20001);

        dhmg.matricularAluno(1, 20002);
        dhmg.matricularAluno(150, 20002);
        dhmg.matricularAluno(135, 20002);

        System.out.println(dhmg.dhprofessores.size());
        System.out.println(dhmg.dhcursos.size());
        System.out.println(dhmg.dhalunos.size());
        System.out.println(dhmg.dhmatriculas.size());



    }
}
