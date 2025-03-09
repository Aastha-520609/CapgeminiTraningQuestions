package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bean.Buyer;
import com.bean.Flat;
import com.repository.BuyerRepository;
import com.repository.FlatRepository;


@Repository
public class BuyerDAO {

	private final BuyerRepository buyerRepository;
	private final FlatRepository flatRepository;
	
	public BuyerDAO(BuyerRepository buyerRepository, FlatRepository flatRepository) {
		this.buyerRepository = buyerRepository;
		this.flatRepository = flatRepository;
	}
	
	public void addBuyer(Buyer buyer) {
		buyerRepository.save(buyer);
	}
	
	public void addFlat(String buyer_id, Flat flat) {
		Buyer buyer = buyerRepository.findById(buyer_id).orElseThrow(() -> new RuntimeException("Buyer not found"));
		flat.setBuyer(buyer);
		flatRepository.save(flat);
	}
	
	public List<Flat> flatWithMinPriceMaxRooms(){
		double minPrice = flatRepository.findAll().stream().mapToDouble(Flat::getFlatPrice).min().orElse(0);
		int maxRooms = flatRepository.findAll().stream().mapToInt(Flat::getNumberOfRooms).max().orElse(0);
		return flatRepository.findAll().stream()
				.filter(flat -> flat.getFlatPrice() == minPrice && flat.getNumberOfRooms() == maxRooms)
				.toList();
	}
	
}
