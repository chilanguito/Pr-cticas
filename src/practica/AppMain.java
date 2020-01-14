package practica;

import java.util.ArrayList;
import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("¿Cuántos valores desea ingresar?");

        int valor=scanner.nextInt();

        String arreglo[]= new String[valor];

        for (int i=0;i<arreglo.length;i++){
            arreglo[i]= scanner.next();
        }

        MyDynamicArray myDynamicArray= new MyDynamicArray(null);

        myDynamicArray.convertToDynamicArray(arreglo);

        myDynamicArray.clearIndex(0);

     var arr=   myDynamicArray.obtainArray();

        for(String s: arr){
            System.out.println(s);
        }

    }
}

interface MyArrayInterface {
    void convertToDynamicArray(String[] a);

    void clearIndex(int index);

    ArrayList<String> obtainArray();
}

class MyDynamicArray implements MyArrayInterface {
    private ArrayList<String> myArray;

    public MyDynamicArray(ArrayList<String> myArray) {
        myArray = new ArrayList<>();
        this.myArray = myArray;
    }

    @Override
    public void convertToDynamicArray(String[] a) {
        for (int i = 0; i < a.length; i++) {
            myArray.add(a[i]);
            System.out.println("The element: " + a[i] + " has been added at index " + i);
        }
    }

    @Override
    public void clearIndex(int index) {
        System.out.println("The element: " +myArray.get(index)+" has been converted in null");
        myArray.set(index,"");
    }

    @Override
    public ArrayList<String> obtainArray() {
        ArrayList<String> array =  new ArrayList<>();

        for (String s:myArray){
            if (!s.equals("")){
                array.add(s);
            }
        }

        return array;
    }
}
