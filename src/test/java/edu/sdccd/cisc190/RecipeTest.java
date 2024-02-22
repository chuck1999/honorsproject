package edu.sdccd.cisc190;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {
    Recipe recipe;
    static final String APPLE_PIE = "Apple Pie";
    @BeforeEach
    void setUp() {
        recipe = new Recipe(APPLE_PIE);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getName() {
        assertEquals(APPLE_PIE, recipe.getName());
    }

    @Test
    void getIngredients() {
    }
}