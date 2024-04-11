package com.study.domain;

import java.util.List;

public class MyBean122 {
    private String name;
    private String team;
    private String country;
    private String event; // 종목
    private List<String> positions;

    public MyBean122() {
    }

    public MyBean122(String name, String team, String country, String event, List<String> positions) {
        this.name = name;
        this.team = team;
        this.country = country;
        this.event = event;
        this.positions = positions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public List<String> getPositions() {
        return positions;
    }

    public void setPositions(List<String> positions) {
        this.positions = positions;
    }
}
