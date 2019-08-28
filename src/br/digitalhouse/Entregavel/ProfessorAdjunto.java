package br.digitalhouse.Entregavel;

public class ProfessorAdjunto extends Professor {

    private String nome;
    private String sobrenome;
    private Integer codigoProfessor;
    private Integer horasMonitoria;


    public ProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer horasMonitoria) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codigoProfessor = codigoProfessor;
        this.horasMonitoria = horasMonitoria;
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

    public Integer getHorasMonitoria() {
        return horasMonitoria;
    }

    public void setHorasMonitoria(Integer horasMonitoria) {
        this.horasMonitoria = horasMonitoria;
    }
}
