package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgx {
    public static final /* synthetic */ int a = 0;
    private static final AtomicBoolean b = new AtomicBoolean(false);

    public static void a(final int... iArr) {
        if (b.compareAndSet(false, true)) {
            bga.e(new bfz() { // from class: cgw
                @Override // defpackage.bfz
                public final bfx a(bfx bfxVar) {
                    int i = cgx.a;
                    int[] iArr2 = iArr;
                    try {
                        if (bfxVar.a.c()) {
                            throw new IllegalArgumentException("addExperimentIds forbidden on deidentified logger");
                        }
                        if (bfxVar.d == null) {
                            bfxVar.d = new ArrayList();
                        }
                        bfxVar.d.add(Integer.valueOf(iArr2[0]));
                        return bfxVar;
                    } catch (IllegalArgumentException unused) {
                        return bfxVar;
                    }
                }
            });
        }
    }
}
