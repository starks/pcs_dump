package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fjl implements Serializable, fkj {
    public static final Object a = fjk.a;
    protected final Object b;
    public final String c;
    public final String d;
    private transient fkj e;
    private final Class f;
    private final boolean g;

    protected fjl(Object obj, Class cls, String str, String str2, boolean z) {
        this.b = obj;
        this.f = cls;
        this.c = str;
        this.d = str2;
        this.g = z;
    }

    public final fkj b() {
        fkj fkjVar = this.e;
        if (fkjVar != null) {
            return fkjVar;
        }
        fkj fkjVarC = c();
        this.e = fkjVarC;
        return fkjVarC;
    }

    protected abstract fkj c();

    public final fkl d() {
        Class cls = this.f;
        if (cls == null) {
            return null;
        }
        if (!this.g) {
            return fjy.b(cls);
        }
        fjp fjpVar = fjy.a;
        return new fju(cls);
    }

    @Override // defpackage.fkj
    public final Object e() {
        throw null;
    }
}
