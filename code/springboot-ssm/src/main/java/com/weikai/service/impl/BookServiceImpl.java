package com.weikai.service.impl;

import com.weikai.mapper.BookMapper;
import com.weikai.pojo.Book;
import com.weikai.service.BookService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service("bookServiceImpl")
public class BookServiceImpl implements BookService {
    //spring帮你注入, mybatis自动代理生成的实现类对象
    @Resource//自动装配到这里,目前是没有BookMapper的bean,只有启动自动代理后才有
    private BookMapper bookMapper;

    @Override
    public List<Book> getBookAll() {
        return bookMapper.selectBookAll();
    }

    @Override
    public Book getBookById(Integer id) {
//        if (1 == 1) {
//            throw new BusinessException(Code.BUSINESS_ERR, "业务异常");
//        }
//        try {
//            int i = 1 / 0;
//        } catch (Exception e) {
//            throw new SystemException(Code.SYSTEM_ERR, "系统异常");
//        }
        return bookMapper.selectBookById(id);
    }

    @Override
    public boolean update(Book book) {

        return bookMapper.updateBook(book) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return bookMapper.deleteBookById(id) > 0;
    }

    @Override
    public boolean save(Book book) {
        return bookMapper.saveBook(book) > 0;
    }
}
