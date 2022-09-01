package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.Article;


public interface IArticleService {
	List<Article> retrieveAllEvents();
	Article retrieveEvent(String title);
}
