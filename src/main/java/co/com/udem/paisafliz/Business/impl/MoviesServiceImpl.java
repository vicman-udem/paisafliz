package co.com.udem.paisafliz.Business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import co.com.udem.paisafliz.Business.MoviesService;
@Service
public class MoviesServiceImpl implements MoviesService {

	public List<String> getMovies() {
		// TODO Auto-generated method stub
		List<String> movies = new ArrayList<String>();
		movies.add("La vendedora de rosas");
		movies.add("titanic");
		movies.add("rapido y furioso 1");
		movies.add("rapido y furioso 2");
		movies.add("rapido y furioso 3");
		movies.add("rapido y furioso 4");
		movies.add("rapido y furioso 5");
		movies.add("rapido y furioso 6");
		movies.add("rapido y furioso 9");
		return movies;
	}

}
