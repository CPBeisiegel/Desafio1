package br.digitalhouse.Entregavel;

import java.util.List;

public class DigitalHouseManager {

    private List<Aluno> listadealunos;
    private List<Professor> listaprofessores;
    private List<Curso> listacursos;
    private List<Matricula> listamatriculas;


    public List<Aluno> getListadealunos() {
        return listadealunos;
    }

    public void setListadealunos(List<Aluno> listadealunos) {
        this.listadealunos = listadealunos;
    }

    public List<Professor> getListaprofessores() {
        return listaprofessores;
    }

    public void setListaprofessores(List<Professor> listaprofessores) {
        this.listaprofessores = listaprofessores;
    }

    public List<Curso> getListacursos() {
        return listacursos;
    }

    public void setListacursos(List<Curso> listacursos) {
        this.listacursos = listacursos;
    }

    public List<Matricula> getListamatriculas() {
        return listamatriculas;
    }

    public void setListamatriculas(List<Matricula> listamatriculas) {
        this.listamatriculas = listamatriculas;
    }


    public void registrarCurso(String nome, Integer codigoCurso, Integer quantidadeMaximaDeAlunos){
        Curso novoCurso = new Curso(nome,codigoCurso,quantidadeMaximaDeAlunos);
        listacursos.add(novoCurso);
    }

    public void excluirCurso(Integer codigoCurso){
        listacursos.remove(codigoCurso);
    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer quantidadeDeHoras){
        ProfessorAdjunto novoProfessorAdjunto = new ProfessorAdjunto(nome,sobrenome,codigoProfessor,quantidadeDeHoras);
        listaprofessores.add(novoProfessorAdjunto);
    }

    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade){
        ProfessorTitular novoProfessorTitular = new ProfessorTitular(nome, sobrenome, codigoProfessor, especialidade);
        listaprofessores.add(novoProfessorTitular);
    }

    public void excluirProfessor(Integer codigoProfessor){
        listaprofessores.remove(codigoProfessor);
    }


    public void matricularAluno(String nome, String sobrenome,Integer codigoAluno){
        Aluno matriculandoAluno = new Aluno(nome,sobrenome,codigoAluno);
        listadealunos.add(matriculandoAluno);
    }

    public void matricularAluno(Integer codigoAluno, Integer codigoCurso){

    }

    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto){

    }


}
