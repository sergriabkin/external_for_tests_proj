package com.company.homeTasks.hw5.star.system.app.Entity;

public class Planet extends SpaceEntity {
    private Star star;

    public Planet(String name, Star star) {
        super(name);
        this.star = star;
    }
    @Override
    public String toString() {
        return super.toString() +" - planet";
    }
}
