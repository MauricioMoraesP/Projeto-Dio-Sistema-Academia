package com.me.academia.academia.service;

import com.me.academia.academia.entity.Exercicio;
import com.me.academia.academia.entity.form.ExercicioForm;

import java.util.List;

public interface IExercicioService {
    public Exercicio getExercicioID(long id);

    public Exercicio createExercicio(ExercicioForm exercicioForm);

    public void deleteExercicio(long id);

    public Exercicio updateExercicio(long id, ExercicioForm exercicioForm);

    public List<Exercicio> getListExercicio();

    interface ITreinoExercicioRepository {
    }
}
