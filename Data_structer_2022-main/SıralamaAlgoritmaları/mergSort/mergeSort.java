public class mergeSort {
private int[] list;

public mergeSort(int[] listToSort) {list = listToSort; }

public int[] getList() { return list; }


public void sort() { list = sort(list); }


private int[] sort(int[] dizi) {
    if (dizi.length == 1) 
        return dizi;
    else 
    {
        
        int[] left = new int[dizi.length/2];
        System.arraycopy(dizi, 0, left, 0, left.length);
        
        for(int i = 0;i< dizi.length ; i++)
            System.out.print(dizi[i] + " ");
        System.out.println("");

        
        int[] right = new int[dizi.length-left.length];
        System.arraycopy(dizi, left.length, right, 0, right.length);

        for(int i = 0;i< dizi.length ; i++)
            System.out.print(dizi[i] + " ");
        System.out.println("");
        
        
        left = sort(left);
        right = sort(right);
        
        for(int i = 0;i< dizi.length ; i++)
            System.out.print(dizi[i] + " ");
        System.out.println("");
        
        
        merge(left, right, dizi);

        

        return dizi;
    }
}


private void merge(int[] left, int[] right, int[] sonuc) {
    int x = 0; int y = 0; int k = 0;
    
    while (x < left.length && y < right.length)
    { 
        if (left[x] < right[y]) 
        { 
            sonuc[k] = left[x]; x++; 
        }
        else 
        { 
            sonuc[k] = right[y]; y++; 
        }
        k++;
    }
    int[] rest; int restIndex;
    if (x >= left.length) 
    { 
        rest = right; 
        restIndex = y; 
    }
    else 
    { 
        rest = left; 
        restIndex = x; 
    }
    for (int i=restIndex; i<rest.length; i++) 
    { 
        sonuc[k] = rest[i]; 
        k++; 
    }
}

public static void main(String[] args) {
    int[] dizi = {10,35,36,98,74,56,51,2,7,9};
    System.out.println("Sırasıs:");
    for(int i = 0;i< dizi.length ; i++)
    {
        System.out.print(dizi[i] + " ");
    }
    mergeSort sortObj = new mergeSort(dizi);
    sortObj.sort();
    System.out.println("");
    System.out.println("Sıralı:");
    int [] sirali = sortObj.getList();
    for(int i = 0;i< sirali.length ; i++)
    {
        System.out.print(sirali[i] + " ");
    }
}
}
