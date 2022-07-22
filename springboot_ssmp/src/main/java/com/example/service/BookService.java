package com.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.domain.Book;

import java.util.List;

public interface BookService {
    Boolean save(Book book);
    Boolean update(Book book);
    Boolean delete(Integer id);
    Book selectById(Integer id);
    List<Book> selectAll();
    IPage<Book> selectByPage(int currentPage, int pageSize);
}
