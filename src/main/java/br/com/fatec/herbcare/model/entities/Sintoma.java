package br.com.fatec.herbcare.model.entities;

import lombok.*;

import javax.persistence.*;

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

    @Column(name = "nm_sintoma", nullable = false, length = 45)
    private String nome;

}
