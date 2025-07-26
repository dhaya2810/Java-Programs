import java.util.*;
class countvowels_consonants
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int c=0,v=0;
		for(int i=0;i<str.length();i++){
		    char ch=str.charAt(i);
		    if(Character.isLetter(ch)){
		        char l=Character.toLowerCase(ch);
		        if(l=='a'|| l=='e'||l=='i'||l=='o'||l=='u'){
		            v++;
		        }else{
		            c++;
		        }
		    }
		}System.out.println(v);
		System.out.println(c);
		
		}
}
