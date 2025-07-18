package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class egu extends edt {
    final egv a;
    edw b = b();
    final /* synthetic */ egw c;

    public egu(egw egwVar) {
        this.c = egwVar;
        this.a = new egv(egwVar);
    }

    private final edw b() {
        egv egvVar = this.a;
        if (egvVar.hasNext()) {
            return egvVar.next().iterator();
        }
        return null;
    }

    @Override // defpackage.edw
    public final byte a() {
        edw edwVar = this.b;
        if (edwVar == null) {
            throw new NoSuchElementException();
        }
        byte bA = edwVar.a();
        if (!this.b.hasNext()) {
            this.b = b();
        }
        return bA;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }
}
