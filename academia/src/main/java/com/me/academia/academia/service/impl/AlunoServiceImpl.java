package com.me.academia.academia.service.impl;

import com.me.academia.academia.entity.Aluno;
import com.me.academia.academia.entity.form.AlunoForm;
import com.me.academia.academia.repository.AlunoRepository;
import com.me.academia.academia.service.IAlunoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AlunoServiceImpl implements IAlunoService {

    AlunoRepository alunoRepository;

    @Override
    public Aluno getAlunoID(long id) {
        Optional<Aluno> optionalAluno = alunoRepository.findById(id);
        return optionalAluno.orElse(null);
    }


    @Override
    public Aluno createAluno(AlunoForm aluno) {
       Aluno aluno1= new Aluno();
       aluno1.setCpf(aluno.getCpf());
       aluno1.setNome(aluno.getNome());
       aluno1.setDataNascimento(aluno.getDataNascimento());
       return alunoRepository.save(aluno1);
    }


    @Override
    public void deleteAluno(long id) {
         alunoRepository.deleteById(id);
    }

    @Override
    public Aluno updateAluno(long id, AlunoForm alunoForm) {
        Optional<Aluno> optionalAluno = alunoRepository.findById(id);
        if (optionalAluno.isPresent()) {
            Aluno aluno = optionalAluno.get();
            aluno.setNome(alunoForm.getNome());
            aluno.setCpf(alunoForm.getCpf());
            aluno.setDataNascimento(alunoForm.getDataNascimento());
            aluno = alunoRepository.save(aluno);
            return aluno;
        } else {
            return null;
        }
    }


    @Override
    public List<Aluno> getListAluno() {
        List<Aluno> listaAlunos= new ArrayList<>();
        listaAlunos=alunoRepository.findAll();
        return listaAlunos;
    }
}
