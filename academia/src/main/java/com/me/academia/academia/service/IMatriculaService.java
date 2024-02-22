package com.me.academia.academia.service;

import com.me.academia.academia.entity.Matricula;
import com.me.academia.academia.entity.form.MatriculaForm;

import java.util.List;

public interface IMatriculaService {
    public Matricula getMatriculaID(long id);

    public Matricula createMatricula(MatriculaForm matriculaForm);

    public void deleteMatricula(long id);

    public Matricula updateMatricula(long id, MatriculaForm matriculaForm);

    public List<Matricula> getListMatricula();
}
