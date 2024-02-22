package com.me.academia.academia.controller;
import com.me.academia.academia.entity.Matricula;
import com.me.academia.academia.entity.form.MatriculaForm;
import com.me.academia.academia.service.impl.MatriculaServiceImpl;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matricula")
@AllArgsConstructor
public class MatriculaController {

    MatriculaServiceImpl matriculaService;

    @PostMapping
    public Matricula criarMatricula(@Valid @RequestBody MatriculaForm matriculaForm){
        return matriculaService.createMatricula(matriculaForm);
    }

    @DeleteMapping("/{id}")
    public void deleteMatricula(@PathVariable Long id){
        matriculaService.deleteMatricula(id);
    }

    @GetMapping("/todas-matriculas")
    public List<Matricula> getAllMatricula(){
        return matriculaService.getListMatricula();
    }

}
