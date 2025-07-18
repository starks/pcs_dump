package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dle {
    public final dvg a;
    public final List b;
    private final dri c;

    public dle(dvg dvgVar, List list, dri driVar) {
        this.a = dvgVar;
        this.b = list;
        this.c = driVar;
    }

    public static final dle b(dvg dvgVar) {
        f(dvgVar);
        return new dle(dvgVar, i(dvgVar));
    }

    public static dvf d(dky dkyVar, dla dlaVar, int i) throws GeneralSecurityException {
        int i2;
        dsf dsfVar = (dsf) drt.a.c(dkyVar, dsf.class, dln.a);
        Integer num = dsfVar.f;
        if (num != null && num.intValue() != i) {
            throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
        }
        if (dla.a.equals(dlaVar)) {
            i2 = dvd.b;
        } else if (dla.b.equals(dlaVar)) {
            i2 = dvd.c;
        } else {
            if (!dla.c.equals(dlaVar)) {
                throw new IllegalStateException("Unknown key status");
            }
            i2 = dvd.d;
        }
        asr asrVar = (asr) dvf.a.createBuilder();
        asr asrVar2 = (asr) dvc.a.createBuilder();
        String str = dsfVar.a;
        if (!asrVar2.a.isMutable()) {
            asrVar2.B();
        }
        dvc dvcVar = (dvc) asrVar2.a;
        str.getClass();
        dvcVar.b = str;
        eea eeaVar = dsfVar.c;
        if (!asrVar2.a.isMutable()) {
            asrVar2.B();
        }
        dvc dvcVar2 = (dvc) asrVar2.a;
        eeaVar.getClass();
        dvcVar2.c = eeaVar;
        dvb dvbVar = dsfVar.d;
        if (!asrVar2.a.isMutable()) {
            asrVar2.B();
        }
        ((dvc) asrVar2.a).d = dvbVar.a();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        dvf dvfVar = (dvf) asrVar.a;
        dvc dvcVar3 = (dvc) asrVar2.z();
        dvcVar3.getClass();
        dvfVar.c = dvcVar3;
        dvfVar.b |= 1;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dvf) asrVar.a).d = dvd.a(i2);
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dvf) asrVar.a).e = i;
        dvn dvnVar = dsfVar.e;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dvf) asrVar.a).f = dvnVar.a();
        return (dvf) asrVar.z();
    }

    public static void f(dvg dvgVar) {
        if (dvgVar == null || dvgVar.c.size() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public static void g(dvg dvgVar) {
        for (dvf dvfVar : dvgVar.c) {
            dvc dvcVar = dvfVar.c;
            if (dvcVar == null) {
                dvcVar = dvc.a;
            }
            dvb dvbVarB = dvb.b(dvcVar.d);
            if (dvbVarB == null) {
                dvbVarB = dvb.UNRECOGNIZED;
            }
            if (dvbVarB != dvb.UNKNOWN_KEYMATERIAL) {
                dvc dvcVar2 = dvfVar.c;
                if (dvcVar2 == null) {
                    dvcVar2 = dvc.a;
                }
                dvb dvbVarB2 = dvb.b(dvcVar2.d);
                if (dvbVarB2 == null) {
                    dvbVarB2 = dvb.UNRECOGNIZED;
                }
                if (dvbVarB2 != dvb.SYMMETRIC) {
                    dvc dvcVar3 = dvfVar.c;
                    if (dvcVar3 == null) {
                        dvcVar3 = dvc.a;
                    }
                    dvb dvbVarB3 = dvb.b(dvcVar3.d);
                    if (dvbVarB3 == null) {
                        dvbVarB3 = dvb.UNRECOGNIZED;
                    }
                    if (dvbVarB3 == dvb.ASYMMETRIC_PRIVATE) {
                    }
                }
            }
            dvc dvcVar4 = dvfVar.c;
            if (dvcVar4 == null) {
                dvcVar4 = dvc.a;
            }
            dvb dvbVarB4 = dvb.b(dvcVar4.d);
            if (dvbVarB4 == null) {
                dvbVarB4 = dvb.UNRECOGNIZED;
            }
            String strName = dvbVarB4.name();
            dvc dvcVar5 = dvfVar.c;
            if (dvcVar5 == null) {
                dvcVar5 = dvc.a;
            }
            throw new GeneralSecurityException(String.format("keyset contains key material of type %s for type url %s", strName, dvcVar5.b));
        }
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, java.util.Map] */
    private static dky h(dvf dvfVar) throws GeneralSecurityException {
        int i = dvfVar.e;
        dvn dvnVarB = dvn.b(dvfVar.f);
        if (dvnVarB == null) {
            dvnVarB = dvn.UNRECOGNIZED;
        }
        Integer numValueOf = dvnVarB == dvn.RAW ? null : Integer.valueOf(i);
        dvc dvcVar = dvfVar.c;
        if (dvcVar == null) {
            dvcVar = dvc.a;
        }
        String str = dvcVar.b;
        dvc dvcVar2 = dvfVar.c;
        if (dvcVar2 == null) {
            dvcVar2 = dvc.a;
        }
        eea eeaVar = dvcVar2.c;
        dvc dvcVar3 = dvfVar.c;
        if (dvcVar3 == null) {
            dvcVar3 = dvc.a;
        }
        dvb dvbVarB = dvb.b(dvcVar3.d);
        if (dvbVarB == null) {
            dvbVarB = dvb.UNRECOGNIZED;
        }
        dvn dvnVarB2 = dvn.b(dvfVar.f);
        if (dvnVarB2 == null) {
            dvnVarB2 = dvn.UNRECOGNIZED;
        }
        dsf dsfVarA = dsf.a(str, eeaVar, dvbVarB, dvnVarB2, numValueOf);
        drt drtVar = drt.a;
        AtomicReference atomicReference = drtVar.b;
        dln dlnVar = dln.a;
        return !((egc) atomicReference.get()).c.containsKey(new dsl(dsfVarA.getClass(), dsfVarA.b)) ? new drg(dsfVarA, dlnVar) : drtVar.a(dsfVarA, dlnVar);
    }

    private static List i(dvg dvgVar) {
        ArrayList arrayList = new ArrayList(dvgVar.c.size());
        for (dvf dvfVar : dvgVar.c) {
            int i = dvfVar.e;
            try {
                dky dkyVarH = h(dvfVar);
                int iB = dvd.b(dvfVar.d);
                if (iB == 0) {
                    iB = dvd.e;
                }
                arrayList.add(new dld(dkyVarH, k(iB), i, i == dvgVar.b));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    private final Object j(dkt dktVar, Class cls, Class cls2) throws GeneralSecurityException {
        int i = dlp.a;
        dvg dvgVar = this.a;
        int i2 = dvgVar.b;
        int i3 = 0;
        boolean z = false;
        boolean z2 = true;
        for (dvf dvfVar : dvgVar.c) {
            int iB = dvd.b(dvfVar.d);
            if (iB == 0) {
                iB = dvd.e;
            }
            if (iB == dvd.b) {
                if ((dvfVar.b & 1) == 0) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(dvfVar.e)));
                }
                dvn dvnVarB = dvn.b(dvfVar.f);
                if (dvnVarB == null) {
                    dvnVarB = dvn.UNRECOGNIZED;
                }
                if (dvnVarB == dvn.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(dvfVar.e)));
                }
                int iB2 = dvd.b(dvfVar.d);
                if (iB2 == 0) {
                    iB2 = dvd.e;
                }
                if (iB2 == dvd.a) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(dvfVar.e)));
                }
                if (dvfVar.e == i2) {
                    if (z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                dvc dvcVar = dvfVar.c;
                if (dvcVar == null) {
                    dvcVar = dvc.a;
                }
                dvb dvbVarB = dvb.b(dvcVar.d);
                if (dvbVarB == null) {
                    dvbVarB = dvb.UNRECOGNIZED;
                }
                z2 &= dvbVarB == dvb.ASYMMETRIC_PUBLIC;
                i3++;
            }
        }
        if (i3 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        dsc dscVar = new dsc(cls2);
        dri driVar = this.c;
        if (dscVar.b == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }
        dscVar.e = driVar;
        for (int i4 = 0; i4 < a(); i4++) {
            dvf dvfVar2 = (dvf) this.a.c.get(i4);
            int iB3 = dvd.b(dvfVar2.d);
            if (iB3 == 0) {
                iB3 = dvd.e;
            }
            boolean z3 = iB3 == dvd.b;
            if (iB3 == 0) {
                throw null;
            }
            if (z3) {
                dld dldVar = (dld) this.b.get(i4);
                if (dldVar == null) {
                    dvc dvcVar2 = dvfVar2.c;
                    if (dvcVar2 == null) {
                        dvcVar2 = dvc.a;
                    }
                    throw new GeneralSecurityException("Key parsing of key with index " + i4 + " and type_url " + dvcVar2.b + " failed, unable to get primitive");
                }
                Object obj = dldVar.c;
                try {
                    Object objA = dktVar.a((dky) obj, cls2);
                    if (dvfVar2.e == this.a.b) {
                        dscVar.a(objA, (dky) obj, dvfVar2, true);
                    } else {
                        dscVar.a(objA, (dky) obj, dvfVar2, false);
                    }
                } catch (GeneralSecurityException e) {
                    String string = cls2.toString();
                    dvc dvcVar3 = dvfVar2.c;
                    if (dvcVar3 == null) {
                        dvcVar3 = dvc.a;
                    }
                    throw new GeneralSecurityException("Unable to get primitive " + string + " for key of type " + dvcVar3.b + ", see https://developers.google.com/tink/faq/registration_errors", e);
                }
            }
        }
        Map map = dscVar.b;
        if (map == null) {
            throw new IllegalStateException("build cannot be called twice");
        }
        fpv fpvVar = new fpv(map, dscVar.c, dscVar.d, dscVar.e, dscVar.a);
        dscVar.b = null;
        return dktVar.b(fpvVar, cls);
    }

    private static dla k(int i) throws GeneralSecurityException {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 2;
        if (i2 == 1) {
            return dla.a;
        }
        if (i2 == 2) {
            return dla.b;
        }
        if (i2 == 3) {
            return dla.c;
        }
        throw new GeneralSecurityException("Unknown key status");
    }

    public final int a() {
        return this.b.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.dle c() throws java.security.GeneralSecurityException {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dle.c():dle");
    }

    public final Object e(dkt dktVar, Class cls) throws GeneralSecurityException {
        Class clsB = dlm.b(cls);
        if (clsB != null) {
            return j(dktVar, cls, clsB);
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(String.valueOf(cls.getName())));
    }

    public final String toString() {
        return dlp.a(this.a).toString();
    }

    private dle(dvg dvgVar, List list) {
        this.a = dvgVar;
        this.b = list;
        this.c = dri.a;
    }
}
