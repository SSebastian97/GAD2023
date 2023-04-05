package basics;

public class Main {
    static void CopyArrayexample()
    {
        char[] copyFrom={'a','b','c','d','e','f','g','h','i'};
        char[] copyTo=new char[7];

        System.arraycopy(copyFrom,2,copyTo,0,7);
        System.out.println(7);
    }

    static void egalite()
    {
        String firstSTR=new String("abc");
        String secondSTR=new String("abc");

        if(firstSTR.equals(secondSTR))
        {
            System.out.println("Nice");
        }

    }

    public static void main(String[] args) {
        CopyArrayexample();
        egalite();
    }
}
