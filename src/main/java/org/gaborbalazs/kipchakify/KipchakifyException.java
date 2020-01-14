package org.gaborbalazs.kipchakify;

/**
 * Kipchakify exception for {@link Kipchakify} and {@link KipchakManager}.
 */
public class KipchakifyException extends RuntimeException {

    public KipchakifyException() {
        super();
    }

    public KipchakifyException(String message) {
        super(message);
    }
}
