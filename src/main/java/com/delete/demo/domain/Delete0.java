package com.delete.demo.domain;

import com.delete.demo.tools.Timetool;

import java.util.List;

public class Delete0 {
    private static List<Planning> plannings;
    private static List<Achievement> achievements;
    private static List<Group> groups;
    private static String name = "dElete";
    private static String password = "panzertty12[]";

    //完成计划及误触
    public static void thePlanningIsOver(Planning planning){
        planning.endThePlanning();
        Achievement achievement = new Achievement(planning);
        achievements.add(achievement);
    }
    public static void restartPlanning(Planning planning){
        planning.restartPlanning();
        for(int i = achievements.size(); i>0; i--){
            if(planning.getName() == achievements.get(i-1).getName()|| achievements.get(i-1).getStartTime()!=null){
                achievements.remove(i-1);
            }
        }
    }

    //添加成就及误触
    public static void addAchievement(String name){
        achievements.add(new Achievement(name));
    }
    public static void deleteAchievement(Achievement achievement){
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
    public static List<Planning> getPlannings() {
        return plannings;
    }
    public static List<Achievement> getAchievements() {
        return achievements;
    }
    public static List<Group> getGroups() {
        return groups;
    }
    public static String getName() {
        return name;
    }
    public static int getUserAchievementsPoint() {
        return achievements.size();
    }
    public static int getNumOfGroup(){
        return groups.size();
    }
    public static int getNumOfPlanning() {
        return plannings.size();
    }
    public static int getNumOfAchievementsToday(){
        int count = 0;
        for(int i = 0; i < achievements.size(); i++){
            if(Timetool.nowTime() == achievements.get(i).getEndTime()){
                count++;
            }
        }
        return count;
    }
    public static int getPersonAchievementsPoint() {
        return achievements.size();
    }
    public static String getPassword() {
        return password;
    }

}
