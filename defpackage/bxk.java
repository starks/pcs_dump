package defpackage;

import java.net.URI;
import java.net.URISyntaxException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxk implements ccr {
    private static final cxo a = new cyz("app");
    private final bqm b;
    private final String c;
    private final bsp d;

    public bxk(bqm bqmVar, String str, bsp bspVar) {
        this.b = bqmVar;
        this.c = str;
        this.d = bspVar;
    }

    @Override // defpackage.ccr
    public final bxq a(ebs ebsVar, dzi dziVar, dfa dfaVar) throws ccq {
        String str = ebsVar.c;
        edl edlVar = ebsVar.b;
        if (edlVar == null) {
            edlVar = edl.a;
        }
        edl edlVar2 = edlVar;
        edl edlVar3 = ebsVar.d;
        if (edlVar3 == null) {
            edlVar3 = edl.a;
        }
        eea byteString = edlVar3.toByteString();
        try {
            URI uri = new URI(str);
            String scheme = uri.getScheme();
            if (scheme == null || !a.contains(scheme) || uri.getFragment() != null || uri.getQuery() != null) {
                this.b.l(ccj.L, this.c);
                throw new ccq(String.format("URI invalid: appId=%s, collectionUri=%s", this.c, str));
            }
            String authority = uri.getAuthority();
            if ("app".equals(scheme) && !clq.O(authority) && !this.c.equals(authority)) {
                this.b.l(ccj.F, this.c);
                throw new ccq(String.format("collection_uri authority segment mismatches training task's app: %s vs %s", authority, this.c));
            }
            String rawPath = uri.getRawPath();
            if (!"app".equals(scheme)) {
                throw new RuntimeException("Unexpected scheme: ".concat(scheme));
            }
            this.b.l(ccj.H, this.c);
            if (!"com.google.android.gms".equals(this.c)) {
                return this.d.a(rawPath, edlVar2, byteString, dfaVar, null, dziVar);
            }
            String strD = bxr.d(rawPath);
            if (strD != null) {
                this.b.k(ccj.eH);
                return this.d.a(rawPath, edlVar2, byteString, dfaVar, strD, dziVar);
            }
            this.b.k(ccj.eG);
            throw new ccq("invalid collection for GMS Core hosted example store, must match /<module name>/<collection name>: ".concat(String.valueOf(rawPath)));
        } catch (URISyntaxException e) {
            this.b.l(ccj.L, this.c);
            throw new ccq(String.format("URI invalid: appId=%s, collectionUri=%s", this.c, str), e);
        }
    }
}
