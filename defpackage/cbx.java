package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cbx {
    public final String a;

    protected cbx(String str) {
        this.a = str;
    }

    public abstract void a(Level level, String str, Throwable th, String str2, Object... objArr);

    public abstract void b(String str);

    public final void e(String str) {
        a(Level.SEVERE, this.a, null, str, new Object[0]);
    }

    public final void f(Throwable th, String str) {
        a(Level.SEVERE, this.a, th, str, new Object[0]);
    }

    public final void g(String str, Object... objArr) {
        a(Level.INFO, this.a, null, str, objArr);
    }

    public final void h(String str) {
        a(Level.WARNING, this.a, null, str, new Object[0]);
    }

    public final void i(String str, Object... objArr) {
        a(Level.WARNING, this.a, null, str, objArr);
    }

    public final void j(Throwable th, String str) {
        a(Level.WARNING, this.a, th, str, new Object[0]);
    }

    public final void k(Throwable th, String str, Object... objArr) {
        a(Level.WARNING, this.a, th, str, objArr);
    }
}
