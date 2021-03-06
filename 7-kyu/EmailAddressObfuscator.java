/**
 * Many people choose to obfuscate their email address when displaying it on the Web. One common way of doing this 
 * is by substituting the @ and . characters for their literal equivalents in brackets.
 *
 * Using the examples above as a guide, write a function that takes an email address string and returns the obfuscated 
 * version as a string that replaces the characters @ and . with [at] and [dot], respectively.
 *
 **/

public class EmailObfuscator {
    public static String obfuscate(String email) {
      return email.replace("@", " [at] ").replace(".", " [dot] ");
    }
}
