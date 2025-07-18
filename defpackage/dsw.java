package defpackage;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dsw implements dse {
    public static final dsw a = new dsw();

    private dsw() {
    }

    @Override // defpackage.dse
    public final Class a() {
        return dsu.class;
    }

    @Override // defpackage.dse
    public final Class b() {
        return dsu.class;
    }

    @Override // defpackage.dse
    public final /* bridge */ /* synthetic */ Object c(fpv fpvVar) throws GeneralSecurityException {
        if (fpvVar.d == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        Iterator it = fpvVar.d().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
            }
        }
        return new dsv();
    }
}
