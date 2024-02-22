package com.me.academia.academia.controller;

import com.me.academia.academia.entity.Aluno;
import com.me.academia.academia.entity.Exercicio;
import com.me.academia.academia.entity.form.AlunoForm;
import com.me.academia.academia.entity.form.ExercicioForm;
import com.me.academia.academia.service.impl.AlunoServiceImpl;
import com.me.academia.academia.service.impl.ExercicioServiceImpl;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exercicio")
@AllArgsConstructor
public class ExercicioController {

    ExercicioServiceImpl exercicioService;

    @PostMapping
    public Exercicio criarExercicio(@Valid @RequestBody ExercicioForm exercicioForm){
        return exercicioService.createExercicio(exercicioForm);
    }

    @DeleteMapping("/{id}")
    public void deleteExercicio(@PathVariable Long id){
        exercicioService.deleteExercicio(id);
    }

    @GetMapping("/todos-exercicios")
    public List<Exercicio> getAllAExercicio(){
        return exercicioService.getListExercicio();
    }
}
