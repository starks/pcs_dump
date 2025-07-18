package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ezk implements Runnable {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ezk(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        frk frkVar;
        long jG;
        long j;
        boolean z;
        switch (this.b) {
            case 0:
                ezv ezvVar = (ezv) this.a;
                if (ezvVar.A) {
                    return;
                }
                ezvVar.w.e();
                return;
            case 1:
                ((eze) this.a).f.A = true;
                ezv ezvVar2 = ((eze) this.a).f;
                ety etyVar = ezvVar2.w;
                fcy fcyVar = ezvVar2.F;
                etyVar.a((eqo) fcyVar.c, (etx) fcyVar.b, (epc) fcyVar.a);
                return;
            case 2:
                ((ezs) this.a).b.A = true;
                ezv ezvVar3 = ((ezs) this.a).b;
                ety etyVar2 = ezvVar3.w;
                fcy fcyVar2 = ezvVar3.F;
                etyVar2.a((eqo) fcyVar2.c, (etx) fcyVar2.b, (epc) fcyVar2.a);
                return;
            case 3:
                ezv ezvVar4 = ((ezs) this.a).b;
                if (ezvVar4.A) {
                    return;
                }
                ezvVar4.w.e();
                return;
            case 4:
                ((epo) this.a).b();
                return;
            case 5:
                ((far) this.a).a.g(eqo.c.e("Handshake timeout exceeded"));
                return;
            case 6:
                try {
                    Object obj = this.a;
                    fwd fwdVar = ((fbs) obj).f;
                    if (fwdVar != null) {
                        fvk fvkVar = ((fbs) obj).b;
                        long j2 = fvkVar.b;
                        if (j2 > 0) {
                            fwdVar.bi(fvkVar, j2);
                        }
                    }
                } catch (IOException e) {
                    ((fbs) this.a).c.b(e);
                }
                try {
                    fwd fwdVar2 = ((fbs) this.a).f;
                    if (fwdVar2 != null) {
                        fwdVar2.close();
                    }
                } catch (IOException e2) {
                    ((fbs) this.a).c.b(e2);
                }
                try {
                    Socket socket = ((fbs) this.a).g;
                    if (socket != null) {
                        socket.close();
                        return;
                    }
                    return;
                } catch (IOException e3) {
                    ((fbs) this.a).c.b(e3);
                    return;
                }
            case 7:
                esy esyVar = (esy) this.a;
                long j3 = esyVar.a;
                esz eszVar = esyVar.b;
                long j4 = esyVar.a;
                long jMax = Math.max(j4 + j4, j4);
                if (eszVar.c.compareAndSet(j3, jMax)) {
                    esz.a.logp(Level.WARNING, "io.grpc.internal.AtomicBackoff$State", "backoff", "Increased {0} to {1}", new Object[]{esyVar.b.b, Long.valueOf(jMax)});
                    return;
                }
                return;
            case 8:
                fcg fcgVar = (fcg) this.a;
                fcgVar.n.execute(fcgVar.p);
                synchronized (((fcg) this.a).l) {
                    Object obj2 = this.a;
                    ((fcg) obj2).w = Integer.MAX_VALUE;
                    ((fcg) obj2).q();
                }
                return;
        }
        while (true) {
            Object obj3 = this.a;
            synchronized (obj3) {
                byte[] bArr = frh.a;
                while (true) {
                    if (!((frn) obj3).f.isEmpty()) {
                        long jG2 = fsc.g();
                        Iterator it = ((frn) obj3).f.iterator();
                        long jMin = Long.MAX_VALUE;
                        frk frkVar2 = null;
                        while (true) {
                            if (it.hasNext()) {
                                frk frkVar3 = (frk) ((frm) it.next()).e.get(0);
                                j = jG2;
                                long jMax2 = Math.max(0L, frkVar3.c - j);
                                if (jMax2 > 0) {
                                    jMin = Math.min(jMax2, jMin);
                                } else if (frkVar2 != null) {
                                    z = true;
                                } else {
                                    frkVar2 = frkVar3;
                                }
                                jG2 = j;
                            } else {
                                j = jG2;
                                z = false;
                            }
                        }
                        if (frkVar2 != null) {
                            frkVar2.c = -1L;
                            frm frmVar = frkVar2.b;
                            frmVar.getClass();
                            frmVar.e.remove(frkVar2);
                            ((frn) obj3).f.remove(frmVar);
                            frmVar.d = frkVar2;
                            ((frn) obj3).e.add(frmVar);
                            if (z || (!((frn) obj3).c && !((frn) obj3).f.isEmpty())) {
                                ((frn) obj3).h.d(((frn) obj3).g);
                            }
                            frkVar = frkVar2;
                        } else if (!((frn) obj3).c) {
                            ((frn) obj3).c = true;
                            ((frn) obj3).d = j + jMin;
                            try {
                                try {
                                    fsc.f((frn) obj3, jMin);
                                    ((frn) obj3).c = false;
                                } catch (InterruptedException unused) {
                                    int size = ((frn) obj3).e.size();
                                    while (true) {
                                        size--;
                                        if (size >= 0) {
                                            ((frm) ((frn) obj3).e.get(size)).d();
                                        } else {
                                            int size2 = ((frn) obj3).f.size();
                                            while (true) {
                                                size2--;
                                                if (size2 >= 0) {
                                                    frm frmVar2 = (frm) ((frn) obj3).f.get(size2);
                                                    frmVar2.d();
                                                    if (frmVar2.e.isEmpty()) {
                                                        ((frn) obj3).f.remove(size2);
                                                    }
                                                } else {
                                                    ((frn) obj3).c = false;
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable th) {
                                ((frn) obj3).c = false;
                                throw th;
                            }
                        } else if (jMin < ((frn) obj3).d - j) {
                            fsc.e((frn) obj3);
                        }
                    }
                }
                frkVar = null;
            }
            if (frkVar == null) {
                return;
            }
            frm frmVar3 = frkVar.b;
            frmVar3.getClass();
            Object obj4 = this.a;
            boolean zIsLoggable = frn.b.isLoggable(Level.FINE);
            if (zIsLoggable) {
                jG = fsc.g();
                fwv.x(frkVar, frmVar3, "starting");
            } else {
                jG = -1;
            }
            try {
                Thread threadCurrentThread = Thread.currentThread();
                String name = threadCurrentThread.getName();
                threadCurrentThread.setName(frkVar.a);
                try {
                    long jA = frkVar.a();
                    synchronized (obj4) {
                        ((frn) obj4).b(frkVar, jA);
                    }
                    threadCurrentThread.setName(name);
                    if (zIsLoggable) {
                        fwv.x(frkVar, frmVar3, "finished run in ".concat(fwv.w(fsc.g() - jG)));
                    }
                } catch (Throwable th2) {
                    synchronized (obj4) {
                        ((frn) obj4).b(frkVar, -1L);
                        threadCurrentThread.setName(name);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    ((frn) obj4).h.d(this);
                    throw th3;
                } catch (Throwable th4) {
                    if (zIsLoggable) {
                        fwv.x(frkVar, frmVar3, "failed a run in ".concat(fwv.w(fsc.g() - jG)));
                    }
                    throw th4;
                }
            }
        }
    }
}
