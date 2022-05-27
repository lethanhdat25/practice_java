package com.example.practicle.Controller;

import com.example.practicle.Entity.Candidates;
import com.example.practicle.Service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(path = "api/v1/candidates")
public class CandidateController {
    @Autowired
    public CandidateService candidateService;

    @RequestMapping(method = RequestMethod.GET)
    public Page<Candidates> findAll(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int limit) {
        return candidateService.findAll(page, limit);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Candidates> save(@RequestBody Candidates candidates){
        return ResponseEntity.ok(candidateService.save(candidates));
    }
}
