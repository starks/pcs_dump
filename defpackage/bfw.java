package defpackage;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bfw {
    public static volatile int a = -1;
    public static final byi[] b = new byi[0];
    public static final String[] c = new String[0];

    @Deprecated
    public static final fcy m;
    private static final bfe n;
    private static final yt o;
    public final bgt d;
    public final Context e;
    protected final bgb f;
    protected final String g;
    public final String h;
    public final bgw i;
    protected final bnc j;
    public final int k;
    protected final yt l;

    static {
        bfe bfeVar = new bfe(null, null);
        n = bfeVar;
        bfu bfuVar = new bfu();
        o = bfuVar;
        m = new fcy("ClearcutLogger.API", bfuVar, bfeVar);
    }

    protected bfw(Context context, String str, bgw bgwVar, csg csgVar) {
        if (!bgwVar.a(bgx.ACCOUNT_NAME)) {
            aso.z(true, "Upload account name cannot be used with a deidentified or pseudonymous logger.");
        }
        b(bgwVar);
        this.e = context.getApplicationContext();
        this.h = context.getPackageName();
        this.g = "BRELLA";
        this.i = bgwVar;
        this.k = eiy.a;
        this.f = new bhc(context, csgVar);
        this.j = bnc.a;
        this.d = new bhk(context);
        this.l = new yt();
    }

    static final String a(Iterable iterable) {
        return new brb(", ").o(iterable);
    }

    static final void b(bgw bgwVar) {
        if (!bgwVar.equals(bgw.c) && !bgwVar.equals(bgw.a) && !bgwVar.equals(bgw.b)) {
            throw new IllegalArgumentException("piiLevelSet must be one of ZWIEBACK_ONLY, NO_RESTRICTIONS, or DEIDENTIFIED");
        }
    }

    public static final int[] d(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            iArr[i2] = ((Integer) arrayList.get(i)).intValue();
            i++;
            i2++;
        }
        return iArr;
    }

    public final boolean c() {
        return this.i.equals(bgw.b);
    }
}
