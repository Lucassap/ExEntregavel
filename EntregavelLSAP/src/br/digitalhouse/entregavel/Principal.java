package br.digitalhouse.entregavel;
//Projeto Entregável
//Feito por Lucas S.A. Pereira
//Mobile Android 03
import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        List<Aluno> dhalunos = new ArrayList<Aluno>();
        List<Professor> dhprofessor = new ArrayList<Professor>();
        List<Matricula> dhmatricula = new ArrayList<Matricula>();
        List<Curso> dhcurso = new ArrayList<Curso>();

        /*Cria a escola*/
        DigitalHouseManager dhmg = new DigitalHouseManager(dhalunos, dhprofessor, dhmatricula, dhcurso);

        /* Cadastra professores na escola*/
        dhmg.registrarProfessorAdjunto("Lucas", "Pereira", 100, 100);
        dhmg.registrarProfessorTitular("Carlos", "Aquino", 25, "Biologia");
        dhmg.registrarProfessorAdjunto("Mariano", "Carvalho", 205, 100);
        dhmg.registrarProfessorTitular("Michael", "Jailson", 101, "Coaching Quântico");

        /*Registra cursos na escola*/
        dhmg.registrarCurso("Full Stack", 20001, 3);
        dhmg.registrarCurso("Android", 20002, 2);

        /* Cadastra alunos na escola*/
        dhmg.matricularAluno("Mario", "Betânio", 100);
        dhmg.matricularAluno("Maria", "Betânia", 15);
        dhmg.matricularAluno("Mario", "Lima", 1);
        dhmg.matricularAluno("José", "Guedes", 150);
        dhmg.matricularAluno("Antônio", "Alvarez", 135);

        /* Aloca professores aos cursos*/
        dhmg.alocarProfessores(20001, 25, 100);
        dhmg.alocarProfessores(20002, 101, 205);

        /* Matricular aluno na lista de matrículas*/
        dhmg.matricularAluno(100,20001);
        dhmg.matricularAluno(15, 20001);

        /* Matricular aluno nos cursos*/
        dhmg.matricularAluno(1, 20002);
        dhmg.matricularAluno(150, 20002);
        dhmg.matricularAluno(135, 20002);

        /* Verificar curso no qual o aluno foi cadastrado*/
        dhmg.verificarCursosAluno(dhmatricula, 100);
        dhmg.verificarCursosAluno(dhmatricula, 1);
        dhmg.verificarCursosAluno(dhmatricula, 150);





    }
}
