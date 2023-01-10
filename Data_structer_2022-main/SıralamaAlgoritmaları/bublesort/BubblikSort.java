class BubbleSort{
    void bubbleSort(int dizi[])
    {
        int n= dizi.length;
        for (int i=0;i<n-1;++i){
                for (int j=0;j<n-i-1;++j){
                if(dizi[j]>dizi[j+1])
                {
                int temp=dizi[j];
                dizi[j]=dizi[j+1];
                dizi[j+1]=temp;
                }
                System.out.println(i+1+".asama");
            }
        }
    }
    
    public static void main(String args[]){
        
        BubbleSort bs = new BubbleSort();
        int dizi[]={20,34,13,5,9,80,1};
        bs.bubbleSort(dizi);
        System.out.print("Sirali Dizi");
        int n=dizi.length;
        for (int i=0;i<n;++i
        ){
            System.out.print(dizi[i]+" ");
        System.out.println();
    }
    
    }
    }