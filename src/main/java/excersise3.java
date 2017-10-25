
public class excersise3 {

	public static void main(String[] args) {
		int n=0;
		if(args[0]==null) {
			System.exit(1);
		}
		try {
			n = Integer.parseInt(args[0]);
		}
		catch(NumberFormatException e) {
			System.out.println("Improper argument 1");
			System.exit(1);
		}
		if (n<0) {
			System.out.println("Improper argument 2");
			System.exit(1);
		}
		
		int l = layz(n);
		int t = tri(n);
		System.out.println("Tri("+n+") = "+t);
		System.out.println("Lazy("+n+") = "+l);
	}
	
	public static int layz(int n) {
		return (n*n+n+2)/2;
	}
	
	public static int tri(int n) {
		int ret = 0;
		for (int i = 0; i<n+1;i++) {
			ret = ret + i;
		}
		return ret;
	}

}
