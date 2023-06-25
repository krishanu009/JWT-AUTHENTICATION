package com.myntraclone.backend.repository;

import com.myntraclone.backend.models.ERole;
import com.myntraclone.backend.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(ERole name);


}
