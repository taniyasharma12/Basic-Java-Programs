
public class WordReverse {

	public static void main(String[] args) {
		
		String str = " This is a set of words";
	//output should be "words of set a is This"
		String rev = "";
		
		String words[] = str.split(" ");
		
		for(int i= words.length-1; i>=0; i--) {
			
			rev = rev + " " + words[i];
		}
			System.out.print(rev);
	}
}
