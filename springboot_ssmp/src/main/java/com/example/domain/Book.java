package com.example.domain;

import lombok.Data;

//lombok
@Data //包含Getter,Setter,toString,hashCode,equals等大量方法
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;

}
