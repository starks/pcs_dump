package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eb {
    public final List a;
    public final int[] b;
    public final int[] c;
    public final ea d;
    public final int e;
    public final int f;

    public eb(ea eaVar, List list, int[] iArr, int[] iArr2) {
        this.a = list;
        this.b = iArr;
        this.c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.d = eaVar;
        int iB = eaVar.b();
        this.e = iB;
        int iA = eaVar.a();
        this.f = iA;
        cql cqlVar = list.isEmpty() ? null : (cql) list.get(0);
        if (cqlVar == null || cqlVar.b != 0 || cqlVar.c != 0) {
            list.add(0, new cql(0, 0, 0, null, null));
        }
        list.add(new cql(iB, iA, 0, null, null));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cql cqlVar2 = (cql) it.next();
            for (int i = 0; i < cqlVar2.a; i++) {
                int i2 = cqlVar2.b + i;
                int i3 = cqlVar2.c + i;
                int i4 = true != this.d.c(i2, i3) ? 2 : 1;
                this.b[i2] = (i3 << 4) | i4;
                this.c[i3] = (i2 << 4) | i4;
            }
        }
        int iA2 = 0;
        for (cql cqlVar3 : this.a) {
            while (iA2 < cqlVar3.b) {
                if (this.b[iA2] == 0) {
                    int size = this.a.size();
                    int i5 = 0;
                    int iB2 = 0;
                    while (true) {
                        if (i5 < size) {
                            cql cqlVar4 = (cql) this.a.get(i5);
                            while (iB2 < cqlVar4.c) {
                                if (this.c[iB2] == 0 && this.d.d(iA2, iB2)) {
                                    int i6 = true != this.d.c(iA2, iB2) ? 4 : 8;
                                    this.b[iA2] = (iB2 << 4) | i6;
                                    this.c[iB2] = i6 | (iA2 << 4);
                                } else {
                                    iB2++;
                                }
                            }
                            iB2 = cqlVar4.b();
                            i5++;
                        }
                    }
                }
                iA2++;
            }
            iA2 = cqlVar3.a();
        }
    }

    public static ec a(Collection collection, int i, boolean z) {
        ec ecVar;
        Iterator it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                ecVar = null;
                break;
            }
            ecVar = (ec) it.next();
            if (ecVar.a == i && ecVar.c == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            ec ecVar2 = (ec) it.next();
            if (z) {
                ecVar2.b--;
            } else {
                ecVar2.b++;
            }
        }
        return ecVar;
    }
}
