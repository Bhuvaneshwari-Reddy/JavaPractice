
//Java Methods
public class Practice{
static void myMethod(){
        System.out.println("Hello world");
    }
 static void myMethod1(String name){
        System.out.println("My name is " +name);
}
static void myMethod2(String name,int age){
     System.out.println(name+" is "+age);
}

static void checkAge(int voteAge){
    if(voteAge<18){
        System.out.println("Not elligible for voting");
    }else{
        System.out.println("Eligible for voting");
    }
}
 //return values,instead of void method method use any primitive data types to return a value

static int myMethod3(int c,int d){
    return c+d;
   
}

//method overloading-same method name with different parameters(type of the parametr is different)
static int addmethod(int x,int y){
    return x+y;
}
static double addmethod(double x,double y){
    return x+y;
}

static void mymethod4(){
    System.out.println("Hey Hii");
}
   


//recursion

public static int sum(int k){
    if(k>0){
        return k+sum(k-1);
    }else{
        return 0;
    }
}

function buyHealth(gold){
   if (gold >= 10) { 
   gold -= 10;
   health += 10;
   goldText.innerText = gold;
   healthText.innerText = health;
   console.log("You have enough gold. Health purchased!");
 
}
}

//instance of object
int v=10;


//attributes
int u=10;
final int o=20;//updating the value  of o is not possible


    public static void main(String[] args){
        myMethod();
        myMethod1("Bhuvana");
        myMethod2("Bhuvana",25);
        myMethod2("Reddy",24);
        mymethod4();
        checkAge(19);
        buyHealth();
        int callmethod3=  myMethod3(2,5);
        System.out.println(callmethod3);

        int myNum1=addmethod(5,3);
        double myNum2=addmethod(5.2,6.3);
        System.out.println("int "+myNum1);
        System.out.println("double "+myNum2);

        int result=sum(10);
        System.out.println(result);

        Practice myobj=new Practice();
        Practice myobj1=new Practice();
        System.out.println(myobj.v);
        System.out.println(myobj1.v);

        Practice myobj2=new Practice();
        System.out.println(myobj2.u);

        //update  u value
        myobj2.u=40;
        System.out.println(myobj2.u);
    }



}


