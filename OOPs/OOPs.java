package OOPs;

public class OOPs {
    public static void main(String args[]){
        Pen P1 = new Pen();  // We have Created a Pen Object Called P1
        P1.setColor("Blue");
        System.out.println(P1.Color);
    }
}

class Pen {
    String Color;
    int tip;

    void setColor(String newColor){
        Color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage; //cgpa

    void calcPercentage(int phy,int chem, int math){
        percentage = (phy+chem+math) / 3;
    }
}

