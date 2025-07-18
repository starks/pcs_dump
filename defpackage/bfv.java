package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfv {
    protected final Context a;
    protected final String b;
    protected csg c;
    protected bgw d;

    protected bfv(Context context, String str) {
        this.c = new bzh(1);
        this.d = bgw.a;
        aso.F(context);
        this.a = context;
        aso.E("BRELLA");
        this.b = "BRELLA";
    }

    public static /* synthetic */ Boolean b() {
        return false;
    }

    public final bfv a(bgw bgwVar) {
        aso.F(bgwVar);
        this.d = bgwVar;
        bfw.b(bgwVar);
        return this;
    }

    public final bga c() {
        return new bga(this.a, this.b, this.d, this.c, null);
    }

    public bfv(Context context, String str, byte[] bArr) {
        this(context, "BRELLA");
    }
}
