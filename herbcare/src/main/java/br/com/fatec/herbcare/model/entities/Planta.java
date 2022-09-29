package br.com.fatec.herbcare.model.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tb_planta", schema = "db_herbcare_dev")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Planta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_planta", nullable = false)
    private Integer id;

    @Column(name = "nm_popular", nullable = false, length = 45, unique = true)
    private String nomePopular;

    @Column(name = "nm_cientifico", nullable = false, length = 45, unique = true)
    private String nomeCientifico;

    @Column(name = "ds_receita", nullable = false, columnDefinition = "TINYTEXT")
    private String receita;

    @ManyToMany
    @JoinTable(name = "tb_planta_sintoma", joinColumns = @JoinColumn(name = "cd_planta"), inverseJoinColumns = @JoinColumn(name = "cd_sintoma"))
    private List<Sintoma> sintomas;

    @ManyToMany
    @JoinTable(name = "tb_planta_restricao", joinColumns = @JoinColumn(name = "cd_planta"), inverseJoinColumns = @JoinColumn(name = "cd_sintoma"))
    private List<Restricao> restricoes;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Planta planta = (Planta) o;
        return id != null && Objects.equals(id, planta.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "nomePopular = " + nomePopular + ", " +
                "nomeCientifico = " + nomeCientifico + ", " +
                "receita = " + receita + ")";
    }
}
