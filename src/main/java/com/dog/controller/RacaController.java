package com.dog.controller;


import com.dog.model.Raca;
import com.dog.service.RacaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/racas")
public class RacaController {

    private final RacaService racaService;

    public RacaController(RacaService racaService) {
        this.racaService = racaService;
    }

    @PostMapping
    public Raca criar(@RequestBody Raca raca) {
       return racaService.criarRaca(raca);
    }

    @GetMapping
    public Raca buscarPorId(@RequestParam Long id) {
        return racaService.buscarRacaPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        racaService.deletarRaca(id);
    }

    @PutMapping("/{id}")
    public Raca atualizar(@PathVariable Long id, @RequestBody Raca racaAtualizada) {
        return racaService.atualizarRaca(id, racaAtualizada);
    }

    @GetMapping("/listar")
    public List<Raca> listarTodas() {
        return racaService.listarTodasRacas();
    }

}
