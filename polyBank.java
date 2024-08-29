class Bank {
    float getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    float getRateOfInterest() {
        return 8.4f;
    }
}

class icici extends Bank {
    float getRateOfInterest() {
        return 7.3f;
    }
}

class axis extends Bank {
    float getRateOfInterest() {
        return 9.7f;
    }
}

class polyBank {
    public static void main(String args[]) {
        Bank c;
        c = new SBI();
        System.out.println("SBI Rate : " + c.getRateOfInterest());
        c = new icici();
        System.out.println("icici Rate: " + c.getRateOfInterest());
        c = new axis();
        System.out.println("axis Rate : " + c.getRateOfInterest());
    }
}