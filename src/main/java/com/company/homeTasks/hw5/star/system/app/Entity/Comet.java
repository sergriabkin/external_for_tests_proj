package com.company.homeTasks.hw5.star.system.app.Entity;

public class Comet extends SpaceEntity{

    public Comet(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString() +" - comet";
    }
}
