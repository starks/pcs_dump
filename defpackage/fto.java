package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fto extends frk {
    final /* synthetic */ ftv d;
    final /* synthetic */ int e;
    final /* synthetic */ fvk f;
    final /* synthetic */ int g;
    final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fto(String str, ftv ftvVar, int i, fvk fvkVar, int i2, boolean z) {
        super(str);
        this.d = ftvVar;
        this.e = i;
        this.f = fvkVar;
        this.g = i2;
        this.h = z;
    }

    @Override // defpackage.frk
    public final long a() {
        try {
            this.d.m.a(this.f, this.g);
            this.d.w.h(this.e, fta.i);
            synchronized (this.d) {
                this.d.y.remove(Integer.valueOf(this.e));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
