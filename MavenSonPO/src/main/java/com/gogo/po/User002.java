package com.gogo.po;

/**
 * describe
 * 作者：曾昭武
 */
public class User002 {

    private  int id;
    private  String name;

    public User002(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public User002() {
    }

    @Override
    public String toString() {
        return "User002{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
