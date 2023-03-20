package com.example.springstoreapplication.services;

import org.springframework.stereotype.Service;

import com.example.springstoreapplication.entity.Sales;
import com.example.springstoreapplication.repository.SalesRepository;


@Service
public class SalesServiceImpl implements SalesService {
private final SalesRepository salesRepository;
	

	public SalesServiceImpl(SalesRepository salesRepository) {
		this.salesRepository = salesRepository;
	}
	@Override
	public Sales getSale(int id) {
		java.util.Optional<Sales> sale = salesRepository.findById((long) id);
		return ((java.util.Optional<Sales>) sale).orElse(null);
	}

}
