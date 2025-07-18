package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fuz {
    private final AtomicBoolean e = new AtomicBoolean(false);
    private final CountDownLatch f = new CountDownLatch(1);
    private byte[] g;
    private byte[] h;
    public static final fwv b = new fwv();
    private static final byte[] c = {42};
    private static final List d = ffh.z("*");
    public static final fuz a = new fuz();

    private final void c() {
        fjx fjxVar;
        fjx fjxVar2;
        InputStream resourceAsStream;
        CountDownLatch countDownLatch;
        boolean z = false;
        while (true) {
            try {
                try {
                    try {
                        fjxVar = new fjx();
                        fjxVar2 = new fjx();
                        resourceAsStream = fuz.class.getResourceAsStream("publicsuffixes.gz");
                        break;
                    } catch (InterruptedIOException unused) {
                        Thread.interrupted();
                        z = true;
                    } catch (IOException e) {
                        fup.c.k("Failed to read public suffix list", 5, e);
                    }
                } catch (Throwable th) {
                    this.f.countDown();
                    throw th;
                }
            } finally {
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        if (resourceAsStream == null) {
            countDownLatch = this.f;
        } else {
            Logger logger = fvu.a;
            fvz fvzVar = new fvz(new fvr(new fvt(resourceAsStream, new fwh())));
            try {
                fjxVar.a = fvzVar.G(fvzVar.f());
                fjxVar2.a = fvzVar.G(fvzVar.f());
                fjp.x(fvzVar, null);
                synchronized (this) {
                    Object obj = fjxVar.a;
                    obj.getClass();
                    this.g = (byte[]) obj;
                    Object obj2 = fjxVar2.a;
                    obj2.getClass();
                    this.h = (byte[]) obj2;
                }
                countDownLatch = this.f;
            } finally {
            }
        }
        countDownLatch.countDown();
    }

    public final List a(List list) {
        String str;
        String strO;
        String strO2;
        if (this.e.get() || !this.e.compareAndSet(false, true)) {
            try {
                this.f.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            c();
        }
        if (this.g == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size = list.size();
        byte[][] bArr = new byte[size][];
        for (int i = 0; i < size; i++) {
            String str2 = (String) list.get(i);
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            byte[] bytes = str2.getBytes(charset);
            bytes.getClass();
            bArr[i] = bytes;
        }
        int i2 = 0;
        while (true) {
            str = null;
            if (i2 >= size) {
                strO = null;
                break;
            }
            byte[] bArr2 = this.g;
            if (bArr2 == null) {
                fjs.b("publicSuffixListBytes");
                bArr2 = null;
            }
            strO = fwv.o(bArr2, bArr, i2);
            if (strO != null) {
                break;
            }
            i2++;
        }
        if (size > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int i3 = 0; i3 < length; i3++) {
                bArr3[i3] = c;
                byte[] bArr4 = this.g;
                if (bArr4 == null) {
                    fjs.b("publicSuffixListBytes");
                    bArr4 = null;
                }
                strO2 = fwv.o(bArr4, bArr3, i3);
                if (strO2 != null) {
                    break;
                }
            }
            strO2 = null;
        } else {
            strO2 = null;
        }
        if (strO2 != null) {
            int i4 = size - 1;
            int i5 = 0;
            while (true) {
                if (i5 >= i4) {
                    break;
                }
                byte[] bArr5 = this.h;
                if (bArr5 == null) {
                    fjs.b("publicSuffixExceptionListBytes");
                    bArr5 = null;
                }
                String strO3 = fwv.o(bArr5, bArr, i5);
                if (strO3 != null) {
                    str = strO3;
                    break;
                }
                i5++;
            }
        }
        if (str != null) {
            return fjz.C("!".concat(str), new char[]{'.'});
        }
        if (strO == null && strO2 == null) {
            return d;
        }
        List listC = strO != null ? fjz.C(strO, new char[]{'.'}) : fgm.a;
        List listC2 = strO2 != null ? fjz.C(strO2, new char[]{'.'}) : fgm.a;
        return listC.size() > listC2.size() ? listC : listC2;
    }

    public final List b(String str) {
        int i = 0;
        List listC = fjz.C(str, new char[]{'.'});
        if (!fjs.c(ffh.G(listC), "")) {
            return listC;
        }
        int i2 = fjs.i(listC.size() - 1, 0);
        if (i2 < 0) {
            throw new IllegalArgumentException(a.E(i2, "Requested element count ", " is less than zero."));
        }
        if (i2 == 0) {
            return fgm.a;
        }
        if (i2 >= listC.size()) {
            return ffh.L(listC);
        }
        if (i2 == 1) {
            return ffh.B(ffh.F(listC));
        }
        ArrayList arrayList = new ArrayList(i2);
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
            i++;
            if (i == i2) {
                break;
            }
        }
        return ffh.C(arrayList);
    }
}
