package io.swagger.client.service;

import java.util.List;

import io.swagger.client.model.BeerBox;
import io.swagger.client.model.BeerItem;

public interface CervezaService {
	public List<BeerItem> getAllBeers();
	
	public BeerItem getBeer(Integer id);

	public BeerBox getBeerBoxByBeerId(Integer id);

	public BeerItem insertBeer(BeerItem beer);
}
