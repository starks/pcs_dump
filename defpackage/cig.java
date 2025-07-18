package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.zip.Inflater;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cig implements chm {
    private final /* synthetic */ int a;

    public cig(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [cik, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    public static final InputStream b(fpv fpvVar) {
        InputStream inputStreamD = fpvVar.c.d((Uri) fpvVar.a);
        ArrayList arrayList = new ArrayList();
        arrayList.add(inputStreamD);
        if (!fpvVar.b.isEmpty()) {
            ?? r2 = fpvVar.b;
            int i = chk.a;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = r2.iterator();
            while (it.hasNext()) {
                cim cimVarA = ((cio) it.next()).a();
                if (cimVarA != null) {
                    arrayList2.add(cimVarA);
                }
            }
            chk chkVar = !arrayList2.isEmpty() ? new chk(inputStreamD, arrayList2) : null;
            if (chkVar != null) {
                arrayList.add(chkVar);
            }
        }
        for (cip cipVar : fpvVar.e) {
            arrayList.add(cipVar.c());
        }
        Collections.reverse(arrayList);
        return (InputStream) arrayList.get(0);
    }

    @Override // defpackage.chm
    public final /* synthetic */ Object a(fpv fpvVar) throws IOException {
        long j;
        String strX;
        cfm cfmVar;
        if (this.a == 0) {
            return b(fpvVar);
        }
        InputStream inputStreamB = b(fpvVar);
        try {
            eee eeeVarJ = eee.J(inputStreamB);
            cfq cfqVar = cfq.a;
            int iK = eeeVarJ.k();
            if (iK > 1) {
                throw new efp("Unsupported version: " + iK + ". Current version is: 1");
            }
            eeeVarJ.k();
            int iE = eeeVarJ.e(eeeVarJ.n());
            een eenVar = een.a;
            egr egrVar = egr.a;
            cfk cfkVar = (cfk) efb.parseFrom(cfk.a, eeeVarJ, een.a);
            eeeVarJ.A(iE);
            byte[] bArrF = eeeVarJ.F();
            chx chxVar = new chx(1);
            try {
                ((Inflater) chxVar.a).setInput(bArrF);
                try {
                    eee eeeVarJ2 = eee.J(new cfl(chxVar));
                    cfn cfnVar = cfn.a;
                    int iJ = eeeVarJ2.j();
                    if (iJ < 0) {
                        throw new efp("Negative number of flags");
                    }
                    cxr cxrVar = new cxr(cyi.a);
                    long j2 = 0;
                    for (int i = 0; i < iJ; i++) {
                        long jR = eeeVarJ2.r();
                        int i2 = (int) jR;
                        long j3 = jR >>> 3;
                        if (j3 == 0) {
                            j = 0;
                            strX = eeeVarJ2.x();
                        } else {
                            long j4 = j3 + j2;
                            if (j4 > 2305843009213693951L) {
                                throw new efp("Flag name larger than max size");
                            }
                            j = j4;
                            strX = null;
                        }
                        int i3 = i2 & 7;
                        if (i3 == 0 || i3 == 1) {
                            cfmVar = new cfm(j, strX, i3, 0L, null);
                        } else if (i3 == 2) {
                            cfmVar = new cfm(j, strX, i3, eeeVarJ2.r(), null);
                        } else if (i3 == 3) {
                            cfmVar = new cfm(j, strX, i3, Double.doubleToRawLongBits(eeeVarJ2.b()), null);
                        } else if (i3 == 4) {
                            cfmVar = new cfm(j, strX, i3, 0L, eeeVarJ2.x());
                        } else {
                            if (i3 != 5) {
                                throw new efp("Unrecognized flag type " + i3);
                            }
                            cfmVar = new cfm(j, strX, i3, 0L, eeeVarJ2.F());
                        }
                        cfm cfmVar2 = cfmVar;
                        long j5 = cfmVar2.a;
                        if (j5 != 0) {
                            j2 = j5;
                        }
                        cxrVar.m(cfmVar2);
                    }
                    cfn cfnVar2 = new cfn(cxrVar.i());
                    chxVar.close();
                    cfq cfqVar2 = new cfq(cfnVar2, cfkVar);
                    if (inputStreamB != null) {
                        inputStreamB.close();
                    }
                    return cfqVar2;
                } finally {
                    ((Inflater) chxVar.a).reset();
                }
            } finally {
            }
        } finally {
        }
    }
}
