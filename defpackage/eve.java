package defpackage;

import java.net.InetSocketAddress;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eve extends epp {
    private static final boolean a = fjp.K(eve.class.getClassLoader());

    @Override // defpackage.epk
    public final epo a(URI uri, epi epiVar) {
        if (!"dns".equals(uri.getScheme())) {
            return null;
        }
        String path = uri.getPath();
        path.getClass();
        clq.D(path.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", path, uri);
        String strSubstring = path.substring(1);
        uri.getAuthority();
        return new evd(strSubstring, epiVar, evt.o, new csf(), a);
    }

    @Override // defpackage.epk
    public final String b() {
        return "dns";
    }

    @Override // defpackage.epp
    public final Collection c() {
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override // defpackage.epp
    protected final void d() {
    }

    @Override // defpackage.epp
    public final void e() {
    }
}
