package com.lucca.os.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucca.os.domain.OS;

@Repository
public interface OsRepository extends JpaRepository<OS, Integer> {

}
