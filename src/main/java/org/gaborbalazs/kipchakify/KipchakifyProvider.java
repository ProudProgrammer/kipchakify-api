package org.gaborbalazs.kipchakify;

/**
 * Provider for Kipchakify API.
 */
public interface KipchakifyProvider {

    /**
     * Factory method for creating {@link KipchakifyServiceFactory}.
     * @return {@link KipchakifyServiceFactory}
     */
    KipchakifyServiceFactory createKipchakifyServiceFactory();
}
