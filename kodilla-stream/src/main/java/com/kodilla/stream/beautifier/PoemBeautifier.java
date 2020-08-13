package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String word, PoemDecorator poemDecorator){
        String result = poemDecorator.beautify(word);
        System.out.println("Wyraz " + result);
    }
}
