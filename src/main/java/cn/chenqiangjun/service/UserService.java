package cn.chenqiangjun.service;

import cn.chenqiangjun.po.User;

public interface UserService {

    User checkUser(String username, String password);
}
