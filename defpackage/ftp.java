package defpackage;

import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftp extends frk {
    final /* synthetic */ ftv d;
    final /* synthetic */ int e;
    final /* synthetic */ List f;
    final /* synthetic */ boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ftp(String str, ftv ftvVar, int i, List list, boolean z) {
        super(str);
        this.d = ftvVar;
        this.e = i;
        this.f = list;
        this.g = z;
    }

    @Override // defpackage.frk
    public final long a() {
        try {
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
