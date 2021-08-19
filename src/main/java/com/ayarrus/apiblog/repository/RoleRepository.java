package com.ayarrus.apiblog.repository;

import com.ayarrus.apiblog.model.role.Role;
import com.ayarrus.apiblog.model.role.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(RoleName name);
}
