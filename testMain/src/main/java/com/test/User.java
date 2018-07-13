package com.test;

import java.util.List;

/**
 * Created by ban on 2018/7/12.
 */
public class User {

    private String username;
    private String password;
    private String age;
    private List<A> list;

    public List<A> getList() {
        return list;
    }

    public void setList(List<A> list) {
        this.list = list;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age='" + age + '\'' +
                ", list=" + list +
                '}';
    }
}
