package hu.flowacademy;

import hu.flowacademy.employee.Employee;
import hu.flowacademy.employee.Employer;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee("pista", 1);
        Employee e2 = new Employee("jozsi", 26);
        Employee e3 = new Employee("laci", 40);

        List<Employee> employerList = new ArrayList<>();
        employerList.add(e1);
        employerList.add(e2);
        employerList.add(e3);

        Employer employer = new Employer(employerList);
        System.out.println(employer);

        /*Stack stack = new Stack(5);
        stack.push("sz");
        stack.push("zsé");
        System.out.println(stack.peek());
        System.out.println(stack);*/

    /*StackDynamic stack = new StackDynamic();
    stack.push(2);
    stack.push(4);
    stack.push(5);
        System.out.println(stack);
    }*/
/*
        LinkedList list = new LinkedList();
        list.insertFirst(1);
        list.insertAfter(3);
        list.insertAfter(6);
        System.out.println(list);
        System.out.println(list.contains(3));*/

        /*StructureTime st = new StructureTime();*/
        /*st.timeOfMyLife();*/
        /* st.timeForFourFor();*/
       /* double[][] testArrayList = st.timeOfMyLife();
        double[][] testHashSet = st.timeForFourFor();
        *//*Util.drawDiagram(testArrayList);*//*
        Util.drawMultipleDiagram(testHashSet, testArrayList);*/

       /* factorial(20L);*/
    /*    Util.drawDiagram(factorialTimeCalc());*/
        /*var stash = factorialTimeCalc();
        print2d(stash);*/
      /*  System.out.println(fibonacci(6));*/
      /*  List<Integer> list = new List<>();
        list.add(3);
        list.add(7);
        list.add(2);
        list.remove(7);
        System.out.println(list);
        list.add(6);
        System.out.println(list);
        *//*System.out.println(list.hasNext(6));*//*
        list.addWithIndex(8, 2);
        System.out.println(list);*/

    }

    private static int fibonacci(int number){
        if(number == 0) return 0;
        if(number == 1) return 1;
        return fibonacci(number -1) + fibonacci(number -2);
    }


    private static long factorial(long number){
        long res = 1;
        for (long i = 1; i <= number; i++) {
            res = res * i;
        }
       return res;
    }
    
    private static double[][] factorialTimeCalc(){
        double[][] stash = new double[2][20];
        Long start;
        for (int i = 0; i < 20; i++) {
            start = System.currentTimeMillis();
            long res = factorial(i);
            stash[0][i] = i;
            stash[1][i] = (System.currentTimeMillis() - start);
            System.out.print(res);
        }
        return stash;
    }

    private static void print2d(double[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }

        }
    }
}
