
package main.java.service;

import main.java.model.Ingrediente;
import main.java.repository.IngredienteRepository;

@Service
public class IngredienteService {

    @Autowired
    private IngredienteRepository ingredienteRepository;

    public Ingrediente saveIngrediente(Ingrediente ingrediente) {
        return ingredienteRepository.save(ingrediente);
    }

    public Ingrediente getIngredienteById(Long id) {
        return ingredienteRepository.findById(id).orElseThrow(() -> new RuntimeException("Ingrediente não encontrado"));
    }

    public void deleteIngrediente(Long id) {
        ingredienteRepository.deleteById(id);
    }
}