package com.delete.demo.domain;

import com.delete.demo.tools.Timetool;

import java.util.Date;

//已完成成就
public class Achievement {
    private String startTime;
    private String endTime;
    private String name;

    //构造方法们
    public Achievement(String name) {
        endTime = Timetool.nowTime();
        this.name = name;
    }
    public Achievement(Planning planning) {
        this.name = planning.getName();
        this.startTime = planning.getStartTime();
        this.endTime = planning.getEndTime();
    }

    //get方法们
    public String getName(){
        return name;
    }
    public String getStartTime() {
        return startTime;
    }
    public String getEndTime() {
        return endTime;
    }
}
