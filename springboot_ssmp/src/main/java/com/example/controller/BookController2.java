package com.example.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.controller.utils.R;
import com.example.domain.Book;
import com.example.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

//REST風格開發的標準命名方式
//表現層數據一致性處理
@RestController
@RequestMapping("/books")
public class BookController2 {

    @Autowired
    private IBookService bookService;

    @GetMapping
    public R getAll(){
        return new R(true,bookService.list());
    }

    @GetMapping("{id}")
    public R getById(@PathVariable Integer id){
        return new R(true,bookService.getById(id));
    }

    @PostMapping
    public R save(@RequestBody Book book) /*throws IOException*/ {
        //R r=new R();
        //boolean flag=bookService.save(book);
        //r.setFlag(flag);
        //return r;

        //if(true) throw new IOException(); //模擬異常發生
        return new R(bookService.save(book));
    }

    @PutMapping
    public R update(@RequestBody Book book){
        return new R(bookService.updateById(book));
    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id){
        return new R(bookService.removeById(id));
    }

    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage,@PathVariable int pageSize,Book book){
        IPage<Book> page=bookService.getPage(currentPage,pageSize,book);
        //如果當前頁碼值大於總頁碼值，重新執行查詢操作，使用最大頁碼值作為當前頁碼值
        if(currentPage>page.getPages()){
            page=bookService.getPage((int)page.getPages(),pageSize,book);
        }
        return new R(true,page);
    }
}