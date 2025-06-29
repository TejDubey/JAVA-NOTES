//import java.util.*;
//COLLECTION FRAMEWORK IN JAVA
//import java.util.*

//1.List: ArrayList, LinkedList, Vector, Stack

//  i............................................... ArrayList
//Its sizeis dynamically increased as elements are addes into it.
//we can store variable data types in an arraylist
 
// All collection methods :
//add(Object o)
//addAll(Collection c)
//remove(Object o)
//removeAll(Collection c)
//retainAll(Collection c)
//clear()
//isEmpty()
//size()
//equals(Object o)
//toArray()
//contains(Object o)
//containsAll(Collection c)
//ArrayList al=new ArrayList();
//al.size();

//1. //ArrayList methods:
//get(object o)
//set(index, object o)
//add(index, object o)
//addAll(Collection c)
//remove(index, object o)
//removeAll(Collection c)

/*class helloworld{
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(10);
        al.add(63);
        al.add(7);
        al.add(3,9);
        al.add(34);
        al.remove(2); //insert index not element now new list 10,63,9,34 now 
        al.remove(3); //now 34 gets removed dont see original list see new list 
        al.add(234);
        al.add(45667);
        al.add(3);
        System.out.println("The arraylist: "+al);
        //for(int i:al){
        //System.out.println(i);
        //}
                                    //import java.util.* (Collections)
        //other important collection methods
        //binarySearch(list,key)
        //Collections.sort(list)
        //Collections.min(list)
        //Collections.max(list)
        //Collections.reverse(list)
        //Collections.shuffle(list)
        //Collections.swap(list, i, j) //swap value at index i with j
        //Collections.replaceAll(list,x1,x2) //replace x1 with x2
        //Collections.fill(list,x1) //fill with element x1
        //Collections.copy(l2,l1) //list1 gets copied too list2

        Collections.sort(al);
        System.out.println("The sorted arraylist: "+al);
        System.out.println(Collections.min(al));
        System.out.println(Collections.max(al));
        Collections.reverse(al);
        System.out.println("The reversed arraylist: "+al);
        Collections.sort(al); // ***** we must ensure the list is sorted before binary search //
        /*System.out.println("THE BINARY SEARCH :"+Collections.binarySearch(al, 45667)); //we enter element
        //Collections.shuffle(al);
        //System.out.println("The shuffled arraylist: "+al);
        Collections.swap(al,0, 1);
        System.out.println("The swapped arraylist: "+al);
        al.add(45667);
        Collections.replaceAll(al,45667,8);
        System.out.println("The replaced arraylist: "+al);
        //fill copy
        //1. *************************** fixed size list : ****************************
        List <Integer> l1=Arrays.asList(1,2,3,4,5); //write whole Integer not int
        System.out.println("l1 is : "+l1);
        //l1.add(8); this is an error we cannot add element in this fixed length list
        //2. *********** fully flxible list *********** its size dynamically increases as new element is added
        List <Integer> l2=new ArrayList<>(Arrays.asList(1,5,6,23,325,67));
        l2.add(12345); // here we can do this as its variable length 
        //to make variable length just add : new ArrayList<>(Array.asList()); on rhs 
        System.out.println("l2 is : "+l2);
        List <Integer> l3=Arrays.asList(new Integer [5]); //dont forget to write Integer not int
        Collections.fill(l3,1); //fills with 1 which was initially l3 is: [null, null, null, null, null]
        System.out.println("l3 is: "+l3);
    }
}*/

//ArrayList is a concrete class where as List is an interface.........................
// 1. ArrayList <Integer> l1=new ArrayList <Integer>();  //variable size l1.add().. we can add remove modify
// 2. ArrayList <Integer> l1=new ArrayList <Integer>(Arrays.asList(1,2,3,4,5)); //fixed size l1.add().. we can add remove modify
// 3. List <Integer> l1=Arrays.asList(1,2,3,4,5);  //fixed length list we cant add more elements or remove only modify
// 4. List <Integer> l1=Arrays.asList(new Integer [5]); //creates an list with 5 null values

