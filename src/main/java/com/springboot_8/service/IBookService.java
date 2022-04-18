package com.springboot_8.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.springboot_8.domain.Book;

// 业务层接口
public interface IBookService extends IService<Book> {
    // 如果给定的功能不够我们用，我们可以像下面这样自己手动写功能，然后自己在对应的实现类实现就行
    Boolean saveBook(Book book);

    Boolean delete(Integer id);

    Boolean insert(Book book);

    Boolean modify(Book book);

    Book get(Integer id);
}
