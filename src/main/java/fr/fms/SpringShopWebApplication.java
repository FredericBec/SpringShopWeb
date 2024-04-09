package fr.fms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.fms.dao.ArticleRepository;
import fr.fms.entities.Article;

@SpringBootApplication
public class SpringShopWebApplication implements CommandLineRunner{

	@Autowired
	private ArticleRepository articleRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringShopWebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		articleRepository.save(new Article(null, "Nvidia Geforce RTX4060", 750));
		articleRepository.save(new Article(null, "Galaxy tab", 150));
		articleRepository.save(new Article(null, "Apple watch", 200));
		*/
		articleRepository.findAll().forEach(System.out::println);
	}

}
