package com.example.profilecard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.profilecard.model.Profile;

public interface ProfileRepository
        extends JpaRepository<Profile, Long> {
}
