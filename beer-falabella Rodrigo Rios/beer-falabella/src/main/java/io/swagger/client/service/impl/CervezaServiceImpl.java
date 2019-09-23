package io.swagger.client.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import io.swagger.client.model.BeerBox;
import io.swagger.client.model.BeerItem;
import io.swagger.client.service.CervezaService;

@Service
public class CervezaServiceImpl implements CervezaService {

	// puede ir en un utilitario de constantes.
	public static String CURRENCY = "CLP";

	@Override
	public BeerItem getBeer(Integer id) {
		// esta lógica debe ser reemplazada por valores de base de datos.
		BeerItem beer = new BeerItem();
		if (id == 0) {
			BigDecimal price = new BigDecimal(1500);
			beer.setId(0);
			beer.setName("Kuntsmann Miel");
			beer.setBrewery("Kuntsmann");
			beer.setPrice(price);
			beer.setCountry("Chile");

		} else {
			beer = new BeerItem();
		}
		return beer;
	}

	@Override
	public BeerBox getBeerBoxByBeerId(Integer id) {
		BeerBox beerBox = this.getPriceFromBeer(id);
		return beerBox;
	}
	
	private BeerBox getPriceFromBeer(Integer id) {
		// esta lógica debe ser reemplazada por valores de base de datos.
		BeerBox beerBox = new BeerBox();
		if (id == 0)
		{
			BigDecimal price = new BigDecimal(1500);
			beerBox.setPriceTotal(price.multiply(new BigDecimal(6)));
		}
		else {
			beerBox = new BeerBox();
		}
		return beerBox;
	}

	@Override
	public BeerItem insertBeer(BeerItem beer) {
		// aquí se debe ingresar la persistencia a la base de datos.
		return beer;
	}

	@Override
	public List<BeerItem> getAllBeers() {
		List<BeerItem> listBeer = new ArrayList<>();
		BeerItem beer = new BeerItem();
		BigDecimal price = new BigDecimal(1500);
		beer.setId(0);
		beer.setName("Kuntsmann Miel");
		beer.setBrewery("Kuntsmann");
		beer.setPrice(price);
		beer.setCountry("Chile");
		listBeer.add(beer);
		return listBeer;
	}

}
