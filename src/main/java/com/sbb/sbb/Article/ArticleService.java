package com.sbb.sbb.Article;

import com.sbb.sbb.DataNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;

    public List<Article> getList(){
        return this.articleRepository.findAll();
    }

    public void createArticle(String title, String content){
        Article article = new Article();
        article.setTitle(title);
        article.setContent(content);
        article.setCreateDate(LocalDateTime.now());
        this.articleRepository.save(article);
    }
    public Article getArticle(Integer id){
        Optional<Article> oq = this.articleRepository.findById(id);
        if(oq.isEmpty()){
            throw new DataNotFoundException("question not found");
        } else {
            return oq.get();
        }
    }
}
