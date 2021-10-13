public class GenericSorting {
    public static void main(String[] args)
    {
        Float num[] = {2.3f,-12.3f,1.2f,-1.2f,0.3f};
        Integer arr[] = {1,-45,-2,5,67,-2,0};
        int i;
        
        sort(num, 5);
        for(i = 0; i<=4; i++)
            System.out.println(num[i]+ " ");
        System.out.println();
        sort(arr, 7);
        for(i = 0; i<=6; i++)
            System.out.println(arr[i] + " ");
    }
    
    public static <T extends Comparable <T>> void sort(T [] n, int size)
    {
        int i, j;
        T t;
        
        for(i = 0; i <=size-2;i++)
        {
            for(j =i+1; j <=size-1;j++)
            {
                if(n[i].compareTo(n[j])>0)
                {
                    t =n[i];
                    n[i] = n[j];
                    n[j] =t;
                }
            }
        }
    }
}
