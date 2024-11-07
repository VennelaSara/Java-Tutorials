public class MyString {
    public static void main(String args[]) {
        String s = "Vennela";

        String a = new String("Hello " + s);
        System.out.println(a.hashCode());
        System.out.println(a.charAt(3));
        System.out.println(a.concat("Goud"));
    StringBuffer sb = new StringBuffer("Vennela");
    
    // sb.capacity() , sb.append("Goud")
    
    
    }
    // Strings Immutable.
}