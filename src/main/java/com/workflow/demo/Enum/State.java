package com.workflow.demo.Enum;

/**
 * 枚举工具类
 * @Author: Elvis
 * @Date: 2019/9/2 15:24
 */
public enum State {

    PROGRESSING("PROGRESSING", "进行中"),
    FINISHED("FINISHED", "已完成"),
        CLOSED("CLOSED", "已关闭");

     private String state;
     private String name;

     State(String state, String name){
     this.state = state;
     this.name = name;
     }

     public String getCode(){
         return state;
     }

     public String getName(){
         return name;
     }

     public void setName(String name){
         State[] values = State.values();
         for(State value : values){
             if(value.name == name){
                 this.state = value.state;
                 this.name = value.name;
             }
         }
     }
}