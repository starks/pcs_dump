package defpackage;

import com.google.android.apps.aicore.aidl.AIFeature;
import java.io.EOFException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fqq {
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final boolean f;
    private final String h;
    private final String i;
    private final List j;
    private final String k;
    public static final fwv g = new fwv();
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public fqq(String str, String str2, String str3, String str4, int i, List list, String str5, String str6) {
        this.b = str;
        this.h = str2;
        this.i = str3;
        this.c = str4;
        this.d = i;
        this.j = list;
        this.k = str5;
        this.e = str6;
        this.f = fjs.c(str, "https");
    }

    public final String a() {
        if (this.i.length() == 0) {
            return "";
        }
        int iU = fjz.u(this.e, ':', this.b.length() + 3, 4) + 1;
        String str = this.e;
        String strSubstring = str.substring(iU, fjz.u(str, '@', 0, 6));
        strSubstring.getClass();
        return strSubstring;
    }

    public final String b() {
        int length = this.b.length();
        String str = this.e;
        int iU = fjz.u(str, '/', length + 3, 4);
        String strSubstring = this.e.substring(iU, frh.b(str, "?#", iU, str.length()));
        strSubstring.getClass();
        return strSubstring;
    }

    public final String c() {
        if (this.j == null) {
            return null;
        }
        int iU = fjz.u(this.e, '?', 0, 6) + 1;
        String str = this.e;
        String strSubstring = str.substring(iU, frh.a(str, '#', iU, str.length()));
        strSubstring.getClass();
        return strSubstring;
    }

    public final String d() {
        if (this.h.length() == 0) {
            return "";
        }
        String str = this.b;
        String str2 = this.e;
        int length = str.length() + 3;
        String strSubstring = str2.substring(length, frh.b(str2, ":@", length, str2.length()));
        strSubstring.getClass();
        return strSubstring;
    }

    public final URI e() {
        String strSubstring;
        fqp fqpVar = new fqp();
        fqpVar.a = this.b;
        fqpVar.b = d();
        fqpVar.c = a();
        fqpVar.d = this.c;
        fqpVar.e = this.d != fwv.C(this.b) ? this.d : -1;
        fqpVar.f.clear();
        fqpVar.f.addAll(f());
        fqpVar.b(c());
        if (this.k == null) {
            strSubstring = null;
        } else {
            strSubstring = this.e.substring(fjz.u(this.e, '#', 0, 6) + 1);
            strSubstring.getClass();
        }
        fqpVar.h = strSubstring;
        String str = fqpVar.d;
        fqpVar.d = str != null ? new fld("[\"<>^`{|}]").b(str) : null;
        int size = fqpVar.f.size();
        for (int i = 0; i < size; i++) {
            List list = fqpVar.f;
            list.set(i, fwv.I(g, (String) list.get(i), 0, 0, "[]", true, true, false, false, AIFeature.Id.AIAI_ZERO_STATE_6));
        }
        List list2 = fqpVar.g;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str2 = (String) list2.get(i2);
                list2.set(i2, str2 != null ? fwv.I(g, str2, 0, 0, "\\^`{|}", true, true, true, false, 195) : null);
            }
        }
        String str3 = fqpVar.h;
        fqpVar.h = str3 != null ? fwv.I(g, str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 163) : null;
        String string = fqpVar.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                URI uriCreate = URI.create(new fld("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").b(string));
                uriCreate.getClass();
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fqq) && fjs.c(((fqq) obj).e, this.e);
    }

    public final List f() {
        int length = this.b.length();
        String str = this.e;
        int iU = fjz.u(str, '/', length + 3, 4);
        int iB = frh.b(str, "?#", iU, str.length());
        ArrayList arrayList = new ArrayList();
        while (iU < iB) {
            int i = iU + 1;
            int iA = frh.a(this.e, '/', i, iB);
            String strSubstring = this.e.substring(i, iA);
            strSubstring.getClass();
            arrayList.add(strSubstring);
            iU = iA;
        }
        return arrayList;
    }

    public final fqp g(String str) throws EOFException {
        try {
            fqp fqpVar = new fqp();
            fqpVar.c(this, str);
            return fqpVar;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return this.e;
    }
}
