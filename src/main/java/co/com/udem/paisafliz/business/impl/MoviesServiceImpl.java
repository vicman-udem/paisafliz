package co.com.udem.paisafliz.business.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.udem.paisafliz.DAO.MoviesDAO;
import co.com.udem.paisafliz.DTO.MovieDTO;
import co.com.udem.paisafliz.business.MoviesService;
import co.com.udem.paisafliz.domain.Moviee;

@Service
public class MoviesServiceImpl implements MoviesService {

	@Autowired
	private MoviesDAO moviesDAO;
	
	@Transactional
	public List<Moviee> getMoviesList() {
		List<Moviee> movies = moviesDAO.getMoviesList();
		
		for (Moviee movie : movies) {
			movie.setName(movie.getName() + "2");
		}
		
		return movies;
	}

}
