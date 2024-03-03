package nuri.springframework.spring6webapp.repositories;

import nuri.springframework.spring6webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
