package co.com.udem.paisafliz.business.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.udem.paisafliz.DAO.MoviesDAO;
import co.com.udem.paisafliz.DTO.MovieDTO;
import co.com.udem.paisafliz.business.MoviesService;

@Service
public class MoviesServiceImpl implements MoviesService {

	@Autowired
	private MoviesDAO moviesDAO;
	
	@Transactional
	public List<MovieDTO> getMoviesList() {
		List<MovieDTO> movies = moviesDAO.getMoviesList();
		
		for (MovieDTO movie : movies) {
			movie.setName(movie.getName() + "2");
		}
		
		return movies;
	}

}
