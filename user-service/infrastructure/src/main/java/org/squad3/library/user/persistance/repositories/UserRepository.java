package org.squad3.library.user.persistance.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.squad3.library.user.persistance.entites.UserEntity;

import java.util.Optional;

@Repository
public interface UserRepository  extends JpaRepository<UserEntity, Integer> {
    Optional<UserEntity> findByUserCode(String userCode);
}


