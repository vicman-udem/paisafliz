package co.com.udem.paisafliz.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/movies")
public class MoviesController {
	
	@RequestMapping("/list")
	public ModelAndView MoviesList(){
		
		String name = "Victor";
		
		List<String> movies = new ArrayList<String>();
		movies.add("La vendedora de rosas");
		movies.add("titanic");
		movies.add("rapido y furioso 1");
		movies.add("rapido y furioso 2");
		movies.add("rapido y furioso 3");
		movies.add("rapido y furioso 4");
		movies.add("rapido y furioso 5");
		movies.add("rapido y furioso 6");
		movies.add("rapido y furioso 7");
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("movies", movies);
		mv.addObject("name", name);
		
		return mv;
	}

}
