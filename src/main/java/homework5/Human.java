package homework5;

import java.util.Arrays;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    //private Pet pet;
    private Family family;
    private String[][] schedule;

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }


    public Human() {
    }

    public Human(String name, String surname, int year, int iq, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq(){
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    private String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public void greetPet(){
        System.out.printf("Hello, %s", family.getPet().nickname);
    }
    public void describePet(){
        System.out.printf("I have a %s, he is %d years old, he is %s", family.getPet().species, family.getPet().age,
                (family.getPet().trickLevel>50? "very sly":"almost not sly"));
    }


    @Override
    public String toString() {
        return ("homework.HappyFamily.Human-"+" name-"+this.name +"\t"
                +" surname-" +this.surname+"\t"
                +" year-"+this.year+"\t"
                +" iq-"+this.iq+"\t"
                +"schedule:"+ Arrays.deepToString(this.schedule));

    }
}
