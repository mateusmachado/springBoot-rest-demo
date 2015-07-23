package br.com.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import br.com.model.Book;

public interface BookRepository extends MongoRepository<Book, String> {

}
