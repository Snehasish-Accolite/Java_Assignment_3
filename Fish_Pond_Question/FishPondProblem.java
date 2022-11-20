import java.util.*;
class func extends Thread{
	List<String> fish = new ArrayList<String>();
	int d1,d2;
	int k = 0;
	String [] fi = {"M","F"};
	
	Random rand = new Random();
	public void run() {
		//to be written
		
	}
	func(List<String> fish){
		this.fish = fish;
	}
	public void activity() {
			synchronized(this) {
			d1 = new Random().nextInt(fish.size());
			d2 = new Random().nextInt(fish.size());
			
			
			//incomplete
			
			
			
			if(fish.get(d1)=="M" && fish.get(d2)=="M") {
				fish.remove("M");
				fish.remove("M");
				
			}
			
			else if(fish.get(d1)=="M" && fish.get(d2)=="F" ) {
				fish.add(fi[rand.nextInt(fi.length)]);
				fish.add(fi[rand.nextInt(fi.length)]);
				
			}
			
			System.out.println(fish+"   "+fish.size());
			}
			
		
	}
}

public class FishPondProblem {
	static List<String> fish = new ArrayList<String>();

	public static void main(String[] args) {
		
		for(int i=0;i<10;i++) {
			fish.add("M");
			fish.add("F");
		}
		
		System.out.println(fish+"   "+fish.size());
		func f1 = new func(fish);
		func f2 = new func(fish);
		func f3 = new func(fish);
		func f4 = new func(fish);
		func f5 = new func(fish);
		f1.start();
		f2.start();
		f3.start();
		f4.start();
		f5.start();
	}
}
