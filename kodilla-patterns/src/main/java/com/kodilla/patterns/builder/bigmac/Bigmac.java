package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {

    private final Bun bun;
    private final int burgers;
    private final SAUCE sauce;
    private final List<Ingredient> ingredients;

    public static class BigmacBuilder {
        private Bun bun;
        private int burgers;
        private SAUCE sauce;
        private List<Ingredient> ingredients = new ArrayList<>();

        public BigmacBuilder bread(Bun bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(SAUCE sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredient(Ingredient ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }


    public Bigmac(Bun bun, int burgers, SAUCE sauce, List<Ingredient> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public Bun getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public SAUCE getSauce() {
        return sauce;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun=" + bun +
                ", burgers=" + burgers +
                ", sauce=" + sauce +
                ", ingredient=" + ingredients +
                '}';
    }
}

enum Bun {
    BUN,
    ROLL,
    ROLL_WITH_SESAME_SEEDS
}

enum SAUCE {
    STANDARD,
    THOUSAND_ISLANDS,
    BARBECUE
}

enum Ingredient {
    LETTUCE,
    ONION,
    BACON,
    CUCUMBER,
    CHILI_PEPPERS,
    MUSHROOMS,
    SHRIMPS,
    CHEESE
}