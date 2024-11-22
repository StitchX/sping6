package com.atguigu.spring6.tx.service;

import com.atguigu.spring6.tx.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;

//@Transactional(timeout = 3)
//@Transactional(readOnly = true)
//@Transactional(noRollbackFor = ArithmeticException.class)
//@Transactional(isolation = Isolation.DEFAULT)
/*
什么是事务的传播行为?
在service类中有a()方法和b(方法，a(方法上有事务，b0方法上也有事务，
当a0方法执行过程中调用了b0方法事务是如何传递的?合并到一个事务里? 还是开启一个新的事务? 这就是事务传播行为。
 */
/*
REQUIRED: 支持当前事务，如果不存在就新建一个(默认)[没有就新建，有就加入]\

REQUIRES_NEW: 开启一个新的事务，如果一个事务已经存在，则将这个存在的事务挂起
[不管有没有，直接开启一个新事务，开启的新事务和之前的事务不存在嵌套关系，之前事务被挂起]
 */
@Transactional(propagation = Propagation.REQUIRES_NEW)
@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookDao bookDao;

    //    买书的方法：图书id 和用户id
//    @Transactional()
    @Override
    public void buyBook(Integer bookId, Integer userId) {
        //Todo 模拟超时效果
//        try {
//            TimeUnit.SECONDS.sleep(5);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        //根据图书id查询图书价格
        Integer price = bookDao.getBookPriceByBookId(bookId);
        // 更新图书表库存量 -1
        bookDao.updateStock(bookId);

        // 更新用户表用户余额 -图书价格
        bookDao.updateUserBalance(userId,price);


//        System.out.println(1/0);
    }
}
