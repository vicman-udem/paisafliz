package co.com.udem.paisafliz.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.com.udem.paisafliz.Business.MoviesService;

@Controller
@RequestMapping("/movies")
public class MoviesController {
	
	@Autowired
	public MoviesService moviesService;
	
	@RequestMapping("/list")
	public ModelAndView MoviesList(){
		
		String name = "Victor";
		
		List<String> movies = moviesService.getMovies();
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("movies", movies);
		mv.addObject("name", name);
		
		return mv;
	}

}
