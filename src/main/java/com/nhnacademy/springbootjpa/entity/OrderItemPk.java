package com.nhnacademy.springbootjpa.entity;

// TODO #2: `OrderItem` Entity 클래스의 복합키 클래스인 `OrderItemPk` 클래스를 작성하세요.
public class OrderItemPk {
    public OrderItemPk(long orderId, int lineNumber) {
    }

    public long getOrderId() {
        return 0;
    }

    public int getLineNumber() {
        return 0;
    }
}
