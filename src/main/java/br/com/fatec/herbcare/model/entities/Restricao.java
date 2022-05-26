package br.com.fatec.herbcare.model.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_restricao", schema = "db_herbcare_dev")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class Restricao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_restricao", nullable = false)
    private Integer id;

    @Column(name = "nm_grupo", nullable = false, length = 45, unique = true)
    private String nome;

    @ManyToMany(mappedBy = "restricoes")
    private List<Planta> plantas;

}
