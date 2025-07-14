package com.example.commad.infrastructure.repository;

import com.example.commad.infrastructure.entity.AccountHolderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountHolderRepository extends JpaRepository<AccountHolderEntity, Long> {
}