//List<String> list = new ArrayList<>();
// Later, you can switch to:
//list = new LinkedList<>();

// ii.......................................... LINKED LIST
/*class helloworld{
    public static void main(String[] args) {
        LinkedList <String> l1=new LinkedList <String>();
        l1.add("HELLO");
        l1.add("WORLD");
        l1.add("WELCOME");
        l1.addFirst("FIRST");
        l1.addLast("LAST");
        l1.remove(2); //2nd index gets removed
        l1.removeFirst();
        l1.removeLast();
        l1.addLast("THANK");
        l1.add("YOU");
        System.out.println("L1 is : "+l1);
        System.out.println("At 2: "+l1.get(2));
        System.out.println("At first : "+l1.getFirst());
        System.out.println("At last : "+l1.getLast());
        //iterator 
        ListIterator <String> i1=l1.listIterator(); //for list use listIterator as iterator doesbnt support hasprevious
        //Iterator <String> i1=l1.iterator(); //but this one doesnt support hasPrevious()
        while(i1.hasNext()){
            System.out.println(i1.next());
        }
        System.out.println("now previous : ");
        while(i1.hasPrevious()){
            System.out.println(i1.previous());
        }
    }
}
*/

// iii. .............................................VECTOR
//Vector <String> v=new Vector <String>();
//List<String> syncList = Collections.synchronizedList(new ArrayList<>());

//Thread-Safety
//Vector is synchronized → thread-safe by default.
//All major methods (add, remove, get, etc.) are synchronized.
//Vector <Integer> v=new Vector <Integer>(10); //u may incldue size or not 
//for (int i = 0; i < v.size(); i++) {
//    System.out.println(v.get(i));
//}
//supports all similar methods add remove first element last element find replace 

/*
// iv. ...........................................STACK............................................
//stacks is basically last in first out (LIFO)

7 is last in first out
2,4,8,9,7 push          7 pop ------: then 9 then 8 ....

|    7      |           |           |        
|    9      |           |     9     |
|    8      |           |     8     |
|    4      |           |     4     |
|____2______|           |_____2_____|

*//*
class helloworld{
    public static void main(String[] args) {
        Stack <Integer> s1=new Stack <>();
        s1.push(5);
        s1.push(2);
        s1.push(67);
        s1.push(23);
        s1.push(95);
        s1.pop();
        s1.pop();
        System.out.println(s1.empty());
        System.out.println(s1.peek()); //top element                          //   3 2 1 index position
        System.out.println(s1.search(5)); //search works in index based 1 from top 5 2 27                                                                                              
        System.out.println(s1.get(0)); //here u put index inside    //starts from bottom element    5 2 17
        //in search put element whose index starts from 1 and starts from backwards(top)        //  0 1 2...
        //in get we pass index and it gives the element at index starts from 0 from front(bottom)
        System.out.println("The stack : "+s1);

    }
}
*/

// v. ............................................MAP
//map methods
//put(key,value)
//remove(key)
//replace(key,value)
//Get(k key) //used to access value in a hashmap
//getKey()
//getValue()

//hashmap
/*
class helloworld{
    public static void main(String[] args) {
        HashMap <String,Integer> h1=new HashMap<>();
        h1.put("hello",5);
        h1.put("worldd",6);
        h1.put("welcome",7); //values can be same
        h1.put("to",7); //values can be same only keys to be diffrent
        h1.put("java",4);
        h1.put("java",9); //any dublicate value will be overwritten now java will be linked to 9 not 4
        System.out.println("The hashmap: "+h1);

        //hashmap stores key value pairs without any order /////////////////// IMP
        //tree map creates a sorted map         /////////////////////////////////////////////// IMP
        //now TreeMap and LinkedHashMap
        TreeMap <String,Integer> t1=new TreeMap<>(h1); //MAP is interface TreeMap is concrete class
        //Map <String,Integer> t1=new TreeMap<>(h1); both are same
        System.out.println("t1 is: "+t1);

        //LinkedHashMap
        //LinkedHashMap <String,Integer> lh1=new LinkedHashMap<>(t1);
        //or
        //Map <String,Integer> lh1=new LinkedHashMap<>(t1);
        //System.out.println("lh1 is : "+lh1);

        //keySet values get put
        LinkedHashMap <Integer,String> lh1=new LinkedHashMap<>();
        lh1.put(1,"one");
        lh1.put(2,"two");
        lh1.put(3,"three");
        lh1.put(4,"four");
        lh1.put(1,"oneeeeeee");
        System.out.println("lh1 is: "+lh1);
        System.out.println(lh1.get(3)); //insert key

        //---------------
        //System.out.println(lh1.getKey("four")); //error : this doesnt work as only map contains these funcs 
        //linkedhashmap and treemap doesnt contain these functions
        //System.out.println(lh1.getValue(3));//error
        //---------------
        System.out.println(lh1.keySet()); //valid
        System.out.println(lh1.values()); //valid 
    }
}
*/

