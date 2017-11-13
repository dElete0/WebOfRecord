package com.delete.demo.domain;

import com.delete.demo.tools.Timetool;

import java.util.List;

public class Group {
    private User adm;
    private List<User> users;
    private String name;
    private String buildTime;
    private int groupAchievementoints;

    //构造方法
    public Group(User adm, String name){
        this.adm = adm;
        this.name = name;
        this.buildTime = Timetool.nowTime();
    }

    //添加删除小组成员
    public void addGroupPerson(User user){
        if(addGroupPersonIsExist(user)){
            System.out.println("该用户已存在");
        }else{
            users.add(user);
            System.out.println("添加用户成功");
        }
    }
    public boolean addGroupPersonIsExist(User user){
        for(int i=0;i<users.size();i++){
            if(user.getName() == users.get(i).getName()){
                return true;
            }
        }
        return false;
    }
    public void deleteGroutPerson(User user){
        for(int i=0;i<users.size();i++){
            if(users.get(i)== user){
                users.remove(i);
                System.out.println("删除成功");
            }else{
                System.out.println("未知错误");
            }
        }
    }

    //get方法们
    public User getAdm() {
        return adm;
    }
    public List<User> getPeople() {
        return users;
    }
    public String getName() {
        return name;
    }
    public String getBuildTime() {
        return buildTime;
    }
    public int getGroupAchievementoints() {
        return groupAchievementoints;
    }

}
