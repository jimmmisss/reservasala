package br.com.reservasala.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

public class Sala implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String descricaoSala;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "localId")
    private Local local;

    public Sala() {
    }

    public Sala(Integer id, String descricaoSala) {
        this.id = id;
        this.descricaoSala = descricaoSala;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricaoSala() {
        return descricaoSala;
    }

    public void setDescricaoSala(String descricaoSala) {
        this.descricaoSala = descricaoSala;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sala sala = (Sala) o;

        return id != null ? id.equals(sala.id) : sala.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "id=" + id +
                ", descricaoSala='" + descricaoSala + '\'' +
                '}';
    }
}
