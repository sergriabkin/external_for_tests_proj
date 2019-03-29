package com.company.homeTasks.hw5.star.system.app;

import com.company.homeTasks.hw5.star.system.app.Entity.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Star star = new Star("Sun");
        StarSystem starSystem = new StarSystem(star, fillTheStarSystem(star));

        starSystem.showStarName();
        starSystem.planetCount();
        starSystem.addSpaceEntity(new Planet("Mars", star));
        starSystem.planetCount();

        System.out.println("\nSolar system members: ");
        starSystem.getAll().forEach(System.out::println);

    }

    private static List<SpaceEntity> fillTheStarSystem(Star star) {
        Planet planet3 = new Planet("Earth", star);
        Moon moon = new Moon("Moon", planet3);

        List<SpaceEntity> spaceEntityList = new ArrayList<>();
        spaceEntityList.add(planet3);
        spaceEntityList.add(moon);
        spaceEntityList.add(new Comet("Galley"));
        return spaceEntityList;
    }

}
