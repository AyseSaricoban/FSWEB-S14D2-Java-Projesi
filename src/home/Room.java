package home;

public class Room {
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceilling ceiling;
    private Lamp lamp;
    private Carpet carpet;

    public Room(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceilling ceiling, Lamp lamp, Carpet carpet) {
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.lamp = lamp;
        this.carpet = carpet;
    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public Ceilling getCeiling() {
        return ceiling;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public Carpet getCarpet() {
        return carpet;
    }
}
