package com.delete.demo.domain;

import java.util.List;

public class GroupLIst {
    private List<Group> groups;

    //添加删除学习小组
    public void addGroup(Person person, String name) {
        Group group = new Group(person, name);
        groups.add(group);
    }
    public void deleteGroup(Group group){
        for(int i=0;i<groups.size();i++){
            if(groups.get(i)==group){
                groups.remove(i);
                System.out.println("删除成功");
            }
        }
    }
}
