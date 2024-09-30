package com.example.lab2;

public class Counter {

    public int countWords(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }
        String[] words = input.split("[\\s,.]+");
        return words.length;
    }

    public int countCharacters(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        return input.replace(" ", "").replace(",", "").replace(".", "").length();
    }
}

