import java.util.ArrayList;

public class NextFit implements Fit {

    public void fit(ArrayList<Bin> arr, Item item) {

        Bin bin = null;

        for(int i=0;i<arr.size();i++)
        {
            bin = arr.get(i);

        }
        if(bin!=null)
        {
            if (bin.check(item)){
                bin.update(item);
                return;
            }
        }


        Bin b= new Bin();
        b.update(item);
        arr.add(b);

    }
}
