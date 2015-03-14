package co.com.udem.paisafliz.DAO.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import co.com.udem.paisafliz.DAO.MoviesDAO;
import co.com.udem.paisafliz.DTO.MovieDTO;

@Repository
public class MoviesDAOImpl implements MoviesDAO {

	public List<MovieDTO> getMoviesList() {
		List<MovieDTO> movies = new ArrayList<MovieDTO>();
		movies.add(new MovieDTO("la vendedora de rosas", (short)1998));
		movies.add(new MovieDTO("titanic", (short)234));
		movies.add(new MovieDTO("rapido y furioso 1", (short)1998));
		movies.add(new MovieDTO("rapido y furioso 2", (short)234));
		movies.add(new MovieDTO("rapido y furioso 3", (short)345));
		movies.add(new MovieDTO("rapido y furioso 4", (short)234));
		movies.add(new MovieDTO("rapido y furioso 5", (short)546));
		movies.add(new MovieDTO("rapido y furioso 6", (short)764));
		movies.add(new MovieDTO("rapido y furioso 7", (short)456));
		return movies;
	}

}
