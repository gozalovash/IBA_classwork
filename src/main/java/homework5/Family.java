package homework5;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Objects;


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

    public boolean deleteChild(Human child){
        Human[] children_new=new Human[children.length-1];
        int pos=0;
        for(Human child1:children){
            if(!child1.equals(child)){
                children_new[pos++]=child1;
            }
        }
        return true;
    }

    public int countFamily(){
        int c=2;
        Field[] fields=Family.class.getDeclaredFields();
        for(Human child:children) c++;
        if(pet!=null) c++;
        return c;
    }

    @Override
    public String toString() {
        return "mother:" + this.mother+"\t"
                +" father: "+ this.father+"\t"
                +"children:" + this.children+"\t"
                +"pet:"+this.pet;
    }

   @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return pet.equals(family.pet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pet);
    }
}