//----------------------------------------------------------------------------------------------------------------//

//finally block in java
/*class helloworld{
    public static void main(String[] args) {
        int a=7;    
        int b=8;
        while (true) { 
            try{
                System.out.println("Div: "+a/b);
            }
            catch(Exception e){
                System.out.println("Exception occoured : "+e);
                break;
            }
            finally{
                System.out.println("The value of b is = "+b);
            }
            b--;
        }
    }
}
*/

//throw and throwss in java...............

//hackerrank
/*import java.util.Scanner;
class MyCalculator {
    long power(int n,int p) throws Exception{
        
        if(n==0 && p==0) throw new Exception("n and p should not be zero.");
        else if(n<0 || p<0) throw new Exception("n or p should not be negative.");
        
        int res=1;
        while(p!=0){
            res=res*n;
            p--;
        }
        return res;
    }
}

public class Solution {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
*/

/*class Negativer extends Exception{
    @Override
    public String toString(){  //used to give exception name actual
        return "Negradius";
    }
    @Override
    public String getMessage(){ //used to give infromation about your custom exception
        return "Entered radius is negative please enter positive radius";
    }
}
class helloworld{
    public static void validr(int r) throws Negativer{
        if(r<0){
            throw new Negativer();
        }
        double area=Math.PI*r*r;
        System.out.println("The area of circle is: "+area);
        
    }
    public static int divide(int a,int b) throws ArithmeticException{
        int c=a/b;
        return c;
    }
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int a=s1.nextInt();
        //int b=s1.nextInt();
        try {
            //int z=divide(a,b);
            //System.out.println(z);
            validr(a);
        } 
        //catch (Exception e) {
        //    System.out.println("ArithmeticException ocooured ");
        //}
        catch(Negativer e){
            System.out.println("Custom exception occoured "+e);
            //System.out.println(e.toString()); gives same out of +e as above
            System.out.println(e.getMessage());
            e.printStackTrace(); //it gives the wholetrace where and what exception occoured the path and all
        }
    }
}
*/
//try catch block exceptions in java
/*public class helloworld{
    public static void main(String[] args){
        int [] arr = new int [3];
        arr[0]=2;
        arr[1]=5;
        arr[2]=6;
        Scanner s1=new Scanner(System.in);
        System.out.println("enter a index");
        int z1=s1.nextInt();
        System.out.println("enter a value to divide");
        int z2=s1.nextInt();
        try{
            System.out.println("the division "+arr[z1]/z2); //after error here the nextline doesnt get executed of try block
            System.out.println("the element "+arr[z1]);
            //but here first line gets executed at inputs 0 0 but next line doesnt and shows error
            System.out.println("the element "+arr[z1]);
            System.out.println("the division "+arr[z1]/z2);
        } 
        catch (Exception e) {
            System.out.println("error occoured : "+e); //the exception which occoured first shows up like 456 0 it shows out of bounds exception
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic error : "+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array ind out of bound : "+e);
        }
        System.out.println("End of code");

    }
}
*/

