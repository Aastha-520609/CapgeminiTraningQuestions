package com.service;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


import com.model.Candidate;

@Service
public class RecruitService {
    
	private final Logger logger = LoggerFactory.getLogger(RecruitService.class);
	List<Candidate> candidateList = new ArrayList<>();
	
	public void setCandidateList(List<Candidate> candidateList) {
		this.candidateList = candidateList;
	}

	public List<Candidate> getCandidateList() {
		return candidateList;
	}

	public void insertCandidate(Candidate candidate) {
		
		try {
			candidateList.add(candidate);
	        logger.info("Candidate inserted: " + candidate);
	    } catch (Exception e) {
	        logger.error("Error inserting candidate: " + e.getMessage());
	    }
	}
	
	public List<Candidate> viewAllCandidates(){
		
		//return list of candidates
		if(candidateList.isEmpty()) {
			logger.error("Candidate List is empty");
		}else {
			logger.info("Candidate details are Listed");
		}
		return candidateList;
		
	}
}
