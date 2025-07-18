package defpackage;

import com.google.android.apps.aicore.aidl.AIFeature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fqp {
    public static final fwv i = new fwv();
    public String a;
    public String d;
    public final List f;
    public List g;
    public String h;
    public String b = "";
    public String c = "";
    public int e = -1;

    public fqp() {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        arrayList.add("");
    }

    private final int d() {
        int i2 = this.e;
        if (i2 != -1) {
            return i2;
        }
        char[] cArr = fqq.a;
        String str = this.a;
        str.getClass();
        return fwv.C(str);
    }

    public final fqq a() {
        ArrayList arrayList;
        String str = this.a;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        char[] cArr = fqq.a;
        String strD = fwv.D(this.b, 0, 0, false, 7);
        String strD2 = fwv.D(this.c, 0, 0, false, 7);
        String str2 = this.d;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int iD = d();
        List list = this.f;
        ArrayList arrayList2 = new ArrayList(ffh.Q(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(fwv.D((String) it.next(), 0, 0, false, 7));
        }
        List<String> list2 = this.g;
        if (list2 != null) {
            arrayList = new ArrayList(ffh.Q(list2));
            for (String str3 : list2) {
                arrayList.add(str3 != null ? fwv.D(str3, 0, 0, true, 3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = this.h;
        return new fqq(str, strD, strD2, str2, iD, arrayList, str4 != null ? fwv.D(str4, 0, 0, false, 7) : null, toString());
    }

    public final void b(String str) {
        this.g = str != null ? fwv.E(fwv.I(fqq.g, str, 0, 0, " \"'<>#", true, false, true, false, AIFeature.Id.AIAI_ZERO_STATE_TEXT_ONLY_EE0)) : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.fqq r26, java.lang.String r27) throws java.lang.NumberFormatException, java.io.EOFException {
        /*
            Method dump skipped, instructions count: 939
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fqp.c(fqq, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fqp.toString():java.lang.String");
    }
}
