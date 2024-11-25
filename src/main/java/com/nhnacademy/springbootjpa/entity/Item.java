package com.nhnacademy.springbootjpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

// TODO #1: `item` 테이블과 매핑될 `Item` Entity 클래스를 작성하세요.
/*
 * create table item
 * (
 *     id    bigint auto_increment
 *         primary key,
 *     name  varchar(40) not null,
 *     price bigint      not null
 * );
 */
@Entity
@Table
@NoArgsConstructor
@Getter
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Long price;


//    public long getId() {
//        return 0;
//    }
//
//    public String getName() {
//        return null;
//    }
//
//    public long getPrice() {
//        return 0;
//    }
}
