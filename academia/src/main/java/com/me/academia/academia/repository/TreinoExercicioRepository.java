package com.me.academia.academia.repository;

import com.me.academia.academia.entity.TreinoExercicio;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TreinoExercicioRepository extends JpaRepository<TreinoExercicio, Long> {

    @Modifying
    @Transactional
    @Query("DELETE FROM TreinoExercicio te WHERE te.treino_id = :treinoId AND te.exercicio.id = :exercicioId")
    void deleteTreinoExercicio(Long treinoId, Long exercicioId);
}
