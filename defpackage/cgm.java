package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.widget.ListView;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgm {
    private static boolean d;
    public final int a;
    public final Object b;
    public final Object c;

    public cgm(bjq bjqVar, int i, biz bizVar) {
        this.c = bjqVar;
        this.a = i;
        this.b = bizVar;
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [csg, java.lang.Object] */
    public final void a() {
        synchronized (cgm.class) {
            if (!d) {
                chg chgVar = new chg(this, 1);
                long j = this.a;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                dke dkeVar = (dke) this.b.a();
                clq.r(dkeVar.schedule(new cgl(chgVar, dkeVar, j, timeUnit), j, timeUnit));
                d = true;
            }
        }
    }

    public final ListView b() {
        return ((jk) this.b).e;
    }

    public cgm(jn jnVar, ff ffVar, int i) {
        this.b = jnVar;
        this.c = ffVar;
        this.a = i;
    }

    public cgm(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.c = colorStateList;
        this.b = configuration;
        this.a = theme == null ? 0 : theme.hashCode();
    }

    public cgm(csg csgVar) {
        bzh bzhVar = new bzh(4);
        this.b = csgVar;
        this.a = Math.max(5, 10);
        this.c = bzhVar;
    }
}
