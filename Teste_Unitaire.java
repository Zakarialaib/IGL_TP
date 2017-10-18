import java.util.ArrayList;

public class Teste_Unitaire {
	
	public boolean Test_trie() {
		boolean check = true;
		ArrayList<Integer> s = new ArrayList<Integer>(); 
		s.add(1);
		s.add(0);
		s.add(-5);
		ArrayList<Integer> s1 = new ArrayList<Integer>(); 
		s1.add(-5); 
		s1.add(0); 
		s1.add(1); 
		VectorHelper V = new VectorHelper(s); 
		VectorHelper V1 = new VectorHelper(s1); 
		V.Trie();
		for(int i=0 ; i<V.VectSize(); i++)
		{
			if (V.getElemnt(i)!=V1.getElemnt(i)) check=false; 
		}
		
		return check;
	}
	
	public Boolean Test_VectInverser()
	{ 
		boolean check =true ;
		ArrayList<Integer> s = new ArrayList<Integer>(); 
		s.add(0);
		s.add(1);
		s.add(-5);
		ArrayList<Integer> s1 = new ArrayList<Integer>(); 
		s1.add(-5); 
		s1.add(1); 
		s1.add(0); 
		VectorHelper V = new VectorHelper(s); 
		VectorHelper V1 = new VectorHelper(s1);
		V.VectInverser();
		for(int i=0 ; i<V.VectSize(); i++)
		{
			if (V.getElemnt(i)!=V1.getElemnt(i)) check=false; 
		}
		
		
		
		return check ;
	}
	
	public boolean TestMax()
	{
		boolean check=true ;
		ArrayList<Integer> s = new ArrayList<Integer>(); 
		s.add(0);
		s.add(1);
		s.add(-5);
		VectorHelper V = new VectorHelper(s); 
		if(V.VectMax()!=1) check=false;
		
		return check; 
		
	}
	public boolean Test()
	{
		boolean check=true ;
		ArrayList<Integer> s = new ArrayList<Integer>(); 
		s.add(0);
		s.add(1);
		s.add(-5);
		VectorHelper V = new VectorHelper(s); 
		if(V.VectMin()!=-5) check=false;
		return check; 
		
	}
	public boolean Test_VectMultiplication()
	{
		boolean check = true ;
		ArrayList<Integer> s = new ArrayList<Integer>(); 
		s.add(0);
		s.add(1);
		s.add(-5);
		ArrayList<Integer> s1 = new ArrayList<Integer>(); 
		s1.add(-10); 
		s1.add(2); 
		s1.add(0); 
		VectorHelper V = new VectorHelper(s); 
		VectorHelper V1 = new VectorHelper(s1);
		V.VectMultiplication(2);
		for(int i=0 ; i<V.VectSize(); i++)
		{
			if (V.getElemnt(i)!=V1.getElemnt(i)*2) check=false; 
		}
		
		
		return check;
		
	}
	public boolean Test_VectDevision()
	{
		boolean check = true ;
		ArrayList<Integer> s = new ArrayList<Integer>(); 
		s.add(0);
		s.add(1);
		s.add(-5);
		ArrayList<Integer> s1 = new ArrayList<Integer>(); 
		s1.add(-5/2); 
		s1.add(1/2); 
		s1.add(0); 
		VectorHelper V = new VectorHelper(s); 
		VectorHelper V1 = new VectorHelper(s1);
		V.VectMultiplication(2);
		for(int i=0 ; i<V.VectSize(); i++)
		{
			if (V.getElemnt(i)!=V1.getElemnt(i)/2) check=false; 
		}
		
		
		return check;
		
	}
	public boolean Test_VectAddition()
	{
		boolean check = true ;
		ArrayList<Integer> s = new ArrayList<Integer>(); 
		s.add(0);
		s.add(1);
		s.add(-5);
		ArrayList<Integer> s1 = new ArrayList<Integer>(); 
		s1.add(-5+2); 
		s1.add(1+2); 
		s1.add(0+2); 
		VectorHelper V = new VectorHelper(s); 
		VectorHelper V1 = new VectorHelper(s1);
		V.VectMultiplication(2);
		for(int i=0 ; i<V.VectSize(); i++)
		{
			if (V.getElemnt(i)!=V1.getElemnt(i)+2) check=false; 
		}
		
		
		return check;
		
	}
	public boolean Test_VectSoustraction()
	{
		boolean check = true ;
		ArrayList<Integer> s = new ArrayList<Integer>(); 
		s.add(0);
		s.add(1);
		s.add(-5);
		ArrayList<Integer> s1 = new ArrayList<Integer>(); 
		s1.add(-5-2); 
		s1.add(1-2); 
		s1.add(0-2); 
		VectorHelper V = new VectorHelper(s); 
		VectorHelper V1 = new VectorHelper(s1);
		V.VectMultiplication(2);
		for(int i=0 ; i<V.VectSize(); i++)
		{
			if (V.getElemnt(i)!=V1.getElemnt(i)-2) check=false; 
		}
		
		
		return check;
		
		
	}
	public boolean Test_Some() throws Exception
	{
		boolean check = true ;
		ArrayList<Integer> s = new ArrayList<Integer>(); 
		s.add(0);
		s.add(1);
		s.add(-5);
		ArrayList<Integer> s1 = new ArrayList<Integer>(); 
		s1.add(1); 
		s1.add(1); 
		s1.add(1); 
		ArrayList<Integer> s2 = new ArrayList<Integer>(); 
		s2.add(1); 
		s2.add(2); 
		s2.add(-4); 
		VectorHelper V = new VectorHelper(s); 
		VectorHelper V1 = new VectorHelper(s1);
		VectorHelper V2 = new VectorHelper(s); 
		V.Somme(V1);
		for(int i=0 ; i<V.VectSize(); i++)
		{
			if (V.getElemnt(i)!=V2.getElemnt(i)) check=false; 
		}
		
		return check; 
		
		
	}
}

