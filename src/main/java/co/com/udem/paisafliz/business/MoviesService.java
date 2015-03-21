package co.com.udem.paisafliz.business;

import java.util.List;

import co.com.udem.paisafliz.DTO.MovieDTO;
import co.com.udem.paisafliz.domain.Moviee;

public interface MoviesService {
	public List<Moviee> getMoviesList();
}
