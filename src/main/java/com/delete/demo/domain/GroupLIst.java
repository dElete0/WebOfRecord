package com.delete.demo.domain;

import java.util.List;

public class GroupLIst {
    private static List<Group> groups;

    //添加/删除学习小组
    public static void addGroup(User user, String name) {
        Group group = new Group(user, name);
        groups.add(group);
    }
    public static void deleteGroup(Group group){
        for(int i=0;i<groups.size();i++){
            if(groups.get(i)==group){
                groups.remove(i);
                System.out.println("删除成功");
            }
        }
    }
}
