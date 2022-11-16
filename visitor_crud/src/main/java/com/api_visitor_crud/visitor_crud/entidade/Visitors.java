package com.api_visitor_crud.visitor_crud.entidade;


import javax.persistence.*;

@Entity
public class Visitors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String cpf;
    @Column(nullable = false)
    private String idade;
    @Column(nullable = false)
    private String telefone;
    @Column(nullable = false)
    private String data_de_cadastro;

    @Column(columnDefinition = "varchar(20) default 'ATIVO'")
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getData_de_cadastro() {
        return data_de_cadastro;
    }

    public void setData_de_cadastro(String data_de_cadastro) {
        this.data_de_cadastro = data_de_cadastro;
    }
}
