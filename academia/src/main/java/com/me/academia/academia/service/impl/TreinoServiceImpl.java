package com.me.academia.academia.service.impl;
import com.me.academia.academia.entity.Treino;
import com.me.academia.academia.entity.TreinoExercicio;
import com.me.academia.academia.entity.form.TreinoForm;
import com.me.academia.academia.repository.TreinoExercicioRepository;
import com.me.academia.academia.repository.TreinoRepository;
import com.me.academia.academia.service.ITreinoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TreinoServiceImpl implements ITreinoService {

    private  TreinoRepository treinoRepository;
    private TreinoExercicioRepository treinoExercicioRepository;



    @Override
    public Treino getTreinoID(long id) {
        return treinoRepository.findById(id).orElse(null);
    }

    @Override
    public Treino createTreino(TreinoForm treinoForm) {
        Treino treino = new Treino();
        treino.setExercicios(treinoForm.getExercicios());
        treino.setDataCriacao(treinoForm.getDataCriacao());
        treino.setIdMatricula(treinoForm.getIdMatricula());
        treino.setUtilizado(treinoForm.isUtilizado());
        return treinoRepository.save(treino);
    }

    @Override
    public void deleteTreino(long id) {
        treinoRepository.deleteById(id);
    }

    @Override
    public Treino updateTreino(long id, TreinoForm treinoForm) {
        Optional<Treino> optionalTreino = treinoRepository.findById(id);
        if (optionalTreino.isPresent()) {
            Treino treino = optionalTreino.get();
            treino.setExercicios(treinoForm.getExercicios());
            treino.setDataCriacao(treinoForm.getDataCriacao());
            treino.setUtilizado(treinoForm.isUtilizado());
            return treinoRepository.save(treino);
        }
        return null;
    }

    @Override
    public List<Treino> getListTreino() {
        return treinoRepository.findAll();
    }
}
