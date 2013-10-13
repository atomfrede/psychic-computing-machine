package de.atomfrede.bookshelf.domain.entity.author;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import de.atomfrede.bookshelf.domain.entity.AbstractEntity;

@Entity
@Table(name = "author")
public class Author extends AbstractEntity {

	private static final long serialVersionUID = -6438715475593461119L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Override
	public Long getId() {
		return id;
	}

}
