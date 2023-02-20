package day06_unary_operator;

public class Practice {
    public static void main(String[] args) {
      int a = 48;//48-47 --48-47 46
        int b = -a-- + a++  + --a  * a--;
            //-48 + 47+47 *47
        System.out.println(a);
        System.out.println(b );
        int h = 16;//17 16 17 17 18
        int k = ++h + h-- / ++h -h++;
                //17 +17 /17 -17

        System.out.println(h);
        System.out.println(k);


    }
}