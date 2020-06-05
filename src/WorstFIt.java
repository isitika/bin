import java.util.ArrayList;

public class WorstFIt implements Fit {

    public void fit(ArrayList<Bin> arr, Item item) {
        int best=0;
        int bestnumber=0;
        int checknumber=0;

        for(int i=0;i<arr.size();i++)
        {
            Bin bin = arr.get(i);
            if(bin.check(item))
            {
                checknumber=1;
                if((bin.remainCapacity-item.weight)>best) {
                    best = (bin.remainCapacity-item.weight) ;
                    bestnumber = i;
                }
            }


        }

        if(checknumber==1)
        {
            Bin bin = arr.get(bestnumber);
            bin.update(item);
            return;
        }


        Bin b= new Bin();
        b.update(item);
        arr.add(b);
        return;
    }
}