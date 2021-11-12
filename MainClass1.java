package java11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class MainClass1
{

		public static void main(String[] args)
		{
			String msg = "A quick Brown fox jumps over the lazy dog";
			List<String> list = Arrays.asList("A", "quick", "brown", 
	                "fox", "jumps", "over", "the","lazy","dog");
			String[] array1 = list.toArray(new String[list.size()]);
	        System.out.println(Arrays.toString(array1));
	        
	        
			List<String> al = new ArrayList<String>();
			
			for(String s: al)
			{
			   System.out.println(s);
			}
		}
}











		/*	
			ArrayList<String>a=new ArrayList<>();
			a.add("a");
			a.add("quick");
			a.add("brown");
			a.add("fox");
			a.add("jumps");
			a.add("over");
			a.add("the");
			a.add("lazy");
			a.add("dog");
			System.out.println(a);
			
			Object[] s=a.stream().toArray(size->new String[size]);
			System.out.println(Arrays.toString(s));*/