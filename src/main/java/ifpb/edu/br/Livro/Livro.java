/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.edu.br.Livro;

import java.io.Serializable;
import java.util.Date;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Cliente
 */
@Entity
public class Livro implements Serializable {

    @Id
    @GenericGenerator(name = "increment", strategy = "increment")
    @GeneratedValue(generator = "increment")
    private int id;
    @Column(length = 100, nullable = false)
    private String titulo;
    @Column(nullable = false)
    private String escritor;
    private String editora;
    @Temporal(TemporalType.DATE)
    private Date dataEdicao;
    private int numDePaginas;
    private String descricao;

    public Livro(String titulo, String escritor, String editora, int numDePaginas, String descricao) {

        this.titulo = titulo;
        this.escritor = escritor;
        this.descricao = descricao;
        this.editora = editora;
        this.dataEdicao = new Date();
        this.numDePaginas = numDePaginas;
    }

    Livro() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEscritor() {
        return escritor;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Date getDataEdicao() {
        return dataEdicao;
    }

    public void setDataEdicao(Date dataEdicao) {
        this.dataEdicao = dataEdicao;
    }

    public int getNumDePaginas() {
        return numDePaginas;
    }

    public void setNumDePaginas(int numDePaginas) {
        this.numDePaginas = numDePaginas;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + this.id;
        hash = 61 * hash + Objects.hashCode(this.titulo);
        hash = 61 * hash + Objects.hashCode(this.escritor);
        hash = 61 * hash + Objects.hashCode(this.editora);
        hash = 61 * hash + Objects.hashCode(this.dataEdicao);
        hash = 61 * hash + this.numDePaginas;
        hash = 61 * hash + Objects.hashCode(this.descricao);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Livro other = (Livro) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.numDePaginas != other.numDePaginas) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.escritor, other.escritor)) {
            return false;
        }
        if (!Objects.equals(this.editora, other.editora)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.dataEdicao, other.dataEdicao)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Livro{" + "id=" + id + ", titulo=" + titulo + ", escritor=" + escritor
                + ", editora=" + editora + ", dataEdicao=" + dataEdicao + ", "
                + "numDePaginas=" + numDePaginas + ", descricao=" + descricao + '}';
    }

}
