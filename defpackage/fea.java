package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fea implements epe {
    private static final ThreadLocal a = new ThreadLocal();
    private final egp b;
    private final egi c;

    public fea(egi egiVar) {
        egiVar.getClass();
        this.c = egiVar;
        this.b = egiVar.getParserForType();
    }

    @Override // defpackage.epe
    public final /* bridge */ /* synthetic */ InputStream a(Object obj) {
        return new fdz((egi) obj, this.b);
    }

    @Override // defpackage.epe
    public final /* bridge */ /* synthetic */ Object b(InputStream inputStream) throws IOException {
        byte[] bArr;
        if (inputStream instanceof fdz) {
            fdz fdzVar = (fdz) inputStream;
            if (fdzVar.b == this.b) {
                try {
                    egi egiVar = fdzVar.a;
                    if (egiVar != null) {
                        return egiVar;
                    }
                    throw new IllegalStateException("message not available");
                } catch (IllegalStateException unused) {
                }
            }
        }
        try {
            eee eeeVarJ = null;
            if (inputStream instanceof env) {
                int iAvailable = inputStream.available();
                if (iAvailable > 0 && iAvailable <= 4194304) {
                    ThreadLocal threadLocal = a;
                    Reference reference = (Reference) threadLocal.get();
                    if (reference == null || (bArr = (byte[]) reference.get()) == null || bArr.length < iAvailable) {
                        bArr = new byte[iAvailable];
                        threadLocal.set(new WeakReference(bArr));
                    }
                    int i = iAvailable;
                    while (i > 0) {
                        int i2 = inputStream.read(bArr, iAvailable - i, i);
                        if (i2 == -1) {
                            break;
                        }
                        i -= i2;
                    }
                    if (i != 0) {
                        throw new RuntimeException("size inaccurate: " + iAvailable + " != " + (iAvailable - i));
                    }
                    eeeVarJ = eee.P(bArr, iAvailable);
                } else if (iAvailable == 0) {
                    return this.c;
                }
            }
            if (eeeVarJ == null) {
                eeeVarJ = eee.J(inputStream);
            }
            eeeVarJ.d = Integer.MAX_VALUE;
            try {
                Object objA = this.b.a(eeeVarJ, fec.a);
                try {
                    eeeVarJ.z(0);
                    return objA;
                } catch (efp e) {
                    throw e;
                }
            } catch (efp e2) {
                throw new eqr(eqo.k.e("Invalid protobuf byte sequence").d(e2));
            }
        } catch (IOException e3) {
            throw new RuntimeException(e3);
        }
    }
}
