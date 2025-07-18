package android.support.v7.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.fe;
import defpackage.ff;
import defpackage.fh;
import defpackage.ft;
import defpackage.zw;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements AdapterView.OnItemClickListener, fe, ft {
    private static final int[] a = {R.attr.background, R.attr.divider};
    private ff b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // defpackage.ft
    public final void a(ff ffVar) {
        this.b = ffVar;
    }

    @Override // defpackage.fe
    public final boolean b(fh fhVar) {
        throw null;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.b.z((fh) getAdapter().getItem(i), 0);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        zw zwVarR = zw.r(context, attributeSet, a, i, 0);
        if (zwVarR.o(0)) {
            setBackgroundDrawable(zwVarR.i(0));
        }
        if (zwVarR.o(1)) {
            setDivider(zwVarR.i(1));
        }
        zwVarR.m();
    }
}
