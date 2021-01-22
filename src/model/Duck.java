package model;

//added by Daniel DeLima

public class Duck {

    private String name;
    private String color;
    private int age;

    public Duck(){
        super();
    }

    public Duck(String name, String color, int age){
        super();
        this.name = name;
        this.color = color;
        this.age = age;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    public String speak(){
        return "Quack!";
    }
}
