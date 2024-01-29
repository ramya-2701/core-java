package loops;

public class PersonAge {
    public void Age(int a){
        if(a<13){
            System.out.println("Person is kid");
        }
        else if(a>19){
            System.out.println("Person is adult");
        }
        else{
            System.out.println("Person is teen");
        }

    }
    public static void main(String[] args){
        PersonAge p=new PersonAge();
        p.Age(15);


    }
}
