package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aw implements au {
    final /* synthetic */ ax a;

    public aw(ax axVar) {
        this.a = axVar;
    }

    @Override // defpackage.au
    public final boolean i(ArrayList arrayList, ArrayList arrayList2) {
        boolean zAf;
        int i;
        ax axVar = this.a;
        if (ax.X(2)) {
            Objects.toString(axVar.b);
        }
        int i2 = 0;
        if (axVar.d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            zAf = false;
        } else {
            axVar.f = (d) axVar.d.get(r1.size() - 1);
            ArrayList arrayList3 = axVar.f.d;
            int size = arrayList3.size();
            for (int i3 = 0; i3 < size; i3++) {
                ab abVar = ((be) arrayList3.get(i3)).b;
                if (abVar != null) {
                    abVar.r = true;
                }
            }
            zAf = axVar.af(arrayList, arrayList2, -1, 0);
        }
        if (!this.a.i.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).booleanValue();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size2 = arrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                linkedHashSet.addAll(ax.ac((d) arrayList.get(i4)));
            }
            ArrayList arrayList4 = this.a.i;
            int size3 = arrayList4.size();
            while (i2 < size3) {
                at atVar = (at) arrayList4.get(i2);
                Iterator it = linkedHashSet.iterator();
                while (true) {
                    i = i2 + 1;
                    if (it.hasNext()) {
                        atVar.e();
                    }
                }
                i2 = i;
            }
        }
        return zAf;
    }
}
