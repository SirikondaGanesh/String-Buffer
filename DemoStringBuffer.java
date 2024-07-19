//implimenting a program using String-Buffer
package apjfsa;
//class-declaration
public class DemoStringBuffer {
     //main-function
	public static void main(String[] args) {
		//String Buffer-object
		StringBuffer strbuff=new StringBuffer("GANESH ");
		System.out.println(strbuff);
		//append for including
		strbuff.append("SIRIKONDA");
		System.out.println(strbuff);
		//String-buffer methods
		System.out.println(strbuff.reverse());
		System.out.println(strbuff.capacity());
		System.out.println(strbuff.charAt(2));
		System.out.println(strbuff.indexOf("B"));
		StringBuffer strb=new StringBuffer("Java full stack using angular");
		System.out.println(strb.capacity());
		System.out.println(strb.deleteCharAt(2));
		System.out.println(strb.codePointAt(0));
		
	}

}

