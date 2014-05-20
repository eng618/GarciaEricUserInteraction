package com.GarciaEric.userinteraction.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by: ENG618-Mac on 5/20/14
 * Full Sail University
 */
public class RecipeData {

    // Create List of recipes
    private List<Recipe> Recipes = new ArrayList<Recipe>();

    // Returns list of recipes
    public List<Recipe> getRecepes() {
        return Recipes;
    }

    // Add new recipe
    private void addItem(Recipe item) {
        Recipes.add(item);
    }
}