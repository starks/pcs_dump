package defpackage;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eyb extends OutputStream {
    public final List a = new ArrayList();
    final /* synthetic */ eye b;
    private fcm c;

    public eyb(eye eyeVar) {
        this.b = eyeVar;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        fcm fcmVar = this.c;
        if (fcmVar == null || fcmVar.b <= 0) {
            write(new byte[]{(byte) i}, 0, 1);
            return;
        }
        fcmVar.a.P((byte) i);
        fcmVar.b--;
        fcmVar.c++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (this.c == null) {
            fcm fcmVarE = ffh.e(Math.max(4096, i2));
            this.c = fcmVarE;
            this.a.add(fcmVarE);
        }
        while (i2 > 0) {
            int iMin = Math.min(i2, this.c.b);
            if (iMin == 0) {
                int i3 = this.c.c;
                fcm fcmVarE2 = ffh.e(Math.max(i2, i3 + i3));
                this.c = fcmVarE2;
                this.a.add(fcmVarE2);
            } else {
                this.c.c(bArr, i, iMin);
                i += iMin;
                i2 -= iMin;
            }
        }
    }
}
