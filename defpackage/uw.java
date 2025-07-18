package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uw implements Iterator {
    final /* synthetic */ ViewGroup a;
    private int b;

    public uw(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.getChildCount();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.b;
        this.b = i + 1;
        View childAt = this.a.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.b - 1;
        this.b = i;
        this.a.removeViewAt(i);
    }
}
