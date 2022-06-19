package br.com.pdist.apiteste.model;

import javax.persistence.*;


@Entity
@Table(name="usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String nome;
    private String cpf;
    private Integer idade;
    private String sexo;

    public Usuario(){}

    public Usuario(Long id, String nome, String cpf, Integer idade, String dataAdm, String sexo) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
