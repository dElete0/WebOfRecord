package com.delete.demo.domain;

import com.delete.demo.tools.Timetool;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class User {

    private List<Planning> plannings;
    private List<Achievement> achievements;
    private List<Group> groups;
    private Long id;
    private String name;
    private String joinTime;
    private String password;

    //构造方法
    public User(String name, String password){
        this.name = name;
        this.password = password;
        joinTime = Timetool.nowTime();
    }

    //完成计划及误触
    public void thePlanningIsOver(Planning planning){
        planning.endThePlanning();
        Achievement achievement = new Achievement(planning);
        achievements.add(achievement);
    }
    public void restartPlanning(Planning planning){
        planning.restartPlanning();
        for(int i = achievements.size(); i>0; i--){
            if(planning.getName() == achievements.get(i-1).getName()|| achievements.get(i-1).getStartTime()!=null){
                achievements.remove(i-1);
            }
        }
    }

    //添加成就及误触
    public void addAchievement(String name){
        achievements.add(new Achievement(name));
    }
    public void deleteAchievement(Achievement achievement){
        for(int i = achievements.size(); i > 0; i--){
            if(achievement == achievements.get(i-1)){
                achievements.remove(i-1);
                System.out.println("删除成功");
                return;
            }
        }
        System.out.println("删除失败");
    }

    //get方法们
    public List<Planning> getPlannings() {
        return plannings;
    }
    public List<Achievement> getAchievements() {
        return achievements;
    }
    public List<Group> getGroups() {
        return groups;
    }
    public String getName() {
        return name;
    }
    public Long getId(){
        return id;
    }
    public int getUserAchievementsPoint() {
        return achievements.size();
    }
    public int getNumOfGroup(){
        return groups.size();
    }
    public int getNumOfPlanning() {
        return plannings.size();
    }
    public int getNumOfAchievementsToday(){
        int count = 0;
        for(int i = 0; i < achievements.size(); i++){
            if(Timetool.nowTime() == achievements.get(i).getEndTime()){
                count++;
            }
        }
        return count;
    }
    public int getPersonAchievementsPoint() {
        return achievements.size();
    }
    public String getJoinTime() {
        return joinTime;
    }
    public String getPassword() {
        return password;
    }
}