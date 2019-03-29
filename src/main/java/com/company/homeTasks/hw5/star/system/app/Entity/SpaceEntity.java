package com.company.homeTasks.hw5.star.system.app.Entity;

import java.util.Objects;

public abstract class SpaceEntity {
    private int id;
    private String name;

    private static int count = 0;

    public SpaceEntity(String name) {
        this.id = ++count;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpaceEntity that = (SpaceEntity) o;
        return id == that.id &&
                name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "SpaceEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
