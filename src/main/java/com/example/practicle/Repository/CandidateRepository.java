package com.example.practicle.Repository;

import com.example.practicle.Entity.Candidates;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository extends JpaRepository<Candidates,Integer> {
    Page<Candidates> findAll(Pageable pageable);
}
