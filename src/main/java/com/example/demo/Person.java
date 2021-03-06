package com.example.demo;

public class Person {
    String name;
    private String email;
    private String phone;
    private AccountStatus status=AccountStatus.ACTIVE;
    public AccountStatus getStatus() {

        return status;
    }
    public void setStatus(AccountStatus status) {

        this.status = status;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public Person(String name, String email, String phone) {
        super();
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }


}