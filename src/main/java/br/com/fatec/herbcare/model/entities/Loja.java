package br.com.fatec.herbcare.model.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tb_loja", schema = "db_herbcare_dev")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class Loja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_loja", nullable = false)
    private Integer id;

    @Column(name = "nm_loja", nullable = false, length = 45)
    private String nome;

    @Column(name = "ds_loja", nullable = false, length = 200, unique = true)
    private String descricao;

    @Column(name = "ds_contato", nullable = false, length = 45)
    private String contato;

    @Column(name = "ds_logradouro", nullable = false, length = 45)
    private String logradouro;

    @Column(name = "ds_complemento", length = 45)
    private String complemento;

    @Column(name = "cd_bairro", nullable = false)
    private Integer codigoBairro;

    @Column(name = "cd_cidade", nullable = false)
    private Integer codigoCidade;

    @Column(name = "sg_estado", nullable = false, length = 2)
    private String siglaEstado;

}
