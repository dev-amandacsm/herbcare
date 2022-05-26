package br.com.fatec.herbcare.model.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_categoria", schema = "db_herbcare_dev")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_categoria", nullable = false)
    private Integer id;

    @Column(name = "nm_categoria", nullable = false, unique = true, length = 45)
    private String nome;

    @Column(name = "ds_categoria", columnDefinition = "TINYTEXT")
    private String descricao;

}
