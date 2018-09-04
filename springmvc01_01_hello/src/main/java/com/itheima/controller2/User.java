package com.itheima.controller2;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class User {
    private int id;
    private String name;
    // 地址对象
    private Address address;
    // 集合对象
    private List<Address> list;
    private Map<String,Address> map;
    // 生日
    private Date birthday;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Address> getList() {
        return list;
    }

    public void setList(List<Address> list) {
        this.list = list;
    }

    public Map<String, Address> getMap() {
        return map;
    }

    public void setMap(Map<String, Address> map) {
        this.map = map;
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
