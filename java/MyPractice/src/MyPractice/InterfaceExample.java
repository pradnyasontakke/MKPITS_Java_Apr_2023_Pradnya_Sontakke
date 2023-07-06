package MyPractice;

interface InterfaceExample {    //step1: create class
    int number = 10;             //field-by default public ststic and final

    public void display();   // method-by default public and abstract
}                                 //method only declare not define
    class InterfaceExample1 implements InterfaceExample{
    public void display(){   //public compulsory
        System.out.println("this is example1");
    }

        public static void main(String[] args) {
            InterfaceExample1 interfaceExample1=new InterfaceExample1();
            interfaceExample1.display();
            System.out.println(number);
        }
    }

