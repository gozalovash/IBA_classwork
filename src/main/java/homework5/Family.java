package homework5;

import java.lang.reflect.Field;


public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        children= new Human[]{};
    }

    public Human getFather() {
        return father;
    }

    public Human getMother() {
        return mother;
    }

    public Human[] getChildren() {
        return children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    private int count=0;
    public void addChild(Human child){
        children[count++]=child;
    }
    public boolean deleteChild(int index){
        while((children[index]=null)==null) return true;
        return false;
    }
    public int countFamily(){
        int c=2;
        Field[] fields=Family.class.getDeclaredFields();
        for(Human child:children) c++;
        if(pet!=null) c++;
        return c;
    }
    private void equals(){

    }
    @Override
    public String toString() {
        return "mother:" + this.mother+"\t"
                +" father: "+ this.father+"\t"
                +"children:" + this.children+"\t"
                +"pet:"+this.pet;
    }
}
