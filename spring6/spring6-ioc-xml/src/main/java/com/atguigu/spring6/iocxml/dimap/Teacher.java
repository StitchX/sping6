package com.atguigu.spring6.iocxml.dimap;


public class Teacher {

    private String tid;
    private String tname;

    public void run(){
        System.out.println("学生编号："+tid+":"+tname);
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid='" + tid + '\'' +
                ", tname='" + tname + '\'' +
                '}';
    }
}
