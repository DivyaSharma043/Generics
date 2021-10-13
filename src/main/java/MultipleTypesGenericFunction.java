
public class MultipleTypesGenericFunction {
    public static void main(String[] args)
    {
        Integer i = 10;
        Float f = 3.14f;
        Character c = 'A';
        Double e = 3.22;
        printTypes(i,f,c,e);
    }
    
    public static <T,S,Z,D> void printTypes(T a, S b, Z d, D e)
    {
        System.out.println("Data Type: "+a.getClass().getSimpleName() +"\n a= "+ a);
        System.out.println("b= "+ b);
        System.out.println("d= "+ d);
        System.out.println("e= "+ e);
    }
}
