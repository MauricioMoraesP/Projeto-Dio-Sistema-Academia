package com.me.academia.academia.controller;

import com.me.academia.academia.entity.Treino;
import com.me.academia.academia.entity.form.TreinoForm;
import com.me.academia.academia.service.impl.TreinoServiceImpl;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/treino")
@AllArgsConstructor
public class TreinoController {

    TreinoServiceImpl treinoService;

    @PostMapping
    public Treino criarTreino(@Valid @RequestBody TreinoForm treinoForm){
        return treinoService.createTreino(treinoForm);
    }

    @DeleteMapping("/{id}")
    public void deleteTreino(@PathVariable Long id){
        treinoService.deleteTreino(id);
    }

    @GetMapping("/todos-treinos")
    public List<Treino> getAllTreinos(){
        return treinoService.getListTreino();
    }
}
