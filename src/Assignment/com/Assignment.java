package Assignment.com;

import java.util.*;

// 1.Remove Duplicates...


//public class Assignment implements Comparable<Assignment>{
//
//    private int id;
//    private String name;
//    private String address;
//
//    private long number;
//
//    public Assignment() {
//    }
//
//    public Assignment(int id, String name, String address, long number){
//        this.id = id;
//        this.name = name;
//        this.address = address;
//        this.number = number;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String  getAddress() {
//        return address;
//    }
//
//    public void setNumber(long number) {
//        this.number = number;
//    }
//
//
//    public long getNumber() {
//        return number;
//    }
//
//
//    public int compareTo(Assignment e2) {
//        if (this.name.compareTo(e2.name) != 0) {
//            return this.name.compareTo(e2.name);
//        }
//        else if (this.address.compareTo(e2.address) != 0 ) {
//            return this.address.compareTo(e2.address);
//        }
//        else {
//            return this.id - e2.id;
//
//        }
//
//    }
//}
//
//class Task{
//
//    public static void main(String[] args) {
//
//
//        TreeSet<Assignment> ts = new TreeSet<Assignment>();
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter how many names do u want to print");
//
//        int n = scan.nextInt();
//
//        for(int i=0; i<n;i++){
//
//            String s =scan.next();
//
//            String[] ar = s.split(",");
//
//            int id = Integer.parseInt(ar[0]);
//            String name = ar[1];
//            String  address = ar[2];
//            long number = Long.parseLong(ar[3]);
//
//            Assignment d = new Assignment(id,name,address,number);
//
//            ts.add(d);
//
//            for(Assignment x : ts ){
//                System.out.println("id:" + x.getId() + " " + "name:" + x.getName() + " " + " address:" + x.getAddress() + " " + "phone number:" + x.getNumber() );
//
//            }
//        }
//    }
//}


//---------------------------------- OR ---------------------------------------------------


//class Assignment{
//
//    public static void removeDuplicates(String[] ar){
//        TreeMap<String,Integer> map = new TreeMap<String,Integer>();
//
//
//        for(int i=0; i<ar.length; i++){
//            map.put(ar[i], i);
//        }
//        Set<Map.Entry<String,Integer >> entries = map.entrySet();
//
//        for(Map.Entry<String,Integer> x : entries){
//            System.out.println(x.getKey());
//        }
//    }
//
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//
//        String[] ar = new String[n];
//
//        for(int i=0; i<ar.length; i++){
//            ar[i] = scan.next();
//        }
//
//        removeDuplicates(ar);
//    }
//}


//-------------------------------------------- OR -------------------------------------------------

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










// ----------------------------CRUD Operations using HashpMap.... --------------------------

//class Assignment2{
//
//    HashMap<Integer,String> map = new HashMap<Integer,String>();
//
//    Scanner scan = new Scanner(System.in);
//
//
//    public void create(){
//        System.out.print("Enter ID to create : ");
//        int id =  scan.nextInt();
//        scan.nextLine();
//
//        if(map.containsKey(id)){
//            System.out.println("User already exist "+ id);
//        }
//        else {
//            System.out.print("Enter your name: ");
//            String name = scan.nextLine();
//            map.put(id,name);
//            System.out.println("Entry created: ID : " + id + " Name: " + name);
//        }
//
//    }
//
//
//
//    public void read(){
//        System.out.print("Enter ID to read : ");
//        int id =  scan.nextInt();
//
//        if(map.containsKey(id)){
//            System.out.println( "ID : "+ id + " Name : " + map.get(id));
//        }
//        else {
//            System.out.println("No entry found with this ID : " + id);
//        }
//
//    }
//
//
//    public void update(){
//        System.out.print("Enter ID to update : ");
//        int id =  scan.nextInt();
//        scan.nextLine();
//
//
//        if(map.containsKey(id)){
//            System.out.print("Update your Name...😄: ");
//            String newName = scan.nextLine();
//            map.put(id,newName);
//            System.out.println("Horray!!! Your name changed.Your id : " + id + " UpdatedName : " + newName);
//        }
//        else {
//            System.out.println("No entry found with this ID : " + id);
//
//        }
//
//    }
//
//    public void delete(){
//        System.out.print("Enter ID to delete : ");
//        int id =  scan.nextInt();
//
//        if(map.containsKey(id)){
//            map.remove(id);
//            System.out.println("Horray your id " + id  +  " deleted");
//
//        }
//        else {
//            System.out.println("No entry found with this ID : " + id);
//        }
//
//    }
//
//
//    public void listAll(){
//        if(map.isEmpty()){
//            System.out.println("No entries found");
//        }
//        else {
//            Set<Map.Entry<Integer,String>> entires= map.entrySet();
//
////            for(var x : entires){
////                System.out.println(x.getKey() + x.getValue());
////            }
//
////          ------------OR----------
//
//            map.forEach((id,name) -> System.out.println(id + " " + name));
//
//        }
//
//    }
//
//
//    public void all(){
//        while (true){
//            System.out.println("Which CRUD operations do u want to perform....👉👉");
//            System.out.println("1. Create");
//            System.out.println("2. Read");
//            System.out.println("3. Update");
//            System.out.println("4. Delete");
//            System.out.println("5. List All");
//            System.out.println("6. Exist");
//            System.out.print("Choose an option : ");
//
//            int select = scan.nextInt();
//
//            switch (select){
//                case 1:
//                    create();
//                    break;
//
//                case 2:
//                    read();
//                    break;
//
//
//                case 3:
//                    update();
//                    break;
//
//
//                case 4:
//                    delete();
//                    break;
//
//
//                case 5:
//                    listAll();
//                    break;
//
//
//                case 6:
//                    System.out.println("Exiting program....🥺🥺🥺");
//                    return;
//
//
//                default:
//                    System.out.println("Invalid option: Please try again...");
//
//            }
//        }
//
//    }
//
//
//
//    public static void main(String[] args) {
//        Assignment2 a = new Assignment2();
//        a.all();
//    }
//}











