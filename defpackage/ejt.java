package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejt implements ekj {
    private volatile Object a;
    private final Object b = new Object();
    private final ab c;
    private final ejy d;

    public ejt(ab abVar) {
        this.c = abVar;
        this.d = new ejy(abVar);
    }

    public static final Context a(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    @Override // defpackage.ekj
    public final Object aS() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    if (this.c.G() == null) {
                        throw new NullPointerException("Hilt Fragments must be attached before creating the component.");
                    }
                    ebq.v(this.c.G() instanceof ekj, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", this.c.G().getClass());
                    alb albVarA = ((ejs) ebq.z(this.c.G(), ejs.class)).a();
                    albVarA.b = this.d.aS();
                    albVarA.a = this.c;
                    ebq.r(albVarA.a, ab.class);
                    ebq.r(albVarA.b, eji.class);
                    this.a = new alk(albVarA.c, null);
                }
            }
        }
        return this.a;
    }
}
