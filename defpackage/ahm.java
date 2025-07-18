package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahm {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public ahm(fsc fscVar, zz zzVar, aag aagVar) {
        this.a = fscVar;
        this.c = zzVar;
        this.b = aagVar;
        this.d = new vr();
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, zz] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.Map] */
    public final zx a(fkk fkkVar, String str) {
        zx zxVarAi;
        synchronized (this.d) {
            zxVarAi = ((fsc) this.a).ai(str);
            if (fkkVar.c(zxVarAi)) {
                Object obj = this.c;
                if (obj instanceof aab) {
                    zxVarAi.getClass();
                }
                zxVarAi.getClass();
            } else {
                aah aahVar = new aah((aag) this.b);
                aahVar.a(aac.a, str);
                zxVarAi = vq.d(this.c, fkkVar, aahVar);
                zx zxVar = (zx) ((fsc) this.a).a.put(str, zxVarAi);
                if (zxVar != null) {
                    zxVar.f();
                }
            }
        }
        return zxVarAi;
    }

    public final ArrayList b(Object obj) {
        return (ArrayList) ((oc) this.c).get(obj);
    }

    public final void c(Object obj) {
        if (((oc) this.c).containsKey(obj)) {
            return;
        }
        ((oc) this.c).put(obj, null);
    }

    public final void d(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((oc) this.c).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                d(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public ahm(acq acqVar, int[] iArr, String[] strArr) {
        Object objSingleton;
        iArr.getClass();
        strArr.getClass();
        this.b = acqVar;
        this.a = iArr;
        this.c = strArr;
        int length = iArr.length;
        String[] strArr2 = strArr;
        int length2 = strArr2.length;
        if (length != length2) {
            throw new IllegalStateException("Check failed.");
        }
        if (length2 == 0) {
            objSingleton = fgo.a;
        } else {
            objSingleton = Collections.singleton(strArr2[0]);
            objSingleton.getClass();
        }
        this.d = objSingleton;
    }

    public ahm(byte[] bArr) {
        this.a = new tl(10);
        this.c = new oc();
        this.b = new ArrayList();
        this.d = new HashSet();
    }

    public ahm() {
        this.a = new nv();
        this.b = new SparseArray();
        this.c = new nz();
        this.d = new nv();
    }
}
