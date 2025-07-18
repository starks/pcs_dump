package defpackage;

import com.google.android.libraries.micore.learning.training.nativeshared.NativeLogManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ccw implements NativeLogManager {
    public final bqm a;
    public final String b;
    public final dfa c;
    private final fsc d;

    public ccw(bqm bqmVar, String str, dfa dfaVar, fsc fscVar) {
        this.a = bqmVar;
        this.b = str;
        this.c = dfaVar;
        this.d = fscVar;
    }

    @Override // com.google.android.libraries.micore.learning.training.nativeshared.NativeLogManager
    public final void logDebugDiag(int i) {
        this.d.S(new sp(this, i, 4));
    }

    @Override // com.google.android.libraries.micore.learning.training.nativeshared.NativeLogManager
    public final void logProdDiag(int i) {
        this.d.S(new sp(this, i, 5));
    }

    @Override // com.google.android.libraries.micore.learning.training.nativeshared.NativeLogManager
    public final void logToLongHistogram(int i, int i2, int i3, int i4, long j) {
        this.d.S(new ccv(this, i, i4, i2, i3, null, j));
    }

    @Override // com.google.android.libraries.micore.learning.training.nativeshared.NativeLogManager
    public final void logToLongHistogram(int i, int i2, int i3, int i4, String str, long j) {
        this.d.S(new ccv(this, i, i4, i2, i3, str, j));
    }
}
