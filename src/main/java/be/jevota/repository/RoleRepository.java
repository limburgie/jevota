package be.jevota.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import be.jevota.domain.Role;
import be.jevota.domain.type.RoleName;

public interface RoleRepository extends JpaRepository<Role, Long> {

	@Query("FROM Role ORDER BY name ASC")
	List<Role> getRoles();

	Role findByName(RoleName roleName);

	
}
