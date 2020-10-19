package com.kodilla.patterns.builder.bigmac;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bigmac {

    private final String bun;
    private final double burgersCount;
    private final SauceType sauce;
    private List<IngredientsType> ingredients = new ArrayList<>();

    public static class BigmacBuilder {
        private String bun;
        private double burgersCount;
        private SauceType sauce;
        private final List<IngredientsType> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder burgersCount(double burgersCount) {
            this.burgersCount = burgersCount;
            return this;
        }

        public BigmacBuilder sauce(SauceType sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredient(IngredientsType ingredient) {
            this.ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgersCount, sauce, ingredients);
        }
    }

    public Bigmac(String bun, double burgersCount, SauceType sauce, List<IngredientsType> ingredients) {
        this.bun = bun;
        this.burgersCount = burgersCount;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public Bigmac(String bun, double burgersCount, SauceType sauce, IngredientsType... ingredients) {
        this.bun = bun;
        this.burgersCount = burgersCount;
        this.sauce = sauce;
        this.ingredients.addAll(Arrays.asList(ingredients));
    }

    public String getBun() {
        return bun;
    }

    public double getBurgersCount() {
        return burgersCount;
    }

    public SauceType getSauce() {
        return sauce;
    }

    public List<IngredientsType> getIngredients() {
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