//Thread priorities
/*class A extends Thread{
    public A(String name){
        super(name);
    }
    @Override
    public void run(){
        int i=0;
        while(i<30){
            System.out.println(getName()+" "+getId()+" "+getPriority()); //max=10 min=1 norm=5 priority
            i++;
        }
    }
}
class helloworld{
    public static void main(String[] args) {
        A t1=new A("1");  //normal priority
        A t2=new A("22"); //least priority
        A t3=new A("333"); //least priority
        A t4=new A("4444"); //normal prioriy
        A t5=new A("55555"); //supose it has to be given max priority
        t5.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.NORM_PRIORITY);
        t1.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
*/

//constructor in threads
/*class A extends Thread{
    public A(String name){
        super(name);
    }
    @Override
    public void run(){
        int i=0;
        while(i<10){
            System.out.println("hello");
            i++;
        }
    }
}
class helloworld{
    public static void main(String[] args) {
        A a = new A("TEJ");
        a.start();
        System.out.println("The id is "+a.getId());
        System.out.println("The id is "+a.getName());
    }
}
*/
//Threads in java
/*
// 2. By using runnable interfaces
class A implements Runnable{
    @Override
    public void run(){
        int i=0;
        while(i<400){
            System.out.println("Good morning");
            i++;
        }
    }
}
class B implements Runnable{
    @Override
    public void run(){
        int i=0;
        while(i<400){
            System.out.println("Hello");
            i++;
        }
    }
}
class helloworld{
    public static void main(String[] args) {
        A a=new A();
        Thread ta=new Thread(a);
        B b=new B();
        Thread tb=new Thread(b);
        ta.start();
        tb.start();
    }
}
*/

// 1. By extending thread class
//unpredictable sequence of good morning and hello
//it doesnt first execute whole class A then goes to B it does both things simultaneously
/*class A extends Thread{
    @Override
    public void run(){ //run metjod from thread is overriden here
        int i=0;
        while(i<400){
            System.out.println("hello");
            i++;
        }
    }
}
class B extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<400){
            System.out.println("good morning");
            i++;
        }
    }
}
class helloworld{
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        a.start(); //dont do a.run();; a.start() automatically runs things from class A
        b.start();
    }
}
*/

//polymorphism in java 
/*class A{
    void greet1(){
        System.out.println("Hello1");
    }
    void greet2(){
        System.out.println("Hello2");
    }
    int a=35;
}
interface I1{
    void meth1();
    void meth2();
    default void methy(){
        System.out.println("I am default");
    }
}
interface I2 extends I1{
    void method1();
    void method2();
}
class B extends A implements I1,I2{
    void greet3(){
        System.out.println("Hello3");
    }
    public void meth1(){
        System.out.println("Meth1");
    }
    public void meth2(){
        System.out.println("Meth2");
    }
    public void method1(){
        System.out.println("Method1...");
    }
    public void method2(){
        System.out.println("Method2...");
    }
}
class helloworld{
    public static void main(String[] args) {
        A a=new A();
        System.out.println(a.a);
        a.greet1();
        a.greet2(); //all are allowed

        B b=new B();
        System.out.println(b.a);
        b.greet1();
        b.greet2();
        b.greet3();
        b.meth1();
        b.meth2();
        b.method1();
        b.method2();
        b.methy(); // all are allowed

        //polymorphism concept!!!!!!!!!!!
        //now we try to pass refrence of interfaces

        //B b=new I1,I2,A(); //errorrrrrr
        // (valid) A a=new B();
        I1 i=new B();
        i.meth1();
        i.meth2();
        i.methy();
        // i.method1,2(); i.greet1,2,3,4,5(); i.a; it can only only onlyyyy use I1 methods 

        I2 i=new B();
        i.meth1();
        i.meth2();
        i.method1();
        i.method2();
        i.methy();
        //  the meth1,2 are allowed as I2 extends I1 or else it wont be allowed 
        //i.greet1,2,3,4,5(); //not allowed
    }
}
*/
/* 
//inheriting interfaces in java
interface A{
    void meth1();
    void meth2();
    default void meth3(){
        System.out.println("Default meth3");
    }
}
interface B extends A{
    void meth4();
    void meth5();
}
class C implements A,B{
    public void meth1(){
        System.out.println("Meth1");
    }
    public void meth2(){
        System.out.println("Meth2");
    }
    public void meth4(){
        System.out.println("Meth4");
    }
    public void meth5(){
        System.out.println("Meth5");
    }
    public void meth3(){
        System.out.println("Meth5");
    }
}
class helloworld{
    public static void main(String[] args) {
        C c= new C();
        c.meth1();
        c.meth2();
        c.meth4();
        c.meth5();
        c.meth3(); // we can override meth3 in inherited interfaces also validddd
    }
}
*/
//default method in java
/*interface A{
    void meth1();
    void meth2();
    default void meth3(){
        meth4();    //here this default method can acces private method if its called inside default. 
                    //will not work if u override this default method
        System.out.println("Hello default");
    }
    //private void meth4(); // this in invalid we need to define it here as its inaccessible elsewhere
    private void meth4(){
        System.out.println("HELLO 4");
    }
}
class B implements A{
    public void meth1(){    //public keyword is necessary here else it would give error
        System.out.println("Meth1");
    }
    public void meth2(){    
        System.out.println("Meth2");
    }
    public void meth3(){
        System.out.println("Meth3");
    }
}
class helloworld{
    public static void main(String[] args) {
        B b = new B();
        b.meth1();
        b.meth2();
        //b.meth3(); // here hello default gets printed if we dont override it in B
        b.meth3(); //meth3 is output overridden
    }
}
*/

