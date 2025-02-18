package com.whimsy.placeholders.placeholders.impl;

import com.whimsy.placeholders.PlaceholderManager;
import com.whimsy.placeholders.placeholders.IPlaceholder;

/**
 * Generic class for defining a placeholder.
 *
 * @param <T> the type of the placeholder value
 */
public class Placeholder<T> implements IPlaceholder {

    private final String identifier;
    private final T value;

    public Placeholder(String identifier, T value) {
        this.identifier = identifier;
        this.value = value;
        PlaceholderManager.registerPlaceholder(this.identifier, this);
    }

    @Override
    public String getValue() {
        return value.toString();
    }

    @Override
    public String getIdentifier() {
        return this.identifier;
    }
}