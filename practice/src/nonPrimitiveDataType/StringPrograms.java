package nonPrimitiveDataType;

public class StringPrograms {

	public static void main(String[] args) {

		/*String s= "Rajeshwar";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		String k= " RAJESHWAR ";
		System.out.println(k=k.trim());
		System.out.println(k.length());*/
		
		/*String r = "Rajeshwar";
		int Vowels = 0;
		int Consonants=0;
		for (int i=0;i<r.length();i++)
		{
			//System.out.println(r.charAt(i));
			if (r.charAt(i)=='a' || r.charAt(i)=='e'|| r.charAt(i)=='i' || r.charAt(i)=='o'|| r.charAt(i)=='u')
			{
				Vowels++;
			}
			else
			{
				Consonants++;
			}
			}
		System.out.println( "Total Vowels- "+Vowels);
		System.out.println("Total Consonants- "+ Consonants);*/
		
		String t="RAJ";
		System.out.println(t.replace('R', 'K')+" "+ t.replace('J', 'C'));
		System.out.println(t.replaceAll("RAJ", "RUPESH"));
		System.out.println(t.replaceFirst("RAJ", "TAAJ"));

		
	}

}
