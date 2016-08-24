package com.teccsoluction.sushi.entidade;

import com.teccsoluction.sushi.util.TipoUsuario;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "USUARIO")
public class Usuario implements Serializable {


    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "senha")
    private String senha;

    @Enumerated(EnumType.STRING)
    private TipoUsuario tipo;

    @Column(name = "email")
    private String email;


    public Usuario() {
        // TODO Auto-generated constructor stub
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public long getId() {
        return id;
    }

    public String getSenha() {
        return senha;
    }


    public void setSenha(String senha) {
        this.senha = senha;
    }

    public TipoUsuario getTipo() {
        return tipo;
    }


    public void setTipo(TipoUsuario tipo) {
        this.tipo = tipo;
    }

    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return nome;
    }


}
