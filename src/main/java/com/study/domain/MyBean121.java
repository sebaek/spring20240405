package com.study.domain;


public class MyBean121 {
    private String name;
    private String company;
    private String country;
    private Integer price;

    public MyBean121() {
    }

    public MyBean121(String name, String company, String country, Integer price) {
        this.name = name;
        this.company = company;
        this.country = country;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
