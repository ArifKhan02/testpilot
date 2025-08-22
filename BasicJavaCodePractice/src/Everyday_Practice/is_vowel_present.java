package Everyday_Practice;

public class is_vowel_present {
	
	public void isVowel(String word) 
	{
		String words=word.toUpperCase();
		int c=0;
		for(int i=0;i<=words.length()-1;i++) 
		{
			char w=words.charAt(i);
			if(w=='A'|w=='E'|w=='I'|w=='O'|w=='U') 
			{
				System.out.println("vowel is present in the word");
				c++;
				
			}

		}
		if(c==0) 
		{
			System.out.println("vowel is not present in the word");

			
		}
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		is_vowel_present v=new is_vowel_present();
		v.isVowel("HKDKLJLK");
		
		
	}

}
