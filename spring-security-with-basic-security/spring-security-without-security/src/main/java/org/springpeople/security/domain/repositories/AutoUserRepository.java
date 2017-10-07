package org.springpeople.security.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springpeople.security.domain.entities.AutoUser;

public interface AutoUserRepository extends JpaRepository<AutoUser, Long> {

}
