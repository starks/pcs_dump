package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.as.oss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class awg extends awj {
    @Override // defpackage.awj
    public final int a() {
        return 2;
    }

    @Override // defpackage.awj
    public final awe b(ViewGroup viewGroup, avs avsVar) {
        int i = avv.s;
        return new avv(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.date_divider, viewGroup, false));
    }
}
