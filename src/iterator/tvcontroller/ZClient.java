package iterator.tvcontroller;


public class ZClient {
	public static void display(Television tv) {
		TVIterator i = tv.createIterator();
		System.out.println("电视机频道：");
		while (!i.isLast()) {
			System.out.print(i.currentChannel().toString()+" ");
			i.next();
		}
	}
	
	//反转输出
	public static void reverseDisplay(Television tv) {
		TVIterator i = tv.createIterator();
		i.setChannel(5);
		System.out.println("逆向输出电视机频道：");
		while (!i.isFirst()) {
			i.previous();
			System.out.print(i.currentChannel().toString()+" ");
			
			
		}
	}

	public static void main(String args[]) {
		Television tv;
		tv = new SkyworthTelevision();
		display(tv);
		System.out.println("--------------------------");
		reverseDisplay(tv);
		
		tv = new TCLTelevision();
		display(tv);
		System.out.println("--------------------------");
		reverseDisplay(tv);
	}

}
