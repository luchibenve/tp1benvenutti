package com.utn.tp1.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table (name = "Domicilio")
public class Domicilio extends BaseEntidad {
    @Column(name = "calle", length = 50, nullable = false)
    private String calle;

    @Column(name = "numero", length = 50, nullable = false)
    private String numero;

    @Column(name = "localidad", length = 50, nullable = false)
    private String localidad;

}
