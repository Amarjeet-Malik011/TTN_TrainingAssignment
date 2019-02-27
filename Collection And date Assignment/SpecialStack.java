import java.util.*;

public class SpecialStack {
    int top=-1;
    int capacity=5;
    int size=0;
    int min=Integer.MAX_VALUE;
    //list for storing variable in custom stack
    static List<Integer> list=new LinkedList<>();
    //list2 for minimum value in stack (i.e. maintaining list2 with list for special stack feature)
    static List<Integer> list2=new LinkedList<Integer>();
    public static Object push(SpecialStack specialStack,Integer i){
        if(i<specialStack.min){
            specialStack.min=i;
            list2.add(specialStack.min);
        }
        else
            list2.add(specialStack.min);

        if(!specialStack.isFull()) {
            list.add(i);
            specialStack.size++;
            specialStack.top++;
        }
        else{
            System.out.println("Stack OverFlow!");
        }
        return i;
    }
    public static Object pop(SpecialStack specialStack){
            int removedElement;
            removedElement=list.get(specialStack.top);
            list.remove(specialStack.top);
            list2.remove(specialStack.top);
            specialStack.top--;
            specialStack.size--;
            return removedElement;
    }
    boolean isFull()
    {
        if (this.size<this.capacity)
            return false;
        else
            return true;
    }
    boolean isEmpty(){
        if(this.size==0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        SpecialStack specialStack=new SpecialStack();
        Scanner sc =new Scanner(System.in);
        String input="n";
        System.out.println("Special Stack menu");
        System.out.println("------------------");
        do {
            System.out.println("Press 1 for PUSH operation");
            System.out.println("Press 2 for POP operation");
            System.out.println("Press 3 for Print operation");
            System.out.println("Press 4 for getting minimum from Stack");
            System.out.println("Enter your choice:");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter the element to PUSH: ");
                    int element = sc.nextInt();
                    System.out.println("Element inserted: "+push(specialStack, element));
                    break;
                case 2:if(specialStack.isEmpty())
                            System.out.println("Stack underflow!");
                       else
                        System.out.println("Element deleted: "+pop(specialStack));
                        break;
                case 3:if(specialStack.isEmpty())
                            System.out.println("Stack underflow!");
                       else {
                            System.out.println("Stack at present");
                            System.out.println("----------------");
                            for (int i = 0; i < list.size(); i++) {
                                System.out.println("\t\t"+list.get(i));
                            }
                        }
                        break;
                case 4:if(specialStack.isEmpty())
                        System.out.println("Stack Underflow!");
                    else
                        System.out.println("Minimum value: "+list2.get(specialStack.top));
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            System.out.println("Do you want to continue(y/n)?");
            input=sc.next();
        }while (input.charAt(0)=='y'||input.charAt(0)=='Y');
    }
}
