package com.me.academia.academia.service.impl;

import com.me.academia.academia.entity.Exercicio;
import com.me.academia.academia.entity.form.ExercicioForm;
import com.me.academia.academia.repository.ExercicioRepository;
import com.me.academia.academia.service.IExercicioService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ExercicioServiceImpl implements IExercicioService {

    private final ExercicioRepository exercicioRepository;



    @Override
    public Exercicio getExercicioID(long id) {
        return exercicioRepository.findById(id).orElse(null);
    }

    @Override
    public Exercicio createExercicio(ExercicioForm exercicioForm) {
        Exercicio exercicio = new Exercicio();
        exercicio.setNomeExercicio(exercicioForm.getNomeExercicio());
        return exercicioRepository.save(exercicio);
    }

    @Override
    public void deleteExercicio(long id) {
        exercicioRepository.deleteById(id);
    }

    @Override
    public Exercicio updateExercicio(long id, ExercicioForm exercicioForm) {
        Optional<Exercicio> optionalExercicio = exercicioRepository.findById(id);
        if (optionalExercicio.isPresent()) {
            Exercicio exercicio = optionalExercicio.get();
            exercicio.setNomeExercicio(exercicioForm.getNomeExercicio());
            return exercicioRepository.save(exercicio);
        }
        return null;
    }

    @Override
    public List<Exercicio> getListExercicio() {
        return exercicioRepository.findAll();
    }
}
