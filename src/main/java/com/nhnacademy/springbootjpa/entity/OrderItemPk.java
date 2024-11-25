package com.nhnacademy.springbootjpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

// TODO #2: `OrderItem` Entity 클래스의 복합키 클래스인 `OrderItemPk` 클래스를 작성하세요.

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
@Getter
public class OrderItemPk implements Serializable {

    @Column(name = "order_id")
    private long orderId;
    @Column(name = "line_number")
    private int lineNumber;



}
