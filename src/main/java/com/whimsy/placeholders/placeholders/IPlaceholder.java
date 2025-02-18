package com.whimsy.placeholders.placeholders;

/**
 * Interface for defining a placeholder.
 */
public interface IPlaceholder {

    /**
     * Gets the identifier of the placeholder.
     *
     * @return the identifier of the placeholder
     */
    String getIdentifier();

    /**
     * Gets the value of the placeholder.
     *
     * @return the value of the placeholder
     */
    String getValue();
}