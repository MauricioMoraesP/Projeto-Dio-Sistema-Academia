package com.me.academia.academia.service.impl;

import com.me.academia.academia.entity.Matricula;
import com.me.academia.academia.entity.form.MatriculaForm;
import com.me.academia.academia.repository.MatriculaRepository;
import com.me.academia.academia.service.IMatriculaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MatriculaServiceImpl implements IMatriculaService {

    private final MatriculaRepository matriculaRepository;

    @Override
    public Matricula getMatriculaID(long id) {
        return matriculaRepository.findById(id).orElse(null);
    }

    @Override
    public Matricula createMatricula(MatriculaForm matriculaForm) {
        Matricula matricula = new Matricula();
        matricula.setAlunoId(matriculaForm.getAlunoId());
        matricula.setDataMatricula(matriculaForm.getDataMatricula());
        return matriculaRepository.save(matricula);
    }

    @Override
    public void deleteMatricula(long id) {
        matriculaRepository.deleteById(id);
    }

    @Override
    public Matricula updateMatricula(long id, MatriculaForm matriculaForm) {
        Optional<Matricula> optionalMatricula = matriculaRepository.findById(id);
        if (optionalMatricula.isPresent()) {
            Matricula matricula = optionalMatricula.get();
            matricula.setAlunoId(matriculaForm.getAlunoId());
            matricula.setDataMatricula(matriculaForm.getDataMatricula());
            return matriculaRepository.save(matricula);
        }
        return null;
    }

    @Override
    public List<Matricula> getListMatricula() {
        return matriculaRepository.findAll();
    }
}
