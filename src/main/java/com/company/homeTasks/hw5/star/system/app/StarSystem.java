package com.company.homeTasks.hw5.star.system.app;

import java.util.ArrayList;
import java.util.List;

public class StarSystem {

    private List<SpaceEntity> list = new ArrayList<>();

    public StarSystem(List<SpaceEntity> list) {
        this.list = list;
    }

    public List<SpaceEntity> getList() {
        return list;
    }

    public SpaceEntity save (SpaceEntity spaceEntity){
        throw new UnsupportedOperationException();
    }
    public SpaceEntity update (SpaceEntity oldSpaceEntity, SpaceEntity newSpaceEntity){
        throw new UnsupportedOperationException();
    }
    public SpaceEntity delete (SpaceEntity spaceEntity){
        throw new UnsupportedOperationException();
    }

}
