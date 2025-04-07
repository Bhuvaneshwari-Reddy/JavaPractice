class Employe{
    private String name;
    public void setName(String name){
this.name=name;
    }

    public String getName(){
        return name;
    }

}


public class EncapsulationDemo{

public static void main(String []args){
    Employe o=new Employe();
    o.setName("Bhuvana");
   System.out.println(o.getName());
}
}