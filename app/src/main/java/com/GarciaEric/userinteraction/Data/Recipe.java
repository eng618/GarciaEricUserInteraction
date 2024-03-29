package com.GarciaEric.userinteraction.Data;

import java.util.ArrayList;

/**
 * Created by: Eric Garcia on 5/20/14
 * Full Sail University | MDVBS
 */

public class Recipe {

    // Recipe variables
    public String recipeID;
    public String recipeName;
    public String sourceDisplayName;
    public ArrayList<String> ingredients;
    public int totalTimeInSeconds;
    public String recipeURL;

    // Construct recipe object
    public Recipe(String recipeName, String recipeID, String sourceDisplayName, ArrayList<String> ingredients, int totalTimeInSeconds) {
        this.recipeName = recipeName;
        this.recipeID = recipeID;
        this.sourceDisplayName = sourceDisplayName;
        this.ingredients = ingredients;
        this.totalTimeInSeconds = totalTimeInSeconds;
    }

    @Override
    public String toString() {
        return recipeName;
    }
}