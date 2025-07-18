package defpackage;

import android.os.Parcel;
import com.google.android.apps.aicore.aidl.ICancellationCallback;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aln extends akh implements alo {
    final /* synthetic */ ICancellationCallback a;

    public aln() {
        super("com.google.android.apps.miphone.astrea.ai.aidl.PccCancellationCallback");
    }

    public final void a() {
        ICancellationCallback iCancellationCallback = this.a;
        if (iCancellationCallback != null) {
            iCancellationCallback.cancel();
        }
    }

    @Override // defpackage.akh
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        a();
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aln(ICancellationCallback iCancellationCallback) {
        this();
        this.a = iCancellationCallback;
    }
}
