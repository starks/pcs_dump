package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahf implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    final ahc a;
    final ViewGroup b;

    public ahf(ahc ahcVar, ViewGroup viewGroup) {
        this.a = ahcVar;
        this.b = viewGroup;
    }

    private final void a() {
        this.b.getViewTreeObserver().removeOnPreDrawListener(this);
        this.b.removeOnAttachStateChangeListener(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e9 A[EDGE_INSN: B:156:0x01e9->B:88:0x01e9 BREAK  A[LOOP:1: B:18:0x008f->B:87:0x01e2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02cb A[EDGE_INSN: B:197:0x02cb->B:135:0x02cb BREAK  A[LOOP:8: B:104:0x0240->B:211:0x0240], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0213  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onPreDraw() {
        /*
            Method dump skipped, instructions count: 822
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahf.onPreDraw():boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
        ahg.b.remove(this.b);
        ArrayList arrayList = (ArrayList) ahg.a().get(this.b);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ahc) arrayList.get(i)).w(this.b);
            }
        }
        this.a.q(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
