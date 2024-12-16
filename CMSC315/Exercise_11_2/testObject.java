package Exercise_11_2;

import java.util.Date;

public class testObject {

    protected Date dateCreated = new Date();
    public Date getDate() {
        return dateCreated;
    }


    public static void main(String[] args) {
        testObject testObject = new testObject();
        System.out.println(testObject.getDate());
        testObject2 to2 = new testObject2();
        System.out.println(to2.getDate());
    }
}

class testObject2 extends testObject {

    @Override
    public Date getDate() {
       System.out.println("testObject2 getDate");
       return super.getDate();
    }
}
