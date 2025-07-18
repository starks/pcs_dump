package defpackage;

import j$.util.List;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fie extends fgf implements Serializable, List, java.util.List {
    private final Enum[] b;

    public fie(Enum[] enumArr) {
        this.b = enumArr;
    }

    private final Object writeReplace() {
        return new fif(this.b);
    }

    @Override // defpackage.fgb
    public final int a() {
        return this.b.length;
    }

    @Override // defpackage.fgb, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        r3.getClass();
        return ffh.aa(this.b, r3.ordinal()) == r3;
    }

    @Override // defpackage.fgf, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        ffh.ap(i, this.b.length);
        return this.b[i];
    }

    @Override // defpackage.fgf, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        r3.getClass();
        Enum[] enumArr = this.b;
        int iOrdinal = r3.ordinal();
        if (ffh.aa(enumArr, iOrdinal) == r3) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // defpackage.fgf, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r2 = (Enum) obj;
        r2.getClass();
        return indexOf(r2);
    }
}
