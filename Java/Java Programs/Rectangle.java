public class Rectangle {
    // public method
    public int calculateArea(int l,int b){
        return l*b;
    }
    public  int calculatePerimeter(int l,int b){
        return 2*(l+b);
    }
    public static void main(String[] args){
        //creating an instance or object creation
        Rectangle myObj=new Rectangle();
        //calling public method
        int area = myObj.calculateArea(20,3);
        int perimeter = myObj.calculatePerimeter(20,3);
        System.out.println("Area of rectangle is "+ area);
        System.out.println("Perimeter of rectangle is "+ perimeter);
    }
}
