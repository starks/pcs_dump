package defpackage;

import android.content.Context;
import com.google.android.gms.learning.dynamite.training.InAppTrainerImpl;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class btk implements crp {
    public final /* synthetic */ InAppTrainerImpl a;
    public final /* synthetic */ bxh b;
    public final /* synthetic */ bpz c;
    public final /* synthetic */ Context d;
    private final /* synthetic */ int e;

    public /* synthetic */ btk(InAppTrainerImpl inAppTrainerImpl, bxh bxhVar, bpz bpzVar, Context context, int i) {
        this.e = i;
        this.a = inAppTrainerImpl;
        this.b = bxhVar;
        this.c = bpzVar;
        this.d = context;
    }

    @Override // defpackage.crp
    public final Object a(Object obj) {
        if (this.e != 0) {
            Context context = this.d;
            bpz bpzVar = this.c;
            bxh bxhVar = this.b;
            return InAppTrainerImpl.m19$r8$lambda$la1LnQIx2Jdc3Ai9gU7LAtJkuk(this.a, bxhVar, bpzVar, context, (RuntimeException) obj);
        }
        Context context2 = this.d;
        bpz bpzVar2 = this.c;
        bxh bxhVar2 = this.b;
        return InAppTrainerImpl.m17$r8$lambda$PySnkXftCowkSDxm2KfNnLj1kk(this.a, bxhVar2, bpzVar2, context2, (RuntimeException) obj);
    }
}
