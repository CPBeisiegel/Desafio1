package br.digitalhouse.Entregavel;

public class ProfessorTitular extends Professor {

    private String nome;
    private String sobrenome;
    private Integer codigoProfessor;
    private String especialidade;


    public ProfessorTitular(Integer codigoProfessor) {
        this.codigoProfessor = codigoProfessor;
    }

    public ProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codigoProfessor = codigoProfessor;
        this.especialidade = especialidade;
    }

    public ProfessorTitular() {
    }

    @Override
    public String toString() {
        return "ProfessorTitular{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", codigoProfessor=" + codigoProfessor +
                ", especialidade='" + especialidade + '\'' +
                '}';
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getSobrenome() {
        return sobrenome;
    }

    @Override
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public Integer getCodigoProfessor() {
        return codigoProfessor;
    }

    @Override
    public void setCodigoProfessor(Integer codigoProfessor) {
        this.codigoProfessor = codigoProfessor;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
