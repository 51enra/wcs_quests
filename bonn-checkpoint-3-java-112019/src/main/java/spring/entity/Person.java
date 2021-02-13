package spring.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String firstName;
	
	private String lastName;
	
	@ManyToOne
    //@JoinColumn(name = "bookId")
	private Book book;
	
	@OneToMany(mappedBy = "person", cascade = {CascadeType.REMOVE})
	private List<Borrow> borrowings;
	
}
