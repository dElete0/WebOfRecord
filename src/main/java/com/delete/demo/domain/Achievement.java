package com.delete.demo.domain;

import java.util.Date;

//已完成成就
public class Achievement {
    private Date startTime;
    private Date endTime;
    private String name;

    //构造方法们
    public Achievement(String name) {
        this.endTime = new Date();
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
    public Date getStartTime() {
        return startTime;
    }
    public Date getEndTime() {
        return endTime;
    }
}
