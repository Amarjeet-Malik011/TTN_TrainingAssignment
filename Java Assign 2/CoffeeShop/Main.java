package CoffeeShop;

import java.util.Scanner;

public class Main {
    static  {
        System.out.println("****Welcome to the Cofee shop****");
        
    }
    public static void main(String[] args) {
        char a;
        Scanner sc=new Scanner(System.in);
        Order o=new Order();
        do{
            o.placeOrder();
            System.out.println("do you want to place more order(y/n)?");
            a=sc.next().charAt(0);
        }while (a=='y'||a=='Y');
        o.prepareOrder();
        o.orderReady();
    }
}
