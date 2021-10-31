package primitivetypes;

import javax.swing.text.StyledEditorKit;
import java.sql.SQLOutput;

public class PrimitiveTypesMain {
    public static void main(String[] args) {
        int a = 2;
        Integer b =2;
        Integer c = a;
        Integer d = b;
        Integer e = new Integer(2);
        int f = new Integer( 2);
        int g = new Integer(a);
        System.out.println(g);
        int h = new Integer(c);
        int i = new Integer("2");
        i = Integer.parseInt("2");
        Integer j = Integer.parseInt("2");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);

        boolean k = true;
        Boolean l = true;
        boolean m = new Boolean("true");
        System.out.println(m);
        Boolean n = new Boolean(true);
        boolean o =  Boolean.parseBoolean("TrUe");
        System.out.println(o);
        Boolean p = Boolean.parseBoolean("TrUe");
        System.out.println(p);
        boolean q = Boolean.getBoolean("TreU");
        System.out.println(q);
        Boolean r = Boolean.getBoolean("TreU");
        System.out.println(r);
        System.out.println(Boolean.valueOf("True"));




    }
}
