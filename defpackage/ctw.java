package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ctw extends ctx implements cta {
    private static final long serialVersionUID = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctw(csv csvVar, csy csyVar) {
        super(new cuu(csvVar, csyVar));
        csyVar.getClass();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use LoadingSerializationProxy");
    }

    @Override // defpackage.crp
    public final Object a(Object obj) {
        return b(obj);
    }

    @Override // defpackage.cta
    public final Object b(Object obj) {
        ctv ctvVar;
        cuj cujVarD;
        boolean z;
        Object objF;
        cuv cuvVarB;
        Object objI;
        try {
            cuu cuuVar = this.a;
            csy csyVar = cuuVar.s;
            obj.getClass();
            int iA = cuuVar.a(obj);
            cua cuaVarB = cuuVar.b(iA);
            csyVar.getClass();
            try {
                try {
                    if (cuaVarB.b != 0 && (cuvVarB = cuaVarB.b(obj, iA)) != null) {
                        long jA = cuaVarB.a.q.a();
                        Object objG = cuaVarB.g(cuvVarB, jA);
                        if (objG != null) {
                            cuaVarB.q(cuvVarB, jA);
                            cuaVarB.n.b();
                            objI = cua.x(objG);
                        } else {
                            cuj cujVarD2 = cuvVarB.d();
                            if (cujVarD2.g()) {
                                objI = cuaVarB.i(cuvVarB, obj, cujVarD2);
                            }
                        }
                        return objI;
                    }
                    cuaVarB.lock();
                    try {
                        long jA2 = cuaVarB.a.q.a();
                        cuaVarB.s(jA2);
                        int i = cuaVarB.b - 1;
                        AtomicReferenceArray atomicReferenceArray = cuaVarB.f;
                        int length = (atomicReferenceArray.length() - 1) & iA;
                        cuv cuvVar = (cuv) atomicReferenceArray.get(length);
                        cuv cuvVarD = cuvVar;
                        while (true) {
                            ctvVar = null;
                            if (cuvVarD == null) {
                                cujVarD = null;
                                break;
                            }
                            Object objJ = cuvVarD.j();
                            if (cuvVarD.a() == iA && objJ != null && cuaVarB.a.h.c(obj, objJ)) {
                                cujVarD = cuvVarD.d();
                                if (cujVarD.g()) {
                                    z = false;
                                } else {
                                    objF = cujVarD.get();
                                    if (objF == null) {
                                        cuaVarB.A(objJ, null, cujVarD.a(), cuw.c);
                                    } else if (cuaVarB.a.k(cuvVarD, jA2)) {
                                        cuaVarB.A(objJ, objF, cujVarD.a(), cuw.d);
                                    } else {
                                        cuaVarB.p(cuvVarD, jA2);
                                        cuaVarB.n.b();
                                    }
                                    cuaVarB.l.remove(cuvVarD);
                                    cuaVarB.m.remove(cuvVarD);
                                    cuaVarB.b = i;
                                }
                            } else {
                                cuvVarD = cuvVarD.e();
                            }
                        }
                        z = true;
                        if (z) {
                            ctvVar = new ctv();
                            if (cuvVarD == null) {
                                cuvVarD = cuaVarB.d(obj, iA, cuvVar);
                                cuvVarD.p(ctvVar);
                                atomicReferenceArray.set(length, cuvVarD);
                            } else {
                                cuvVarD.p(ctvVar);
                            }
                        }
                        if (z) {
                            try {
                                synchronized (cuvVarD) {
                                    objF = cuaVarB.f(obj, iA, ctvVar, ctvVar.i(obj, csyVar));
                                }
                            } finally {
                                cuaVarB.n.e();
                            }
                        } else {
                            objF = cuaVarB.i(cuvVarD, obj, cujVarD);
                        }
                        return objF;
                    } finally {
                        cuaVarB.unlock();
                        cuaVarB.t();
                    }
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    if (cause instanceof Error) {
                        throw new dja((Error) cause);
                    }
                    if (cause instanceof RuntimeException) {
                        throw new dkq(cause);
                    }
                    throw e;
                }
            } finally {
                cuaVarB.o();
            }
        } catch (ExecutionException e2) {
            throw new dkq(e2.getCause());
        }
    }

    @Override // defpackage.ctx
    Object writeReplace() {
        return new ctu(this.a);
    }
}
