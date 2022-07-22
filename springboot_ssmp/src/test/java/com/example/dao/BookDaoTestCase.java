package com.example.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.SSMPApplication;
import com.example.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = SSMPApplication.class)
public class BookDaoTestCase {
    @Autowired
    private com.example.dao.BookDao BookDao;

    @Test
    void SelectAll(){
        BookDao.selectList(null);
    }

    @Test
    void SelectById(){
        BookDao.selectById(5);
    }

    @Test
    void Add(){
        Book book=new Book();
        book.setName("測試數據456");
        book.setType("測試數據456");
        book.setDescription("測試數據456");

        BookDao.insert(book);
    }

    @Test
    void DeleteById(){
        BookDao.deleteById(14);
    }

    @Test
    void UpdateById(){
        Book book=new Book();
        book.setId(14);
        book.setName("測試數據789");
        book.setType("測試數據789");
        book.setDescription("測試數據789");

        BookDao.updateById(book);
    }

    @Test
    void SelectByPage(){
        //本功能需要設置分頁攔截器
        IPage<Book> page=new Page(2,4);
        BookDao.selectPage(page,null);
        System.out.println(page.getPages());
        System.out.println(page.getCurrent());
        System.out.println(page.getRecords());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
    }

    @Test
    void SelectByCondition(){
        QueryWrapper<Book> qw=new QueryWrapper<>();
        //查詢帶有"Spring"的書本名
        qw.like("name","Spring");
        BookDao.selectList(qw);
    }

    @Test
    void SelectByCondition2(){
        String name="Spring";

        LambdaQueryWrapper<Book> lqw=new LambdaQueryWrapper<>();
        //查詢帶有"Spring"的書本名
        lqw.like(name != null,Book::getName,name);
        BookDao.selectList(lqw);
    }
}
