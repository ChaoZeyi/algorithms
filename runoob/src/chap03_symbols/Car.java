package chap03_symbols;

class Vehicle {}

public class Car extends Vehicle {
    public static void main(String[] args){
        Vehicle a = new Car();//���ж�һ��ʵ������������ʱ��Ҫ����ʵ�����Ͷ�������������
        Car b = new Car();
        boolean result =  a instanceof Vehicle;
        System.out.println( result);
    }
}
