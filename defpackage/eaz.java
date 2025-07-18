package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eaz {
    public boolean a;
    public String b;
    public Throwable c;
    public int d;
    private boolean e;

    public final void a() {
        this.e = true;
    }

    public final void b(String str, Object... objArr) {
        this.b = String.format(Locale.US, str, objArr);
    }
}
