package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ceb {
    public final ContentResolver b;
    public final Uri c;
    public volatile Map e;
    private final Runnable h;
    private ContentObserver i;
    private static final Map g = new nv();
    public static final String[] a = {"key", "value"};
    public final Object d = new Object();
    public final List f = new ArrayList();

    private ceb(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        contentResolver.getClass();
        uri.getClass();
        this.b = contentResolver;
        this.c = uri;
        this.h = runnable;
        this.i = new cea(this);
    }

    public static ceb a(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        ceb cebVar;
        synchronized (ceb.class) {
            Map map = g;
            cebVar = (ceb) map.get(uri);
            if (cebVar == null) {
                try {
                    ceb cebVar2 = new ceb(contentResolver, uri, runnable);
                    try {
                        contentResolver.registerContentObserver(uri, false, cebVar2.i);
                        map.put(uri, cebVar2);
                    } catch (SecurityException unused) {
                    }
                    cebVar = cebVar2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return cebVar;
    }

    static synchronized void b() {
        for (ceb cebVar : g.values()) {
            cebVar.b.unregisterContentObserver(cebVar.i);
        }
        g.clear();
    }
}
