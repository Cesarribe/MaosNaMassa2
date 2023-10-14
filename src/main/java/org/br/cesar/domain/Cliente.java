package org.br.cesar.domain;

public class Cliente implements Persistente {

    public long getCpf() {
        return Cpf;
    }

    public void setCpf(long cpf) {
        Cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public long getTel() {
        return tel;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    private long Cpf;
   private String nome;
   private String end;
   private long tel;
   private String cidade;
   private String estado;


}
