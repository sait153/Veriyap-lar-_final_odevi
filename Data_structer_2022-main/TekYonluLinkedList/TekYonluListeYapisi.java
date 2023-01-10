public class TekYonluListeYapisi {
	Nesne head=null;
	Nesne tail=null;
	void basaEkle(int x)
	{
		Nesne eleman=new Nesne();
		eleman.data=x;
		
		if(head==null)
		{
			eleman.next=null;
			head=eleman;
			tail=eleman;
			System.out.println("liste yapisi oluşturuldu,ilk eleman eklendi");
			
		}
		else
		{
			
			eleman.next=head;
			head=eleman;
			System.out.println("başa eleman eklendi");
			
		}
		
	}
	void sonaEkle(int x)
	{
		Nesne eleman=new Nesne();
		eleman.data=x;
		
		if(head==null)
		{
			eleman.next=null;
			head=eleman;
			tail=eleman;
			System.out.println("liste yapisi oluşturuldu ,ilk eleman eklendi");
		}
		else
		{
			tail.next=eleman;
			tail=eleman;
			System.out.println("sona eleman eklendi");
		}
	}
	void arayaEkle(int indis ,int x)
	{
		Nesne eleman=new Nesne();
		eleman.data=x;
		
		if(head==null && indis ==0)
		{
			eleman.next=null;
			head=eleman;
			tail=eleman;
			System.out.println("liste yapisi oluşturuldu,ilk eleman eklendi");
		}
		else if(head!= null && indis ==0)
		{
			eleman.next=head;
			head=eleman;
			System.out.println(indis + "indisinci siraya yeni eleman eklendi");
			
		}
		else
		{
			int n=0;
			Nesne temp=head;
			Nesne temp2=head;
			while(temp.next!=null)
			{
				n++;
				temp2=temp;
				temp=temp.next;
			}
			
			if(n==indis)
			{
				temp2.next=eleman;
				eleman.next=temp;
				System.out.println("eleman eklendi");
			}
			else
			{
				temp=head;
				temp2=head;
				int i= 0;
				while(i!=indis)
				{
					temp2=temp;
					temp=temp.next;
					i++;
					
					
				}
				temp2.next=eleman;
				eleman.next=temp;
				System.out.println(indis + ".siraya yeni eleman eklendi");

			}
		}
	}
	void yazdir()
	{
		
		if(head==null)
		{
			System.out.println("liste yapisi oluşturuldu,ilk eleman eklendi");
		}
		else
		{
		Nesne temp=head;
		System.out.print("baş->");
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.print("son.");
		}
	}
	
	}