package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class drl {
    public static final dcr a = new dcr(null);

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    public static drk a(fpv fpvVar) throws GeneralSecurityException {
        dla dlaVar;
        euw euwVar = new euw(null, null, null);
        if (euwVar.a == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build()");
        }
        euwVar.c = fpvVar.a;
        Iterator it = fpvVar.d().iterator();
        while (it.hasNext()) {
            for (dsd dsdVar : (List) it.next()) {
                dky dkyVar = dsdVar.d;
                int i = dsdVar.e;
                int i2 = i - 2;
                if (i == 0) {
                    throw null;
                }
                if (i2 == 1) {
                    dlaVar = dla.a;
                } else if (i2 == 2) {
                    dlaVar = dla.b;
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    dlaVar = dla.c;
                }
                int i3 = dsdVar.c;
                Object obj = euwVar.a;
                if (obj == null) {
                    throw new IllegalStateException("addEntry cannot be called after build()");
                }
                ((ArrayList) obj).add(new drj(dlaVar, i3));
            }
        }
        Object obj2 = fpvVar.d;
        if (obj2 != null) {
            if (euwVar.a == null) {
                throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
            }
            euwVar.b = Integer.valueOf(((dsd) obj2).c);
        }
        try {
            if (euwVar.a == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            Object obj3 = euwVar.b;
            if (obj3 != null) {
                int iIntValue = ((Integer) obj3).intValue();
                ?? r2 = euwVar.a;
                int size = r2.size();
                int i4 = 0;
                while (i4 < size) {
                    int i5 = ((drj) r2.get(i4)).a;
                    i4++;
                    if (i5 == iIntValue) {
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            drk drkVar = new drk((dri) euwVar.c, DesugarCollections.unmodifiableList(euwVar.a), (Integer) euwVar.b);
            euwVar.a = null;
            return drkVar;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
