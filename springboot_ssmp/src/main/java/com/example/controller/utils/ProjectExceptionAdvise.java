package com.example.controller.utils;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//作為springmvc的異常處理器
@RestControllerAdvice
public class ProjectExceptionAdvise {
    //攔截所有異常信息
    @ExceptionHandler
    public R doException(Exception ex){
        //記錄日誌
        //通知運維
        //通知開發

        ex.printStackTrace();
        return new R("服務器故障，請聯繫管理員");
    }
}
