package com.me.academia.academia.controller;
import com.me.academia.academia.entity.Aluno;
import com.me.academia.academia.entity.form.AlunoForm;
import com.me.academia.academia.service.impl.AlunoServiceImpl;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/alunos")
@AllArgsConstructor
public class AlunoController {

    AlunoServiceImpl alunoService;

    @PostMapping
    public Aluno criarAluno(@Valid @RequestBody AlunoForm alunoForm){
    return alunoService.createAluno(alunoForm);
    }

    @DeleteMapping("/{id}")
    public void deleteAluno(@PathVariable Long id){
         alunoService.deleteAluno(id);
    }

    @GetMapping("/todos-alunos")
    public List<Aluno> getAllAlunos(){
        return alunoService.getListAluno();
    }
}
