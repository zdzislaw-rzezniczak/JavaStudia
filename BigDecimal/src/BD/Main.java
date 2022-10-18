package BD;

import java.math.BigDecimal;
import java.util.*;
class Main {

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here
        Arrays.sort(s, (o1, o2) -> {
            if (o1 == null || o2 == null) {
                return 0;
            }

            BigDecimal a = new BigDecimal(o1);
            BigDecimal b = new BigDecimal(o2);
            return b.compareTo(a);
        });

//        Arrays.sort(s, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if (o1 == null || o2 == null) {
//                    return 0;
//                }
//
//                BigDecimal a = new BigDecimal(o1);
//                BigDecimal b = new BigDecimal(o2);
//                return b.compareTo(a);
//            }
//        });

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}