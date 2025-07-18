package defpackage;

import android.util.Log;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcq extends dcd {
    public static final Set a;
    public static final dbn b;
    public static final dco c;
    private final String d;
    private final dba e;
    private final Level f;
    private final Set g;
    private final dbn h;

    static {
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(czr.a, dat.a, dau.a)));
        a = setUnmodifiableSet;
        dbn dbnVarA = dbq.a(setUnmodifiableSet);
        b = dbnVarA;
        c = new dco(true, dbb.NO_OP, Level.ALL, setUnmodifiableSet, dbnVarA);
    }

    public dcq(String str, boolean z, dba dbaVar, Level level, Set set, dbn dbnVar) {
        super(str);
        this.d = dcr.e(str, z);
        this.e = dbaVar;
        this.f = level;
        this.g = set;
        this.h = dbnVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(defpackage.daz r4, java.lang.String r5, defpackage.dba r6, java.util.logging.Level r7, java.util.Set r8, defpackage.dbn r9) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcq.e(daz, java.lang.String, dba, java.util.logging.Level, java.util.Set, dbn):void");
    }

    @Override // defpackage.dbc
    public final void c(daz dazVar) {
        e(dazVar, this.d, this.e, this.f, this.g, this.h);
    }

    @Override // defpackage.dbc
    public final boolean d(Level level) {
        String str = this.d;
        int iD = dcr.d(level);
        return Log.isLoggable(str, iD) || Log.isLoggable("all", iD);
    }
}
