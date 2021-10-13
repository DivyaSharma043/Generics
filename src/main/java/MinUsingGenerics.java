public class MinUsingGenerics {

            public static <T extends Comparable <T>> T minimum (T a, T b)
            {
                if(a.compareTo(b)<0)
                    return a;
                else
                    return b;
            }
            
            public static void main(String[] args)
            {
                Float a =3.14f, b =-6.28f,c;
                c = minimum(a,b);
                System.out.println(c);
                
                Character ch ='A', dh ='D',eh;
                eh = minimum(ch,dh);
                System.out.println(eh);
                
                Double d =3.1, e =-6.28,f;
                f = minimum(d,e);
                System.out.println(f);
            }
}
