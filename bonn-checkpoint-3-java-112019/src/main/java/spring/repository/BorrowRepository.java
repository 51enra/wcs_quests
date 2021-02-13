package spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.entity.Borrow;

public interface BorrowRepository extends JpaRepository<Borrow, Long> {

}
