
public class ArrayService {

	public static void Add(int num, int[] hashtable) {
		int size=hashtable.length;
		int coll = 0;
		//calculate position of bucket in the array
		int pos=(num+10)%size;
		//if in that position another data is present
		if(hashtable[pos]!=0) {
			coll++;
		}
	}

}
