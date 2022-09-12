package com.kulkarniishan.userservice.repository;

import com.kulkarniishan.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUserId(Long userId);
}
