package com.me.academia.academia.service.impl;

import com.me.academia.academia.entity.Exercicio;
import com.me.academia.academia.entity.Treino;
import com.me.academia.academia.entity.TreinoExercicio;
import com.me.academia.academia.repository.ExercicioRepository;
import com.me.academia.academia.repository.TreinoExercicioRepository;
import com.me.academia.academia.repository.TreinoRepository;
import com.me.academia.academia.service.ITreinoExercicioService;
import com.me.academia.academia.service.ITreinoService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class TreinoExericicoServiceImpl implements ITreinoExercicioService {

    TreinoExercicioRepository treinoExercicioRepository;
    ExercicioRepository exercicioRepository;

    TreinoRepository treinoRepository;
    @Override
    public List<TreinoExercicio> getTreinoExercicioID(Long id) {
        Optional<TreinoExercicio> treinoExercicioOptional = treinoExercicioRepository.findById(id);
        return treinoExercicioOptional.map(Collections::singletonList).orElse(Collections.emptyList());
    }


    @Override
    public TreinoExercicio createExercicio(Long idTreino, Long idExercicio) {
        TreinoExercicio treinoExercicio = new TreinoExercicio();
        Treino treino = treinoRepository.findById(idTreino).orElse(null);
        Exercicio exercicio = exercicioRepository.findById(idExercicio).orElse(null);

        if (treino != null && exercicio != null) {
            treinoExercicio.setTreino(treino);
            treinoExercicio.setExercicio(exercicio);
            treinoExercicioRepository.save(treinoExercicio);
        } else {
            throw new RuntimeException("Treino ou exercício não encontrados");
        }

        return treinoExercicio;
    }

    @Override
    public void deleteExercicio(Long idTreino, Long idExercicio) {
        treinoExercicioRepository.deleteTreinoExercicio(idTreino,idExercicio);
    }
}
