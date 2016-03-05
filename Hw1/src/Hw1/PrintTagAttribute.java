package Hw1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PrintTagAttribute {
	public static void main(String[] args) {
		String target = "";
		/* get the content between <tag> & </tag> */
		Pattern pattern = Pattern.compile("<tag>(.*)<\\/tag>");
		Matcher matcher = pattern.matcher(args[0]);
		if (matcher.find()) {
			target = matcher.group(1);
		}
		else {
			System.out.println("No match pattern");
		}
		/* compose pattern string */
		String tmp = "<" + target + " (.*)>";
		int length;
		pattern = Pattern.compile(tmp);
		matcher = pattern.matcher(args[0]);
		if (matcher.find()) {
			if (matcher.group(1).endsWith("/")) {
				length = matcher.group(1).length();
				System.out.println(matcher.group(1).substring(0, length-1));
			}
			else {
			System.out.println(matcher.group(1));
			}
		}
	}
}