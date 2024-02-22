package com.me.academia.academia.entity.form;

import com.me.academia.academia.entity.Aluno;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;

import java.util.Date;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class MatriculaForm {


    @Column(unique = true)
    @NotNull
    private Long alunoId;

    @NotNull
    private Date dataMatricula;
}
