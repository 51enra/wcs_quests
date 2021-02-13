package spring.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String title;
	
	private String author;
	
	@ManyToMany(mappedBy = "books", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Library> libraries = new ArrayList<>();
	
	@OneToMany(mappedBy = "book", cascade = {CascadeType.REMOVE})
	private List<Borrow> borrowings;

}
