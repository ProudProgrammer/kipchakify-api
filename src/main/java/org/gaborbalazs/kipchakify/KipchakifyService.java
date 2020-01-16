package org.gaborbalazs.kipchakify;

/**
 * Service for kipchak translating.
 */
public interface KipchakifyService {

    /**
     * Kipchakify method for translate texts.
     * @param text is about to translate to kipchak.
     * @return String is the kipchakified text.
     * @throws KipchakifyException when given text is unkipchakifyable.
     */
    String kipchakify(String text) throws KipchakifyException;
}
