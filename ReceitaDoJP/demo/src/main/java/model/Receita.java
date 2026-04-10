package main.java.model;

@Entity
public class Receita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private int tempoPreparo;
    private double custoAproximado;

    @ManyToMany
    private Set<Ingrediente> ingredientes = new HashSet<>();

    public void addIngrediente(Ingrediente ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    public void removeIngrediente(Ingrediente ingrediente) {
        this.ingredientes.remove(ingrediente);
    }
}