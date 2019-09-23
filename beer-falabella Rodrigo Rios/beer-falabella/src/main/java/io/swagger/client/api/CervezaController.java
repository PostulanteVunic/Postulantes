package io.swagger.client.api;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.client.model.BeerItem;
import io.swagger.client.service.CervezaService;
import io.swagger.client.model.BeerBox;

@RestController
@RequestMapping("beers")
public class CervezaController {
	
	@Autowired
	CervezaService cervezaService;
	
	@GetMapping(value="", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<BeerItem>> getAllBeers() {
		List<BeerItem> listBeer = cervezaService.getAllBeers();
		return ResponseEntity.ok(listBeer);
	}
	
	@GetMapping(value="/{beerID}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<BeerItem> getBeerById(@PathVariable(value = "beerID") Integer id) {
		BeerItem beer = cervezaService.getBeer(id);
		return ResponseEntity.ok(beer);
	}

	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<BeerItem> addBeer(@RequestBody BeerItem beerItem) {
		BeerItem beer = cervezaService.insertBeer(beerItem);
		return ResponseEntity.ok(beer); 
	}
	
	@GetMapping(value="/{beerID}/boxprice", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<BeerBox> getBeerBoxPriceByBeerId(@PathVariable(value = "beerID") Integer id) {
		BeerBox beerbox = cervezaService.getBeerBoxByBeerId(id);
		return ResponseEntity.ok(beerbox);
	}
	
}