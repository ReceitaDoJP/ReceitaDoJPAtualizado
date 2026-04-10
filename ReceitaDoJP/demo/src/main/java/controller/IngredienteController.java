
package main.java.controller;

import main.java.model.Ingrediente;
import main.java.service.IngredienteService;

@RestController
@RequestMapping("/ingredientes")
public class IngredienteController {

    @Autowired
    private IngredienteService ingredienteService;

    @PostMapping
    public Ingrediente addIngrediente(@RequestBody Ingrediente ingrediente) {
        return ingredienteService.saveIngrediente(ingrediente);
    }

    @GetMapping("/{id}")
    public Ingrediente getIngrediente(@PathVariable Long id) {
        return ingredienteService.getIngredienteById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteIngrediente(@PathVariable Long id) {
        ingredienteService.deleteIngrediente(id);
    }
}