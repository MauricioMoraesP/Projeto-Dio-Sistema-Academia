package com.me.academia.academia.service;

import com.me.academia.academia.entity.Aluno;
import com.me.academia.academia.entity.form.AlunoForm;

import java.util.List;

public interface IAlunoService {

    public Aluno getAlunoID(long id);

    public Aluno createAluno(AlunoForm aluno);

    public void deleteAluno(long id);

    public Aluno updateAluno(long id, AlunoForm alunoForm);

    public List<Aluno> getListAluno();

}
