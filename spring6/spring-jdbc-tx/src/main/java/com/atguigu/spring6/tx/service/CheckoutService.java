package com.atguigu.spring6.tx.service;

public interface CheckoutService {
//    买很多本书的方法
    void checkout(Integer[] bookIds, Integer userId);
}
