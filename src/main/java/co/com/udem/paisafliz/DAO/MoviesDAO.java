package co.com.udem.paisafliz.DAO;

import java.util.List;

import co.com.udem.paisafliz.DTO.MovieDTO;
import co.com.udem.paisafliz.domain.Moviee;

public interface MoviesDAO {
	public List<Moviee> getMoviesList();
}
