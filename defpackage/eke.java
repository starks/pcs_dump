package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eke extends ContextWrapper {
    public ab a;
    public LayoutInflater b;
    public LayoutInflater c;
    private final yx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eke(Context context, ab abVar) {
        super(context);
        ebq.w(context);
        lt ltVar = new lt(this, 5, null);
        this.d = ltVar;
        this.b = null;
        this.a = abVar;
        abVar.X.b(ltVar);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.c == null) {
            if (this.b == null) {
                this.b = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
            }
            this.c = this.b.cloneInContext(this);
        }
        return this.c;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public eke(LayoutInflater layoutInflater, ab abVar) {
        ebq.w(layoutInflater);
        Context context = layoutInflater.getContext();
        ebq.w(context);
        super(context);
        lt ltVar = new lt(this, 5, null);
        this.d = ltVar;
        this.b = layoutInflater;
        this.a = abVar;
        abVar.X.b(ltVar);
    }
}
