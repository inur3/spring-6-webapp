package nuri.springframework.spring6webapp.services;

import nuri.springframework.spring6webapp.domain.Author;

public interface AuthorService  {

    Iterable<Author> findAll();
}
