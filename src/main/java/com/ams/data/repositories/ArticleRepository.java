package com.ams.data.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.ams.data.entities.Article;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Long> {

}
