package co.com.udem.paisafliz.DAO.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.com.udem.paisafliz.DAO.MoviesDAO;
import co.com.udem.paisafliz.DTO.MovieDTO;
import co.com.udem.paisafliz.domain.Moviee;

@Repository
public class MoviesDAOImpl implements MoviesDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Moviee> getMoviesList() {
		
		
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("FROM Moviee");
		
		@SuppressWarnings("unchecked")
		List<Moviee> listMovies = (List<Moviee>) query.list();
		
		System.out.println(listMovies.get(0).getName());
		
		
		return listMovies;
	}

}
