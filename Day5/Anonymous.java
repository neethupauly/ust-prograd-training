package Day5;

interface Addable {
    int addition(int a,int b);
}
public class Anonymous {
    public static void main(String[] args) {

        Addable add=(int a,int b)->{
            int sum=a+b;
            return (sum);
        };

        int x=10;
        int y=20;

        System.out.println(add.addition(x,y));
    }
}

