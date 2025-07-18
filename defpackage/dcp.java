package defpackage;

import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dcp extends dcd {
    private final String a;
    private final boolean b;
    private final dba c;
    private final Level d;
    private final boolean e;
    private final Set f;
    private final dbn g;

    public dcp(String str, boolean z, dba dbaVar, Level level, boolean z2, Set set, dbn dbnVar) {
        super(str);
        this.a = "";
        this.b = true;
        this.c = dbaVar;
        this.d = level;
        this.e = true;
        this.f = set;
        this.g = dbnVar;
    }

    @Override // defpackage.dbc
    public final void c(daz dazVar) {
        String strB = (String) dazVar.j().d(dat.a);
        if (strB == null) {
            strB = a();
        }
        if (strB == null) {
            strB = dazVar.f().b();
            int iIndexOf = strB.indexOf(36, strB.lastIndexOf(46));
            if (iIndexOf >= 0) {
                strB = strB.substring(0, iIndexOf);
            }
        }
        dcq.e(dazVar, dcr.e(strB, true), this.c, this.d, this.f, this.g);
    }

    @Override // defpackage.dbc
    public final boolean d(Level level) {
        return true;
    }
}
