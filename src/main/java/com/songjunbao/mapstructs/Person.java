package com.songjunbao.mapstructs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private Long id;
    private String name;
    private String email;
    private Date birthday;
    private User user;
}
