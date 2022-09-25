package com.horaoen.behavior.iterator.social_networks;

import com.horaoen.behavior.iterator.iterators.ProfileIterator;

/**
 * @author horaoen 
 */
public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}