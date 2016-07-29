package com.roger.ssm.service;

/**
 * Created by Roger on 2016/7/29.
 */
public class Message {
    
    public static String show(String msg){
        String str = "Service message show: " + msg;
        System.out.println(str);
        return str;
    }
}
