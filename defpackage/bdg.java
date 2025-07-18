package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdg {
    public static volatile eqi a;
    private static volatile epg b;

    public static epg a() {
        epg epgVarA;
        epg epgVar = b;
        if (epgVar != null) {
            return epgVar;
        }
        synchronized (bdg.class) {
            epgVarA = b;
            if (epgVarA == null) {
                epd epdVarA = epg.a();
                epdVarA.c = epf.SERVER_STREAMING;
                epdVarA.d = epg.c("com.google.android.apps.miphone.astrea.pir.api.PirService", "Download");
                epdVarA.b();
                bdc bdcVar = bdc.a;
                int i = fec.b;
                epdVarA.a = new fea(bdcVar);
                epdVarA.b = new fea(bdd.a);
                epgVarA = epdVarA.a();
                b = epgVarA;
            }
        }
        return epgVarA;
    }

    public static dzw b() {
        return new dzw(crc.a, new ebq());
    }

    public static int c(int i) {
        int[] iArrD = d();
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArrD[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    public static int[] d() {
        return new int[]{1, 2, 3};
    }

    public static String e(File file, String str) {
        bxx bxxVar = bxx.a;
        return new File(file, str).getPath();
    }
}
