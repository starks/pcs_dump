package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class czn extends cze {
    private static final daa b = new daa((char[]) null);

    public czn(dbc dbcVar) {
        super(dbcVar);
    }

    @Deprecated
    public static czn j(String str) {
        cnx.U(!str.isEmpty(), "injected class name is empty");
        return new czn(dca.d(str.replace('/', '.')));
    }

    @Override // defpackage.cze
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final czl a(Level level) {
        boolean zH = h(level);
        dca.n(f(), level, zH);
        return !zH ? b : new czm(this, level);
    }
}
