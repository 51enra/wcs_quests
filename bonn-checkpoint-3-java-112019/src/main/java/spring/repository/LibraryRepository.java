package spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.entity.Library;

public interface LibraryRepository extends JpaRepository<Library, Long> {

}
