package com.example.profilecard.controller;

import org.springframework.web.bind.annotation.*;
import com.example.profilecard.model.Profile;
import com.example.profilecard.service.ProfileService;
import jakarta.validation.Valid;


import java.util.List;

@RestController
@RequestMapping("/api/profiles")
@CrossOrigin(origins = "*")

public class ProfileController {

    private final ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    // CREATE profile
    @PostMapping
    public Profile createProfile( @RequestBody Profile profile) {
        return profileService.saveProfile(profile);
    }


    // GET profile by ID
    @GetMapping("/{id}")
    public Profile getProfile(@PathVariable Long id) {
        return profileService.getProfileById(id);
    }

    // GET all profiles
    @GetMapping
    public List<Profile> getAllProfiles() {
        return profileService.getAllProfiles();
    }

    // DELETE profile
    @DeleteMapping("/{id}")
    public void deleteProfile(@PathVariable Long id) {
        profileService.deleteProfile(id);
    }
}
