package spring.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Borrow {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDateTime date;
	
	@ManyToOne
	private Book book;
	
	@ManyToOne
	private Person person;
}
