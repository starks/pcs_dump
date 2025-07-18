package defpackage;

import android.os.Binder;
import android.provider.DeviceConfig;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aok extends anz {
    public static final czn a = czn.j("com/google/android/apps/miphone/astrea/common/config/impl/DeviceFlagManager");
    public static final Object b = new Object();
    public static final ekb c = new ekb((byte[]) null, (byte[]) null, (byte[]) null);
    public final fcy d = new fcy(diy.a);
    private final String e;
    private final fuu f;

    public aok(aog aogVar, Executor executor, fuu fuuVar) {
        this.e = aogVar.e;
        this.f = fuuVar;
        String str = aogVar.e;
        DeviceConfig.OnPropertiesChangedListener onPropertiesChangedListener = new DeviceConfig.OnPropertiesChangedListener() { // from class: aoj
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.concurrent.Executor] */
            /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.concurrent.Executor] */
            public final void onPropertiesChanged(DeviceConfig.Properties properties) {
                fuu fuuVar2 = new fuu(cxc.o(properties.getKeyset()));
                fcy fcyVar = this.a.d;
                synchronized (fcyVar.a) {
                    Iterator it = ((CopyOnWriteArrayList) fcyVar.a).iterator();
                    while (it.hasNext()) {
                        fcyVar.b.execute(new o(fuuVar2, it.next(), 18, (byte[]) null));
                    }
                }
                synchronized (fcyVar.c) {
                    Iterator it2 = ((CopyOnWriteArrayList) fcyVar.c).iterator();
                    while (it2.hasNext()) {
                        WeakReference weakReference = (WeakReference) it2.next();
                        if (weakReference.get() != null) {
                            fcyVar.b.execute(new o(fuuVar2, weakReference, 19, (byte[]) null));
                        }
                    }
                    int size = ((CopyOnWriteArrayList) fcyVar.c).size();
                    while (true) {
                        size--;
                        if (size >= 0) {
                            if (((WeakReference) ((CopyOnWriteArrayList) fcyVar.c).get(size)).get() == null) {
                                ((CopyOnWriteArrayList) fcyVar.c).remove(size);
                            }
                        }
                    }
                }
            }
        };
        if (fuuVar.t()) {
            DeviceConfig.addOnPropertiesChangedListener(str, executor, onPropertiesChangedListener);
        }
    }

    @Override // defpackage.anz
    public final String d(String str) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            return !this.f.t() ? null : DeviceConfig.getProperty(this.e, str);
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }
}
