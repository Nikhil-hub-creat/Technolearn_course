import java.util.*;

public class Main {
    double real,img;
    Main(){

    }
    Main(double real,double img){
        this.real = real;
        this.img = img;
    }

    
    public String toString() {
        return "Complex{" +
                "real=" + real +
                ", img=" + img +
                '}';
    }
    public Main add(Main m1,Main m2){
        double real_sum = m1.real + m2.real;
        double img_sum  = m1.img + m2.img;
        return new Main(real_sum,img_sum);
    }


    public static void main(String[] args) {

        Main obj = new Main();
        Main ob1 = new Main(1,2);
        Main ob2 = new Main(3,4);
        Main ob3 ;
        ob3 = obj.add(ob1, ob2);
        System.out.println("Complex 1"+ ob1);
        System.out.println("Complex 2"+ob2);
        System.out.println("Complex 3"+ ob3);

       
    }
}
