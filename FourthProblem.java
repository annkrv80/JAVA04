import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class FourthProblem {
    int n;
    Object [] a;
     FourthProblem(){
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        a=new Object[n];
        for(int i = 0; i<n; i++){
            a[i]=in.next();
        }
        in.close();
    }

    public void addToStack(){
        Stack<Object> stack = new Stack<>();
        for(int i =0; i<n; i++){
            stack.push(a[i]);
        }
        System.out.println("Первоначальный стэк" + stack);
        int size=stack.size();
        for(int i=0;i<n;i++){
            System.out.println("Взяли посмотреть" + i + ":"+stack.peek());
            System.out.println("Взяли посмотреть и удалить" + i + ":"+stack.pop());
        }
        System.out.println("Должен быть пустой стэк" + stack);
    }
    
    public void addToQueue(){
        
        Queue<Object> queue=new LinkedList<>();
        for(int i =0; i<n; i++){
            queue.add(a[i]);
        }
        System.out.println("Первоначальную очередь " + queue);
        int size=queue.size();
        for(int i=0;i<n;i++){
            System.out.println("Взяли посмотреть" + i + ":"+queue.peek());
            System.out.println("Взяли посмотреть и удалить" + i + ":"+queue.poll());
        }
        System.out.println("Должен быть пустая очередь " + queue);
    }
}
