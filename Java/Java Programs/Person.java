//Default & Parametrized Constructor
public class Person {
    String name;
    int year;
//    Person(){       //Default constructor
//        name="Wednesday";
//        age=4;
//    }

    Person(String n,int a){
        name=n;
        year=a;
    }
    void show(){ //method
        System.out.println("Name : "+ name);
        System.out.println("Year Released : "+ year);
    }
    public static void main(String[] args){
        //creating a class instance
        Person myObj=new Person("Wednesday",2023);
        myObj.show();
    }
}
