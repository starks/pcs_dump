package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dce implements dcf {
    private final String a;
    private final dba b;

    public dce() {
        dbb dbbVar = dbb.NO_OP;
        this.a = "";
        this.b = dbbVar;
    }

    @Override // defpackage.dcf
    public final dbc a(String str) {
        return new dcp(str, true, this.b, Level.ALL, true, dcq.a, dcq.b);
    }
}
