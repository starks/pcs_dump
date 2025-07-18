package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class am implements aew {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public am(cm cmVar, int i) {
        this.b = i;
        this.a = cmVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.aew
    public final Bundle a() {
        ffs[] ffsVarArr;
        int i = this.b;
        if (i == 0) {
            return ((ax) this.a).b();
        }
        if (i == 1) {
            ae aeVar = (ae) this.a;
            aeVar.c();
            aeVar.a.d(yu.ON_STOP);
            return new Bundle();
        }
        if (i == 2) {
            Bundle bundle = new Bundle();
            ((cm) this.a).q();
            return bundle;
        }
        if (i == 3) {
            Bundle bundle2 = new Bundle();
            ms msVar = ((lx) this.a).g;
            bundle2.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(msVar.b.values()));
            bundle2.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(msVar.b.keySet()));
            bundle2.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(msVar.d));
            bundle2.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(msVar.g));
            return bundle2;
        }
        fpv fpvVar = (fpv) this.a;
        for (Map.Entry entry : ffh.w(fpvVar.a).entrySet()) {
            fpvVar.m((String) entry.getKey(), ((fui) entry.getValue()).j());
        }
        for (Map.Entry entry2 : ffh.w(fpvVar.b).entrySet()) {
            fpvVar.m((String) entry2.getKey(), ((aew) entry2.getValue()).a());
        }
        ?? r5 = fpvVar.c;
        if (r5.isEmpty()) {
            ffsVarArr = new ffs[0];
        } else {
            ArrayList arrayList = new ArrayList(r5.size());
            for (Map.Entry entry3 : r5.entrySet()) {
                arrayList.add(new ffs((String) entry3.getKey(), entry3.getValue()));
            }
            ffsVarArr = (ffs[]) arrayList.toArray(new ffs[0]);
        }
        return un.E((ffs[]) Arrays.copyOf(ffsVarArr, ffsVarArr.length));
    }

    public /* synthetic */ am(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
