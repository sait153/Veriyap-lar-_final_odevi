class kuyruk{//DİZİ KUYRUK KODLARI
    private int boyut;//boyutu almak için kullanılır.
    private int[] kuyrukDizi;//dizi tipinde kuyruk tanımlanır
    private int bas;//kuyruğun başı
    private int son;//kuyruğun sonu
    private int elemanSayisi;
    public kuyruk(int s){
        boyut=s;
        kuyrukDizi=new int[boyut];
        bas=0;
        son=-1;
        elemanSayisi=0;
    }
    
    public void ekle(int e){
        if(son==boyut-1)
            son=-1;
        kuyrukDizi[++son]=e;
        elemanSayisi++;
    }

    
    public int cikart(){
        int tmp=kuyrukDizi[bas++];
        if(bas==boyut)
            bas=0;
        elemanSayisi--;
        return tmp;
    }

    public boolean bosmu(){
        return(elemanSayisi==0);
    }

}