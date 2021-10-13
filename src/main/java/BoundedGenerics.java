public class BoundedGenerics {
    public static void main(String[] args)
    {
        Integer iarr[] = {1,2,3,4,5};
        Statistics<Integer>iobj;
        double avg1;
        
        iobj = new Statistics<Integer>(iarr);
        avg1= iobj.getAverage();
        System.out.println("avg1= "+ avg1);
        
        Float farr[] ={1.1f,2.2f,3.3f};
        Statistics<Float>fobj;
        double avg2;
        
        fobj = new Statistics<Float>(farr);
        avg2= fobj.getAverage();
        System.out.println("avg2= "+ avg2);
    }
}

class Statistics<T extends Number>
    {
        private T arr[];
        Statistics (T[] obj)
        {
            arr = obj;
        }
        public double getAverage()
        {
            double sum = 0.0;
            for(int i = 0; i < arr.length; i++)
                sum = sum +arr[i].doubleValue();
            
            return (sum/arr.length);
        }
    }
