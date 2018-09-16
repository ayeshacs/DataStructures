import java.util.*;
public class MyArrayList {
 
    private Object[] myStore;
    private int actSize = 0;
     
    public MyArrayList()
    {
        myStore = new Object[10];
    }
     
    public Object get(int index){
        if(index < actSize){
            return myStore[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
     
    public void add(Object obj)
    {
        if(myStore.length-actSize <= 5)
        {
            increaseListSize();
        }
        myStore[actSize] = obj;
        actSize++;
    }
     
    public void remove(int index)
    {
        if(index < actSize){
            myStore[index] = null;

            while(index < actSize){
                myStore[index] = myStore[index+1];
                index++;
            }
            actSize--;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
         
    }
     
    private void increaseListSize(){
        myStore = Arrays.copyOf(myStore, myStore.length*2);
        System.out.println("\nNew length: "+myStore.length);
    }
    
    public int size()
    {
        return actSize;
    }
     
    public static void main(String a[]){
        MyArrayList mal = new MyArrayList();
        mal.add(new Integer(2));
        mal.add(new Integer(5));
        mal.add(new Integer(1));
        mal.add(new Integer(23));
        mal.add(new Integer(14));
        for(int i=0;i<mal.size();i++){
            System.out.print(mal.get(i)+" ");
        }
        mal.add(new Integer(29));
        System.out.println("Element at Index 5:"+mal.get(5));
        System.out.println("List size: "+mal.size());
        mal.remove(2);
        
        for(int i=0;i<mal.size();i++){
            System.out.print(mal.get(i)+" ");
        }
    }
}

