package com.company.homeTasks.hw5.star.system.app;

import com.company.homeTasks.hw5.star.system.app.Entity.Planet;
import com.company.homeTasks.hw5.star.system.app.Entity.SpaceEntity;
import com.company.homeTasks.hw5.star.system.app.Entity.Star;

import java.util.List;

public class StarSystem {

    private Star star;
    private List<SpaceEntity> list;

    public StarSystem(Star star, List<SpaceEntity> list) {
        this.star = star;
        this.list = list;
    }

    public List<SpaceEntity> getAll() {
        return list;
    }

    public void addSpaceEntity(SpaceEntity spaceEntity) {
        list.add(spaceEntity);
        System.out.println(spaceEntity.getName() + " was added to Star System");
    }

    public SpaceEntity update(SpaceEntity oldSpaceEntity, SpaceEntity newSpaceEntity) {
        throw new UnsupportedOperationException();
    }

    public SpaceEntity delete(SpaceEntity spaceEntity) {
        throw new UnsupportedOperationException();
    }

    public void planetCount() {
        int count = 0;
        for (SpaceEntity e : list) {
            if (e instanceof Planet) count++;
        }
        System.out.println("There are: " + count + ((count>1)?" planets":" planet"));
    }

    public void showStarName() {
        System.out.println("Name of the star: " + star.getName());
    }

}
