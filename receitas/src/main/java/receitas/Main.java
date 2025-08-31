package receitas;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] ovoIngredientes = {"margarina", "ovo"};
        Sandwich ovo = new Sandwich(ovoIngredientes);
        ovo.preparo();
        String[] beterrabaIngredientes = {"beterraba", "cebola", "vinagre", "sal"};
        Salada beterraba = new Salada(Arrays.copyOfRange(beterrabaIngredientes, 0, 2),beterrabaIngredientes);
        beterraba.preparo();
    }
}