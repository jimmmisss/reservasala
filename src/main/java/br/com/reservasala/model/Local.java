package br.com.reservasala.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Local implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String descricaoLocal;

    @OneToMany(mappedBy = "local", cascade = CascadeType.ALL)
    private List<Sala> salas = new ArrayList<>();

    public Local() {
    }

    public Local(Integer id, String descricaoLocal) {
        this.id = id;
        this.descricaoLocal = descricaoLocal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricaoLocal() {
        return descricaoLocal;
    }

    public void setDescricaoLocal(String descricaoLocal) {
        this.descricaoLocal = descricaoLocal;
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public void setSalas(List<Sala> salas) {
        this.salas = salas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Local local = (Local) o;

        return id != null ? id.equals(local.id) : local.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Local{" +
                "id=" + id +
                ", descricaoLocal='" + descricaoLocal + '\'' +
                ", salas=" + salas +
                '}';
    }
}