//Interfaces in java
/*
interface A{
    int a=45;
    void hello1();
    void hello2();
}
interface C{
    void hello3();
}
class B implements A,C{
    public void hello1(){
        System.out.println("Hello1");
    }
    public void hello2(){
        System.out.println("Hello2");
    }
    public void hello3(){
        System.out.println("Hello3");
    }
}
public class helloworld{
    public static void main(String[] args) {
        B b = new B();
        b.hello1();
        b.hello2();
        b.hello3();
        System.out.println("The value of a : "+b.a);
        //b.a=345; // we cannot modify the value of variables defined in interfaces

    }
}
*/
/*
//Abstract classes in java VERYVERY IMPORTANT KNOWLEDGE SHARED HERE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
abstract class A{
    A(){
        System.out.println("HELOLOLOLOLO");
    }
    public void hello(){
        System.out.println("Hello");
    }
    abstract void greet1();
    abstract void greet2();
}
class B extends A{
    void hehe(){
        System.out.println("I am B");
    }
    void greet1(){
        System.out.println("GM1");
    }
    void greet2(){
        System.out.println("GM2");
    }
    void greet4(){
        System.out.println("WHAT HOWS THIS POSSIBLE");
    }
}
abstract class C { //we can also write here abstract class C extends A both works fine
    void greet3(){
        System.out.println("GOOOOD MORNING");
    }
    abstract void greet4();
}
public class helloworld{
    public static void main(String[] args) {
        //B b = new B(); //automatrically abstract class constructor has been called as class B inherits from class A.
        //b.greet1();
        //b.greet2();
        //b.hello();
        //b.hehe();

        //VERYVERY IMPORTANT!!!!!!!!!!!!!!!!!!!!!!!!!!!
        A a = new B();
        a.hello();
        a.greet1(); //greet 1 and greet 2 are defined in class B but as class A is abstract and contains abtract methods
        a.greet1(); //therefore  class A can run its own abstract methods definded in class B
        ////a.hehe(); //invalid
        ////a.greet3(); //invalid
        B b= new B();
        //a.greet4(); this is not possible in java abstract class reference cannot be used to accesss other abstract class method that extends A
        //a.greet4(); // invalid
        b.greet4(); // this is possible as B is a concrete class and can access its abstracted class method
        // important point to note here is that the abstract class B weather it extends A or not C can access its method greet4();
        // even if B doesnt extends C or C doesnt extend A


        // we do this all for multiple inheritence in java as it doesnt support directly like in cpp:
        // class B extends A,C{} not allowed

        //now to use greet 3 method that is not a abstract method present in class C we can use interfaces like 
        //the change we do is class B extends A implements C
        //interface C instead of abstract class C
        //default void greet3();
        //default keyword is necessary here as by default all the methods in the interfaces are abstract so to
        //give it a body we need default keyword
    }
}

*/

