package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cat {
    public final AtomicBoolean a = new AtomicBoolean();
    public HashMap b = null;
    private final HashMap e = new HashMap(16, 1.0f);
    private final HashMap f = new HashMap(16, 1.0f);
    public final HashMap c = new HashMap(16, 1.0f);
    private final HashMap g = new HashMap(16, 1.0f);
    public Object d = null;
    private boolean h = false;
    private final String[] i = new String[0];
    private final up j = new up(null);

    public static final void b(ContentResolver contentResolver) {
        if (contentResolver == null) {
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
    }

    public final void a(ContentResolver contentResolver) {
        if (this.b == null) {
            this.a.set(false);
            this.b = new HashMap(16, 1.0f);
            this.d = new Object();
            contentResolver.registerContentObserver(cap.a, true, new car(this));
            return;
        }
        if (this.a.getAndSet(false)) {
            this.b.clear();
            this.e.clear();
            this.f.clear();
            this.c.clear();
            this.g.clear();
            this.d = new Object();
            this.h = false;
        }
    }

    public final String c(ContentResolver contentResolver, String str) throws cas {
        String string;
        b(contentResolver);
        synchronized (this) {
            a(contentResolver);
            Object obj = this.d;
            String str2 = null;
            if (this.b.containsKey(str)) {
                String str3 = (String) this.b.get(str);
                if (str3 != null) {
                    str2 = str3;
                }
                return str2;
            }
            try {
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(cap.a);
                try {
                    if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                        throw new cas("Unable to acquire ContentProviderClient");
                    }
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(cap.a, null, null, new String[]{str}, null);
                        try {
                            if (cursorQuery == null) {
                                throw new cas("ContentProvider query returned null cursor");
                            }
                            if (cursorQuery.moveToFirst()) {
                                string = cursorQuery.getString(1);
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } else {
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                                string = null;
                            }
                            if (string != null && string.equals(null)) {
                                string = null;
                            }
                            synchronized (this) {
                                if (obj == this.d) {
                                    this.b.put(str, string);
                                }
                            }
                            if (string != null) {
                                return string;
                            }
                            return null;
                        } finally {
                        }
                    } catch (RemoteException e) {
                        throw new cas(e);
                    }
                } catch (Throwable th) {
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    throw th;
                }
            } catch (cas unused) {
                return null;
            }
        }
    }
}
