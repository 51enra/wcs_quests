package spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import spring.entity.Book;
import spring.repository.BookRepository;

@Controller
public class BookController {
	
	@Autowired
	private BookRepository repository;

	@GetMapping("/book")
	public String editBook() {
		return("book");
	}
	
	@GetMapping("/save")
	public String saveBook(@ModelAttribute Book book) {
		repository.save(book);
		return("redirect:/books");
	}
	
	@GetMapping("/books")
	public String listBooks(Model model) {
		
		List<Book> books = repository.findAll();
		model.addAttribute("books", books);
		return("books");
	}
	
	@GetMapping("/search")
	public String search() {
		return("search");
	}
	
	@GetMapping("/search-author")
	public String searchByAuthor(@RequestParam String author, Model model) {
		
		List<Book> books = repository.findByAuthor(author);
		model.addAttribute("books", books);
		return("books");
	}
	
	@GetMapping("/search-title")
	public String searchByTitle(@RequestParam String title, Model model) {
		
		List<Book> books = repository.findByTitle(title);
		model.addAttribute("books", books);
		return("books");
	}
}
