package receitas;

public class Salada implements Refeicao {
    private final String[] ingredientesCortaveis;
    private final String[] ingredientes;
    
    public Salada(String[] IngredientesCortaveis, String[] Ingredientes) { 
        ingredientesCortaveis = IngredientesCortaveis;
        ingredientes  = Ingredientes;
    }
    
    @Override 
    public void preparo() {
        for (String ingrediente : ingredientesCortaveis) {
            System.out.println(String.format("cortando %s", ingrediente));
        }
        for (String ingrediente : ingredientes) {
            System.out.println(String.format("misturando %s", ingrediente));
        }
    }

}
