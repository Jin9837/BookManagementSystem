package com.springboot_8.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springboot_8.dao.BookDao;
import com.springboot_8.domain.Book;
import com.springboot_8.service.IBookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl extends ServiceImpl<BookDao, Book> implements IBookService {
    private BookDao bookDao;
    @Override
    public Boolean saveBook(Book book) {
        return bookDao.insert(book) > 0;
    }

    // 用postman测试的时候delete方法会出现500错误，没找出原因
    @Override
    public Boolean delete(Integer id) {
        return bookDao.deleteById(id) > 0;
    }

    @Override
    public Boolean insert(Book book) {
        return bookDao.insert(book) > 0;
    }

    @Override
    public Boolean modify(Book book) {
        return bookDao.updateById(book) > 0;
    }

    @Override
    public Book get(Integer id) {
        return bookDao.selectById(id);
    }
}
