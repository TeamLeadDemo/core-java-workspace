
public class OneDArrayDemo {

	public static void main(String args[]) {
		
		int[] myMarks = new int[4]; // recommended
		
		int allMarks[] = new int[4]; // used in older versions
		
		myMarks[0] = 50;
		myMarks[1] = 50;
		myMarks[2] = 50;
		myMarks[3] = 50;
		
		for(int i=0; i<myMarks.length; i++) {
			System.out.println(myMarks[i]);
		}
		
		System.out.println("------------------");
		
		for(int mark : myMarks) {
			System.out.println(mark);
		}
	}
}
