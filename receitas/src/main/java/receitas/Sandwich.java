package receitas;

public class Sandwich implements Refeicao{

    private final String[] ingredientes;

    public Sandwich(String[] Ingredientes) { 
        ingredientes = Ingredientes;
    }
    @Override
    public void preparo() {
        System.out.println("cortando o pão");
        for (String ingrediente : ingredientes) {
            System.out.println(String.format("recheando o pão com %s", ingrediente));
        }
    }
}
