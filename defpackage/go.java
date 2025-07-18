package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewDebug;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class go extends jb {

    @ViewDebug.ExportedProperty
    public boolean a;

    @ViewDebug.ExportedProperty
    public int b;

    @ViewDebug.ExportedProperty
    public int c;

    @ViewDebug.ExportedProperty
    public boolean d;

    @ViewDebug.ExportedProperty
    public boolean e;
    public boolean f;

    public go() {
        super(-2);
        this.a = false;
    }

    public go(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public go(go goVar) {
        super((ViewGroup.LayoutParams) goVar);
        this.a = goVar.a;
    }

    public go(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }
}
