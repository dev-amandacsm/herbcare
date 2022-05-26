package br.com.fatec.herbcare.model.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "tb_sintoma", schema = "db_herbcare_dev")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class Sintoma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_sintoma", nullable = false)
    private Integer id;

    @Column(name = "nm_sintoma", nullable = false, length = 45, unique = true)
    private String nome;

    @ManyToMany(mappedBy = "sintomas")
    private List<Planta> plantas;

}
