package com.example.profilecard.service;

import org.springframework.stereotype.Service;
import com.example.profilecard.model.Profile;
import com.example.profilecard.repository.ProfileRepository;

import java.util.List;

@Service
public class ProfileService {

    private final ProfileRepository profileRepository;


    public ProfileService(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    // Create or Update Profile
    public Profile saveProfile(Profile profile) {
        return profileRepository.save(profile);
    }

    // Get Profile by ID
    public Profile getProfileById(Long id) {
        return profileRepository.findById(id).orElse(null);
    }

    // Get all Profiles
    public List<Profile> getAllProfiles() {
        return profileRepository.findAll();
    }

    // Delete Profile
    public void deleteProfile(Long id) {
        profileRepository.deleteById(id);
    }
}
