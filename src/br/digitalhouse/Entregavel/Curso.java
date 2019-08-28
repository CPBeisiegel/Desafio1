package br.digitalhouse.Entregavel;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nome;
    private Integer codigoCurso;
    private ProfessorTitular professorTitular;
    private ProfessorAdjunto professorAdjunto;
    private Integer quantidadeMaximaAlunos;
    private List<Aluno> listaAlunos = new ArrayList<>();

    public Curso(String nome, Integer codigoCurso,Integer quantidadeMaximaAlunos) {
        this.nome = nome;
        this.codigoCurso = codigoCurso;
        this.quantidadeMaximaAlunos = quantidadeMaximaAlunos;

    }

    public String getNome() {
        return nome;
    }

    public Integer getCodigoCurso() {
        return codigoCurso;
    }

    public Integer getQuantidadeMaximaAlunos() {
        return quantidadeMaximaAlunos;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigoCurso(Integer codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public void setQuantidadeMaximaAlunos(Integer quantidadeMaximaAlunos) {
        this.quantidadeMaximaAlunos = quantidadeMaximaAlunos;
    }

    public boolean adicionarUmAluno(Aluno umAluno) {
        if(listaAlunos.size() <= quantidadeMaximaAlunos){
            listaAlunos.add(umAluno);
            System.out.println("Aluno adicionado");
            return true;
        } else{
            System.out.println("Turma lotada");
            return false;
        }
    }

    public void excluirAluno(Aluno umAluno){
        listaAlunos.remove(umAluno);
    }
}

