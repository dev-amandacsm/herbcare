package br.com.herbcare.apicadastroplantas.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tb_Categoria", schema = "db_herbcare")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_Categoria")
    @NotNull
    private Long id;

    @Column(name = "nm_Categoria", nullable = false, unique = true, length = 256)
    @NotBlank
    private String nome;

    @Column(name = "ds_Descricao", nullable = false, unique = true, length = 256)
    @NotBlank
    private String descricao;




}
