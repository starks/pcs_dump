package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bln extends blg implements biw {
    private static volatile Executor s;
    private final Set t;
    private final Account u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected bln(Context context, Looper looper, int i, blh blhVar, bjx bjxVar, bkn bknVar) {
        super(context, looper, blp.j, bhs.a, i, new fuu(bjxVar, null), new fuu(bknVar, null), blhVar.e);
        synchronized (blp.b) {
            if (blp.j == null) {
                blp.j = new blp(context.getApplicationContext(), context.getMainLooper());
            }
        }
        this.u = blhVar.a;
        Set set = blhVar.c;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.t = set;
    }

    @Override // defpackage.blg
    public final bhq[] C() {
        return new bhq[0];
    }

    @Override // defpackage.blg, defpackage.biw
    public int a() {
        throw null;
    }

    @Override // defpackage.biw
    public final Set g() {
        return m() ? this.t : Collections.EMPTY_SET;
    }

    @Override // defpackage.blg
    public final Account r() {
        return this.u;
    }

    @Override // defpackage.blg
    protected final Set v() {
        return this.t;
    }

    @Override // defpackage.blg
    protected final void E() {
    }
}
