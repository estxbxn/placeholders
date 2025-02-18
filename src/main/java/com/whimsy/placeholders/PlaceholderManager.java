package com.whimsy.placeholders;

import com.whimsy.placeholders.placeholders.IPlaceholder;

import java.util.HashMap;
import java.util.Map;

/**
 * Manages the registration and retrieval of placeholders.
 */
public class PlaceholderManager {

    private static final Map<String, IPlaceholder> placeholders = new HashMap<>();

    /**
     * Registers a placeholder with a given identifier.
     *
     * @param identifier  the identifier of the placeholder
     * @param placeholder the placeholder to register
     */
    public static void registerPlaceholder(String identifier, IPlaceholder placeholder) {
        placeholders.put(identifier, placeholder);
    }

    /**
     * Gets the value of a placeholder by its identifier.
     *
     * @param identifier the identifier of the placeholder
     * @return the value of the placeholder, or null if not found
     */
    public static String getPlaceholderValue(String identifier) {
        IPlaceholder placeholder = placeholders.get(identifier);
        return placeholder != null ? placeholder.getValue() : null;
    }

    /**
     * Processes a string by replacing placeholders with their values.
     *
     * @param input the input string
     * @return the processed string with placeholders replaced
     */
    public static String processString(String input) {
        for (Map.Entry<String, IPlaceholder> entry : placeholders.entrySet()) {
            input = input.replace("{" + entry.getKey() + "}", entry.getValue().getValue());
        }
        return input;
    }
}