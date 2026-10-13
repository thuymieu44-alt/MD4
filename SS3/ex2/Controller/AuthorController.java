package ra.ex2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ra.ex2.Repository.Author;
import ra.ex2.Service.AuthorService;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;
    public ResponseEntity<List<Author>> findAllAuthor(){
        return new ResponseEntity<>(authorService.getAllAuthors(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Author> createAuthor(
        @RequestBody Author author){
        return new ResponseEntity<>(
                authorService.createAuthor(author), HttpStatus.CREATED);
    }

    }

