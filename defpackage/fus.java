package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fus {
    public static final fus a = new fus();
    public static final CopyOnWriteArraySet b = new CopyOnWriteArraySet();
    public static final Map c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r1 = fqu.class.getPackage();
        String name = r1 != null ? r1.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(fqu.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(ftf.class.getName(), "okhttp.Http2");
        linkedHashMap.put(frn.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        c = ffh.w(linkedHashMap);
    }

    private fus() {
    }
}
