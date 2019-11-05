public class Human {
    String name;
    String surname;
    int year;
    int iq;
    Pet pet;
    Human mother;
    Human father;
    //String[][] schedule;

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human() {
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        //this.schedule = schedule;
    }

    public String getName() {
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public int getYear(){
        return year;
    }
    public int getIq(){
        return iq;
    }
    public Pet getPet(){
        return pet;
    }
    public Human getMother(){
        return mother;
    }
     public Human getFather(){
        return father;
    }
    /*public String[][] getSchedule() {
        return schedule;
    }*/
    public void greetPet(){
        System.out.println("Hello");
    }

    @Override
    public String toString() {
        return ("Human-"+" name-"+this.name +" surname-"+this.surname+" year-"+this.year+" iq-"+this.iq+
                " mother"+this.mother+" father"+this.father+" pet-"+this.pet);

    }
}
