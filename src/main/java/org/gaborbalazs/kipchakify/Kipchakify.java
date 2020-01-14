package org.gaborbalazs.kipchakify;

/**
 * Kipchakify translator service.
 */
public interface Kipchakify {

    /**
     * Kipchakify translator method.
     * @param text is about to translate to kipchak.
     * @return String is the kipchakified text.
     * @throws KipchakifyException when given text is unkipchakifyable.
     */
    String kipchakify(String text) throws KipchakifyException;
}