//constructors nd inheritence in java this keyword Math.PI 
/*class Circle{
    public int radius;
    Circle(int radius){
        this.radius=radius;
    }
    public void area(){
        System.out.println("The area of circle is : "+(int)(Math.PI*radius*radius));
    }
}
class Cylinder extends Circle{
    int height;
    int radius;
    Cylinder(int radius,int height){
        super(radius);
        this.radius=radius;
        this.height=height;
    }
    public void area2(){
        System.out.println("The area of cylinder is : "+(int)(Math.PI*radius*radius*height));
    }
}
public class helloworld{
    public static void main(String[] args){
        Cylinder c1 = new Cylinder(5,12);
        c1.area();
        c1.area2();
    }
}*/
/*
//overriding methods in java
class A{
    public double h1(){
        System.out.println("A ka method 1");
        return Math.PI;
    }
    public void h2(){
        System.out.println("A ka method 2");
    }
}
class B extends A{
    @override
    public void h2(){
        System.out.println("B ka method 2");
    }
    public void h3(){
        System.out.println("B ka method 3");
    }
}
public class helloworld{
    public static void main(String[] args) {
        //A obj1 = new A(); works fine
        //B obj2 = new B(); works fine
        //B obj3 = new A(); //error subclass reference cant be used for new superclass object. A cant be converted to B as A is parent and B is child class.
        A obj4 = new B(); //superclass reference can be used for subclass object. Parent can create more children Parent obj = new Children();
        // obj4.h1(); only parent methods work not child
        // obj4.h3(); will not work gives error
        obj4.h2(); //works well why?? see below
        //we can use any of the superclass methods but none of the subclass method
        //and the overridden method present in the super and subclass method returns the value for subclass method 
        //ex here obj4.h2 returns B ka method 2 and not A ka method 2
        //System.out.println(obj4.h1());
    }
}*/
//super keyword in java 
/*class base{
    base(){
        System.out.println("I am base const");
    }
    base(int x){
        System.out.println("I am overloaded base const : "+ x );
    }
    public void hello(){
        System.out.println("I am a func of base");
    }
}*/
/*
class derived extends base{
    derived(){
        System.out.println("I am derived const");
    }
    derived(int x,int y){
        /*Scanner s1= new Scanner(System.in);
        int z=s1.nextInt();
        super(z);
        */ 
       //not allowed in java 17 only in java 22 allowed to write something before super
        /*super(7);
        System.out.println("I am overloaded derived const : "+ x + " "+ y );
    }
}
*/
/*public class helloworld{
    public static void main(String[] args) {
        //base b1 = new base();
        //b1.hello();
        //derived d = new derived(); //calls the base classs const first then derived class const is called
        //derived d = new derived(5,11); //calls base const without overloaded and then overloaded derived constructor
        derived d = new derived(5,11); //now we add the super keyword in derived class overloaded constructor
        // this prints the value passed in super() to overloaded base constructor and then prints derived(5,11)value overloaded constuctor
    }
}
*/

/*
//oops in java lec1 classes and objects
// your can only declare one class as public in java, like helloworld so we cant do to Employee or else it will raise an error
class Employee{
    public int salary;
    public String name;
    public int getsalary(){
        return salary;
    }
    public String getname(){
        return name;
    }
    public void setname(String n1){
        name=n1;
    }
}
public class helloworld{
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.name="hello";
        e1.salary=20000;
        System.out.println("The salary is : "+e1.getsalary());
        System.out.println("The name is : "+e1.getname());
        System.out.println("Enter the name");
        Scanner s1=new Scanner(System.in);
        String str=s1.next();
        e1.setname(str);
        System.out.println("The name is : "+e1.getname());
    }
}*/

