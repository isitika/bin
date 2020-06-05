import java.util.ArrayList;

public class Main{
    public static void main(String args[]) {
        int items[]={7,5,6,4,2,3,7,5};
        ArrayList<Bin>arr1=new ArrayList<>();
        ArrayList<Bin>arr2=new ArrayList<>();
        ArrayList<Bin>arr3=new ArrayList<>();
        ArrayList<Bin>arr4=new ArrayList<>();

        FirstFIt ff=new FirstFIt();
        NextFit nf= new NextFit();
        BestFIt bf= new BestFIt();
        WorstFIt wf= new WorstFIt();

        for(int i=0;i<items.length;i++)
        {
            ff.fit(arr1, new Item(items[i]));
        }

        for(int i=0;i<arr1.size();i++)
        {
            System.out.println(arr1.get(i));
        }

        System.out.println();
        System.out.println();

        for(int i=0;i<items.length;i++)
        {
            nf.fit(arr2, new Item(items[i]));
        }

        for(int i=0;i<arr2.size();i++)
        {
            System.out.println(arr2.get(i));
        }

        System.out.println();
        System.out.println();

        for(int i=0;i<items.length;i++)
        {
            bf.fit(arr3, new Item(items[i]));
        }

        for(int i=0;i<arr3.size();i++)
        {
            System.out.println(arr3.get(i));
        }

        System.out.println();
        System.out.println();

        for(int i=0;i<items.length;i++)
        {
            wf.fit(arr4, new Item(items[i]));
        }

        for(int i=0;i<arr4.size();i++)
        {
            System.out.println(arr4.get(i));
        }

        System.out.println();
        System.out.println();







    }
}


