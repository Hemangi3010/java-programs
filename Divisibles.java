public class Divisibles {
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        int n1 = Integer.parseInt(args[1]);
        int n2 = Integer.parseInt(args[2]);

        int start = (n1/n)+1;
        int x = n*start;

        while(true){
            System.out.println(x);
            start = start + 1;
            x = n*start;
            if(x > n2){break;}
        }
    }
}
