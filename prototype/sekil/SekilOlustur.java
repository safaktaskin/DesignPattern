//package prototype.sekil;
//
//import java.util.*;
//
//public class SekilOlustur {
//    private static Hashtable<String, Sekil> sekilHashtable = new Hashtable<String, Sekil>() {
//        public static Sekil getSekil(String id) {
//            Sekil sekil = sekilHashtable.get(id);
//            return (Sekil) sekilHashtable.clone();
//        }
//
//        public static void sekilUret() {
//            Daire daire = new Daire();
//            daire.setId("1");
//            sekilHashtable.put(daire.getId(), daire);
//
//            Kare kare = new Kare();
//            kare.setId("2");
//            sekilHashtable.put(kare.getId(), kare);
//
//            Dikdortgen dikdortgen = new Dikdortgen();
//            dikdortgen.setId("3");
//            sekilHashtable.put(dikdortgen.getId(), dikdortgen);
//
//        }
//
//    };
//}
