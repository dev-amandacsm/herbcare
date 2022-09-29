package br.com.fatec.herbcare.model.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tb_restricao", schema = "db_herbcare_dev")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Restricao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_restricao", nullable = false)
    private Integer id;

    @Column(name = "nm_grupo", nullable = false, length = 45, unique = true)
    private String nome;

    @ManyToMany(mappedBy = "restricoes")
    private List<Planta> plantas;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Restricao restricao = (Restricao) o;
        return id != null && Objects.equals(id, restricao.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "nome = " + nome + ")";
    }
}
