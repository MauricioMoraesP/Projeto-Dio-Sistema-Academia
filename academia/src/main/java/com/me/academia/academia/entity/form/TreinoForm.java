package com.me.academia.academia.entity.form;

import com.me.academia.academia.entity.Exercicio;
import com.me.academia.academia.entity.Matricula;
import com.me.academia.academia.entity.TreinoExercicio;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class TreinoForm {


    private List<TreinoExercicio> exercicios;

    @PastOrPresent
    private Date dataCriacao;

    @NotEmpty
    @NotNull
    private Matricula idMatricula;

    @NotEmpty
    @NotNull
    private boolean utilizado;
}
