package defpackage;

import java.io.IOException;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsa extends frk {
    final /* synthetic */ fsb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fsa(fsb fsbVar, String str) {
        super(str);
        this.d = fsbVar;
    }

    @Override // defpackage.frk
    public final long a() throws IOException {
        long jNanoTime = System.nanoTime();
        fsb fsbVar = this.d;
        Iterator it = fsbVar.d.iterator();
        it.getClass();
        long j = Long.MIN_VALUE;
        frz frzVar = null;
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            frz frzVar2 = (frz) it.next();
            frzVar2.getClass();
            synchronized (frzVar2) {
                byte[] bArr = frh.a;
                List list = frzVar2.j;
                int i3 = 0;
                while (true) {
                    if (i3 < list.size()) {
                        Reference reference = (Reference) list.get(i3);
                        if (reference.get() != null) {
                            i3++;
                        } else {
                            reference.getClass();
                            fup.c.g("A connection to " + frzVar2.a.a.h + " was leaked. Did you forget to close a response body?", ((fru) reference).a);
                            list.remove(i3);
                            frzVar2.l();
                            if (list.isEmpty()) {
                                frzVar2.k = jNanoTime - fsbVar.a;
                                break;
                            }
                        }
                    } else if (list.size() > 0) {
                        i2++;
                    }
                }
                i++;
                long j2 = jNanoTime - frzVar2.k;
                if (j2 > j) {
                    j = j2;
                }
                if (j2 > j) {
                    frzVar = frzVar2;
                }
            }
        }
        long j3 = fsbVar.a;
        if (j < j3 && i <= 5) {
            if (i > 0) {
                return j3 - j;
            }
            if (i2 <= 0) {
                return -1L;
            }
            return j3;
        }
        frzVar.getClass();
        synchronized (frzVar) {
            if (!frzVar.j.isEmpty()) {
                return 0L;
            }
            if (frzVar.k + j != jNanoTime) {
                return 0L;
            }
            frzVar.l();
            fsbVar.d.remove(frzVar);
            frh.s(frzVar.a());
            if (!fsbVar.d.isEmpty()) {
                return 0L;
            }
            fsbVar.b.a();
            return 0L;
        }
    }
}
