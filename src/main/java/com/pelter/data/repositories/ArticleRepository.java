package com.pelter.data.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pelter.data.models.Article;

@Repository // metaconfig
public interface ArticleRepository extends CrudRepository<Article , Long>{
	List<Article> findAllTitles();
}
