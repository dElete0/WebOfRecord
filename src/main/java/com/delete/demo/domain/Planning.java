package com.delete.demo.domain;

import com.delete.demo.tools.Timetool;

import java.util.List;

//计划类
public class Planning {
    private String name;
    private List<Planning> plannings;
    private String startTime;
    private String endTime;
    private String deadline;
    private boolean ifend;

    //结束计划与误触
    public void endThePlanning() {
        endTime = Timetool.nowTime();
        ifend = true;
    }
    public void restartPlanning(){
        endTime = null;
        ifend = false;
    }

    //构造方法
    public Planning(String name) {
        this.name = name;
        this.startTime = Timetool.nowTime();
        ifend = false;
    }

    //重命名
    public void renamePlanning(String name){
        this.name = name;
    }

    //子方法相关
    public void addSonPlanning(Planning planning){
        plannings.add(planning);
    }
    public void deleteSonPlanning(Planning planning){
        for(int i=0;i<plannings.size();i++){
            if(plannings.get(i) == planning){
                plannings.remove(i);
            }
        }
    }

    //get方法们
    public String getName() {
        return name;
    };
    public String getStartTime(){
        return startTime;
    }
    public String getEndTime(){
        return endTime;
    }
    public String getDeadline(){
        return deadline;
    }
}