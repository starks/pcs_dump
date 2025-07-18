package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cub extends SoftReference implements cuj {
    final cuv a;

    public cub(ReferenceQueue referenceQueue, Object obj, cuv cuvVar) {
        super(obj, referenceQueue);
        this.a = cuvVar;
    }

    @Override // defpackage.cuj
    public final int a() {
        return 1;
    }

    @Override // defpackage.cuj
    public final cuj b(ReferenceQueue referenceQueue, Object obj, cuv cuvVar) {
        return new cub(referenceQueue, obj, cuvVar);
    }

    @Override // defpackage.cuj
    public final cuv c() {
        return this.a;
    }

    @Override // defpackage.cuj
    public final Object d() {
        return get();
    }

    @Override // defpackage.cuj
    public final boolean f() {
        return true;
    }

    @Override // defpackage.cuj
    public final boolean g() {
        return false;
    }

    @Override // defpackage.cuj
    public final void e(Object obj) {
    }
}
