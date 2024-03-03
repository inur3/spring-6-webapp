package nuri.springframework.spring6webapp.services;

import nuri.springframework.spring6webapp.domain.Book;

public interface BookService   {

    Iterable<Book> findAll();
}
