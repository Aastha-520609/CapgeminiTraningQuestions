package com.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.*;
import org.springframework.stereotype.Service;

import com.model.Candidate;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Service
public class RecruitService {
	private static final Logger log = LoggerFactory.getLogger(RecruitService.class);

	List<Candidate> candidateList = new ArrayList<>();
	
	public void setCandidateist(List<Candidate> candidateList) {
		this.candidateList=candidateList;
	}

	public List<Candidate> getCandidateList() {
		return candidateList;
	}

	public void insertCandidate(Candidate candidate) {
		
		candidateList.add(candidate);
		log.info("Candidate details added successfully");
	
	}
	
	public List<Candidate> viewAllCandidates(){
		
		 if (candidateList.isEmpty()) {
	            log.error("Candidate List is empty");
	        } else {
	            log.info("Candidate details are listed");
	        }
	        return candidateList;
		
	}
}
