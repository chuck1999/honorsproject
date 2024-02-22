import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RecipeFilter {

    private final List<String> selectedIngredients;

    public RecipeFilter() {
        this.selectedIngredients = new ArrayList<>();
    }

    public void addSelectedIngredient(String ingredient) {
        this.selectedIngredients.add(ingredient);
    }

    public List<Recipe> filterRecipes(List<Recipe> recipes) {
        List<Recipe> filteredRecipes = new ArrayList<>();
        for (Recipe recipe : recipes) {
            if (new HashSet<>(recipe.getIngredients()).containsAll(this.selectedIngredients)) {
                filteredRecipes.add(recipe);
            }
        }
        return filteredRecipes;
    }
}

