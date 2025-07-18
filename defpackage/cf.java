package defpackage;

import android.support.v7.app.AlertController$RecycleListView;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cf implements AdapterView.OnItemClickListener {
    final /* synthetic */ AlertController$RecycleListView a;
    final /* synthetic */ cj b;
    final /* synthetic */ cg c;

    public cf(cg cgVar, AlertController$RecycleListView alertController$RecycleListView, cj cjVar) {
        this.c = cgVar;
        this.a = alertController$RecycleListView;
        this.b = cjVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        boolean[] zArr = this.c.r;
        if (zArr != null) {
            zArr[i] = this.a.isItemChecked(i);
        }
        this.c.v.onClick(this.b.b, i, this.a.isItemChecked(i));
    }
}
