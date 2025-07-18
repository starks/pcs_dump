package defpackage;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dlg {
    private static final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public static dlf a(String str) throws GeneralSecurityException {
        Iterator it = a.iterator();
        while (it.hasNext()) {
            dlf dlfVar = (dlf) it.next();
            if (dlfVar.b(str)) {
                return dlfVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
