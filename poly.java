class hello{
    public void word(){
       System.out.println("hello world");
    }

    public void make() {
    }
}

class moon {

    public void make(){
        System.out.println("makeing same thing new ");
     }
}

class india extends hello {

}


public class poly {
    public static void main(String[] args) {
     
       hello h = new hello();
        h.word();

        moon b = new moon();
        b.make();

    }
}