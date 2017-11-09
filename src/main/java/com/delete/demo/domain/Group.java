package com.delete.demo.domain;

import java.util.Date;
import java.util.List;

public class Group {
    private Person adm;
    private List<Person> people;
    private String name;
    private Date buildTime;
    private int groupAchievementoints;

    //构造方法
    public Group(Person adm, String name){
        this.adm = adm;
        this.name = name;
        this.buildTime = new Date();
    }

    //添加删除小组成员
    public void addGroupPerson(Person person){
        if(addGroupPersonIsExist(person)){
            System.out.println("该用户已存在");
        }else{
            people.add(person);
            System.out.println("添加用户成功");
        }
    }
    public boolean addGroupPersonIsExist(Person person){
        for(int i=0;i<people.size();i++){
            if(person.getName() == people.get(i).getName()){
                return true;
            }
        }
        return false;
    }
    public void deleteGroutPerson(Person person){
        for(int i=0;i<people.size();i++){
            if(people.get(i)==person){
                people.remove(i);
                System.out.println("删除成功");
            }else{
                System.out.println("未知错误");
            }
        }
    }

    //get方法们
    public Person getAdm() {
        return adm;
    }
    public List<Person> getPeople() {
        return people;
    }
    public String getName() {
        return name;
    }
    public Date getBuildTime() {
        return buildTime;
    }
    public int getGroupAchievementoints() {
        return groupAchievementoints;
    }

}
