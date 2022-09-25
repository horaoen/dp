package com.horaoen.behavior.iterator.iterators;

import com.horaoen.behavior.iterator.profile.Profile;

/**
 * @author horaoen 
 */
public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}