import java.util.Scanner;
import java.util.Stack;

public class ThirdProblem {
    String a;

    public void task(){
        Scanner in = new Scanner(System.in);
        Stack<String> stack=new Stack<>();
        do{
            a=in.next();
            if(!a.equals("print") && !a.equals("revert")&& !a.equals("Q")){
                stack.push(a);
            }else if(a.equals("print")){
                System.out.println(stack);
            }else if(a.equals("revert")){
                stack.pop();
            }

        }while(!a.equals("Q"));
            

    }
}
    





/* public static void main(String[] args) {
        ThirdProblem thirdProblem=new ThirdProblem();
        thirdProblem.task();*/




/* Реализовать консольное приложение, которое:
Принимает от пользователя и “запоминает” строки.
Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
Если введено revert, удаляет предыдущую введенную строку из памяти.*/