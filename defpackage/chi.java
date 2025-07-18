package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import java.io.IOException;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class chi {
    public static final Object a = new Object();
    public static final Object b = new Object();
    public final Context c;
    public final csg d;
    public final csg e;
    public final csg f;
    public final csg g;
    public final csg h;
    public final Uri i;
    public volatile cfr j;
    public final Uri k;
    public volatile cft l;

    public chi(Context context, csg csgVar, csg csgVar2, csg csgVar3) {
        this.c = context;
        this.e = csgVar;
        this.d = csgVar3;
        this.f = csgVar2;
        Pattern pattern = chq.a;
        chp chpVar = new chp(context);
        chpVar.d("phenotype_storage_info");
        chpVar.e("storage-info.pb");
        this.i = chpVar.a();
        chp chpVar2 = new chp(context);
        chpVar2.d("phenotype_storage_info");
        chpVar2.e("device-encrypted-storage-info.pb");
        int i = cbl.a;
        chpVar2.b();
        this.k = chpVar2.a();
        this.g = clq.t(new bsr(this, 9));
        this.h = clq.t(new bsr(csgVar, 10));
    }

    public final cfr a() {
        cfr cfrVar;
        cfr cfrVar2 = this.j;
        if (cfrVar2 != null) {
            return cfrVar2;
        }
        synchronized (a) {
            cfrVar = this.j;
            if (cfrVar == null) {
                cfrVar = cfr.b;
                cif cifVarB = cif.b(cfrVar);
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                try {
                    try {
                        cfr cfrVar3 = (cfr) ((fcy) this.f.a()).g(this.i, cifVarB);
                        StrictMode.setThreadPolicy(threadPolicy);
                        cfrVar = cfrVar3;
                    } finally {
                        StrictMode.setThreadPolicy(threadPolicy);
                    }
                } catch (IOException unused) {
                }
                this.j = cfrVar;
            }
        }
        return cfrVar;
    }

    public final cgy b(boolean z) {
        cxc cxcVarO;
        eea eeaVar;
        String str;
        cxc cxcVarO2;
        cxc cxcVarO3;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        String str2 = "";
        if (z) {
            cft cftVar = this.l;
            if (cftVar == null) {
                synchronized (b) {
                    cftVar = this.l;
                    if (cftVar == null) {
                        cftVar = cft.b;
                        cif cifVarB = cif.b(cftVar);
                        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                        try {
                            cft cftVar2 = (cft) ((fcy) this.f.a()).g(this.k, cifVarB);
                            StrictMode.setThreadPolicy(threadPolicy);
                            cftVar = cftVar2;
                        } catch (IOException unused) {
                            StrictMode.setThreadPolicy(threadPolicy);
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(threadPolicy);
                            throw th;
                        }
                        this.l = cftVar;
                    }
                }
            }
            boolean z5 = cftVar.e;
            cxcVarO = cxc.o(new efk(cftVar.i, cft.a));
            eeaVar = cftVar.d;
            str = cftVar.f;
            cxcVarO2 = cxc.o(cftVar.g);
            cxcVarO3 = cxc.o(cftVar.h);
            if ((cftVar.c & 8) != 0) {
                cfu cfuVar = cftVar.j;
                if (cfuVar == null) {
                    cfuVar = cfu.a;
                }
                if (cfuVar.c == Build.VERSION.SDK_INT) {
                    cfu cfuVar2 = cftVar.j;
                    if (cfuVar2 == null) {
                        cfuVar2 = cfu.a;
                    }
                    str2 = cfuVar2.b;
                }
            }
            i = cftVar.c & 1;
            z2 = cftVar.l;
            z4 = z5;
            z3 = cftVar.k;
        } else {
            cfr cfrVarA = a();
            boolean z6 = cfrVarA.e;
            cxcVarO = cxc.o(new efk(cfrVarA.j, cfr.a));
            eeaVar = cfrVarA.d;
            str = cfrVarA.f;
            cxcVarO2 = cxc.o(cfrVarA.h);
            cxcVarO3 = cxc.o(cfrVarA.i);
            if ((cfrVarA.c & 16) != 0) {
                cfu cfuVar3 = cfrVarA.k;
                if (cfuVar3 == null) {
                    cfuVar3 = cfu.a;
                }
                if (cfuVar3.c == Build.VERSION.SDK_INT) {
                    cfu cfuVar4 = cfrVarA.k;
                    if (cfuVar4 == null) {
                        cfuVar4 = cfu.a;
                    }
                    str2 = cfuVar4.b;
                }
            }
            i = cfrVarA.c & 1;
            z2 = cfrVarA.m;
            z3 = cfrVarA.l;
            z4 = z6;
        }
        return new cgy(z4, cxcVarO, eeaVar, str, str2, cxcVarO2, cxcVarO3, 1 == i, z2, z3);
    }
}
