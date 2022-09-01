package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import tn.esprit.spring.entities.Article;
import tn.esprit.spring.services.IArticleService;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/article")
public class ArticleController {
	
	@Autowired
	IArticleService articleInterface;
	
	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		modelMap.put("article", articleInterface.retrieveAllEvents());
		return "article/index";
	}
	
	
	@GetMapping("/getAllArticles")
	@ResponseBody
	public List<Article> getAll() {
	List<Article> listevent = articleInterface.retrieveAllEvents();
	return listevent;
	}

}
