package defpackage;

import java.lang.ref.ReferenceQueue;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cug implements cuj {
    final Object a;

    public cug(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.cuj
    public final int a() {
        return 1;
    }

    @Override // defpackage.cuj
    public final cuv c() {
        return null;
    }

    @Override // defpackage.cuj
    public final Object d() {
        return this.a;
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
    public final Object get() {
        return this.a;
    }

    @Override // defpackage.cuj
    public final void e(Object obj) {
    }

    @Override // defpackage.cuj
    public final cuj b(ReferenceQueue referenceQueue, Object obj, cuv cuvVar) {
        return this;
    }
}
