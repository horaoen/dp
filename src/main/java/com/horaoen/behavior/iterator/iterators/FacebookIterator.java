package com.horaoen.behavior.iterator.iterators;

import com.horaoen.behavior.iterator.profile.Profile;
import com.horaoen.behavior.iterator.social_networks.Facebook;

import java.util.ArrayList;
import java.util.List;

/**
 * @author horaoen 
 */
public class FacebookIterator implements ProfileIterator {
    private final Facebook facebook;
    private final String type;
    
    /** 邮件发送方email */
    private final String email;
    private int currentPosition = 0;
    
    /** 邮件接收者email */
    private final List<String> emails = new ArrayList<>();
    
    /** 邮件接收者profile */
    private final List<Profile> profiles = new ArrayList<>();

    public FacebookIterator(Facebook facebook, String type, String email) {
        this.facebook = facebook;
        this.type = type;
        this.email = email;
    }

    private void lazyLoad() {
        if (emails.size() == 0) {
            List<String> profiles = facebook.requestProfileFriendsFromFacebook(this.email, this.type);
            for (String profile : profiles) {
                this.emails.add(profile);
                this.profiles.add(null);
            }
        }
    }

    @Override
    public boolean hasNext() {
        lazyLoad();
        return currentPosition < emails.size();
    }

    @Override
    public Profile getNext() {
        if (!hasNext()) {
            return null;
        }

        String friendEmail = emails.get(currentPosition);
        Profile friendProfile = profiles.get(currentPosition);
        if (friendProfile == null) {
            friendProfile = facebook.requestProfileFromFacebook(friendEmail);
            profiles.set(currentPosition, friendProfile);
        }
        currentPosition++;
        return friendProfile;
    }

    @Override
    public void reset() {
        currentPosition = 0;
    }
}