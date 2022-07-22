package com.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTestCase {
    //業務層要求將查詢功能的結果打印
    @Autowired
    private BookService bookService;

    @Test
    void selectAll(){
        System.out.println(bookService.selectAll());
    }

    @Test
    void selectById(){
        System.out.println(bookService.selectById(4));
    }

    @Test
    void save(){
        Book book=new Book();
        book.setName("測試數據456");
        book.setType("測試數據456");
        book.setDescription("測試數據456");

        bookService.save(book);
    }

    @Test
    void deleteById(){
        bookService.delete(15);
    }

    @Test
    void Update(){
        Book book=new Book();
        book.setId(13);
        book.setName("測試數據123");
        book.setType("測試數據123");
        book.setDescription("測試數據123");

        bookService.update(book);
    }

    @Test
    void SelectByPage(){
        //本功能需要設置分頁攔截器
        IPage<Book> page=bookService.selectByPage(2,4);
        System.out.println(page.getPages());
        System.out.println(page.getCurrent());
        System.out.println(page.getRecords());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
    }
}
