package org.gaborbalazs.kipchakify;

import java.util.Set;

/**
 * Manages Kipchak objects.
 */
public interface KipchakManager {

    /**
     * Add a {@link Kipchak} to be managed.
     * @param kipchak a {@link Kipchak} which should be managed.
     */
    void add(Kipchak kipchak);

    /**
     * Kipchak can be checked if it is managed.
     * @param kipchak is a {@link Kipchak}.
     * @return true if Kipchak is managed.
     */
    boolean contains(Kipchak kipchak);

    /**
     * Remove a {@link Kipchak} to be not managed.
     * @param kipchak is a {@link Kipchak} which should be removed.
     * @return true if removing is success.
     */
    boolean remove(Kipchak kipchak);

    /**
     * Retrieve all {@link Kipchak} in a Set. They will be managed.
     * @return a set of {@link Kipchak}.
     */
    Set<Kipchak> retrieveAll();
}
