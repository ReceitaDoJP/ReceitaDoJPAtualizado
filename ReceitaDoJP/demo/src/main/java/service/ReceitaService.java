package main.java.service;

import main.java.model.Receita;
import main.java.model.Ingrediente;
import main.java.repository.ReceitaRepository;
import main.java.repository.IngredienteRepository;

@Service
public class ReceitaService {

    @Autowired
    private ReceitaRepository receitaRepository;

    @Autowired
    private IngredienteRepository ingredienteRepository;

    public Receita addIngredienteToReceita(Long receitaId, Long ingredienteId) {
        Receita receita = receitaRepository.findById(receitaId).orElseThrow(() -> new RuntimeException("Receita não encontrada"));
        Ingrediente ingrediente = ingredienteRepository.findById(ingredienteId).orElseThrow(() -> new RuntimeException("Ingrediente não encontrado"));

        receita.addIngrediente(ingrediente);
        return receitaRepository.save(receita);
    }

    public Receita removeIngredienteFromReceita(Long receitaId, Long ingredienteId) {
        Receita receita = receitaRepository.findById(receitaId).orElseThrow(() -> new RuntimeException("Receita não encontrada"));
        Ingrediente ingrediente = ingredienteRepository.findById(ingredienteId).orElseThrow(() -> new RuntimeException("Ingrediente não encontrado"));

        receita.removeIngrediente(ingrediente);
        return receitaRepository.save(receita);
    }
}