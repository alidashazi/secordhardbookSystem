package com.hao.service;

import com.hao.pojo.User;

public interface UserService {

    boolean checkUser(User user);
    User get(int id);
    User getByStudentid(String studnetid);

}
