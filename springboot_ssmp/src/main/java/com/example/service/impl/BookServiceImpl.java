package com.example.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.dao.BookDao;
import com.example.domain.Book;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //將本類別定義為一個業務層對應的Bean
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public Boolean save(Book book) {
        return bookDao.insert(book) > 0; //因本方法返回的是受影響行數，故加上邏輯運算式
    }

    @Override
    public Boolean update(Book book) {
        return bookDao.updateById(book) > 0; //因本方法返回的是受影響行數，故加上邏輯運算式
    }

    @Override
    public Boolean delete(Integer id) {
        return bookDao.deleteById(id) > 0; //因本方法返回的是受影響行數，故加上邏輯運算式
    }

    @Override
    public Book selectById(Integer id) {
        return bookDao.selectById(id);
    }

    @Override
    public List<Book> selectAll() {
        return bookDao.selectList(null);
    }

    @Override
    public IPage<Book> selectByPage(int currentPage, int pageSize) {
        IPage<Book> page= new Page(currentPage,pageSize);
        bookDao.selectPage(page,null);
        return page;
    }
}
