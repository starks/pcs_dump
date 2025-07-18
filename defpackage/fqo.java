package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fqo implements Iterable {
    public static final fwv a = new fwv();
    private final String[] b;

    public fqo(String[] strArr) {
        this.b = strArr;
    }

    public final int a() {
        return this.b.length >> 1;
    }

    public final String b(String str) {
        str.getClass();
        String[] strArr = this.b;
        int length = strArr.length - 2;
        int iY = fjp.y(length, 0, -2);
        if (iY <= length) {
            while (!fjz.q(str, strArr[length])) {
                if (length != iY) {
                    length -= 2;
                }
            }
            return strArr[length + 1];
        }
        return null;
    }

    public final String c(int i) {
        return this.b[i + i];
    }

    public final String d(int i) {
        return this.b[i + i + 1];
    }

    public final List e(String str) {
        str.getClass();
        int iA = a();
        ArrayList arrayList = null;
        for (int i = 0; i < iA; i++) {
            if (fjz.q(str, c(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(d(i));
            }
        }
        if (arrayList == null) {
            return fgm.a;
        }
        List listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fqo) && Arrays.equals(this.b, ((fqo) obj).b);
    }

    public final Set f() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        comparator.getClass();
        TreeSet treeSet = new TreeSet(comparator);
        int iA = a();
        for (int i = 0; i < iA; i++) {
            treeSet.add(c(i));
        }
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(treeSet);
        setUnmodifiableSet.getClass();
        return setUnmodifiableSet;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection] */
    public final fsc g() {
        fsc fscVar = new fsc((byte[]) null);
        ?? r1 = fscVar.a;
        String[] strArr = this.b;
        strArr.getClass();
        r1.addAll(ffh.W(strArr));
        return fscVar;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int iA = a();
        ffs[] ffsVarArr = new ffs[iA];
        for (int i = 0; i < iA; i++) {
            ffsVarArr[i] = new ffs(c(i), d(i));
        }
        return new fkr(ffsVarArr, 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int iA = a();
        for (int i = 0; i < iA; i++) {
            String strC = c(i);
            String strD = d(i);
            sb.append(strC);
            sb.append(": ");
            if (true == frh.x(strC)) {
                strD = "██";
            }
            sb.append(strD);
            sb.append("\n");
        }
        return sb.toString();
    }
}
