package com.delete.demo.domain;

import javax.xml.crypto.Data;
import java.util.List;

public class Person {

    private List<Planning> plannings;
    private List<Achievement> achievements;
    private List<Group> groups;
    private String name;
    private Data joinTime;
    private String password;
    private int personAchievementsPoint;

    //完成计划及误触
    public void thePlanningIsOver(Planning planning){
        planning.endThePlanning();
        Achievement achievement = new Achievement(planning);
        achievements.add(achievement);
    }
    public void restartPlanning(Planning planning){
        planning.restartPlanning();
        for(int i = achievements.size()-1; i>=0; i++){
            if(planning.getName() == achievements.get(i).getName()|| achievements.get(i).getStartTime()!=null){
                achievements.remove(i);
            }
        }
    }

    //添加成就及删除
    public void addAchievement(String name){
        achievements.add(new Achievement(name));
    }
    public void deleteAchievement(Achievement achievement){
        for(int i = 0; i< achievements.size(); i++){

        }
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
    public Data getJoinTime() {
        return joinTime;
    }
    public String getPassword() {
        return password;
    }
    public int getPersonAchievementsPoint() {
        return personAchievementsPoint;
    }

}
