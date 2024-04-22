public class Math {
    //static method multiplication
    public static int multiply(int a,int b){
        return a*b;
    }
    public static void main(String[] args){
        int mul=Math.multiply(2,3);//calling static methods

        System.out.println("Multiplication of a and b =" + mul);
    }
}
