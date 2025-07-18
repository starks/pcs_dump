package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.as.oss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class awi extends awj {
    @Override // defpackage.awj
    public final int a() {
        return 4;
    }

    @Override // defpackage.awj
    public final awe b(ViewGroup viewGroup, avs avsVar) {
        int i = awo.s;
        return new awo(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.network_usage_item_info, viewGroup, false));
    }
}
