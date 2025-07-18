package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eye implements evn {
    public final ffh a;
    private final eyd b;
    private int d;
    private final fbh i;
    private boolean j;
    private int k;
    private long m;
    private fcm n;
    private int c = -1;
    private eme e = emc.a;
    private final boolean f = true;
    private final eyc g = new eyc(this);
    private final ByteBuffer h = ByteBuffer.allocate(5);
    private int l = -1;

    public eye(eyd eydVar, ffh ffhVar, fbh fbhVar) {
        this.b = eydVar;
        this.a = ffhVar;
        this.i = fbhVar;
    }

    private static int h(InputStream inputStream, OutputStream outputStream) throws IOException {
        fdz fdzVar = (fdz) inputStream;
        egi egiVar = fdzVar.a;
        if (egiVar != null) {
            int serializedSize = egiVar.getSerializedSize();
            fdzVar.a.writeTo(outputStream);
            fdzVar.a = null;
            return serializedSize;
        }
        ByteArrayInputStream byteArrayInputStream = fdzVar.c;
        if (byteArrayInputStream == null) {
            return 0;
        }
        int i = fec.b;
        outputStream.getClass();
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int i2 = byteArrayInputStream.read(bArr);
            if (i2 == -1) {
                int i3 = (int) j;
                fdzVar.c = null;
                return i3;
            }
            outputStream.write(bArr, 0, i2);
            j += i2;
        }
    }

    private final void i(boolean z, boolean z2) {
        fcm fcmVar = this.n;
        this.n = null;
        this.b.q(fcmVar, z, z2, this.k);
        this.k = 0;
    }

    private final void j(eyb eybVar, boolean z) {
        Iterator it = eybVar.a.iterator();
        int iA = 0;
        while (it.hasNext()) {
            iA += ((fcm) it.next()).a();
        }
        int i = this.c;
        if (i >= 0 && iA > i) {
            throw new eqr(eqo.h.e(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iA), Integer.valueOf(this.c))));
        }
        this.h.clear();
        this.h.put(z ? (byte) 1 : (byte) 0).putInt(iA);
        ByteBuffer byteBuffer = this.h;
        fcm fcmVarE = ffh.e(5);
        fcmVarE.c(byteBuffer.array(), 0, byteBuffer.position());
        if (iA == 0) {
            this.n = fcmVarE;
            return;
        }
        this.b.q(fcmVarE, false, false, this.k - 1);
        this.k = 1;
        List list = eybVar.a;
        for (int i2 = 0; i2 < list.size() - 1; i2++) {
            this.b.q((fcm) list.get(i2), false, false, 0);
        }
        this.n = (fcm) list.get(list.size() - 1);
        this.m = iA;
    }

    @Override // defpackage.evn
    public final void a() {
        if (this.j) {
            return;
        }
        this.j = true;
        fcm fcmVar = this.n;
        if (fcmVar != null && fcmVar.a() == 0 && this.n != null) {
            this.n = null;
        }
        i(true, true);
    }

    @Override // defpackage.evn
    public final void b() {
        fcm fcmVar = this.n;
        if (fcmVar == null || fcmVar.a() <= 0) {
            return;
        }
        i(false, true);
    }

    @Override // defpackage.evn
    public final void c(int i) {
        clq.G(this.c == -1, "max size already set");
        this.c = i;
    }

    @Override // defpackage.evn
    public final void d(InputStream inputStream) throws IOException {
        int iH;
        if (this.j) {
            throw new IllegalStateException("Framer already closed");
        }
        this.k++;
        this.l++;
        this.m = 0L;
        this.i.f();
        boolean z = this.e != emc.a;
        try {
            int iAvailable = inputStream.available();
            if (iAvailable != 0 && z) {
                eyb eybVar = new eyb(this);
                OutputStream outputStreamB = this.e.b(eybVar);
                try {
                    iH = h(inputStream, outputStreamB);
                    outputStreamB.close();
                    int i = this.c;
                    if (i >= 0 && iH > i) {
                        throw new eqr(eqo.h.e(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iH), Integer.valueOf(this.c))));
                    }
                    j(eybVar, true);
                } catch (Throwable th) {
                    outputStreamB.close();
                    throw th;
                }
            } else if (iAvailable != -1) {
                this.m = iAvailable;
                int i2 = this.c;
                if (i2 >= 0 && iAvailable > i2) {
                    throw new eqr(eqo.h.e(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iAvailable), Integer.valueOf(this.c))));
                }
                this.h.clear();
                this.h.put((byte) 0).putInt(iAvailable);
                this.d = iAvailable + 5;
                g(this.h.array(), 0, this.h.position());
                iH = h(inputStream, this.g);
            } else {
                eyb eybVar2 = new eyb(this);
                iH = h(inputStream, eybVar2);
                j(eybVar2, false);
            }
            if (iAvailable != -1 && iH != iAvailable) {
                throw new eqr(eqo.k.e(String.format("Message length inaccurate %s != %s", Integer.valueOf(iH), Integer.valueOf(iAvailable))));
            }
            this.i.h();
            this.i.a(this.m);
            this.i.g();
        } catch (eqr e) {
            throw e;
        } catch (IOException e2) {
            throw new eqr(eqo.k.e("Failed to frame message").d(e2));
        } catch (RuntimeException e3) {
            throw new eqr(eqo.k.e("Failed to frame message").d(e3));
        }
    }

    @Override // defpackage.evn
    public final boolean e() {
        return this.j;
    }

    @Override // defpackage.evn
    public final /* synthetic */ void f(eme emeVar) {
        this.e = emeVar;
    }

    public final void g(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            fcm fcmVar = this.n;
            if (fcmVar != null && fcmVar.b() == 0) {
                i(false, false);
            }
            if (this.n == null) {
                clq.G(this.d > 0, "knownLengthPendingAllocation reached 0");
                fcm fcmVarE = ffh.e(this.d);
                this.n = fcmVarE;
                int i3 = this.d;
                this.d = i3 - Math.min(i3, fcmVarE.b());
            }
            int iMin = Math.min(i2, this.n.b());
            this.n.c(bArr, i, iMin);
            i += iMin;
            i2 -= iMin;
        }
    }
}
