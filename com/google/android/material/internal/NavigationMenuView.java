package com.google.android.material.internal;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import defpackage.ff;
import defpackage.ft;

/* compiled from: PG */
/* loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements ft {
    public NavigationMenuView(Context context) {
        this(context, null);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        T(new LinearLayoutManager());
    }

    @Override // defpackage.ft
    public final void a(ff ffVar) {
    }
}
