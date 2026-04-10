package main.java.controller;

import main.java.model.Receita;
import main.java.service.ReceitaService;
import main.java.repository.ReceitaRepository;



@RestController
@RequestMapping("/receitas")
public class ReceitaController {

    @Autowired
    private ReceitaService receitaService;

    @PostMapping("/{receitaId}/ingredientes/{ingredienteId}")
    public Receita addIngrediente(@PathVariable Long receitaId, @PathVariable Long ingredienteId) {
        return receitaService.addIngredienteToReceita(receitaId, ingredienteId);
    }

    @DeleteMapping("/{receitaId}/ingredientes/{ingredienteId}")
    public Receita removeIngrediente(@PathVariable Long receitaId, @PathVariable Long ingredienteId) {
        return receitaService.removeIngredienteFromReceita(receitaId, ingredienteId);
    }
}