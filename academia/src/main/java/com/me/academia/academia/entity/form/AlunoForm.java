package com.me.academia.academia.entity.form;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import java.util.Date;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class AlunoForm {

    @NotNull
    @NotEmpty(message = "Preencha o campo corretamente.")
    @Size (min = 2, max=120, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
    private String nome;

    @CPF(message = "'${validatedValue}' é inválido!")
    @NotEmpty(message = "Preencha o campo corretamente.")
    @NotNull
    private String cpf;

    @Past(message = "Data '${validatedValue}' é inválida.")
    @NotNull
    private Date dataNascimento;
}
