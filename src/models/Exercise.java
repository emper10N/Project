package models;

public class Exercise {
    public final String name;
    public final String id;
    public Integer points;
    public final String type;

    public Exercise(String name, String id, Integer points, String type){
         this.name = name;
         this.id = id;
         this.points = points;
         this.type = type;
    }


}
