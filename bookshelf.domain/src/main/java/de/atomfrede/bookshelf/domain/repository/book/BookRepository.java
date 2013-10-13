package de.atomfrede.bookshelf.domain.repository.book;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import de.atomfrede.bookshelf.domain.entity.book.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

	/**
	 * Retrieves all books with the requested title.
	 * 
	 * @param title
	 * @return
	 */
	List<Book> findByTitle(String title);
}
