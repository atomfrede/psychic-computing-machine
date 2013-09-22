package de.atomfrede.bookshelf.domain.entity.repository.book;

import static org.fest.assertions.Assertions.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import de.atomfrede.bookshelf.domain.entity.book.Book;
import de.atomfrede.bookshelf.domain.repository.book.BookRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/test-domain-context.xml")
public class BookRepositoryTest {

	@Autowired
	BookRepository repository;

	@Test
	public void sampleTest() {
		Book steppenwolf = new Book();
		steppenwolf.setTitle("Steppenwolf");
		
		repository.save(steppenwolf);
		
		Book daemian = new Book();
		daemian.setTitle("Daemian");
		
		repository.save(daemian);
		List<Book> found = repository.findByTitle("Steppenwolf");
		
		assertThat(found).isNotEmpty();
		assertThat(found.size()).isEqualTo(1);
		
		
	}
}
