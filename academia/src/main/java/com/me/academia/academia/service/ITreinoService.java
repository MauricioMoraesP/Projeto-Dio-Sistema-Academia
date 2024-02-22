package com.me.academia.academia.service;

import com.me.academia.academia.entity.Treino;
import com.me.academia.academia.entity.form.TreinoForm;

import java.util.List;

public interface ITreinoService {


    public Treino getTreinoID(long id);

    public Treino createTreino(TreinoForm treinoForm);

    public void deleteTreino(long id);

    public Treino updateTreino(long id,TreinoForm treinoform);

    public List<Treino> getListTreino();


}
