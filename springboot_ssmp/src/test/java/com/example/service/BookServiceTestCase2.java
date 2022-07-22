package com.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTestCase2 {
    //業務層要求將查詢功能的結果打印
    @Autowired
    private IBookService iBookService;

    @Test
    void selectAll(){
        System.out.println(iBookService.list());
    }

    @Test
    void selectById(){
        System.out.println(iBookService.getById(4));
    }

    @Test
    void save(){
        Book book=new Book();
        book.setName("測試數據456");
        book.setType("測試數據456");
        book.setDescription("測試數據456");

        iBookService.save(book);
    }

    @Test
    void deleteById(){
        iBookService.removeById(16);
    }

    @Test
    void Update(){
        Book book=new Book();
        book.setId(13);
        book.setName("測試數據456");
        book.setType("測試數據456");
        book.setDescription("測試數據456");

        iBookService.updateById(book);
    }

    @Test
    void SelectByPage(){
        //本功能需要設置分頁攔截器
        IPage<Book> page=new Page<Book>(2,4);
        iBookService.page(page);
        System.out.println(page.getPages());
        System.out.println(page.getCurrent());
        System.out.println(page.getRecords());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
    }
}
