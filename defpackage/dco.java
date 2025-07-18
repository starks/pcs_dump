package defpackage;

import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dco implements dcf {
    public final String a;
    public final boolean b;
    public final dba c;
    public final Level d;
    public final Set e;
    public final dbn f;

    public dco(boolean z, dba dbaVar, Level level, Set set, dbn dbnVar) {
        this.a = "";
        this.b = z;
        this.c = dbaVar;
        this.d = level;
        this.e = set;
        this.f = dbnVar;
    }

    @Override // defpackage.dcf
    public final dbc a(String str) {
        return new dcq(str, this.b, this.c, this.d, this.e, this.f);
    }

    private dco() {
        this(true, dbb.NO_OP, Level.ALL, dcq.a, dcq.b);
    }
}
