package com.delete.demo.domain;

import java.util.List;

public class UserList {
    private static List<User> users;

    //添加/删除用户
    public static void addUser(String name, String password){
        users.add(new User(name, password));
    }
    public static void deleteUser(User user){
        for(int i = 0; i < users.size(); i++){
            if(user == users.get(i)){
                users.remove(i);
            }
        }
    }

    //get用户数量
    public static int NumOfUser(){
        return users.size();
    }
}