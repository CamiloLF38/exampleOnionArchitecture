package com.onionArch.onionArchitecture.dominio;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name="Usuarios")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;

}
