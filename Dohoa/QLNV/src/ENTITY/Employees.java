/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ENTITY;

/**
 *
 * @author Huy
 */
public class Employees {
    String username;
    String password;
    String fullname;
    String age;
    String address;
    String phone;
    int DepID;
    int PrID;

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

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getDepID() {
        return DepID;
    }

    public void setDepID(int DepID) {
        this.DepID = DepID;
    }

    public int getPrID() {
        return PrID;
    }

    public void setPrID(int PrID) {
        this.PrID = PrID;
    }
}
