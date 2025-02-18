package com.whimsy.placeholders;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Main class for demonstrating the placeholder system.
 */
public class Placeholders {

    public static void main(String[] args) {
        new Placeholder<>("date", LocalDate::now);
        new Placeholder<>("greeting", () -> "Hello, Guest!");

        ArrayList<String> inventory = new ArrayList<>(Arrays.asList("Sword", "Shield", "Potion"));
        new Placeholder<>("inventory", () -> inventory.stream().collect(Collectors.joining(", ")));

        ArrayList<String> products = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
        new Placeholder<>("products", () -> products.stream().collect(Collectors.joining(". ")));

        String template = """
                
                Today's date is {date}. {greeting}.
                
                Your inventory contains: {inventory}.
                
                Products: {products}.""";
        String result = PlaceholderManager.processString(template);

        System.out.println(result);
    }
}