import java.util.*;

public class Main {
    public static void main(String[] args) {

        Random random=new Random();
        int [] massiv=new int[10];
        for (int i = 0; i < massiv.length; i++) {
        massiv[i]=random.nextInt(2);

        }
        System.out.println("MASSIV:"+Arrays.toString(massiv));
        sort(massiv);
        System.out.println("------------------------------------------------");


        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(random.nextInt(2));
        }

        System.out.println("ARRAYLIST: "+arrayList);
        sort(arrayList);
        System.out.println("------------------------------------------------");


        LinkedList<Integer> linkedList=new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add(random.nextInt(2) );
        }
        System.out.println("LINKEDLIST: "+linkedList);
        sort(linkedList);
        System.out.println("------------------------------------------------");

    }
    public static void sort(int[] massiv){
        ArrayList<Integer> massiv1=new ArrayList<>();
        for (int i = 0; i < massiv.length; i++) {
            massiv1.add(massiv[i] );
            Collections.sort(massiv1);
        }
        System.out.println("Sorttolgon massiv: "+massiv1);
    }

    public  static void  sort(ArrayList<Integer> arrayList){
        ArrayList <Integer> arrayList1=new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList1.add(arrayList.get(i));
            Collections.sort(arrayList1);
        }
        System.out.println("Sorttolgon Arraylist: "+arrayList1);
    }
    public  static void  sort(LinkedList<Integer> linkedList){
        ArrayList <Integer> arrayList1=new ArrayList<>();
        for (int i = 0; i < linkedList.size(); i++) {
            arrayList1.add(linkedList.get(i));
            Collections.sort(arrayList1);
        }
        System.out.println("Sorttolgon Linkedlist: "+arrayList1);
    }


}