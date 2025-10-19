public class CommandLine {
    public static void main(String[] args) {
        String a=args[0];
        String b=args[1];
        int num=Integer.parseInt(args[2]);
        int num1=Integer.parseInt(args[3]);

        int x=num+num1;
        System.out.println(x);

        System.out.println(a+b+" "+(num+num1));

    }
}
