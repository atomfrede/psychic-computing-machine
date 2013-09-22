package de.atomfrede.bookshelf.service.book;

import org.springframework.beans.factory.annotation.Autowired;

import de.atomfrede.bookshelf.domain.repository.book.BookRepository;

public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;
}
