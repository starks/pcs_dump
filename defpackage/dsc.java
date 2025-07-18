package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dsc {
    public final Class a;
    public dsd d;
    public Map b = new HashMap();
    public final List c = new ArrayList();
    public dri e = dri.a;

    public dsc(Class cls) {
        this.a = cls;
    }

    public final void a(Object obj, dky dkyVar, dvf dvfVar, boolean z) {
        byte[] bArrC;
        if (this.b == null) {
            throw new IllegalStateException("addEntry cannot be called after build");
        }
        int iB = dvd.b(dvfVar.d);
        if (iB == 0) {
            iB = dvd.e;
        }
        if (iB != dvd.b) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        dvn dvnVarB = dvn.b(dvfVar.f);
        if (dvnVarB == null) {
            dvnVarB = dvn.UNRECOGNIZED;
        }
        int iOrdinal = dvnVarB.ordinal();
        if (iOrdinal == 1) {
            bArrC = dru.b(dvfVar.e).c();
        } else if (iOrdinal == 2) {
            bArrC = dru.a(dvfVar.e).c();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrC = dru.a(dvfVar.e).c();
        } else {
            bArrC = dku.a;
        }
        dwt dwtVarB = dwt.b(bArrC);
        int iB2 = dvd.b(dvfVar.d);
        if (iB2 == 0) {
            iB2 = dvd.e;
        }
        dsd dsdVar = new dsd(obj, dwtVarB, iB2, dvfVar.e, dkyVar);
        Map map = this.b;
        List list = this.c;
        ArrayList arrayList = new ArrayList();
        arrayList.add(dsdVar);
        List list2 = (List) map.put(dsdVar.b, DesugarCollections.unmodifiableList(arrayList));
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list2);
            arrayList2.add(dsdVar);
            map.put(dsdVar.b, DesugarCollections.unmodifiableList(arrayList2));
        }
        list.add(dsdVar);
        if (z) {
            if (this.d != null) {
                throw new IllegalStateException("you cannot set two primary primitives");
            }
            this.d = dsdVar;
        }
    }
}