// ------------------------------------------CRUD Operations Using Set... ---------------------------------------------------------




//class Assignment3 {
//
//    LinkedHashSet<String> set = new LinkedHashSet<String>();
//    Scanner scan = new Scanner(System.in);
//
//    public void create() {
//        String name = scan.nextLine();
//
//        if (set.contains(name)) {
//            System.out.println("name " + name + " already exists.");
//        }
//        else {
//            System.out.print("Enter Name: ");
//            name = scan.nextLine();
//            set.add(name);
//            System.out.println("Entry created: Name = " + name);
//        }
//    }
//
//
//
//    public void update() {
//        System.out.print("Enter Name to update: ");
//        String name = scan.next();
//        scan.nextLine();
//
//        if (set.contains(name)) {
//            System.out.print("Update your Name: ");
//            String newName = scan.nextLine();
//            set.add(newName);
//            System.out.println("Entry updated:" + "New Name " + "= " + newName);
//        }
//        else {
//            System.out.println("No entry with this name found " + name );
//        }
//    }
//
//
//    public void delete() {
//        System.out.print("Enter Name to delete: ");
//        String name = scan.next();
//
//        if (set.contains(name)) {
//            var removeName = set.remove(name);
//            System.out.println("Entry deleted: " + "Name : " + "= " + removeName);
//        }
//        else {
//            System.out.println("Entry with this Name  " + name + " not found.");
//        }
//    }
//
//    public void listAll(){
//        if(set.size() == 0){
//            System.out.println("You dont have any entries");
//        }
//        else {
//            System.out.println("Your all entries : " + set);
//        }
//    }
//
//
//
//    public void all() {
//        while (true) {
//            System.out.println(" Which CRUD Operations Do you want to perform ---");
//            System.out.println("1. Create");
//            System.out.println("2. Update");
//            System.out.println("3. Delete");
//            System.out.println("4. All Entry");
//            System.out.println("5. Exit");
//            System.out.print("Choose an option: ");
//
//            int choice = scan.nextInt();
//
//            switch (choice) {
//                case 1:
//                    create();
//                    break;
//                case 2:
//                    update();
//                    break;
//                case 3:
//                    delete();
//                    break;
//                case 4:
//                    listAll();
//                case 5:
//                    System.out.println("Exiting program.");
//                    return;
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//            }
//        }
//    }
//
//
//
//    public static void main(String[] args) {
//        Assignment3 c = new Assignment3();
//        c.all();
//    }
//}








// ------------------------------------- CRUD Operations using ArrayList. ---------------------------------------

