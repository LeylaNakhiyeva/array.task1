import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Massivin ölçüsünü daxil edin: ");
        int n= sc.nextInt();
        System.out.println("Massivin elementlərini daxil edin: ");
        System.out.println();
        int [] arr= new int[n];
        for(int i=0; i< arr.length; i++){
            arr[i]= sc.nextInt();
            System.out.println("Massivin "+i+"-ci elementi: "+arr[i]);
        }
        System.out.println(" ");
        for(int i=0; i< arr.length; i++){
            System.out.println("arr["+i+"]= "+arr[i]);
        }
        System.out.println("_______________________________________ ");
        maxMin(arr);

    }
    public static void maxMin(int [] array){
        int max=array[0];
        int min=array[0];

        // int []array= new int[5];
        for (int i=0; i<array.length; i++){
            if(array[i]<min){
                min=array[i];
            } else if (array[i]>max) {
                max=array[i];

            }
        }
        System.out.println("Massivin minimum elementi: "+min);
        System.out.println("Massivin maksimum elementi: "+max);

    }


}