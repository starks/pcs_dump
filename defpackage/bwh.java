package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bwh extends bki {
    final /* synthetic */ bvx a;
    final /* synthetic */ brb b;

    public bwh(brb brbVar, bvx bvxVar) {
        this.b = brbVar;
        this.a = bvxVar;
    }

    @Override // defpackage.bkj
    public final void a(Status status) {
        if (status.e == 0) {
            this.b.D(new brb(this.a));
        } else {
            this.b.C(new bix(status));
        }
    }
}
