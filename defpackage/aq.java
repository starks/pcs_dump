package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aq implements mq {
    final /* synthetic */ ax a;
    private final /* synthetic */ int b;

    public aq(ax axVar, int i) {
        this.b = i;
        this.a = axVar;
    }

    @Override // defpackage.mq
    public final /* synthetic */ void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            mp mpVar = (mp) obj;
            as asVar = (as) this.a.p.pollLast();
            if (asVar == null) {
                toString();
                Log.w("FragmentManager", "No Activities were started for result for ".concat(toString()));
                return;
            }
            bd bdVar = this.a.c;
            String str = asVar.a;
            ab abVarC = bdVar.c(str);
            if (abVarC == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment ".concat(String.valueOf(str)));
                return;
            } else {
                abVarC.L(asVar.b, mpVar.a, mpVar.b);
                return;
            }
        }
        if (i != 1) {
            mp mpVar2 = (mp) obj;
            as asVar2 = (as) this.a.p.pollFirst();
            if (asVar2 == null) {
                toString();
                Log.w("FragmentManager", "No IntentSenders were started for ".concat(toString()));
                return;
            }
            bd bdVar2 = this.a.c;
            String str2 = asVar2.a;
            ab abVarC2 = bdVar2.c(str2);
            if (abVarC2 == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment ".concat(String.valueOf(str2)));
                return;
            } else {
                abVarC2.L(asVar2.b, mpVar2.a, mpVar2.b);
                return;
            }
        }
        Map map = (Map) obj;
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            iArr[i2] = true != ((Boolean) arrayList.get(i2)).booleanValue() ? -1 : 0;
        }
        as asVar3 = (as) this.a.p.pollFirst();
        if (asVar3 == null) {
            toString();
            Log.w("FragmentManager", "No permissions were requested for ".concat(toString()));
            return;
        }
        bd bdVar3 = this.a.c;
        String str3 = asVar3.a;
        if (bdVar3.c(str3) == null) {
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment ".concat(String.valueOf(str3)));
        }
    }
}
