package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aez {
    public final aey a;
    public boolean c;
    public Bundle d;
    public boolean e;
    private final fin h;
    public final uq g = new uq(null);
    public final Map b = new LinkedHashMap();
    public boolean f = true;

    public aez(aey aeyVar, fin finVar) {
        this.a = aeyVar;
        this.h = finVar;
    }

    public final void a() {
        if (this.a.E().a() != yv.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.c) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.h.a();
        this.a.E().b(new lt(this, 4));
        this.c = true;
    }
}
