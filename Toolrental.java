import java.util.*;

class Rental {
	Scanner s1=new Scanner(System.in);
	static double tot=0.0,sub=0.0;
	static double washer=10.0,aerator=15.0,grinder=50.0,rake=20.0;
        static LinkedList<String> l=new LinkedList<>();
	static LinkedList<String> li=new LinkedList<>();
	static LinkedList<Double> lis=new LinkedList<>();
      Rental(){
		
	l.add("Power washer");
	l.add("Aerator");
	l.add("Stump grinder");
	l.add("Power rake");
	lis.add(10.0);
	lis.add(15.0);
	lis.add(50.0);
	lis.add(20.0);
	}
	public void listrates(){
                 
		System.out.println("\t\t\tPower washer: $"+this.washer);
		System.out.println("\t\t\tAerator: $"+this.aerator);
		System.out.println("\t\t\tStump grinder: $"+this.grinder);
		System.out.println("\t\t\tPower rake: $"+this.rake);
	  }
	public void add(){
		int j=0,ele1,it=0,flag=0;
		int tym=0,cnt=0;
		while(flag==0){
					for(int i=0;i<l.size();i++){
					j++;
					System.out.println("\t\t\t"+j+"-"+l.get(i));	
					}
    				ele1=s1.nextInt();
			        for(int i=0;i<=ele1-1;i++){						
					if(ele1-1==i){
						li.add(l.get(i));
						System.out.println("\t\t\t The items in your CART are :"+li);
					        cnt=i;
					}
					}
					flag=1;
				}
					System.out.println("How long will you rent? (in hours)");
					tym=s1.nextInt();
					this.sub=(lis.get(cnt))*tym;
					this.tot=this.tot+this.sub;
					System.out.println("\t\t\tYour subtotal will be "+this.sub);
					System.out.println("\t\t\tYour total will be "+this.tot);

	}		
	public void display(){
         System.out.println("\t\t\tThe current total is $ "+this.tot);
	}
	public void reset(){
		this.tot=0.0;
	System.out.println("\t\t\tThe current total is $ "+this.tot);
	}
	
	public  void renttool(){
		int ele,flag=0;
		char ch='y';
		while(flag==0){
		System.out.println("Select the requried option :");
		System.out.println("1-Add tool");
		System.out.println("2-Display total");
		System.out.println("3-Reset total");
		System.out.println("4-Return to Main-Menu");
			ele=s1.nextInt();
		 	switch(ele){
			  case 1 :      add();
					while(ch=='y'){
					//Scanner s2=new Scanner(System.in);
					System.out.println("Do You want to add more tools : (y or n)");
					ch=s1.next().charAt(0);
					if(ch=='y'|| ch=='Y'){
				          add();	
					}
					else if(ch!='y' && ch!='n'){
					 System.out.println("____invalid Input_____");
					}
					}	 
				        break;
			 case 2 :    display();
                        break;
             case 3 :    reset();
                        break;
             case 4 :    flag=1;
                        break; 					
			 default :  System.out.println("_____invalid input_____");
		}		 
 	
}
}
}		
class Toolrental extends Rental {
	public static void main(String arg[]){
	  int v;
	Scanner s=new Scanner(System.in);
	Rental e=new Rental();
	while(true){
          System.out.println("1-List Of Hourly Charges");
	  System.out.println("2-Rent A tool");
	  System.out.println("3-exit");
          v=s.nextInt();
	  switch(v){
		case 1 : e.listrates();
                         break;
		case 2 : e.renttool();
			 break;
		case 3 : System.out.println("\t\t\tBYE!");
			 System.exit(0);
			 break;
                default : System.out.println("_____Invalid input______");
	   }
	}
       }
}
	
