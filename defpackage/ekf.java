package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ekf {
    public final Object a;

    public ekf(Object obj) {
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Set] */
    public final void a() {
        if (ebq.b == null) {
            ebq.b = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() != ebq.b) {
            throw new IllegalStateException("Must be called on the Main thread.");
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ekh) it.next()).a();
        }
    }

    public final int b() {
        long j = ((fow) ((fli) this.a).a).b.b;
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final Object c() {
        while (true) {
            fow fowVar = (fow) ((fli) this.a).a;
            Object objB = fowVar.b();
            if (objB != fow.a) {
                return objB;
            }
            ((fli) this.a).d(fowVar, fowVar.c());
        }
    }

    public final void d() {
        while (true) {
            fow fowVar = (fow) ((fli) this.a).a;
            if (fowVar.d()) {
                return;
            }
            ((fli) this.a).d(fowVar, fowVar.c());
        }
    }

    public final boolean e(Object obj) {
        while (true) {
            fow fowVar = (fow) ((fli) this.a).a;
            int iA = fowVar.a(obj);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return false;
            }
            ((fli) this.a).d(fowVar, fowVar.c());
        }
    }

    public final fli f(int i) {
        return ((fli[]) this.a)[i];
    }

    public ekf() {
        this.a = new HashSet();
    }

    public ekf(byte[] bArr, byte[] bArr2) {
        this.a = new HashMap();
    }

    public ekf(byte[] bArr) {
        this.a = new LinkedHashMap();
    }

    public ekf(char[] cArr, byte[] bArr) {
        this.a = new ArrayList(20);
    }

    public ekf(int i) {
        fli[] fliVarArr = new fli[i];
        for (int i2 = 0; i2 < i; i2++) {
            fliVarArr[i2] = fjp.v(null);
        }
        this.a = fliVarArr;
    }

    public ekf(byte[] bArr, char[] cArr) {
        this.a = fjp.v(new fow(8, false));
    }

    public ekf(char[] cArr) {
        this((byte[]) null, (char[]) null);
    }

    public ekf(Context context, byte[] bArr) {
        fwq fwqVar;
        Bundle bundle;
        ServiceInfo serviceInfo;
        Bundle bundle2;
        new fwk("CronetEngine#createBuilderDelegate");
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            ArrayList arrayList = new ArrayList(fwn.c(context));
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (!((fwm) it.next()).a.d()) {
                        it.remove();
                    }
                }
                if (!arrayList.isEmpty()) {
                    Collections.sort(arrayList, new it(7));
                    fwm fwmVar = (fwm) arrayList.get(0);
                    int i = fwmVar.b;
                    String str = fwr.a;
                    synchronized (fwr.class) {
                        if (fwr.b == null) {
                            boolean z = i == 3;
                            Context applicationContext = context.getApplicationContext();
                            synchronized (fws.a) {
                                if (applicationContext != fws.b) {
                                    new fwk("CronetManifest#getMetaData fetching info");
                                    try {
                                        try {
                                            serviceInfo = applicationContext.getPackageManager().getServiceInfo(new ComponentName(applicationContext, "android.net.http.MetaDataHolder"), 787072);
                                        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                                            serviceInfo = null;
                                        }
                                        if (serviceInfo != null && serviceInfo.metaData != null) {
                                            bundle2 = serviceInfo.metaData;
                                        } else {
                                            bundle2 = new Bundle();
                                        }
                                        fws.c = bundle2;
                                        fws.b = applicationContext;
                                        Trace.endSection();
                                    } finally {
                                    }
                                }
                                bundle = fws.c;
                            }
                            if (bundle.getBoolean("android.net.http.EnableTelemetry", z)) {
                                try {
                                    fwr.b = new fwu();
                                } catch (Exception e) {
                                    Log.e(fwr.a, "Exception creating an instance of CronetLoggerImpl", e);
                                }
                            }
                        }
                        if (fwr.b == null) {
                            fwr.b = new fwt();
                        }
                        fwqVar = fwr.b;
                    }
                    fwo fwoVar = new fwo();
                    try {
                        fwoVar.b = false;
                        fwoVar.e = 1;
                        fwoVar.f = fwmVar.b;
                        fwoVar.d = Process.myUid();
                        fwoVar.c = new fwp("133.0.6876.3");
                        Object obj = fwmVar.a.e().a;
                        throw null;
                    } catch (Throwable th) {
                        fwoVar.a = (int) (SystemClock.uptimeMillis() - jUptimeMillis);
                        fwqVar.a(fwoVar);
                        throw th;
                    }
                }
                throw new RuntimeException("All available Cronet providers are disabled. A provider should be enabled before it can be used.");
            }
            throw new RuntimeException("Unable to find any Cronet provider. Have you included all necessary jars?");
        } catch (Throwable th2) {
            try {
                Trace.endSection();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
