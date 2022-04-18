package com.springboot_8.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.springboot_8.controller.utils.R;
import com.springboot_8.domain.Book;
import com.springboot_8.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private IBookService bookService;

    @GetMapping
    public R getAll() {
        return new R(true, bookService.list());
    }

    @PostMapping
    public R save(@RequestBody Book book) {
        return new R(bookService.save(book));

    }

    @PutMapping
    public R update(@RequestBody Book book) {
        return new R(bookService.modify(book));
    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id) {
        return new R(bookService.delete(id));
    }

    @GetMapping("{id}")
    public R getById(@PathVariable Integer id) {
        return new R(true, bookService.getById(id));
    }



}



//// 没有用utils优化之前的方法，格式不够统一，与前端合并比较麻烦
//@RestController
//@RequestMapping("/books")
//public class BookController {
//
//    @Autowired
//    private IBookService bookService;
//
//    @GetMapping
//    public List<Book> getAll() {
//        return bookService.list();
//    }
//
//
//    @PostMapping
//    public Boolean save(@RequestBody Book book) {
//        return bookService.save(book);
//    }
//
//    @PutMapping
//    public Boolean update(@RequestBody Book book) {
//        return bookService.modify(book);
//    }
//
//    @DeleteMapping("/{id}")
//    public Boolean delete(@PathVariable Integer id) {
//        return bookService.delete(id);
//    }
//
//    @GetMapping("/{id}")
//    public Book getById(@PathVariable Integer id) {
//        return bookService.getById(id);
//    }

