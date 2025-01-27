package com.teccsoluction.sushi.entidade;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name = "EMPRESA")
public class Empresa implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "NOME_FANTASIA")
    private String nomefantasia;

    @Column(name = "RAZAO_SOCIAL")
    private String razaosocial;

    @Column(name = "CNPJ")
    private String cnpj;

    @Column(name = "INSCRICAOESTADUAL")
    private String inscricaoestadual;

    @Column(name = "LOGO")
    private String logo;
    
	@Temporal(TemporalType.DATE)   
	@DateTimeFormat(pattern = "dd/MM/yyyy")	
    @Column(name="DATAABERTURA")
	
    private Date dataabertura;


    //CONSTRUTOR PADRAO

    public Empresa() {
        // TODO Auto-generated constructor stub
    }


    //GETTERS AND SETTERS

    public String getNome() {
        return nomefantasia;
    }


    public void setNome(String nome) {
        this.nomefantasia = nome;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomefantasia() {
        return nomefantasia;
    }


    public void setNomefantasia(String nomefantasia) {
        this.nomefantasia = nomefantasia;
    }


    public String getRazaosocial() {
        return razaosocial;
    }


    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }


    public String getCnpj() {
        return cnpj;
    }


    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }


    public String getLogo() {
        return logo;
    }


    public void setLogo(String logo) {
        this.logo = logo;
    }


    public Date getDataabertura() {
        return dataabertura;
    }


    public void setDataabertura(Date dataabertura) {
        this.dataabertura = dataabertura;
    }

    public String getInscricaoestadual() {
        return inscricaoestadual;
    }


    public void setInscricaoestadual(String inscricaoestadual) {
        this.inscricaoestadual = inscricaoestadual;
    }

    @Override
    public String toString() {
        return nomefantasia;
    }

}
