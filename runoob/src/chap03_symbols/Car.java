package chap03_symbols;

class Vehicle {}

public class Car extends Vehicle {
    public static void main(String[] args){
        Vehicle a = new Car();//在判断一个实例的引用类型时，要根据实际类型而不是声明类型
        Car b = new Car();
        boolean result =  a instanceof Vehicle;
        System.out.println( result);
    }
}
