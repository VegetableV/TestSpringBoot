package com.jpa.repository;

import com.jpa.entity.Guset;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guset, Long> {
}
