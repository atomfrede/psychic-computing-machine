package de.atomfrede.bookshelf.domain.entity.tag;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import de.atomfrede.bookshelf.domain.entity.AbstractEntity;
import de.atomfrede.bookshelf.domain.entity.book.Book;

@Entity
@Table(name = "tag", uniqueConstraints = @UniqueConstraint(columnNames = { "title" }))
public class Tag extends AbstractEntity {

	private static final long serialVersionUID = 2368204901851980718L;

	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name = "title")
	private String title;

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "tags", targetEntity = Book.class)
	List<Book> books;

	@Override
	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
