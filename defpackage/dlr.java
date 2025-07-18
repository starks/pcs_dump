package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dlr implements dse {
    public static final dlr a = new dlr();
    public static final dsa b = new dsa(drg.class, dks.class, new dlt(1));

    @Override // defpackage.dse
    public final Class a() {
        return dks.class;
    }

    @Override // defpackage.dse
    public final Class b() {
        return dks.class;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.dse
    public final /* bridge */ /* synthetic */ Object c(fpv fpvVar) throws GeneralSecurityException {
        List arrayList;
        fsc fscVar = new fsc((byte[]) null, (short[]) null);
        for (dsd dsdVar : DesugarCollections.unmodifiableList(fpvVar.b)) {
            dwt dwtVar = dsdVar.b;
            int i = dsdVar.c;
            cnx cnxVar = new cnx();
            if (dwtVar.a() != 0 && dwtVar.a() != 5) {
                throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
            }
            if (fscVar.a.containsKey(dwtVar)) {
                arrayList = (List) fscVar.a.get(dwtVar);
            } else {
                arrayList = new ArrayList();
                fscVar.a.put(dwtVar, arrayList);
            }
            arrayList.add(cnxVar);
        }
        if (fpvVar.f()) {
            drq.a.a();
            drl.a(fpvVar);
        }
        dsd dsdVar2 = (dsd) fpvVar.d;
        int i2 = dsdVar2.c;
        int i3 = dry.a;
        return new doi(1);
    }
}
