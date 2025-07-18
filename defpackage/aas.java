package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aas {
    public int c;
    public final Context d;
    public boolean e = false;
    public boolean f = false;
    public boolean g = true;
    public boolean h = false;
    public aal i;

    public aas(Context context) {
        this.d = context.getApplicationContext();
    }

    public static final String j(Object obj) {
        StringBuilder sb = new StringBuilder(64);
        if (obj == null) {
            sb.append("null");
        } else {
            sb.append(obj.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
            sb.append("}");
        }
        return sb.toString();
    }

    public void i() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" id=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }

    protected void b() {
    }

    public void f() {
    }

    public void g() {
    }
}
