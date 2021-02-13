package spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

	List<Book> findByAuthor(String author);

	List<Book> findByTitle(String title);

}
