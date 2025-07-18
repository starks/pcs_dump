package defpackage;

import com.google.android.libraries.micore.learning.training.nativeshared.NativeExampleIterator;
import com.google.android.libraries.micore.learning.training.util.StatusOr;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cct implements NativeExampleIterator {
    public final /* synthetic */ ccu a;
    public final bxq b;
    final /* synthetic */ bxq c;

    public cct(ccu ccuVar, bxq bxqVar) {
        this.c = bxqVar;
        this.a = ccuVar;
        this.b = bxqVar;
    }

    @Override // com.google.android.libraries.micore.learning.training.nativeshared.NativeExampleIterator, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.e.S(new bkd(this, this.c, 19, (char[]) null));
    }

    @Override // com.google.android.libraries.micore.learning.training.nativeshared.NativeExampleIterator
    public final StatusOr next() {
        return (StatusOr) this.a.e.R(new bri(this, 2));
    }
}
