package br.com.fatec.herbcare.model.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tb_usuario", schema = "db_herbcare_dev")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cd_Usuario", nullable = false)
    private Integer id;

    @Column(name = "nm_Usuario", nullable = false, length = 45)
    private String nome;

    @Column(name = "ds_Login", nullable = false, length = 45, unique = true)
    private String login;

    @Column(name = "ds_Senha", nullable = false, length = 45)
    private String senha;

    @Column(name = "ds_Logradouro", nullable = false, length = 45)
    private String logradouro;

    @Column(name="ds_Complemento", length = 45)
    private String complemento;

    @Column(name="cd_Bairro", nullable = false)
    private Integer codigoBairro;

    @Column(name="cd_Cidade", nullable = false)
    private Integer codigoCidade;

    @Column(name="cd_Estado", nullable = false)
    private Integer codigoEstado;

}
