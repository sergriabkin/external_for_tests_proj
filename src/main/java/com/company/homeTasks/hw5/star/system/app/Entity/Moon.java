package com.company.homeTasks.hw5.star.system.app.Entity;

public class Moon extends SpaceEntity {
    private Planet planet;

    public Moon(String name, Planet planet) {
        super(name);
        this.planet = planet;
    }
    @Override
    public String toString() {
        return super.toString() +" - moon";
    }
}
