package com.nhnacademy.springbootjpa.entity;

import java.time.ZonedDateTime;

// TODO #1: `order` 테이블과 매핑될 `Order` Entity 클래스를 작성하세요.
/*
 * create table "order"
 * (
 *     id         bigint auto_increment
 *         primary key,
 *     ordered_at datetime not null
 * );
 */
public class Order {
    public long getId() {
        return 0;
    }

    public ZonedDateTime getOrderedAt() {
        return null;
    }
}
