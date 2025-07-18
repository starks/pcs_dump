package defpackage;

import android.R;
import android.content.Context;
import android.support.v7.app.AlertController$RecycleListView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cd extends ArrayAdapter {
    final /* synthetic */ AlertController$RecycleListView a;
    final /* synthetic */ cg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd(cg cgVar, Context context, int i, CharSequence[] charSequenceArr, AlertController$RecycleListView alertController$RecycleListView) {
        super(context, i, R.id.text1, charSequenceArr);
        this.b = cgVar;
        this.a = alertController$RecycleListView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        cg cgVar = this.b;
        View view2 = super.getView(i, view, viewGroup);
        if (cgVar.r != null && this.b.r[i]) {
            this.a.setItemChecked(i, true);
        }
        return view2;
    }
}
