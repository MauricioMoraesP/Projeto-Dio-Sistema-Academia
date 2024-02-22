package com.me.academia.academia.controller;


import com.me.academia.academia.entity.Treino;
import com.me.academia.academia.entity.TreinoExercicio;
import com.me.academia.academia.entity.form.TreinoForm;
import com.me.academia.academia.repository.TreinoExercicioRepository;
import com.me.academia.academia.service.impl.TreinoExericicoServiceImpl;
import com.me.academia.academia.service.impl.TreinoServiceImpl;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/treino-exercicio")
@AllArgsConstructor
public class TreinoExercicioController {

    TreinoExericicoServiceImpl treinoExericicoService;
    @PostMapping
    public TreinoExercicio criarTreino(@RequestBody Long treinoId, Long exercicioId){
        return treinoExericicoService.createExercicio(treinoId,exercicioId);
    }

    @DeleteMapping
    public void deleteTreino(@RequestBody Long treinoId, Long exercicioId){
         treinoExericicoService.deleteExercicio(treinoId,exercicioId);
    }

    @GetMapping("/listar-{id}")
    public List<TreinoExercicio>  getAllTreinos(@PathVariable Long id){
        return  treinoExericicoService.getTreinoExercicioID(id);
    }
}
