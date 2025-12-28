package com.nortal.library.persistence.jpa;

import com.nortal.library.core.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JpaBookRepository extends JpaRepository<Book, String> {
    List<Book> findByLoanedTo(String memberId);

}
