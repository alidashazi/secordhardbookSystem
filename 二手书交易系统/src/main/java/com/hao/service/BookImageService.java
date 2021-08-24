package com.hao.service;

import com.hao.pojo.BookImage;

public interface BookImageService {

    BookImage getByBookId(int bid);
    void add(BookImage bookImage);
    void update(BookImage bookImage);
    void deleteByBookId(int bid);
}
