package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fdn {
    public static final fvn a = fvn.g(":");
    public static final fdk[] b = {new fdk(fdk.e, ""), new fdk(fdk.b, "GET"), new fdk(fdk.b, "POST"), new fdk(fdk.c, "/"), new fdk(fdk.c, "/index.html"), new fdk(fdk.d, "http"), new fdk(fdk.d, "https"), new fdk(fdk.a, "200"), new fdk(fdk.a, "204"), new fdk(fdk.a, "206"), new fdk(fdk.a, "304"), new fdk(fdk.a, "400"), new fdk(fdk.a, "404"), new fdk(fdk.a, "500"), new fdk("accept-charset", ""), new fdk("accept-encoding", "gzip, deflate"), new fdk("accept-language", ""), new fdk("accept-ranges", ""), new fdk("accept", ""), new fdk("access-control-allow-origin", ""), new fdk("age", ""), new fdk("allow", ""), new fdk("authorization", ""), new fdk("cache-control", ""), new fdk("content-disposition", ""), new fdk("content-encoding", ""), new fdk("content-language", ""), new fdk("content-length", ""), new fdk("content-location", ""), new fdk("content-range", ""), new fdk("content-type", ""), new fdk("cookie", ""), new fdk("date", ""), new fdk("etag", ""), new fdk("expect", ""), new fdk("expires", ""), new fdk("from", ""), new fdk("host", ""), new fdk("if-match", ""), new fdk("if-modified-since", ""), new fdk("if-none-match", ""), new fdk("if-range", ""), new fdk("if-unmodified-since", ""), new fdk("last-modified", ""), new fdk("link", ""), new fdk("location", ""), new fdk("max-forwards", ""), new fdk("proxy-authenticate", ""), new fdk("proxy-authorization", ""), new fdk("range", ""), new fdk("referer", ""), new fdk("refresh", ""), new fdk("retry-after", ""), new fdk("server", ""), new fdk("set-cookie", ""), new fdk("strict-transport-security", ""), new fdk("transfer-encoding", ""), new fdk("user-agent", ""), new fdk("vary", ""), new fdk("via", ""), new fdk("www-authenticate", "")};
    public static final Map c;

    static {
        int i = 0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        while (true) {
            fdk[] fdkVarArr = b;
            int length = fdkVarArr.length;
            if (i >= 61) {
                c = DesugarCollections.unmodifiableMap(linkedHashMap);
                return;
            } else {
                if (!linkedHashMap.containsKey(fdkVarArr[i].f)) {
                    linkedHashMap.put(fdkVarArr[i].f, Integer.valueOf(i));
                }
                i++;
            }
        }
    }

    public static void a(fvn fvnVar) throws IOException {
        int iB = fvnVar.b();
        for (int i = 0; i < iB; i++) {
            byte bA = fvnVar.a(i);
            if (bA >= 65 && bA <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(fvnVar.e()));
            }
        }
    }
}
