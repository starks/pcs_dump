package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.as.oss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class awh extends awj {
    @Override // defpackage.awj
    public final int a() {
        return 3;
    }

    @Override // defpackage.awj
    public final awe b(ViewGroup viewGroup, avs avsVar) {
        int i = axg.s;
        return new axg(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.summary_banner, viewGroup, false));
    }
}
