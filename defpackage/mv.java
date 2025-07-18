package defpackage;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mv extends mu {
    @Override // defpackage.mu
    public final /* bridge */ /* synthetic */ Object a(int i, Intent intent) {
        if (i != -1) {
            return fgn.a;
        }
        if (intent == null) {
            return fgn.a;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return fgn.a;
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i2 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i2 == 0));
        }
        List listAb = ffh.ab(stringArrayExtra);
        Iterator it = listAb.iterator();
        Iterator it2 = arrayList.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(ffh.Q(listAb), ffh.Q(arrayList)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList2.add(new ffs(it.next(), it2.next()));
        }
        return ffh.v(arrayList2);
    }
}
