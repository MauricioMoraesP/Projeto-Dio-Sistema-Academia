package com.me.academia.academia.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
@Table(name = "treino_exercicio")
public class TreinoExercicio {

    @Id
    private Long treino_id;

    @ManyToOne
    @JoinColumn(name = "treino_id", insertable = false, updatable = false)
    private Treino treino;

    @ManyToOne
    @JoinColumn(name = "exercicio_id")
    private Exercicio exercicio;

}
