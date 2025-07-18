package defpackage;

import android.app.Activity;
import android.app.Application;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejl implements ekj {
    protected final Activity a;
    private volatile Object b;
    private final Object c = new Object();
    private final ekj d;

    public ejl(Activity activity) {
        this.a = activity;
        this.d = new ejp((lx) activity);
    }

    public final ejh a() {
        return (ejh) this.d.aS();
    }

    @Override // defpackage.ekj
    public final Object aS() {
        if (this.b == null) {
            synchronized (this.c) {
                if (this.b == null) {
                    if (!(this.a.getApplication() instanceof ekj)) {
                        throw new IllegalStateException("Hilt Activity must be attached to an @HiltAndroidApp Application. ".concat(Application.class.equals(this.a.getApplication().getClass()) ? "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?" : "Found: ".concat(String.valueOf(String.valueOf(this.a.getApplication().getClass())))));
                    }
                    ala alaVarA = ((ejk) ebq.z(this.d, ejk.class)).a();
                    alaVarA.a = this.a;
                    this.b = new alh(alaVarA.b, alaVarA.c);
                }
            }
        }
        return this.b;
    }

    public final ekb c() {
        ejp ejpVar = (ejp) this.d;
        return ((ejn) ejpVar.a(ejpVar.a, ejpVar.b).a(ejn.class)).b;
    }
}
