class makenoise {
    void eat() {
        System.out.println("eating...");
    }
}

class hello extends makenoise {
    void book() {
        System.out.println("booking for lunch");
    }
}

class helloworld extends hello {
    void moon() {
        System.out.println("moon is world ");
    }
}

public class inheritance {
    public static void main(String args[]) {
        helloworld d = new helloworld();
        d.moon();
        d.book();
        d.eat();
    }
}