/*public class helloworld {
    static int sum (int ...arr){
        int s=0;
        for(int a:arr){
            s+=a;
        }
        return s;
    }
    /*
    to find sum of numbers as many as the person passes
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int [] arr = new int [7];
        for(int i=0;i<7;i++){
            System.out.println("Enter number : "+(i+1));
            arr[i]=s1.nextInt();
        }
        int z=sum(arr);
        System.out.println("The sum is :"+z);
    }*/
    /*static int fibo(int n){
        int a=0;
        int b=1;
        if(n<1){
            return 0;
        }
        else if(n==0){
            return a;
        }
        else if(n==1){
            return b;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }*/
   /*static int fact(int n){
    if(n<0){
        return 0;
    }
    else if(n==0){
        return 1;
    }
    else {
        return n*fact(n-1);
    }
   }

    public static void main(String[] args) {
        int n1=7;
        //System.out.println(fibo(n1));
        System.out.println(fact(n1));
    }*/
    //methods using static keyword

    /*static int add(int a,int b){
        int z=a+b;
        return z;
    }
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int a = s1.nextInt();
        int b = s1.nextInt();
        int z= add(a,b);
        System.out.println("The sum is : "+z);
    }*/
   /*int hello(int x,int y){
        int z=x+y;
        return z;
   }

   //method without static keyword

   public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
       int a=s1.nextInt();
       int b=s1.nextInt();
       helloworld obj1=new helloworld();
       int z1 = obj1.hello(a, b);
       System.out.println(z1);
   }*/
  // method overloading 
  /*static void hello(int a){
    System.out.println("hello "+a);
  }
  static void hello(){
    System.out.println("hello bro");
  }
  public static void main(String[] args) {
   hello(1);   
   hello();
   }
   */
    /*public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    *
    **
    ***
    ****.... pattern */
   /*public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    ****
    ***
    **
    *..pattern
    */
/*
public class helloworld {
    public static void main(String[] args) {
        /*System.out.println("HELLO WORLD!");
        int a=5;
        int b=10;
        int c=81;               
        System.out.println(a+b+c); 
        System.out.println();*/
        //Scanner s1 = new Scanner(System.in);
        //System.out.println("Enter your number: ");
        //int a=s1.nextInt();
        //boolean z=s1.hasNextDouble();
        //System.out.println(z);
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enterin kms: ");
        //int a = s.nextInt();
        //int b = s.nextInt();
        //int c = s.nextInt();
        //float z = (a+b+c);
        //int m=(int)z;
        //int a;
        //String a = "Dear <|name|>, thanks a lot";
        //String name=s1.nextLine();
        //System.out.println(a.replace(" "," ")); 
        //System.out.println(a=8);
        //System.out.println("\"tej dubey\"");
        /*int a1=s1.nextInt();
        int a2=s1.nextInt();
        int a3=s1.nextInt();
        if((a1+a2+a3)/3>=40 && a1>=33 && a2>=33 && a3>=33){
            System.out.println("pass");
        }
        else if(a1<0){
            System.out.println("nah");
        }
        else{
            System.out.println("not pass");
        }*/
        /*String a=s1.next();
        if(a.endsWith(".com")){
            System.out.println("Commerical website");
        }
        else if (a.endsWith(".org")) {
            System.out.println("Organisational Website");
        }
        else if(a.endsWith(".in")){
            System.out.println("Indian website");
        }*/
       /*int a=s1.nextInt();
       while(a!=0){
       for(int i=a;i>0;i--){
        System.out.printf("*");
       }
       a--;
       System.err.println("\n");
       }*/
       //int a=s1.nextInt();
       //factorial
       /*int fact=1;
       for(int i=1;i<=a;i++){
            fact*=i;
       }
       System.out.println(fact);*/
       //table
       /*for(int i=1;i<=10;i++){
        System.out.println(a+" * "+i+" = "+(a*i));
       }*/
      /*int s=0;
      for(int i=1;i<=10;i++){
        s+=(a*i);
       }
       System.err.println(s);*/
       //int m=0;
       //for(int i=0;m!=1;i++){
       // System.err.println(1);
       //}
       /*int [] m = new int [5];
        m[0]=17;
        m[1]=24;
        m[2]=32;
        m[3]=49;
        m[4]=58;*/
        //for(int i=0;i<m.length;i++){
            //System.out.println(m[m.length-1-i]);
        //}
        //int s=0;
        /*int s1=sc.nextInt();
        int f=0;
        for(int i:m){
            if(i==s1) f=1;
        }
        if(f==1) System.out.println("YES");
        else System.out.println("NO");
        //System.out.println(s);*/
        /*int [][] m1 = new int [2][3];
        int [][] m2 = new int [2][3];
        int [][] m3 = new int [2][3];
        // or int [][]m3 = {{0 0 0},
        //                  {0 0 0}}

        m1[0][0]=12;
        m1[0][1]=13;
        m1[0][2]=41;
        m1[1][0]=23;
        m1[1][1]=54;
        m1[1][2]=78;
        
        m2[0][0]=23;
        m2[0][1]=45;
        m2[0][2]=25;
        m2[1][0]=89;
        m2[1][1]=96;
        m2[1][2]=16;

        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m1[i].length;j++){
                m3[i][j]=m1[i][j]+m2[i][j];
            }
        }

        for(int i=0;i<m3.length;i++){
            for(int j=0;j<m3[i].length;j++){
                System.out.print(m3[i][j]+" ");
            }
            System.out.println(" ");
        }*/
       //int [] arr={1,2,4,5,6,8,4,-67};
       /*int max=arr[0];
       int min=arr[0];
       for(int i:arr){
        if(i<min){
            min=i;
        }
        if(i>max){
            max=i;
        }
       }
       System.err.println("Max: "+max+" Min: "+min);*/
       /*int [] arr={1,2,4,5,6,8,};
       int f=0;
       for(int i=0;i<arr.length-1;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
                f=1;
                break;
            }
        }
       }
       if(f==1){
        System.err.println("NSorted");
       }
       else{
        System.err.println("Sorted");
       }
       
    }
}

*/


