package com.inheritance;

class Nature {
    void Animal() {
        String Animalname = "Tiger";
        int Animalleg = 4;
        System.out.println("I am a: " + Animalname);
        System.out.println("I have " + Animalleg + " legs");
        this.Bird("Sparrow", 2);
        this.Fish();
        this.Flower("Rose");
    }

    void Bird(String Birdname, int Birdleg) {
        System.out.println("I am a " + Birdname);
        System.out.println("I have " + Birdleg + " legs");
    }

    void Fish() {
        String fishname = "Goldfish";
        int fishleg = 0;
        System.out.println("I am a " + fishname);
        System.out.println("I have " + fishleg + " legs");
    }

    void Flower(String flowername) {
        System.out.println("Flower name is: " + flowername);
    }
}

public class ThisMethod {
    public static void main(String[] args) {
        Nature n1 = new Nature();
        n1.Animal();
    }
}

