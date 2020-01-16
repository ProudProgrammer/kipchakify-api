package org.gaborbalazs.kipchakify;

/**
 * Factory for {@link KipchakifyService}.
 */
public interface KipchakifyServiceFactory {

    /**
     * Factory method for creating {@link KipchakifyService}.
     * @return {@link KipchakifyService}
     */
    KipchakifyService createKipchakifyService();
}
