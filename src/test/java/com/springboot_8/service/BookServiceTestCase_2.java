package com.springboot_8.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.springboot_8.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTestCase_2 {

    @Autowired
    private BookService bookService;

    @Test
    void testGetById() {
        System.out.println(bookService.getById(4));
    }


    @Test
    void testSave() {
        Book book = new Book();
        book.setType("book type");
        book.setName("book name");
        book.setDescription("book description");
        bookService.save(book);
    }

    @Test
    void testUpdate() {
        Book book = new Book();
        book.setId(13);
        book.setType("book type");
        book.setName("book 13");
        book.setDescription("book description");
        bookService.update(book);
    }

    @Test
    void testDelete() {
        bookService.delete(13);
    }

    @Test
    void testGetAll() {
        System.out.println(bookService.getById(3));
    }

    @Test
    void testGetPage() {
        IPage<Book> page = bookService.getPage(1, 5);
    }

}