//class Assignment4 {
//
//    ArrayList<String> list = new ArrayList<String>();
//    Scanner scan = new Scanner(System.in);
//
//    public void create() {
//        System.out.print("Enter Name: ");
//        String name = scan.nextLine();
////        scan.nextLine();
//
//        if (list.contains(name)) {
//            System.out.println("Name " + " already exists.");
//        }
//        else {
////          System.out.print("Enter Name: ");
//            name = scan.next();
//            list.add(name);
//            System.out.println("Entry created: Name = " + name);
//        }
//    }
//
//
//    public void read() {
//        System.out.print("Enter Name to read: ");
//        String name = scan.next();
//
//        if (list.contains(name)) {
//            System.out.println("Name = " + list.get(list.indexOf(name)));
//        }
//        else {
//            System.out.println("Entry with Name " + name + " not found.");
//        }
//    }
//
//
//    public void update() {
//        System.out.print("Update your name : ");
//        String  name = scan.next();
//        scan.nextLine();
//
//        if (list.contains(name)) {
//            System.out.print("Enter new Name: ");
//            String newName = scan.nextLine();
//            list.set(list.indexOf(name),newName);
//            System.out.println("Entry updated:" +  "New Name" + " = " + newName);
//        }
//        else {
//            System.out.println("Entry with Name " + name + " not found.");
//        }
//    }
//
//    public void delete() {
//        System.out.print("Enter Name to delete: ");
//        String name = scan.next();
//
//        if (list.contains(name)) {
//            var removeName = list.remove(name);
//            System.out.println("Entry deleted:  " + ", Name = " + removeName);
//        }
//        else {
//            System.out.println("Entry with Name " + name + " not found.");
//        }
//    }
//
//    public void listAll() {
//        if (list.isEmpty()) {
//            System.out.println("No entries found.");
//        }
//        else {
//            System.out.println("All Entries:" + list);
//
//
//        }
//    }
//
//
//    public void showMenu() {
//        while (true) {
//            System.out.println(" Which CRUD Operations Do you want to perform....");
//            System.out.println("1. Create");
//            System.out.println("2. Read");
//            System.out.println("3. Update");
//            System.out.println("4. Delete");
//            System.out.println("5. List All");
//            System.out.println("6. Exit");
//            System.out.print("Choose an option: ");
//
//            int choice = scan.nextInt();
//
//            switch (choice) {
//                case 1:
//                    create();
//                    break;
//                case 2:
//                    read();
//                    break;
//                case 3:
//                    update();
//                    break;
//                case 4:
//                    delete();
//                    break;
//                case 5:
//                    listAll();
//                    break;
//                case 6:
//                    System.out.println("Exiting program.");
//                    return;
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//            }
//        }
//    }
//
//
//
//    public static void main(String[] args) {
//        Assignment4 c = new Assignment4();
//        c.showMenu();
//    }
//}





//  ----------------------------------------- Merging... -------------------------------------------------------------


//class Assignment5 implements Comparable<Assignment5>{
//
//    private int id;
//    private String name;
//    private String gender;
//
//    private int salary;
//
//
//
//    public Assignment5(int id, String name, String gender, int salary){
//        this.id = id;
//        this.name = name;
//        this.gender = gender;
//        this.salary = salary;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String  getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public int getSalary() {
//        return salary;
//    }
//
//    public void setSalary(int salary) {
//        this.salary = salary;
//    }
//
//    public int compareTo(Assignment5 a2){
//
//        return this.name.compareTo(a2.name);
//
//    }
//}
//
//
//
//
//class Task{
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        TreeSet<Assignment5> set = new TreeSet<Assignment5>();
//
//        int n = scan.nextInt();
//
//        for(int i=0; i<n; i++){
//
//            System.out.print("Enter Id :");
//            int id = scan.nextInt();
//
//
//            System.out.print("Enter Name :");
//
//            String name = scan.next();
//
//
//
//            System.out.print("Enter Gender :");
//
//            String  gender = scan.next();
//
//
//            System.out.print("Enter Salary :");
//
//            int salary = scan.nextInt();
//
//
//            Assignment5 a = new Assignment5(id,name,gender,salary);
//
//            set.add(a);
//
////            set.forEach((id,name,gender,salary)-> System.out.println("ID : "+ id + "Name : "+ name + "Gender :" + gender + "Salary : " + salary ));
////
//            for(var x : set ){
//
//                System.out.println("ID : " + x.getId() + " " + "Name : " + x.getName() +" " + "Gender : " + x.getGender() + " " + "Salary : " + x.getSalary());
//            }
//        }
//
//    }
//}












