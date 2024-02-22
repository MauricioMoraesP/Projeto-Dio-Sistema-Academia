package com.me.academia.academia.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
@Table(name = "treino")
public class Treino {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "treino", cascade = CascadeType.ALL)
    private List<TreinoExercicio> exercicios;

    private Date dataCriacao;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="matricula_id")
    private Matricula idMatricula;

    private boolean utilizado;

}