//IMPORTANT ADDITIONAL THINGS FROM QUESTION PRACTICE HACKERRANK
//JAVA REGEX
//Q. JAVA STRING TOKENS SPLIT THE GIVEN SENTNCE TO TOKENS
//import java.io.*;
//import java.util.*;
/*
Regex Components Cheat Sheet
Pattern	Meaning
.           Any character
\d	        Digit [0-9]
\D	        Non-digit
\w	        Word character [a-zA-Z0-9_]
\W	        Non-word character
\s	        Whitespace
[abc]	    a or b or c
[^abc]	    Not a or b or c
[a-z]	    a to z
a*	        0 or more a
a+	        1 or more a
a?	        0 or 1 a
a{3}	    Exactly 3 as
a{2,4}	    2 to 4 as
^	        Start of line
$	        End of line
()          Captures the regex as a group
Use double backslashes (\\) in Java strings because \ is an escape character in Java.

Q. To validate string length 8-30 with first letter as alphabet and then followed by a word i.e [a-zA-Z0-9]
regularExpression = "^[A-Za-z]\\w{7,29}$";

*********************Useful Methods*****************
Pattern.matches(regex, input)
Pattern.compile(regex)
matcher.find(), matcher.group(), matcher.start(), matcher.end()
String.split(regex)
String.replaceAll(regex, replacement)
****************************************************
*/

/*
public class helloworld {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        String [] spltd = s.split("[^a-zA-Z]+");
        scan.close();
        
        if (s.isEmpty()) {
            System.out.println(0); //printing length
            return;
        }
        
        System.out.println(spltd.length);
        
        for(int i=0;i<spltd.length;i++){
            System.out.println(spltd[i]);
        }
    }
}
*/
/*
//pattern match regex
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        String text = "hello123";
        String pattern = "[a-z]+\\d+";  // one or more lowercase letters followed by digits

        if (Pattern.matches(pattern, text)) {
            System.out.println("Match found!");
        } else {
            System.out.println("No match.");
        }
    }
}

////Pattern.compile().................x
import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
          	//Write your code
            try{
                Pattern.compile(pattern);
                System.out.println("Valid");
            }
            catch(Exception e){
                System.out.println("Invalid");
            }
            testCases--;
		}
	}
}


*/
