package com.whimsy.placeholders.placeholders;

import com.whimsy.placeholders.PlaceholderManager;

import java.util.function.Supplier;

/**
 * Generic class for defining a placeholder.
 *
 * @param <T> the type of the placeholder value
 */
public class Placeholder<T> implements IPlaceholder {

    private final String identifier;
    private final Supplier<T> valueProvider;

    public Placeholder(String identifier, Supplier<T> valueProvider) {
        this.identifier = identifier;
        this.valueProvider = valueProvider;
        PlaceholderManager.registerPlaceholder(this.identifier, this);
    }

    @Override
    public String getValue() {
        return valueProvider.get().toString();
    }

    @Override
    public String getIdentifier() {
        return this.identifier;
    }
}