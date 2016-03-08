package PrintAttribute;

public class PrintAttribute {
	public static void main(String args[]){
		int tag_1 = args[0].indexOf("tag", 1);
		int tag_2 = args[0].indexOf("tag", 2);
		String tag = args[0].substring( tag_1 + 4, tag_2 - 2 ); //catch the string between the two tag
		
		int tagTwoPosition = args[0].indexOf(tag, (tag_2 + 1)); //find the second position string between the two tag
		int tagLength = tag.length();
		String tagTwo = args[0].substring( tagTwoPosition + tag.length() ,tagTwoPosition + 100 ); 
		int position = tagTwo.indexOf("\"", tagTwo.indexOf("\"")+1 ); //find the second position of " in twoTag
		String finalStr  = args[0].substring(tagTwoPosition + tagLength+1, tagTwoPosition + tagLength+1 + position);
		
		String str = args[0].substring(tagTwoPosition + tagLength, tagTwoPosition + tagLength + 1);
		
		if(str.equals(">")){
			System.out.println(" ");
		}
		else{
		System.out.println(finalStr);			
		}
	}
}
