public class AnonDemo {
    public static void main(String[] args) {
      /*LamdaExp obj =(a,b)->{
          System.out.println("The value of a and b is "+a+" and "+b);
      };
      obj.Math1(5,6);
    }*/
        DemoAno obj = new DemoAno() {
            @Override
            public void math2() {
                System.out.println("math2");
            }

            @Override
            public void math3() {
                System.out.println("math3");
            }
        };
        obj.math2();
        obj.math3();
    }
}

