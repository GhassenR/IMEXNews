package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.entities.Article;
import tn.esprit.spring.repository.ArticleRepository;


@Service
@Slf4j
public class ArticleServiceImp  implements IArticleService{
	@Autowired
	ArticleRepository articleRepository;
	
	
	
	@Override
	public List<Article> retrieveAllEvents() {
		List<Article> articleList = articleRepository.findAll();
		for(Article article : articleList) {
			log.info(article.toString());
		
		}
		return articleList;
	}

	@Override
	public Article retrieveEvent(String title) {
		//return articleRepository.findById(title).orElse(null);
		return null;
	}

}
