package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ce implements AdapterView.OnItemClickListener {
    final /* synthetic */ cj a;
    final /* synthetic */ cg b;

    public ce(cg cgVar, cj cjVar) {
        this.b = cgVar;
        this.a = cjVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.b.p.onClick(this.a.b, i);
        if (this.b.t) {
            return;
        }
        this.a.b.dismiss();
    }
}
