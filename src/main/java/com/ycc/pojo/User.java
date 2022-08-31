package com.ycc.pojo;

/**
 * @author: ycc
 * @date: 2022/8/31-08-31-15:06
 * @Description: com.ycc.pojo
 * @version: 1.0
 */
public class User {
    private String name;
    private String password;

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
