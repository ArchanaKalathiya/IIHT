public class Car {
    static void myMethod(int age,String name){          // Creating a class method ( Here age and string are parameters)
        System.out.println("Hi");
        System.out.println(name);
        System.out.println(age);
    }
    int x=5;   // this is called attribute of Car
    int y=4;    // attribute
    String model="2024";
    String name="Honda";
    String fname = "Archana";
    String lname = "Kalathiya";

    //  these attributes are static

    public static void main(String[] args){

        myMethod(20,"Archana"); // accessing method and you can call it n number of times (Here age and name are called data arguments)
        myMethod(25,"Eden");
        Car myObj = new Car();             // Creating a class instance
        System.out.println( myObj.x);      // accessing class attribute
        System.out.println(myObj.name);

        Car Obj = new Car();
        System.out.println(Obj.x);

        Car Obj1 = new Car();               // Creating multiple objects
        System.out.println(Obj1.y);

        myObj.name="Tesla Car";             // modifying attributes
        System.out.println(myObj.name);

        System.out.println("Name : "+myObj.fname+" "+myObj.lname);
    }
}
