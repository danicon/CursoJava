package idiomasistema;

// import java.util.Locale;



// public class IdiomaSistema {
//     public static void main(String[] args) {
//         Locale currentLocale = Locale.getDefault();
//         System.out.println(currentLocale.getDisplayLanguage());
//         System.out.println(currentLocale.getLanguage());
//     }
// }

import java.util.*;

class IdiomaSistema {
    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.println (loc.getDisplayLanguage()); // imprime "Português"
        System.out.println (loc.getLanguage()); // imprime "pt"
    }
}