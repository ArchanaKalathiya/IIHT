public class MethodOverloading {
    static int sum(int a, int b){
        return a+b;
    }
    static double sum(double a,double b,double c){
        return a+b+c;
    }
    public static void main(String[] args){
        MethodOverloading obj=new MethodOverloading();
        System.out.println("Int sum: "+obj.sum(1,2));
        System.out.println("Double sum: "+obj.sum(1.22,1.22,1.22));
    }
}
