package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class das extends daq {
    public das(dbc dbcVar) {
        super(dbcVar);
    }

    public static das k(String str) {
        return new das(dca.d(str));
    }

    @Override // defpackage.cze
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final dap a(Level level) {
        boolean zH = h(level);
        dca.n(f(), level, zH);
        return !zH ? b : new dar(this, level);
    }
}
