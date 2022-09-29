package br.com.herbcare.apicadastroplantas.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Table(name = "tb_Planta")
public class Planta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_Planta", nullable = false)
    private Long id;

    @Column(name = "nm_Popular", nullable = false, unique = true)
    @NotBlank
    private String nomePopular;

    @Column(name = "nm_Cientifico", nullable = false, unique = true)
    @NotBlank
    private String nomeCientifico;

    @Column(name = "ds_Receita", nullable = false, length = 256)
    @NotBlank
    private String receita;

//    @NotBlank
//    @ManyToMany
//    @JoinTable(name = "tb_PlantaSintoma")
//    private Set<Sintoma> sintomas;
//
//    private Set<Restricao> restricoes;
//
//    @ManyToOne
//    private Categoria categoria;

}
