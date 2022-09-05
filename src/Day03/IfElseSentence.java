package Day03;

    public class IfElseSentence{
    public static void main(String[] args) {
        int a = 3, b = 3, c = 7, max, min;
        if (a > b) ;
        {
            max = a;
            min = b;
        }
        {
            max = b;
            min = a;
        }
        if (max < c)
            max = c;
        if (min > c)
            min = c;
        System.out.println("max=" + max);
        System.out.println("min=" + min);
    }
    }
