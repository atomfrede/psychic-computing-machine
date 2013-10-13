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

	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Override
	public Long getId() {
		return id;
	}

}
