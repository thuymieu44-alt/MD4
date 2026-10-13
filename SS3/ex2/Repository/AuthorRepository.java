package ra.ex2.Repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

public class AuthorRepository {
    private final List<Author> authors;
     public AuthorRepository(){
         authors = new ArrayList<>();
         authors.add(new Author(1, "Tố Hữu", "tohuu@gmail.com"));
         authors.add(new Author(2, "Văn Cao", "vancao@gmail.com"));
         authors.add(new Author(3, "Xuân Quỳnh", "xuanquynh@gmail.com"));
     }
     public List<Author> findAllAuthors(){
         return authors;
     }
     public void save(Author author){
         authors.add(author);
     }
}
