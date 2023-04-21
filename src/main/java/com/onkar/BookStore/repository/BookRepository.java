package com.onkar.BookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onkar.BookStore.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
