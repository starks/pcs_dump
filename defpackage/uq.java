package defpackage;

import android.database.SQLException;
import android.os.Binder;
import android.view.View;
import j$.util.DesugarCollections;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public class uq {
    public uq() {
    }

    static CharSequence a(View view) {
        return view.getAccessibilityPaneTitle();
    }

    static void b(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    static void c(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    static void d(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }

    static boolean e(View view) {
        return view.isAccessibilityHeading();
    }

    static boolean f(View view) {
        return view.isScreenReaderFocusable();
    }

    public static Method i() {
        return (Method) afj.b.a();
    }

    public static Method j() {
        return (Method) afj.a.a();
    }

    public static void k(ady adyVar, String str) throws Exception {
        afa afaVarB = adyVar.b(str);
        try {
            afaVarB.k();
            fjp.w(afaVarB, null);
        } finally {
        }
    }

    public static void l(int i, String str) {
        throw new SQLException(a.x(i, "Error code: ") + ", message: ".concat(str));
    }

    public static void n(Level level, Executor executor, Throwable th, String str, Object... objArr) {
        bsk bskVar = new bsk(level, th, str, objArr, 2);
        int i = cqt.a;
        executor.execute(new eqs(new fjx(), cqa.b(), bskVar, 1));
    }

    public static Object o(ced cedVar) {
        try {
            return cedVar.a();
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return cedVar.a();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }

    public static cdn p(ajc ajcVar) {
        int i;
        ajcVar.getClass();
        String str = ajcVar.b;
        str.getClass();
        if (str.length() <= 0) {
            throw new IllegalArgumentException("Policy name is missing.");
        }
        String str2 = ajcVar.f;
        str2.getClass();
        if (str2.length() <= 0) {
            throw new IllegalArgumentException("Egress type is missing.");
        }
        String str3 = ajcVar.b;
        str3.getClass();
        String str4 = ajcVar.e;
        str4.getClass();
        String str5 = ajcVar.f;
        str5.getClass();
        efm efmVar = ajcVar.c;
        efmVar.getClass();
        ArrayList arrayList = new ArrayList(ffh.Q(efmVar));
        Iterator it = efmVar.iterator();
        while (it.hasNext()) {
            ajf ajfVar = (ajf) it.next();
            ajfVar.getClass();
            String str6 = ajfVar.b;
            str6.getClass();
            long j = ajfVar.c;
            efm<aje> efmVar2 = ajfVar.d;
            efmVar2.getClass();
            ArrayList arrayList2 = new ArrayList(ffh.Q(efmVar2));
            for (aje ajeVar : efmVar2) {
                ajeVar.getClass();
                int iB = ajd.b(ajeVar.b);
                if (iB == 0) {
                    iB = ajd.d;
                }
                if (iB == 0) {
                    throw null;
                }
                cds cdsVar = cds.a;
                int i2 = cdr.a;
                int i3 = iB - 2;
                Iterator it2 = it;
                if (i3 == 1) {
                    i = cdr.a;
                } else {
                    if (i3 != 2) {
                        Objects.toString(ajd.toString$ar$edu$ef30c2d4_0(iB));
                        throw new UnsupportedOperationException("Unknown retention medium: ".concat(ajd.toString$ar$edu$ef30c2d4_0(iB)));
                    }
                    i = cdr.b;
                }
                arrayList2.add(new cdp(i, ajeVar.c));
                it = it2;
            }
            Iterator it3 = it;
            efm<ajb> efmVar3 = ajfVar.e;
            efmVar3.getClass();
            ArrayList arrayList3 = new ArrayList(ffh.Q(efmVar3));
            for (ajb ajbVar : efmVar3) {
                ajbVar.getClass();
                arrayList3.add(v(ajbVar, fgm.a));
            }
            efm<aiv> efmVar4 = ajfVar.f;
            efmVar4.getClass();
            ArrayList arrayList4 = new ArrayList(ffh.Q(efmVar4));
            for (aiv aivVar : efmVar4) {
                aivVar.getClass();
                arrayList4.add(q(aivVar));
            }
            arrayList.add(new cdq(str6, j, arrayList2, arrayList3, arrayList4));
            it = it3;
        }
        efm<aiy> efmVar5 = ajcVar.d;
        efmVar5.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(fjs.i(ffh.r(ffh.Q(efmVar5)), 16));
        for (aiy aiyVar : efmVar5) {
            String str7 = aiyVar.b;
            str7.getClass();
            linkedHashMap.put(str7, DesugarCollections.unmodifiableMap(aiyVar.c));
        }
        efm<aiv> efmVar6 = ajcVar.g;
        efmVar6.getClass();
        ArrayList arrayList5 = new ArrayList(ffh.Q(efmVar6));
        for (aiv aivVar2 : efmVar6) {
            aivVar2.getClass();
            arrayList5.add(q(aivVar2));
        }
        return new cdn(str3, str5, str4, arrayList, linkedHashMap, arrayList5, cdx.a);
    }

    public static cdt q(aiv aivVar) {
        Object cdwVar;
        String str = aivVar.b;
        str.getClass();
        efm<aiu> efmVar = aivVar.c;
        efmVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(fjs.i(ffh.r(ffh.Q(efmVar)), 16));
        for (aiu aiuVar : efmVar) {
            String str2 = aiuVar.d;
            aiuVar.getClass();
            int iB = ait.b(aiuVar.b);
            int i = iB - 1;
            if (iB == 0) {
                throw null;
            }
            if (i == 0) {
                String str3 = aiuVar.b == 2 ? (String) aiuVar.c : "";
                str3.getClass();
                cdwVar = new cdw(str3);
            } else if (i == 1) {
                cdwVar = new cdv(aiuVar.b == 3 ? ((Integer) aiuVar.c).intValue() : 0);
            } else {
                if (i != 2) {
                    throw new UnsupportedOperationException("Invalid [AnnotationParam] type " + ((Object) ait.a(ait.b(aiuVar.b))) + ".");
                }
                cdwVar = new cdu(aiuVar.b == 4 ? ((Boolean) aiuVar.c).booleanValue() : false);
            }
            ffs ffsVar = new ffs(str2, cdwVar);
            linkedHashMap.put(ffsVar.a, ffsVar.b);
        }
        return new cdt(str, linkedHashMap);
    }

    public static void r(Set set, String str, bqm bqmVar) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int iOrdinal = ((cdl) it.next()).ordinal();
            if (iOrdinal == 0) {
                bqmVar.l(ccj.g, str);
            } else if (iOrdinal == 1) {
                bqmVar.l(ccj.h, str);
            } else if (iOrdinal == 2) {
                bqmVar.l(ccj.f, str);
            } else if (iOrdinal == 3) {
                bqmVar.l(ccj.i, str);
            }
        }
    }

    public static dzd s(bpz bpzVar, String str) {
        asr asrVar = (asr) dzd.a.createBuilder();
        long jO = bpzVar.O();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dzd) asrVar.a).c = jO;
        long jAp = bpzVar.ap();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dzd) asrVar.a).d = jAp;
        long jAo = bpzVar.ao();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dzd) asrVar.a).e = jAo;
        boolean zBb = bpzVar.bb();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dzd) asrVar.a).f = zBb;
        boolean zBa = bpzVar.ba();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dzd) asrVar.a).g = zBa;
        bpzVar.bK();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dzd) asrVar.a).h = 600L;
        boolean zBk = bpzVar.bk();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dzd) asrVar.a).i = zBk;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        boolean z = true;
        ((dzd) asrVar.a).j = true;
        long jAl = bpzVar.al();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dzd) asrVar.a).k = jAl;
        long jAk = bpzVar.ak();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dzd) asrVar.a).l = jAk;
        long jR = bpzVar.R();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dzd) asrVar.a).m = jR;
        float fA = bpzVar.A();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dzd) asrVar.a).n = fA;
        long jQ = bpzVar.Q();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dzd) asrVar.a).o = jQ;
        float fZ = bpzVar.z();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dzd) asrVar.a).p = fZ;
        List listAw = bpzVar.aw();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        dzd dzdVar = (dzd) asrVar.a;
        efi efiVar = dzdVar.q;
        if (!efiVar.c()) {
            dzdVar.q = efb.mutableCopy(efiVar);
        }
        edg.addAll(listAw, dzdVar.q);
        bpzVar.bM();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dzd) asrVar.a).r = true;
        bpzVar.bJ();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dzd) asrVar.a).s = true;
        boolean zAR = bpzVar.aR();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dzd) asrVar.a).t = zAR;
        int iK = bpzVar.K();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dzd) asrVar.a).u = iK;
        boolean zAE = bpzVar.aE(str);
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dzd) asrVar.a).E = zAE;
        boolean zBu = bpzVar.bu(str);
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dzd) asrVar.a).F = zBu;
        bpzVar.bI();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dzd) asrVar.a).v = true;
        boolean zAD = bpzVar.aD();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dzd) asrVar.a).w = zAD;
        bpzVar.bL();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dzd) asrVar.a).x = true;
        boolean zAG = bpzVar.aG();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dzd) asrVar.a).y = zAG;
        int iN = bpzVar.N();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dzd) asrVar.a).z = iN;
        boolean zAK = bpzVar.aK();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dzd) asrVar.a).A = zAK;
        long jAd = bpzVar.ad();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dzd) asrVar.a).B = jAd;
        boolean zBp = bpzVar.bp();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dzd) asrVar.a).C = zBp;
        int iL = bpzVar.L();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dzd) asrVar.a).D = iL;
        boolean zBd = bpzVar.bd(str);
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dzd) asrVar.a).G = zBd;
        boolean zAH = bpzVar.aH(str);
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dzd) asrVar.a).H = zAH;
        edb edbVarAr = bpzVar.ar();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        dzd dzdVar2 = (dzd) asrVar.a;
        edbVarAr.getClass();
        dzdVar2.I = edbVarAr;
        dzdVar2.b |= 1;
        List listAv = bpzVar.av();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        dzd dzdVar3 = (dzd) asrVar.a;
        efm efmVar = dzdVar3.J;
        if (!efmVar.c()) {
            dzdVar3.J = efb.mutableCopy(efmVar);
        }
        edg.addAll(listAv, dzdVar3.J);
        if (!bpzVar.aF(str) && !bpzVar.ay()) {
            z = false;
        }
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dzd) asrVar.a).O = z;
        bpzVar.bH();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dzd) asrVar.a).P = false;
        boolean zAB = bpzVar.aB();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dzd) asrVar.a).K = zAB;
        boolean zAJ = bpzVar.aJ();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dzd) asrVar.a).L = zAJ;
        boolean zAN = bpzVar.aN();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dzd) asrVar.a).M = zAN;
        boolean zBg = bpzVar.bg();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dzd) asrVar.a).N = zBg;
        boolean zAA = bpzVar.aA();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dzd) asrVar.a).Q = zAA;
        return (dzd) asrVar.z();
    }

    public static dfa t(bqm bqmVar, bpz bpzVar, String str, long j) {
        if (!bpzVar.aC()) {
            return dfa.a;
        }
        asr asrVar = (asr) dfv.a.createBuilder();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        dfv dfvVar = (dfv) asrVar.a;
        str.getClass();
        dfvVar.b |= 2;
        dfvVar.d = str;
        if (bpzVar.n()) {
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            dfv dfvVar2 = (dfv) asrVar.a;
            dfvVar2.b |= 16;
            dfvVar2.g = j;
        }
        asr asrVar2 = (asr) dfa.a.createBuilder();
        dfv dfvVar3 = (dfv) asrVar.z();
        if (!asrVar2.a.isMutable()) {
            asrVar2.B();
        }
        dfa dfaVar = (dfa) asrVar2.a;
        dfvVar3.getClass();
        dfaVar.d = dfvVar3;
        dfaVar.b |= 4;
        return bqmVar.c((dfa) asrVar2.z());
    }

    public static String u(String str, String str2) {
        if (str2.trim().isEmpty()) {
            return str;
        }
        return str + "/" + str2;
    }

    private static cdo v(ajb ajbVar, List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (aiz aizVar : ajbVar.c) {
            String str = aizVar.c;
            str.getClass();
            if (str.length() == 0) {
                int iB = aja.b(aizVar.b);
                if (iB == 0) {
                    iB = aja.e;
                }
                if (iB == 0) {
                    throw null;
                }
                linkedHashSet.add(w(iB));
            } else {
                String str2 = aizVar.c;
                Object linkedHashSet2 = linkedHashMap.get(str2);
                if (linkedHashSet2 == null) {
                    linkedHashSet2 = new LinkedHashSet();
                    linkedHashMap.put(str2, linkedHashSet2);
                }
                Set set = (Set) linkedHashSet2;
                int iB2 = aja.b(aizVar.b);
                if (iB2 == 0) {
                    iB2 = aja.e;
                }
                if (iB2 == 0) {
                    throw null;
                }
                set.add(w(iB2));
            }
        }
        List listI = ffh.I(list, ajbVar.b);
        efm<ajb> efmVar = ajbVar.d;
        efmVar.getClass();
        ArrayList arrayList = new ArrayList(ffh.Q(efmVar));
        for (ajb ajbVar2 : efmVar) {
            ajbVar2.getClass();
            arrayList.add(v(ajbVar2, listI));
        }
        efm<aiv> efmVar2 = ajbVar.e;
        efmVar2.getClass();
        ArrayList arrayList2 = new ArrayList(ffh.Q(efmVar2));
        for (aiv aivVar : efmVar2) {
            aivVar.getClass();
            arrayList2.add(q(aivVar));
        }
        return new cdo(listI, linkedHashSet, linkedHashMap, arrayList, arrayList2);
    }

    private static cds w(int i) {
        cds cdsVar = cds.a;
        int i2 = cdr.a;
        int i3 = i - 2;
        if (i3 == -1 || i3 == 0) {
            Objects.toString(i != 0 ? aja.toString$ar$edu(i) : "null");
            throw new UnsupportedOperationException("Unknown usage type: ".concat(aja.toString$ar$edu(i)));
        }
        if (i3 == 1) {
            return cds.a;
        }
        if (i3 == 2) {
            return cds.b;
        }
        if (i3 == 3) {
            return cds.c;
        }
        throw new ffq();
    }

    public final void m(Level level, Executor executor, String str, Object... objArr) {
        n(level, executor, null, str, objArr);
    }

    public uq(byte[] bArr) {
    }

    public void g(boolean z) {
    }

    public void h(boolean z) {
    }
}
