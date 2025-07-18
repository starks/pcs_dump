package defpackage;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpq {
    public static Boolean a = null;
    private static Boolean e = null;
    private static bps f = null;
    private static bpu g = null;
    private static String h = null;
    private static boolean i = false;
    private static int j = -1;
    private static Boolean k;
    public final Context d;
    private static final ThreadLocal l = new ThreadLocal();
    private static final ThreadLocal m = new bpi();
    private static final bpn n = new bpj();
    public static final bpp b = new bpk(1);
    public static final bpp c = new bpk(0);

    private bpq(Context context) {
        this.d = context;
    }

    public static int a(Context context, String str) throws NoSuchFieldException, ClassNotFoundException {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass(a.z(str, "com.google.android.gms.dynamite.descriptors.", ".ModuleDescriptor"));
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (a.g(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", a.z(str, "Local module descriptor class for ", " not found."));
            return 0;
        } catch (Exception e2) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x0151 A[Catch: all -> 0x01b6, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x01b6, blocks: (B:3:0x0002, B:53:0x00c1, B:55:0x00c7, B:61:0x00e9, B:83:0x0142, B:87:0x0151, B:108:0x01ae, B:109:0x01b1, B:103:0x01a5, B:59:0x00ce, B:113:0x01b5, B:4:0x0003, B:7:0x0009, B:8:0x0025, B:51:0x00be, B:19:0x0044, B:37:0x0084, B:40:0x0087, B:48:0x00a0, B:52:0x00c0, B:50:0x00a2), top: B:127:0x0002, inners: #0, #3 }] */
    /* JADX WARN: Type inference failed for: r0v36, types: [android.database.Cursor, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x01a3 -> B:128:0x01a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x01a5 -> B:128:0x01a8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int b(android.content.Context r10, java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpq.b(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARN: Type inference failed for: r1v18, types: [android.database.Cursor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.database.Cursor, java.lang.Object] */
    public static bpq d(Context context, bpp bppVar, String str) throws Throwable {
        long j2;
        bpo bpoVarA;
        int i2;
        bpq bpqVarF;
        Boolean bool;
        bpf bpfVarD;
        bpq bpqVar;
        bpu bpuVar;
        boolean z;
        Boolean boolValueOf;
        bpf bpfVarA;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new bpm("null application Context");
        }
        ThreadLocal threadLocal = l;
        ekb ekbVar = (ekb) threadLocal.get();
        ekb ekbVar2 = new ekb((byte[]) null);
        threadLocal.set(ekbVar2);
        ThreadLocal threadLocal2 = m;
        Long l2 = (Long) threadLocal2.get();
        long jLongValue = l2.longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.uptimeMillis()));
            bpoVarA = bppVar.a(context, str, n);
            i2 = bpoVarA.a;
            j2 = jLongValue;
        } catch (Throwable th) {
            th = th;
            j2 = jLongValue;
        }
        try {
            Log.i("DynamiteModule", "Considering local module " + str + ":" + i2 + " and remote module " + str + ":" + bpoVarA.b);
            int i3 = bpoVarA.c;
            if (i3 == 0 || ((i3 == -1 && bpoVarA.a == 0) || (i3 == 1 && bpoVarA.b == 0))) {
                throw new bpm("No acceptable module " + str + " found. Local version is " + bpoVarA.a + " and remote version is " + bpoVarA.b + ".");
            }
            if (i3 == -1) {
                bpqVarF = f(applicationContext, str);
            } else {
                if (i3 != 1) {
                    throw new bpm(a.x(0, "VersionPolicy returned invalid code:"));
                }
                try {
                    int i4 = bpoVarA.b;
                    try {
                        synchronized (bpq.class) {
                            if (!j(context)) {
                                throw new bpm("Remote loading disabled");
                            }
                            bool = e;
                        }
                        if (bool == null) {
                            throw new bpm("Failed to determine which loading route to use.");
                        }
                        if (bool.booleanValue()) {
                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i4);
                            synchronized (bpq.class) {
                                bpuVar = g;
                            }
                            if (bpuVar == null) {
                                throw new bpm("DynamiteLoaderV2 was not cached.");
                            }
                            ekb ekbVar3 = (ekb) threadLocal.get();
                            if (ekbVar3 == null || ekbVar3.a == null) {
                                throw new bpm("No result cursor");
                            }
                            Context applicationContext2 = context.getApplicationContext();
                            Object obj = ekbVar3.a;
                            new bpe(null);
                            synchronized (bpq.class) {
                                z = j >= 2;
                                boolValueOf = Boolean.valueOf(z);
                            }
                            boolValueOf.getClass();
                            if (z) {
                                bpfVarA = bpuVar.b(new bpe(applicationContext2), str, i4, new bpe(obj));
                            } else {
                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                bpfVarA = bpuVar.a(new bpe(applicationContext2), str, i4, new bpe(obj));
                            }
                            Context context2 = (Context) bpe.a(bpfVarA);
                            if (context2 == null) {
                                throw new bpm("Failed to get module context");
                            }
                            bpqVar = new bpq(context2);
                        } else {
                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i4);
                            bps bpsVarG = g(context);
                            if (bpsVarG == null) {
                                throw new bpm("Failed to create IDynamiteLoader.");
                            }
                            int iA = bpsVarG.a();
                            if (iA >= 3) {
                                ekb ekbVar4 = (ekb) threadLocal.get();
                                if (ekbVar4 == null) {
                                    throw new bpm("No cached result cursor holder");
                                }
                                bpfVarD = bpsVarG.e(new bpe(context), str, i4, new bpe(ekbVar4.a));
                            } else if (iA == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                bpfVarD = bpsVarG.f(new bpe(context), str, i4);
                            } else {
                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                bpfVarD = bpsVarG.d(new bpe(context), str, i4);
                            }
                            Object objA = bpe.a(bpfVarD);
                            if (objA == null) {
                                throw new bpm("Failed to load remote module.");
                            }
                            bpqVar = new bpq((Context) objA);
                        }
                        bpqVarF = bpqVar;
                    } catch (RemoteException e2) {
                        throw new bpm("Failed to load remote module.", e2);
                    } catch (bpm e3) {
                        throw e3;
                    } catch (Throwable th2) {
                        bnb.a(context, th2);
                        throw new bpm("Failed to load remote module.", th2);
                    }
                } catch (bpm e4) {
                    Log.w("DynamiteModule", "Failed to load remote module: " + e4.getMessage());
                    int i5 = bpoVarA.a;
                    if (i5 == 0 || bppVar.a(context, str, new bpl(i5)).c != -1) {
                        throw new bpm("Remote load failed. No local fallback found.", e4);
                    }
                    bpqVarF = f(applicationContext, str);
                }
            }
            if (j2 == 0) {
                m.remove();
            } else {
                m.set(l2);
            }
            ?? r1 = ekbVar2.a;
            if (r1 != 0) {
                r1.close();
            }
            l.set(ekbVar);
            return bpqVarF;
        } catch (Throwable th3) {
            th = th3;
            if (j2 == 0) {
                m.remove();
            } else {
                m.set(l2);
            }
            ?? r12 = ekbVar2.a;
            if (r12 != 0) {
                r12.close();
            }
            l.set(ekbVar);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0124 A[PHI: r13
  0x0124: PHI (r13v6 boolean) = (r13v5 boolean), (r13v9 boolean) binds: [B:59:0x00ec, B:74:0x011d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int e(android.content.Context r12, java.lang.String r13, boolean r14, boolean r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpq.e(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static bpq f(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(str));
        return new bpq(context);
    }

    private static bps g(Context context) {
        bps bprVar;
        synchronized (bpq.class) {
            bps bpsVar = f;
            if (bpsVar != null) {
                return bpsVar;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    bprVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    bprVar = iInterfaceQueryLocalInterface instanceof bps ? (bps) iInterfaceQueryLocalInterface : new bpr(iBinder);
                }
                if (bprVar != null) {
                    f = bprVar;
                    return bprVar;
                }
            } catch (Exception e2) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e2.getMessage());
            }
            return null;
        }
    }

    private static void h(ClassLoader classLoader) throws bpm {
        try {
            bpu bptVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                bptVar = iInterfaceQueryLocalInterface instanceof bpu ? (bpu) iInterfaceQueryLocalInterface : new bpt(iBinder);
            }
            g = bptVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new bpm("Failed to instantiate dynamite loader", e2);
        }
    }

    private static boolean i(Cursor cursor) {
        ekb ekbVar = (ekb) l.get();
        if (ekbVar == null || ekbVar.a != null) {
            return false;
        }
        ekbVar.a = cursor;
        return true;
    }

    private static boolean j(Context context) {
        if (Boolean.TRUE.equals(a) || Boolean.TRUE.equals(k)) {
            return true;
        }
        boolean z = false;
        if (k == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 268435456);
            if (bht.d.e(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z = true;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            k = boolValueOf;
            boolValueOf.getClass();
            if (z && providerInfoResolveContentProvider.applicationInfo != null && (providerInfoResolveContentProvider.applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                i = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    public final IBinder c(String str) throws bpm {
        try {
            return (IBinder) this.d.getClassLoader().loadClass("com.google.android.gms.common.GoogleCertificatesImpl").newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new bpm("Failed to instantiate module class: ".concat("com.google.android.gms.common.GoogleCertificatesImpl"), e2);
        }
    }
}
