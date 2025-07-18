package defpackage;

import android.util.Base64;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class cgt implements cgu {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ cgt(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [cgu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [cgu, java.lang.Object] */
    @Override // defpackage.cgu
    public final Object a(Object obj) {
        int i = this.b;
        if (i == 0) {
            return (Double) ((Class) this.a).cast(obj);
        }
        if (i == 1) {
            return (Long) ((Class) this.a).cast(obj);
        }
        if (i == 2) {
            return this.a.a(Base64.decode((String) obj, 3));
        }
        if (i != 3) {
            return i != 4 ? (String) ((Class) this.a).cast(obj) : (Boolean) ((Class) this.a).cast(obj);
        }
        return this.a.a((byte[]) obj);
    }
}
