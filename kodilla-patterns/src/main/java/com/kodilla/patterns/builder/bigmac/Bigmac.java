package com.kodilla.patterns.builder.bigmac;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bigmac {

    private final Bun bun;
    private final double burgersCount;
    private final Sauce sauce;
    private List<Ingredients> ingredients = new ArrayList<>();

    public static class BigmacBuilder {
        private Bun bun;
        private double burgersCount;
        private Sauce sauce;
        private final List<Ingredients> ingredients = new ArrayList<>();

        public BigmacBuilder bun(Bun bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder burgersCount(double burgersCount) {
            this.burgersCount = burgersCount;
            return this;
        }

        public BigmacBuilder sauce(Sauce sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredient(Ingredients ingredient) {
            this.ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgersCount, sauce, ingredients);
        }
    }

    public Bigmac(Bun bun, double burgersCount, Sauce sauce, List<Ingredients> ingredients) {
        this.bun = bun;
        this.burgersCount = burgersCount;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public Bigmac(Bun bun, double burgersCount, Sauce sauce, Ingredients... ingredients) {
        this.bun = bun;
        this.burgersCount = burgersCount;
        this.sauce = sauce;
        this.ingredients.addAll(Arrays.asList(ingredients));
    }

    public Bun getBun() {
        return bun;
    }

    public double getBurgersCount() {
        return burgersCount;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bum='" + bun + '\'' +
                ", burgers=" + burgersCount +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
