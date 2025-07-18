package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ckt implements we {
    final /* synthetic */ int a;
    final /* synthetic */ BottomSheetBehavior b;

    public ckt(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.a = i;
        this.b = bottomSheetBehavior;
    }

    @Override // defpackage.we
    public final boolean a(View view) {
        this.b.I(this.a);
        return true;
    }
}
