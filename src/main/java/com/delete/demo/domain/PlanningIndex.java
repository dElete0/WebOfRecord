package com.delete.demo.domain;

import java.util.List;

import java.util.regex.*;

//计划列表
public class PlanningIndex {
    private String name;
    private List<Planning> plannings;

    //构造方法
    public PlanningIndex(String name) {
        this.name = name;
    }

    //添加计划
    public void addPlanning(String name){
        plannings.add(addPlanningIsOnly(name));
    }
    private Planning addPlanningIsOnly(String name){
        int i = 0;
        Planning planning;
        while (i<plannings.size()){
            if (Pattern.matches(name+"#.*", plannings.get(i).getName())) {
                int count=1;
                for(int j=i; j<plannings.size(); j++){
                    if(Pattern.matches(name+"#{0，}.*", plannings.get(i).getName())) {
                        count++;
                    }
                }
                planning = new Planning(name+"#"+String.valueOf(count+1));
                return planning;
            }
            if (plannings.get(i).getName() == name){
                plannings.get(i).renamePlanning(name+"#1");
                planning = new Planning(name);
                return planning;
            }
        }
        planning = new Planning(name);
        return planning;
    }

    //删除计划
    public boolean deletePlanning(String name){
        for(int i=0;i<plannings.size();i++){
            if(plannings.get(i).getName() == name){
                plannings.remove(i);
                return true;
            }
        }
        return false;
    }
}