package Core_Java;

public class Demo {


    int x = 10;

    public static int sum(){
        int y=5;
        Demo obj=new Demo();
        return obj.x+y;

    }


    public static void main(String[] args) {

        int ans=sum();
        System.out.println(ans);


        //valid for loop
        // if we use ; it will ommit
        int i=0;
        for(;i<1_0;){
            System.out.println(i);
            ++i;
        }

        //infinite loop
        for (;;) {
            System.out.println("Hello");
        }

    }

}
