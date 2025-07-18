package defpackage;

import android.os.Trace;
import android.util.StatsEvent;
import android.util.StatsLog;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwu extends fwq {
    public fwu() {
        new AtomicInteger();
    }

    @Override // defpackage.fwq
    public final void a(fwo fwoVar) {
        new fwk("CronetLoggerImpl#logCronetEngineBuilderInitializedInfo");
        try {
            int i = fwoVar.e;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            int i3 = 0;
            int i4 = i2 != 0 ? 0 : 1;
            int i5 = fwoVar.a;
            int i6 = fwoVar.f;
            int i7 = i6 - 1;
            if (i6 == 0) {
                throw null;
            }
            int i8 = 3;
            if (i7 == 1) {
                i3 = 1;
            } else if (i7 == 2) {
                i3 = 2;
            } else if (i7 == 3) {
                i3 = 3;
            }
            Boolean bool = fwoVar.b;
            if (bool == null) {
                i8 = 1;
            } else {
                bool.booleanValue();
            }
            fwp fwpVar = fwoVar.c;
            int i9 = fwpVar.a;
            int i10 = fwpVar.b;
            int i11 = fwpVar.c;
            int i12 = fwpVar.d;
            int i13 = fwoVar.d;
            StatsEvent.Builder builderNewBuilder = StatsEvent.newBuilder();
            builderNewBuilder.setAtomId(762);
            builderNewBuilder.writeLong(0L);
            builderNewBuilder.writeInt(i4);
            builderNewBuilder.writeInt(i5);
            builderNewBuilder.writeInt(i3);
            builderNewBuilder.writeInt(i8 - 1);
            builderNewBuilder.writeInt(i9);
            builderNewBuilder.writeInt(i10);
            builderNewBuilder.writeInt(i11);
            builderNewBuilder.writeInt(i12);
            builderNewBuilder.writeInt(-1);
            builderNewBuilder.writeInt(-1);
            builderNewBuilder.writeInt(-1);
            builderNewBuilder.writeInt(-1);
            builderNewBuilder.writeInt(i13);
            builderNewBuilder.addBooleanAnnotation((byte) 1, true);
            builderNewBuilder.usePooledBuffer();
            StatsLog.write(builderNewBuilder.build());
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
