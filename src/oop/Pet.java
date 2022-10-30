package oop;

public class Pet {

    private String name;

    public Pet(String petName) {
        name = petName;
    }

    //public type methodName() {  return somethingWithTheType;  }
    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

}
