package com.example.practicle.Service;

import com.example.practicle.Entity.Candidates;
import com.example.practicle.Repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class CandidateService {
    @Autowired
    public CandidateRepository candidateRepository;

    public Page<Candidates> findAll(int page, int limit){
        return candidateRepository.findAll(PageRequest.of(page,limit));
    }
    public Candidates save(Candidates candidates){
        return candidateRepository.save(candidates);
    }
}
