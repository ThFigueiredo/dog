package com.dog.service;


import com.dog.model.Raca;
import com.dog.repository.RacaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RacaService {

    private final RacaRepository racaRepository;

    public RacaService(RacaRepository racaRepository) {
        this.racaRepository = racaRepository;
    }

    public Raca criarRaca(Raca raca) {
        return racaRepository.save(raca);
    }

    public Raca buscarRacaPorId(Long id) {
        return racaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Raça não encontrada com o ID: " + id));
    }

    public void deletarRaca(Long id) {
        Raca raca = buscarRacaPorId(id);
        racaRepository.delete(raca);
    }

    public Raca atualizarRaca(Long id, Raca racaAtualizada) {
        Raca racaExistente = buscarRacaPorId(id);
        racaAtualizada.setId(racaExistente.getId());
        return racaRepository.save(racaAtualizada);
    }

    public List<Raca> listarTodasRacas() {
        return racaRepository.findAll();
    }





}
