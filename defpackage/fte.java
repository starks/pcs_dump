package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fte {
    public static final fte a = new fte();
    public static final ftb[] b = {new ftb(ftb.f, ""), new ftb(ftb.c, "GET"), new ftb(ftb.c, "POST"), new ftb(ftb.d, "/"), new ftb(ftb.d, "/index.html"), new ftb(ftb.e, "http"), new ftb(ftb.e, "https"), new ftb(ftb.b, "200"), new ftb(ftb.b, "204"), new ftb(ftb.b, "206"), new ftb(ftb.b, "304"), new ftb(ftb.b, "400"), new ftb(ftb.b, "404"), new ftb(ftb.b, "500"), new ftb("accept-charset", ""), new ftb("accept-encoding", "gzip, deflate"), new ftb("accept-language", ""), new ftb("accept-ranges", ""), new ftb("accept", ""), new ftb("access-control-allow-origin", ""), new ftb("age", ""), new ftb("allow", ""), new ftb("authorization", ""), new ftb("cache-control", ""), new ftb("content-disposition", ""), new ftb("content-encoding", ""), new ftb("content-language", ""), new ftb("content-length", ""), new ftb("content-location", ""), new ftb("content-range", ""), new ftb("content-type", ""), new ftb("cookie", ""), new ftb("date", ""), new ftb("etag", ""), new ftb("expect", ""), new ftb("expires", ""), new ftb("from", ""), new ftb("host", ""), new ftb("if-match", ""), new ftb("if-modified-since", ""), new ftb("if-none-match", ""), new ftb("if-range", ""), new ftb("if-unmodified-since", ""), new ftb("last-modified", ""), new ftb("link", ""), new ftb("location", ""), new ftb("max-forwards", ""), new ftb("proxy-authenticate", ""), new ftb("proxy-authorization", ""), new ftb("range", ""), new ftb("referer", ""), new ftb("refresh", ""), new ftb("retry-after", ""), new ftb("server", ""), new ftb("set-cookie", ""), new ftb("strict-transport-security", ""), new ftb("transfer-encoding", ""), new ftb("user-agent", ""), new ftb("vary", ""), new ftb("via", ""), new ftb("www-authenticate", "")};
    public static final Map c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            ftb[] ftbVarArr = b;
            if (!linkedHashMap.containsKey(ftbVarArr[i].g)) {
                linkedHashMap.put(ftbVarArr[i].g, Integer.valueOf(i));
            }
        }
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        c = mapUnmodifiableMap;
    }

    private fte() {
    }

    public static final void a(fvn fvnVar) throws IOException {
        int iB = fvnVar.b();
        for (int i = 0; i < iB; i++) {
            byte bA = fvnVar.a(i);
            if (bA >= 65 && bA < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(fvnVar.e()));
            }
        }
    }
}
