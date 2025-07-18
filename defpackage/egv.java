package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class egv implements Iterator {
    private final ArrayDeque a;
    private edx b;

    public egv(eea eeaVar) {
        if (!(eeaVar instanceof egw)) {
            this.a = null;
            this.b = (edx) eeaVar;
            return;
        }
        egw egwVar = (egw) eeaVar;
        ArrayDeque arrayDeque = new ArrayDeque(egwVar.g);
        this.a = arrayDeque;
        arrayDeque.push(egwVar);
        this.b = b(egwVar.e);
    }

    private final edx b(eea eeaVar) {
        while (eeaVar instanceof egw) {
            egw egwVar = (egw) eeaVar;
            this.a.push(egwVar);
            int[] iArr = egw.a;
            eeaVar = egwVar.e;
        }
        return (edx) eeaVar;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final edx next() {
        edx edxVarB;
        edx edxVar = this.b;
        if (edxVar == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.a;
            edxVarB = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            egw egwVar = (egw) this.a.pop();
            int[] iArr = egw.a;
            edxVarB = b(egwVar.f);
        } while (edxVarB.w());
        this.b = edxVarB;
        return edxVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
