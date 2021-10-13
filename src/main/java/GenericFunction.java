
public class GenericFunction {

        public static <T> void printArray(T[] arr)
        {
            for(T i : arr)
            {
                System.out.printf("%s ",i);
                System.out.println( );
            }
        }
        public static void main(String[] args)
        {
            Integer[] intarr = {12,3,44,55,34};
            Float[] floatarr = {12.3f,34.2f,23.4f,5.4f,1.2f};
            Character[] chararr = {'D','i','v','y','a'};
            
            printArray(intarr);
            printArray(floatarr);
            printArray(chararr);
        }
}
