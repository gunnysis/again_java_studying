public class ExOperator {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        //Monadic Operator
        System.out.println("a+b:"+(a+b));
        System.out.println("a-b:"+(a-b));
        System.out.println("a*b:"+(a*b));
        System.out.println("a/b:"+(a/(double)b)); // type casting
        System.out.println("a%b:"+(a%b));

        System.out.println("=========================");

        // Comparison Operator
        System.out.println("a>b:"+(a>b));
        System.out.println("a<b:"+(a<b));


        System.out.println("a>=b:"+(a>=b));
        System.out.println("a<=b:"+(a<=b));

        System.out.println("a==b:"+(a==b));
        System.out.println("a!=b:"+(a!=b));

        // (Prefix/Postfix) Increment/Decrement Operator
        int result = +1;
        result++;
        result--;

        // Sign Operator
        result = 10;
        result = -result;
        System.out.println("10(result variable value) of - Sign Operator:"+result);
        // '+' Operator remain existing variable value.
        result = +result;
        System.out.println("10(result variable value) of + Sign Operator:"+result);

        // Logical NOT Operator
        boolean test = true;
        System.out.println("reverse of test value(true):"+!test);

        // Difference between &/|(Bitwise or Logical AND/OR Operator) and &&/|| (Conditional AND/OR Operator)
        // Bitwise or Logical AND/OR operator estimate all(left/right) conditions.
        // Conditional AND/OR operator is not estimating second condition if first condition is false.
        boolean var1 = true;
        boolean var2 = false;

        if(var1&var2) System.out.println("var1&var2:"+(var1&var2));
        else System.out.println("var1&var2:"+(var1&var2));

        if(var1&&var2) System.out.println("var1&&var2:"+(var1&&var2));
        else System.out.println("var1&&var2:"+(var1&&var2));

        if(var1|var2) System.out.println("var1|var2:"+(var1|var2));
        else System.out.println("var1|var2:"+(var1|var2));

        if(var1||var2) System.out.println("var1|var2:"+(var1|var2));
        else System.out.println("var1||var2:"+(var1||var2));

    }
}
