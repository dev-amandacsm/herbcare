package br.com.fatec.herbcare.model.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tb_usuario", schema = "db_herbcare_dev")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_usuario", nullable = false)
    private Integer id;

    @Column(name = "nm_usuario", nullable = false, length = 45)
    private String nome;

    @Column(name = "ds_login", nullable = false, length = 45, unique = true)
    private String login;

    @Column(name = "ds_senha", nullable = false, length = 45)
    private String senha;

    @Column(name = "ds_logradouro", nullable = false, length = 45)
    private String logradouro;

    @Column(name = "ds_complemento", length = 45)
    private String complemento;

    @Column(name = "cd_bairro", nullable = false)
    private Integer codigoBairro;

    @Column(name = "cd_cidade", nullable = false)
    private Integer codigoCidade;

    @Column(name = "sg_Estado", nullable = false, length = 2)
    private String siglaEstado;

}
