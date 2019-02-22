package CoffeeShop;

import java.util.Scanner;

public class Order implements CoffeeShop {
    static int MAX=10,top=0,order_id=1;
    int order_queue[]=new int[MAX];
    int ready_queue[]=new int[MAX];

    @Override
    public int placeOrder() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 for Cold Cofee");
        System.out.println("Press 2 for Hot Cofee Cofee");
        System.out.println("select your choice");
        int choice=sc.nextInt();
        float billAmount;
        switch (choice)
        {
            case 1:System.out.println("Pay rs. 80");
                billAmount=sc.nextFloat();
                if(billAmount==80)
                {
                    System.out.println("thank you");
                    System.out.println("Please wait while your order::"+order_id+" is being prepared....");
                    order_queue[top++]=order_id++;
                }
                else if(billAmount>80)
                    System.out.println("take "+(billAmount-80)+" rs. back");

                else
                    System.out.println("Insufficient Fund!!! try again.");
                    break;
            case 2:System.out.println("Pay rs. 50");
                billAmount=sc.nextFloat();
                if(billAmount==80)
                {
                    System.out.println("thank you");
                    System.out.println("Please wait while your order::"+order_id+" is being prepared....");
                    order_queue[top++]=order_id++;
                }
                else if(billAmount>80)
                    System.out.println("take "+(billAmount-80)+" rs. back");

                else
                    System.out.println("Insufficient Fund!!! try again.");
                break;
            default:System.out.println("invalid choice");
        }
        return 0;
    }

    @Override
    public void prepareOrder() {
        if(order_queue.length>0) {
            for(int i=0;i<order_queue.length;i++) {
                if(order_queue[i]==0) {
                    break;
                } else {
                    System.out.println("CoffeeShop.Order id " + order_queue[i] + " is being prepared");
                    ready_queue[i] = order_queue[i];
                }
            }
            order_queue=null;
        }
    }

    @Override
    public void orderReady() {
        if(ready_queue.length>0) {
            for(int i=0;i<ready_queue.length;i++) {
                if(ready_queue[i]==0) {
                    break;
                } else {
                    System.out.println("CoffeeShop.Order id " + ready_queue[i] + " is ready.Enjoy!!!");
                }
            }
            ready_queue=null;
        }
    }
}
