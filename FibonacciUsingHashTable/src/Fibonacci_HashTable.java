import java.util.Hashtable;
public class Fibonacci_HashTable {
	private static Hashtable<Integer, Integer> hashtable = new Hashtable<>();
	    public static void main(String[] args) {
	        int n = 5;
	        
	        
	        int result= fibonacci(n);
	        System.out.println("Fibonacci"+n+" "+"="+result);
	        	
	        
	        
	        System.out.println(hashtable);
	    }

	    public static int fibonacci(int n) {
	    	if(n==0) {
	    		hashtable.put(n, 0);
	    		return 0;
	    	}
	        if (n==1) {
	        	hashtable.put(n, 1);
	            return 1;
	        }
	        if (n==2) {
	        	hashtable.put(n, 1);
	            return 1;
	        }
	       
	        if (hashtable.containsKey(n)) {
	            try {
					return hashtable.get(n);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }

	        Integer result = fibonacci(n-1)+ fibonacci(n-2);
	        hashtable.put(n, result);
	        return result;
	    
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	
	   }
	
}
