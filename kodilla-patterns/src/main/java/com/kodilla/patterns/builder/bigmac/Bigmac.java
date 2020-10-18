package com.kodilla.patterns.builder.bigmac;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bigmac {

    private final String bum;
    private final double burgers;
    private final String sauce;
    private List<String> ingredients = new ArrayList<>();

    public static class BigmacBuilder {
        private String bum;
        private double burgers;
        private String sauce;
        private final List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bum(String bum) {
            this.bum = bum;
            return this;
        }

        public BigmacBuilder burgers(double burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            this.ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bum, burgers, sauce, ingredients);
        }
    }

    public Bigmac(String bum, double burgers, String sauce, List<String> ingredients) {
        this.bum = bum;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public Bigmac(String bum, double burgers, String sauce, String... ingredients) {
        this.bum = bum;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients.addAll(Arrays.asList(ingredients));
    }

    public String getBum() {
        return bum;
    }

    public double getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bum='" + bum + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
