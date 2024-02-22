package com.me.academia.academia.entity.form;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
@AllArgsConstructor
public class ExercicioForm {


    @NotNull
    @NotEmpty(message = "Preencha o campo nomeExercicio  corretamente.")
    @Size(min = 2, max=120, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
    private String nomeExercicio;

}
