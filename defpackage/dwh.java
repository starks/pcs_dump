package defpackage;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dwh implements dwi {
    private final dwl a;
    private final /* synthetic */ int b;

    public dwh(dwl dwlVar, int i) {
        this.b = i;
        this.a = dwlVar;
    }

    @Override // defpackage.dwi
    public final Object a(String str) throws GeneralSecurityException {
        int i = this.b;
        Exception exc = null;
        if (i == 0) {
            return this.a.a(str, null);
        }
        if (i == 1) {
            Iterator it = dwj.b("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
            while (it.hasNext()) {
                try {
                    return this.a.a(str, (Provider) it.next());
                } catch (Exception unused) {
                }
            }
            return this.a.a(str, null);
        }
        Iterator it2 = dwj.b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
        while (it2.hasNext()) {
            try {
                return this.a.a(str, (Provider) it2.next());
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
