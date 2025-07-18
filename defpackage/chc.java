package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.StrictMode;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class chc {
    public static final uq d = new uq(null);
    public final cem a;
    public final Uri b;
    public final String c;
    private final String e;
    private final boolean f;

    public chc(cem cemVar, String str, String str2, boolean z) {
        this.a = cemVar;
        this.c = str;
        this.e = str2;
        this.f = z;
        Context context = cemVar.c;
        Pattern pattern = chq.a;
        chp chpVar = new chp(context);
        chpVar.d("phenotype");
        chpVar.e(str2 + "/" + str + ".pb");
        if (z) {
            int i = cbl.a;
            chpVar.b();
        }
        this.b = chpVar.a();
    }

    public static /* synthetic */ void e(chc chcVar, chd chdVar) {
        eqh eqhVar = new eqh((char[]) null, (byte[]) null);
        try {
            fcy fcyVarE = chcVar.a.e();
            Uri uri = chcVar.b;
            cii ciiVar = new cii(chdVar);
            ciiVar.a = new eqh[]{eqhVar};
        } catch (IOException | RuntimeException e) {
            uq.n(Level.WARNING, chcVar.a.c(), e, "Failed to update snapshot for %s flags may be stale.", chcVar.c);
        }
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [csg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [csg, java.lang.Object] */
    public final cha a() {
        cgy cgyVarB = this.a.e.b(this.f);
        dwu dwuVar = dwu.FILE;
        int i = cej.a;
        String strSubstring = this.c;
        int iIndexOf = strSubstring.indexOf("#");
        if (iIndexOf >= 0) {
            strSubstring = strSubstring.substring(0, iIndexOf);
        } else if (strSubstring.contains("@")) {
            throw new IllegalArgumentException("Invalid package name: ".concat(String.valueOf(strSubstring)));
        }
        dwuVar.getClass();
        strSubstring.getClass();
        int i2 = !cgyVarB.f ? cex.m : !cgyVarB.a(dwuVar) ? cex.b : cgyVarB.a.w() ? cex.c : (cgyVarB.d.isEmpty() || cgyVarB.d.contains(strSubstring)) ? cgyVarB.e.contains(strSubstring) ? cex.e : 0 : cex.d;
        if (i2 != 0) {
            return new cha(null, new chb(i2));
        }
        try {
            String str = cgyVarB.c;
            if (str.isEmpty()) {
                cru cruVar = (cru) this.a.f.a();
                if (!cruVar.c()) {
                    d.m(Level.WARNING, this.a.c(), "Unable to get GMS application info, using defaults.", new Object[0]);
                    return new cha(cfq.a, new chb(cey.b, cex.f));
                }
                if (this.f) {
                    int i3 = cbl.a;
                    str = ((ApplicationInfo) cruVar.a()).deviceProtectedDataDir;
                } else {
                    str = ((ApplicationInfo) cruVar.a()).dataDir;
                }
            }
            String str2 = str + File.separator + cgyVarB.b;
            fcy fcyVar = new fcy(cgyVarB.a, this.c, this.e);
            Uri uriBuild = new Uri.Builder().scheme("file").appendEncodedPath(File.separator + str2 + File.separator + new File(((String) fcyVar.b.a()) + "/" + ((String) fcyVar.a.a()) + ".pb").toString()).build();
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
            try {
                try {
                    try {
                        return new cha((cfq) this.a.e().g(uriBuild, new cig(1)), new chb(cey.d, cex.a));
                    } catch (FileNotFoundException unused) {
                        d.m(Level.INFO, this.a.c(), "Shared storage file not found for %s", this.c);
                        return new cha(null, new chb(cex.g));
                    }
                } catch (efp e) {
                    uq.n(Level.SEVERE, this.a.c(), e, "Failed to parse snapshot from shared storage for %s", this.c);
                    return new cha(null, new chb(cex.h));
                }
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Exception e2) {
            uq.n(Level.WARNING, this.a.c(), e2, "Failed to read shared file for %s", this.c);
            return new cha(cfq.a, new chb(cey.b, cex.i));
        }
    }

    final djy b(String str) {
        return dij.i(this.a.f().x(this.c, str), new crp() { // from class: cgz
            @Override // defpackage.crp
            public final Object a(Object obj) {
                cfb cfbVar = (cfb) obj;
                asr asrVar = (asr) chd.a.createBuilder();
                if (cfbVar == null) {
                    return (chd) asrVar.z();
                }
                for (cfd cfdVar : cfbVar.f) {
                    asr asrVar2 = (asr) chf.a.createBuilder();
                    String str2 = cfdVar.e;
                    if (!asrVar2.a.isMutable()) {
                        asrVar2.B();
                    }
                    chf chfVar = (chf) asrVar2.a;
                    str2.getClass();
                    chfVar.b |= 1;
                    chfVar.e = str2;
                    int iA = cfc.a(cfdVar.c);
                    int i = iA - 1;
                    if (iA == 0) {
                        throw null;
                    }
                    if (i == 0) {
                        long jLongValue = cfdVar.c == 1 ? ((Long) cfdVar.d).longValue() : 0L;
                        if (!asrVar2.a.isMutable()) {
                            asrVar2.B();
                        }
                        chf chfVar2 = (chf) asrVar2.a;
                        chfVar2.c = 2;
                        chfVar2.d = Long.valueOf(jLongValue);
                    } else if (i == 1) {
                        boolean zBooleanValue = cfdVar.c == 2 ? ((Boolean) cfdVar.d).booleanValue() : false;
                        if (!asrVar2.a.isMutable()) {
                            asrVar2.B();
                        }
                        chf chfVar3 = (chf) asrVar2.a;
                        chfVar3.c = 3;
                        chfVar3.d = Boolean.valueOf(zBooleanValue);
                    } else if (i == 2) {
                        double dDoubleValue = cfdVar.c == 3 ? ((Double) cfdVar.d).doubleValue() : 0.0d;
                        if (!asrVar2.a.isMutable()) {
                            asrVar2.B();
                        }
                        chf chfVar4 = (chf) asrVar2.a;
                        chfVar4.c = 4;
                        chfVar4.d = Double.valueOf(dDoubleValue);
                    } else if (i == 3) {
                        String str3 = cfdVar.c == 4 ? (String) cfdVar.d : "";
                        if (!asrVar2.a.isMutable()) {
                            asrVar2.B();
                        }
                        chf chfVar5 = (chf) asrVar2.a;
                        str3.getClass();
                        chfVar5.c = 5;
                        chfVar5.d = str3;
                    } else {
                        if (i != 4) {
                            throw new IllegalStateException("No known flag type");
                        }
                        eea eeaVar = cfdVar.c == 5 ? (eea) cfdVar.d : eea.b;
                        if (!asrVar2.a.isMutable()) {
                            asrVar2.B();
                        }
                        chf chfVar6 = (chf) asrVar2.a;
                        eeaVar.getClass();
                        chfVar6.c = 6;
                        chfVar6.d = eeaVar;
                    }
                    chf chfVar7 = (chf) asrVar2.z();
                    if (!asrVar.a.isMutable()) {
                        asrVar.B();
                    }
                    chd chdVar = (chd) asrVar.a;
                    chfVar7.getClass();
                    efm efmVar = chdVar.g;
                    if (!efmVar.c()) {
                        chdVar.g = efb.mutableCopy(efmVar);
                    }
                    chdVar.g.add(chfVar7);
                }
                String str4 = cfbVar.e;
                if (!asrVar.a.isMutable()) {
                    asrVar.B();
                }
                chd chdVar2 = (chd) asrVar.a;
                str4.getClass();
                chdVar2.b = 4 | chdVar2.b;
                chdVar2.e = str4;
                String str5 = cfbVar.c;
                if (!asrVar.a.isMutable()) {
                    asrVar.B();
                }
                chd chdVar3 = (chd) asrVar.a;
                str5.getClass();
                chdVar3.b |= 1;
                chdVar3.c = str5;
                long j = cfbVar.i;
                if (!asrVar.a.isMutable()) {
                    asrVar.B();
                }
                chd chdVar4 = (chd) asrVar.a;
                chdVar4.b |= 8;
                chdVar4.f = j;
                if ((cfbVar.b & 2) != 0) {
                    eea eeaVar2 = cfbVar.d;
                    if (!asrVar.a.isMutable()) {
                        asrVar.B();
                    }
                    chd chdVar5 = (chd) asrVar.a;
                    eeaVar2.getClass();
                    chdVar5.b |= 2;
                    chdVar5.d = eeaVar2;
                }
                return (chd) asrVar.z();
            }
        }, this.a.c());
    }

    public final djy c(chd chdVar) {
        return cnx.E(new amq(this, chdVar, 6), this.a.c());
    }

    public final boolean d() {
        return this.a.e.b(this.f).a(dwu.FILE);
    }
}
