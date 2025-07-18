package defpackage;

import android.content.Context;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgr implements csg {
    public static final /* synthetic */ int b = 0;
    private static volatile cfg c = new cfg(new cgq(0));
    public final String a;
    private final String d;
    private Object e;
    private volatile int f;
    private volatile Object g;
    private oc h;
    private oc i;
    private oc j;
    private final boolean k;
    private volatile boolean l;
    private final cga m;
    private brb n;

    public cgr(String str, String str2, cga cgaVar, String str3) {
        this.f = -1;
        this.d = "com.google.android.gms.learning";
        this.a = str2;
        this.e = str3;
        this.m = cgaVar;
        this.k = true;
        this.l = true;
    }

    private final Object c(cem cemVar) {
        if (!this.k) {
            boolean z = c.a;
            clq.G(true, "Attempt to access ProcessStablePhenotypeFlag not via codegen. All new ProcessStablePhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error.");
        }
        cga cgaVar = this.m;
        String str = this.d;
        String str2 = this.a;
        cem.d();
        Object objB = cgaVar.b(cemVar, str, str2);
        return objB != null ? objB : b();
    }

    @Override // defpackage.csg
    public final Object a() {
        Context context = cem.a;
        boolean z = true;
        ceo.b = true;
        if (ceo.c == null) {
            ceo.c = new cen();
        }
        Context context2 = cem.a;
        if (context2 == null) {
            ceo.a();
            throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
        }
        cem cemVarA = cem.a(context2);
        if (Objects.equals("", "")) {
            int i = this.f;
            if (i == -1 || i < this.n.s()) {
                synchronized (this) {
                    int i2 = this.f;
                    if (i2 == -1) {
                        this.n = this.m.c(cemVarA, this.d);
                    }
                    int iS = this.n.s();
                    if (i2 < iS) {
                        Object objC = c(cemVarA);
                        this.g = objC;
                        this.f = iS;
                        return objC;
                    }
                }
            }
            return this.g;
        }
        synchronized (this) {
            if (this.i == null) {
                clq.F(this.h == null);
                clq.F(this.j == null);
                this.i = new oc();
                this.h = new oc();
                this.j = new oc();
            }
            brb brbVar = (brb) this.i.get("");
            if (brbVar != null && brbVar.s() <= ((Integer) this.j.getOrDefault("", -1)).intValue()) {
                Object obj = this.h.get("");
                obj.getClass();
                return obj;
            }
            brb brbVarC = this.m.c(cemVarA, this.d);
            brb brbVar2 = (brb) this.i.put("", brbVarC);
            if (brbVar2 != null && brbVar2 != brbVarC) {
                z = false;
            }
            clq.G(z, "PackageVersionCache object should not change in the life of the process.");
            this.j.put("", Integer.valueOf(brbVarC.s()));
            Object objC2 = c(cemVarA);
            objC2.getClass();
            this.h.put("", objC2);
            return objC2;
        }
    }

    public final Object b() {
        if (this.l) {
            synchronized (this) {
                if (this.l) {
                    Object objA = this.m.a(this.a, (String) this.e);
                    objA.getClass();
                    this.e = objA;
                    this.l = false;
                }
            }
        }
        return this.e;
    }

    public cgr(String str, String str2, Object obj, cga cgaVar, boolean z) {
        this.f = -1;
        this.d = str;
        this.a = str2;
        this.e = obj;
        this.m = cgaVar;
        this.k = z;
        this.l = false;
    }
}
