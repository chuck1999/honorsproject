package edu.sdccd.cisc190;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main  {

    public static void main(String[] args) {
        List<Recipe> recipes = new ArrayList<>();
        recipes.add(new Recipe("Pizza", Arrays.asList("cheese", "tomato sauce", "dough")));
        recipes.add(new Recipe("Spaghetti", Arrays.asList("pasta", "tomato sauce", "ground beef")));
        recipes.add(new Recipe("Salad", Arrays.asList("lettuce", "tomatoes", "cucumbers")));

        RecipeFilter filter = new RecipeFilter();
        filter.addSelectedIngredient("tomato sauce");
        filter.addSelectedIngredient("dough");

        List<Recipe> filteredRecipes = filter.filterRecipes(recipes);

        for (Recipe recipe : filteredRecipes) {
            System.out.println(recipe.getName());
        }
    }
}
