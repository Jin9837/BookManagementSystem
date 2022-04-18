package com.springboot_8;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.springboot_8.domain.Book;
import com.springboot_8.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Springboot8Application.class)
class Springboot8ApplicationTest {

    @Autowired
    private BookDao bookDao;

    @Test
    void contextLoads() {
    }

    @Test
    void testGetById() {
        System.out.println(bookDao.selectById(1));
    }

    @Test
    void testSave() {
        Book book = new Book();
        book.setType("book type");
        book.setName("book name");
        book.setDescription("book description");
        bookDao.insert(book);
    }

    @Test
    void testUpdate() {
        Book book = new Book();
        book.setId(13);
        book.setType("book type");
        book.setName("book 13");
        book.setDescription("book description");
        bookDao.updateById(book);
    }

    @Test
    void testDelete() {
        bookDao.deleteById(13);
    }

    @Test
    void testGetAll() {
        System.out.println(bookDao.selectList(null));
    }

    @Test
    void testGetPage() {
        IPage page = new Page(1, 5); //需要用到MPConfig.java中的拦截器来实现分页显示
        bookDao.selectPage(page, null);
    }

    @Test
    void testGetBy() {
        // 这个方法不能模糊查询
        // QueryWrapper<Book> qw = new QueryWrapper<>();
        // qw.like("name", "Spring");
        // bookDao.selectList(qw);


        // 这个方法可以模糊查询，手误打错几个字母也能查出来
        String name = "Spring";
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();
        lqw.like(name != null, Book::getName, name);
        bookDao.selectList(lqw);
    }
}
