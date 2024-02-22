package com.me.academia.academia.service;

import com.me.academia.academia.entity.Treino;
import com.me.academia.academia.entity.TreinoExercicio;

import java.util.List;

public interface ITreinoExercicioService {

    public List<TreinoExercicio> getTreinoExercicioID(Long id);
    public TreinoExercicio createExercicio(Long idTreino, Long idExercicio);

    public void deleteExercicio(Long idTreino, Long idExercicio);

}


