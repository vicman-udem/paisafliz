package co.com.udem.paisafliz.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import co.com.udem.paisafliz.DTO.MovieDTO;
import co.com.udem.paisafliz.business.MoviesService;

@Controller
@RequestMapping("/movies")
public class MoviesController {
	
	@Autowired
	public MoviesService moviesService;
	
	@RequestMapping("/list")
	public ModelAndView MoviesList(@RequestParam(value = "name", required = false, defaultValue = "Victor") String name){
		
		List<MovieDTO> movies = moviesService.getMoviesList();
		ModelAndView mv = new ModelAndView();
		mv.addObject("movies", movies);
		mv.addObject("name", name);
		return mv;
	}
	
	@RequestMapping("/listAPI")
	public @ResponseBody List<MovieDTO> MoviesListAPI(@RequestParam(value = "name", required = false, defaultValue = "Victor") String name){
		System.out.println(name);
		List<MovieDTO> movies = moviesService.getMoviesList();
		return movies;
	}

}
