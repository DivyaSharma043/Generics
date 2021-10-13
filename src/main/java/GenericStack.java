public class GenericStack {
        public static void main(String[] args)
        {
            Stack <Integer> s1; //Generic fnctn
            s1 = new Stack <Integer>(10);
            
            if(!s1.isFull())
                s1.push(10);
            if(!s1.isFull())
                s1.push(20);
            if(!s1.isFull())
                s1.push(30);
            
            
            int data1;
            if(!s1.isEmpty())
            {
                data1 = s1.pop();
                System.out.println(data1);
            }
            if(!s1.isEmpty())
            {
                data1 = s1.pop();
                System.out.println(data1);
            }
            
            Stack <Float> s2; //Generic fnctn
            s2 = new Stack <Float>(10);
            
            if(!s2.isFull())
                s2.push(10.11f);
            if(!s2.isFull())
                s2.push(20.22f);
            if(!s2.isFull())
                s2.push(30.33f);
            
            
            float data2;
            if(!s2.isEmpty())
            {
                data2 = s2.pop();
                System.out.println(data2);
            }
            if(!s2.isEmpty())
            {
                data2 = s2.pop();
                System.out.println(data2);
            }
            
            Stack <Complex> s3; //Generic fnctn
            s3 = new Stack <Complex>(10);
            
            Complex c1 = new Complex(1.1f,2.2f);
            Complex c2 = new Complex(3.3f,4.4f);
            Complex c3 = new Complex(5.5f,6.6f);
            
            if(!s3.isFull())
                s3.push(c1);
            if(!s3.isFull())
                s3.push(c2);
            if(!s3.isFull())
                s3.push(c3);
            
            
            Complex c;
            if(!s3.isEmpty())
            {
                c = s3.pop();
                c.printData();
            }
            if(!s3.isEmpty())
            {
                c = s3.pop();
                c.printData();
            }
        }
}

class Stack <T>
{
    private T arr[];
    private int top;
    private int size;
    
    Stack(int sz)
    {
        size = sz;
        top =-1;
        arr = (T[])new Object[sz];
    }
    boolean isFull()
    {
        if(top == size)
            return true;
        else
            return false;
    }
    void push(T data)
    {
        top++;
        arr[top]=data;
    }
    boolean isEmpty()
    {
        if(top == -1)
            return true;
        else
            return false;
    }
    T pop()
    {
        T val;
        val =arr[top];
        top--;
        return val;
    }
}

class Complex
{
    float r, i;
    public Complex(float rr, float ii)
    {
        r = rr;
        i = ii;
    }
    public void printData()
    {
        System.out.println("Real= "+ r + " imag= "+ i);
    }
}