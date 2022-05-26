package br.com.fatec.herbcare.model.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_planta", schema = "db_herbcare_dev")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
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

    @ManyToOne //muitas plantas associadas a uma categoria
    @JoinColumn(name = "cd_categoria", nullable = false)
    private Categoria categoria;

    @ManyToMany
    @JoinTable(name = "tb_planta_sintoma", joinColumns = @JoinColumn(name = "cd_planta"), inverseJoinColumns = @JoinColumn(name = "cd_sintoma"))
    private List<Sintoma> sintomas;

    @ManyToMany
    @JoinTable(name = "tb_planta_restricao", joinColumns = @JoinColumn(name = "cd_planta"), inverseJoinColumns = @JoinColumn(name = "cd_sintoma"))
    private List<Restricao> restricoes;



}
