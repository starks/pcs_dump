package defpackage;

import android.os.Parcel;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
final class esi {
    public final erm a;
    public final int b;
    public final fbh c;
    public epc d;
    public eqo e;
    public epc f;
    private boolean g;
    private InputStream h;
    private Queue i;
    private boolean j;
    private int k;
    private int l;
    private int m;
    private int n;

    public esi(erm ermVar, int i, fbh fbhVar) {
        this.n = 1;
        this.a = ermVar;
        this.b = i;
        this.c = fbhVar;
    }

    private final void i(int i) {
        int i2 = this.n;
        int i3 = i - 1;
        if (i3 == 1) {
            clq.F(i2 == 1);
        } else if (i3 == 2) {
            clq.F(i2 == 2);
        } else if (i3 == 3) {
            clq.F(i2 == 3);
        }
        this.n = i;
    }

    final void a(InputStream inputStream) {
        b();
        Queue queue = this.i;
        if (queue != null) {
            queue.add(inputStream);
        } else {
            if (this.h == null) {
                this.h = inputStream;
                return;
            }
            ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
            this.i = concurrentLinkedQueue;
            concurrentLinkedQueue.add(inputStream);
        }
    }

    protected final void b() {
        this.g = true;
    }

    protected final void c() {
        this.j = true;
    }

    final void d() throws eqp {
        int i;
        int i2;
        while (true) {
            int i3 = this.n;
            int i4 = i3 - 1;
            InputStream inputStream = null;
            if (i3 == 0) {
                throw null;
            }
            int iG = 1;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2 || !this.j) {
                        return;
                    }
                } else if (!f() && !this.j) {
                    return;
                }
            } else if (!this.g) {
                return;
            }
            if (!e()) {
                return;
            }
            try {
                try {
                    esj esjVarC = esj.c();
                    try {
                        int i5 = 0;
                        esjVarC.a().writeInt(0);
                        Parcel parcelA = esjVarC.a();
                        int i6 = this.k;
                        this.k = i6 + 1;
                        parcelA.writeInt(i6);
                        int i7 = this.n;
                        int i8 = i7 - 1;
                        if (i7 == 0) {
                            throw null;
                        }
                        if (i8 == 0) {
                            h(esjVarC.a());
                            i(2);
                            if (f() || this.j) {
                                i = 1;
                            } else {
                                fbc.g(esjVarC.a(), iG);
                                int iDataSize = esjVarC.a().dataSize();
                                this.a.j(this.b, esjVarC);
                                this.c.a(iDataSize);
                                this.c.h();
                                esjVarC.close();
                            }
                        } else if (i8 == 1) {
                            i = 0;
                        } else {
                            if (i8 != 2) {
                                throw new AssertionError();
                            }
                            iG = i5 | 4 | g(esjVarC.a());
                            i(4);
                            fbc.g(esjVarC.a(), iG);
                            int iDataSize2 = esjVarC.a().dataSize();
                            this.a.j(this.b, esjVarC);
                            this.c.a(iDataSize2);
                            this.c.h();
                            esjVarC.close();
                        }
                        if (this.l == 0) {
                            inputStream = this.h;
                        } else {
                            Queue queue = this.i;
                            if (queue != null) {
                                inputStream = (InputStream) queue.peek();
                            }
                        }
                        if (inputStream != null) {
                            int i9 = i | 2;
                            Parcel parcelA2 = esjVarC.a();
                            if (inputStream instanceof esk) {
                                this.m = ((esk) inputStream).a(parcelA2);
                                i2 = 64;
                                iG = 0;
                            } else {
                                byte[] bArrB = eru.b();
                                try {
                                    int i10 = inputStream.read(bArrB);
                                    if (i10 <= 0) {
                                        parcelA2.writeInt(0);
                                    } else {
                                        parcelA2.writeInt(i10);
                                        parcelA2.writeByteArray(bArrB, 0, i10);
                                        this.m += i10;
                                        if (i10 == bArrB.length) {
                                            i2 = 128;
                                        }
                                    }
                                    iG = 0;
                                    i2 = 0;
                                } finally {
                                    eru.a(bArrB);
                                }
                            }
                            if (iG == 0) {
                                inputStream.close();
                                int i11 = this.l;
                                this.l = i11 + 1;
                                if (i11 > 0) {
                                    Queue queue2 = this.i;
                                    queue2.getClass();
                                    queue2.poll();
                                }
                                this.c.f();
                                this.c.g();
                                this.m = 0;
                            }
                            i = i9 | i2;
                        } else {
                            clq.F(this.j);
                        }
                        iG = i;
                        if (this.j && !f()) {
                            i(3);
                            i5 = iG;
                            iG = i5 | 4 | g(esjVarC.a());
                            i(4);
                        }
                        fbc.g(esjVarC.a(), iG);
                        int iDataSize22 = esjVarC.a().dataSize();
                        this.a.j(this.b, esjVarC);
                        this.c.a(iDataSize22);
                        this.c.h();
                        esjVarC.close();
                    } catch (Throwable th) {
                        try {
                            esjVarC.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    throw new eqp(eqo.k.d(e));
                }
            } catch (eqp e2) {
                i(5);
                throw e2;
            }
        }
    }

    final boolean e() {
        return this.a.l();
    }

    protected final boolean f() {
        Queue queue = this.i;
        return queue != null ? !queue.isEmpty() : this.h != null && this.l == 0;
    }

    protected final int g(Parcel parcel) {
        int iF = fbc.f(parcel, this.e);
        esd.b(parcel, this.f);
        this.a.k(this.b);
        return iF;
    }

    protected final void h(Parcel parcel) {
        esd.b(parcel, this.d);
    }

    public final synchronized String toString() {
        String simpleName;
        int i;
        simpleName = getClass().getSimpleName();
        i = this.n;
        return simpleName + "[S=" + (i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "CLOSED" : "SUFFIX_SENT" : "ALL_MESSAGES_SENT" : "PREFIX_SENT" : "INITIAL") + "/NDM=" + this.l + "]";
    }

    public esi(erm ermVar, int i, fbh fbhVar, byte[] bArr) {
        this(ermVar, i, fbhVar);
    }
}
