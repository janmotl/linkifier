package main;

import java.util.List;

public class NullsExpected {

    public static boolean containsKeyword(List<String> lowerCaseTokens) {
        for (String token : lowerCaseTokens) {
            // Makes a hierarchy
            if (token.contains("parent")) return true;
    
            // Is denormalized
            if (token.contains("3")) return true;
            if (token.contains("4")) return true;
            if (token.contains("5")) return true;
            if (token.contains("6")) return true;
            if (token.contains("7")) return true;
            if (token.contains("8")) return true;
            if (token.contains("9")) return true;
            if (token.contains("10")) return true;
            if (token.contains("11")) return true;
            if (token.contains("12")) return true;
    
            // Is a promise {close, cancel, return, refund, reason}
            if (token.contains("close")) return true;
            if (token.contains("cancel")) return true;
            if (token.contains("return")) return true;
            if (token.contains("refund")) return true;
            if (token.contains("reason")) return true;
        }

        return false;
    }
}
