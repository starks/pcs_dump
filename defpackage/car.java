package defpackage;

import android.database.ContentObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
final class car extends ContentObserver {
    final /* synthetic */ cat a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public car(cat catVar) {
        super(null);
        this.a = catVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.a.set(true);
    }
}
