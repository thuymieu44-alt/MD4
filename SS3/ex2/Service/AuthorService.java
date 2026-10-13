package ra.ex2.Service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import ra.ex2.Repository.Author;
import ra.ex2.Repository.AuthorRepository;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> getAllAuthors(){
        return authorRepository.findAllAuthors();
    }
    public Author createAuthor(Author author){
        authorRepository.save(author);
        return author;
    }
}
