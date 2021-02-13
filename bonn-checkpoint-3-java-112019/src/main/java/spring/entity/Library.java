package spring.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Library {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(columnDefinition = "TEXT")
	private String address;
	
	private String name;
	
	@ManyToMany
	@JoinTable(name = "library_book", joinColumns = @JoinColumn(name = "library_id"), inverseJoinColumns = @JoinColumn(name = "book_id"))
	private List<Book> books = new ArrayList<>();

}
