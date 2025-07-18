package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eqj implements Comparator {
    final /* synthetic */ eqk a;

    public eqj(eqk eqkVar) {
        this.a = eqkVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        eqk eqkVar = this.a;
        int iA = eqkVar.a(obj) - eqkVar.a(obj2);
        return iA != 0 ? iA : obj.getClass().getName().compareTo(obj2.getClass().getName());
    }
}
