package defpackage;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fse {
    public static final fwv g = new fwv();
    public final fpw a;
    public final fsc b;
    public List c;
    public int d;
    public List e;
    public final List f;
    private final fqm h;
    private final frw i;

    public fse(fpw fpwVar, fsc fscVar, frw frwVar, fqm fqmVar) {
        List listN;
        this.a = fpwVar;
        this.b = fscVar;
        this.i = frwVar;
        this.h = fqmVar;
        fgm fgmVar = fgm.a;
        this.c = fgmVar;
        this.e = fgmVar;
        this.f = new ArrayList();
        URI uriE = fpwVar.h.e();
        if (uriE.getHost() == null) {
            listN = frh.n(Proxy.NO_PROXY);
        } else {
            List<Proxy> listSelect = fpwVar.g.select(uriE);
            listN = (listSelect == null || listSelect.isEmpty()) ? frh.n(Proxy.NO_PROXY) : frh.o(listSelect);
        }
        this.c = listN;
        this.d = 0;
        listN.getClass();
    }

    public final boolean a() {
        return b() || !this.f.isEmpty();
    }

    public final boolean b() {
        return this.d < this.c.size();
    }
}
