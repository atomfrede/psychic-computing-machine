package de.atomfrede.bookshelf.domain.entity.book;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import de.atomfrede.bookshelf.domain.entity.AbstractEntity;

@Entity
public class Book extends AbstractEntity{

	@GenericGenerator(name = "BookIdGenerator", strategy = "org.hibernate.id.MultipleHiLoPerTableGenerator", parameters = {
			@Parameter(name = "table", value = "IdentityGenerator"),
			@Parameter(name = "primary_key_column", value = "sequence_name"),
			@Parameter(name = "primary_key_value", value = "Book"),
			@Parameter(name = "value_column", value = "next_hi_value"),
			@Parameter(name = "primary_key_length", value = "100"),
			@Parameter(name = "max_lo", value = "1000") })
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "BookIdGenerator")
	private Long id;
	
	private String title;
	
	private String abstractContent;
	
	@Override
	public Long getId() {
		return id;
	}
}
