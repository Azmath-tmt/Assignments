package Assignment.com;

import java.util.*;

// 1.Remove Duplicates...


public class Assignment implements Comparable<Assignment>{

    private int id;
    private String name;
    private String address;

    private long number;

    public Assignment() {
    }

    public Assignment(int id, String name, String address, long number){
        this.id = id;
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String  getAddress() {
        return address;
    }

    public void setNumber(long number) {
        this.number = number;
    }


    public long getNumber() {
        return number;
    }


    public int compareTo(Assignment e2) {
        if (this.name.compareTo(e2.name) != 0) {
            return this.name.compareTo(e2.name);
        }
        else if (this.address.compareTo(e2.address) != 0 ) {
            return this.address.compareTo(e2.address);
        }
        else {
            return this.id - e2.id;

        }

    }
}

class Task{

    public static void main(String[] args) {


        TreeSet<Assignment> ts = new TreeSet<Assignment>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many names do u want to print");

        int n = scan.nextInt();

        for(int i=0; i<n;i++){

            String s =scan.next();

            String[] ar = s.split(",");

            int id = Integer.parseInt(ar[0]);
            String name = ar[1];
            String  address = ar[2];
            long number = Long.parseLong(ar[3]);

            Assignment d = new Assignment(id,name,address,number);

            ts.add(d);

            for(Assignment x : ts ){
                System.out.println("id:" + x.getId() + " " + "name:" + x.getName() + " " + " address:" + x.getAddress() + " " + "phone number:" + x.getNumber() );

            }
        }
    }
}


//------------------------ OR -----------

//class Duplicate{
//
//    public static void removeDuplicate(String s){
//
//        LinkedHashSet<String > set = new LinkedHashSet<String >();
//
////        TreeSet<Character> set = new TreeSet<Character>();
//
//
//        String[] ar = s.split(",");
//
//        for(int i=0; i<ar.length; i++){
//
//            set.add(ar[i]);
//        }
//
//        for( String x : set ){
//            System.out.println(x);
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String s = scan.nextLine();
//
//        removeDuplicate(s);
//    }
//}
//

