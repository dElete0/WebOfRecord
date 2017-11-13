package com.delete.demo.service;

import com.delete.demo.domain.User;

public interface UserService {
    int add(User user);
    int uodate(User user);
    int deleteByIds(String ids);
    User queryUserById(Long user);
}
