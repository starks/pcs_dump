package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdu {
    public int a;
    public int b;
    public final Object c;
    private int d;

    public fdu() {
        this.c = new int[10];
    }

    public static fdu T(eee eeeVar) {
        fdu fduVar = eeeVar.e;
        return fduVar != null ? fduVar : new fdu(eeeVar);
    }

    private final void U(Object obj, egx egxVar, een eenVar) {
        int i = this.d;
        this.d = ehu.c(ehu.a(this.a), 4);
        try {
            egxVar.k(obj, this, eenVar);
            if (this.a == this.d) {
            } else {
                throw new efp("Failed to parse the message.");
            }
        } finally {
            this.d = i;
        }
    }

    private final void V(Object obj, egx egxVar, een eenVar) throws efp {
        eee eeeVar = (eee) this.c;
        int iN = eeeVar.n();
        eeeVar.M();
        int iE = ((eee) this.c).e(iN);
        ((eee) this.c).a++;
        egxVar.k(obj, this, eenVar);
        ((eee) this.c).z(0);
        r3.a--;
        ((eee) this.c).A(iE);
    }

    private final void W(int i) throws efp {
        if (((eee) this.c).d() != i) {
            throw new efp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static final void X(int i) throws efp {
        if ((i & 3) != 0) {
            throw new efp("Failed to parse the message.");
        }
    }

    private static final void Y(int i) throws efp {
        if ((i & 7) != 0) {
            throw new efp("Failed to parse the message.");
        }
    }

    public final void A(Object obj, egx egxVar, een eenVar) throws efp {
        Q(2);
        V(obj, egxVar, eenVar);
    }

    public final void B(List list) throws efp {
        int iM;
        int iM2;
        if (list instanceof edq) {
            edq edqVar = (edq) list;
            int iB = ehu.b(this.a);
            if (iB != 0) {
                if (iB != 2) {
                    throw new efo();
                }
                Object obj = this.c;
                int iD = ((eee) obj).d() + ((eee) obj).n();
                do {
                    edqVar.f(((eee) this.c).D());
                } while (((eee) this.c).d() < iD);
                W(iD);
                return;
            }
            do {
                edqVar.f(((eee) this.c).D());
                if (((eee) this.c).C()) {
                    return;
                } else {
                    iM2 = ((eee) this.c).m();
                }
            } while (iM2 == this.a);
        } else {
            int iB2 = ehu.b(this.a);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new efo();
                }
                Object obj2 = this.c;
                int iD2 = ((eee) obj2).d() + ((eee) obj2).n();
                do {
                    list.add(Boolean.valueOf(((eee) this.c).D()));
                } while (((eee) this.c).d() < iD2);
                W(iD2);
                return;
            }
            do {
                list.add(Boolean.valueOf(((eee) this.c).D()));
                if (((eee) this.c).C()) {
                    return;
                } else {
                    iM = ((eee) this.c).m();
                }
            } while (iM == this.a);
            iM2 = iM;
        }
        this.b = iM2;
    }

    public final void C(List list) throws efp {
        int iM;
        int iM2;
        if (list instanceof eej) {
            eej eejVar = (eej) list;
            int iB = ehu.b(this.a);
            if (iB != 1) {
                if (iB != 2) {
                    throw new efo();
                }
                int iN = ((eee) this.c).n();
                Y(iN);
                int iD = ((eee) this.c).d() + iN;
                do {
                    eejVar.g(((eee) this.c).b());
                } while (((eee) this.c).d() < iD);
                return;
            }
            do {
                eejVar.g(((eee) this.c).b());
                if (((eee) this.c).C()) {
                    return;
                } else {
                    iM2 = ((eee) this.c).m();
                }
            } while (iM2 == this.a);
        } else {
            int iB2 = ehu.b(this.a);
            if (iB2 != 1) {
                if (iB2 != 2) {
                    throw new efo();
                }
                int iN2 = ((eee) this.c).n();
                Y(iN2);
                int iD2 = ((eee) this.c).d() + iN2;
                do {
                    list.add(Double.valueOf(((eee) this.c).b()));
                } while (((eee) this.c).d() < iD2);
                return;
            }
            do {
                list.add(Double.valueOf(((eee) this.c).b()));
                if (((eee) this.c).C()) {
                    return;
                } else {
                    iM = ((eee) this.c).m();
                }
            } while (iM == this.a);
            iM2 = iM;
        }
        this.b = iM2;
    }

    public final void D(List list) throws efp {
        int iM;
        int iM2;
        if (list instanceof efc) {
            efc efcVar = (efc) list;
            int iB = ehu.b(this.a);
            if (iB != 0) {
                if (iB != 2) {
                    throw new efo();
                }
                Object obj = this.c;
                int iD = ((eee) obj).d() + ((eee) obj).n();
                do {
                    efcVar.g(((eee) this.c).f());
                } while (((eee) this.c).d() < iD);
                W(iD);
                return;
            }
            do {
                efcVar.g(((eee) this.c).f());
                if (((eee) this.c).C()) {
                    return;
                } else {
                    iM2 = ((eee) this.c).m();
                }
            } while (iM2 == this.a);
        } else {
            int iB2 = ehu.b(this.a);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new efo();
                }
                Object obj2 = this.c;
                int iD2 = ((eee) obj2).d() + ((eee) obj2).n();
                do {
                    list.add(Integer.valueOf(((eee) this.c).f()));
                } while (((eee) this.c).d() < iD2);
                W(iD2);
                return;
            }
            do {
                list.add(Integer.valueOf(((eee) this.c).f()));
                if (((eee) this.c).C()) {
                    return;
                } else {
                    iM = ((eee) this.c).m();
                }
            } while (iM == this.a);
            iM2 = iM;
        }
        this.b = iM2;
    }

    public final void E(List list) throws efp {
        int iM;
        int iM2;
        if (list instanceof efc) {
            efc efcVar = (efc) list;
            int iB = ehu.b(this.a);
            if (iB == 2) {
                int iN = ((eee) this.c).n();
                X(iN);
                int iD = ((eee) this.c).d() + iN;
                do {
                    efcVar.g(((eee) this.c).g());
                } while (((eee) this.c).d() < iD);
                return;
            }
            if (iB != 5) {
                throw new efo();
            }
            do {
                efcVar.g(((eee) this.c).g());
                if (((eee) this.c).C()) {
                    return;
                } else {
                    iM2 = ((eee) this.c).m();
                }
            } while (iM2 == this.a);
        } else {
            int iB2 = ehu.b(this.a);
            if (iB2 == 2) {
                int iN2 = ((eee) this.c).n();
                X(iN2);
                int iD2 = ((eee) this.c).d() + iN2;
                do {
                    list.add(Integer.valueOf(((eee) this.c).g()));
                } while (((eee) this.c).d() < iD2);
                return;
            }
            if (iB2 != 5) {
                throw new efo();
            }
            do {
                list.add(Integer.valueOf(((eee) this.c).g()));
                if (((eee) this.c).C()) {
                    return;
                } else {
                    iM = ((eee) this.c).m();
                }
            } while (iM == this.a);
            iM2 = iM;
        }
        this.b = iM2;
    }

    public final void F(List list) throws efp {
        int iM;
        int iM2;
        if (list instanceof efy) {
            efy efyVar = (efy) list;
            int iB = ehu.b(this.a);
            if (iB != 1) {
                if (iB != 2) {
                    throw new efo();
                }
                int iN = ((eee) this.c).n();
                Y(iN);
                int iD = ((eee) this.c).d() + iN;
                do {
                    efyVar.f(((eee) this.c).o());
                } while (((eee) this.c).d() < iD);
                return;
            }
            do {
                efyVar.f(((eee) this.c).o());
                if (((eee) this.c).C()) {
                    return;
                } else {
                    iM2 = ((eee) this.c).m();
                }
            } while (iM2 == this.a);
        } else {
            int iB2 = ehu.b(this.a);
            if (iB2 != 1) {
                if (iB2 != 2) {
                    throw new efo();
                }
                int iN2 = ((eee) this.c).n();
                Y(iN2);
                int iD2 = ((eee) this.c).d() + iN2;
                do {
                    list.add(Long.valueOf(((eee) this.c).o()));
                } while (((eee) this.c).d() < iD2);
                return;
            }
            do {
                list.add(Long.valueOf(((eee) this.c).o()));
                if (((eee) this.c).C()) {
                    return;
                } else {
                    iM = ((eee) this.c).m();
                }
            } while (iM == this.a);
            iM2 = iM;
        }
        this.b = iM2;
    }

    public final void G(List list) throws efp {
        int iM;
        int iM2;
        if (list instanceof ees) {
            ees eesVar = (ees) list;
            int iB = ehu.b(this.a);
            if (iB == 2) {
                int iN = ((eee) this.c).n();
                X(iN);
                int iD = ((eee) this.c).d() + iN;
                do {
                    eesVar.g(((eee) this.c).c());
                } while (((eee) this.c).d() < iD);
                return;
            }
            if (iB != 5) {
                throw new efo();
            }
            do {
                eesVar.g(((eee) this.c).c());
                if (((eee) this.c).C()) {
                    return;
                } else {
                    iM2 = ((eee) this.c).m();
                }
            } while (iM2 == this.a);
        } else {
            int iB2 = ehu.b(this.a);
            if (iB2 == 2) {
                int iN2 = ((eee) this.c).n();
                X(iN2);
                int iD2 = ((eee) this.c).d() + iN2;
                do {
                    list.add(Float.valueOf(((eee) this.c).c()));
                } while (((eee) this.c).d() < iD2);
                return;
            }
            if (iB2 != 5) {
                throw new efo();
            }
            do {
                list.add(Float.valueOf(((eee) this.c).c()));
                if (((eee) this.c).C()) {
                    return;
                } else {
                    iM = ((eee) this.c).m();
                }
            } while (iM == this.a);
            iM2 = iM;
        }
        this.b = iM2;
    }

    public final void H(List list) throws efp {
        int iM;
        int iM2;
        if (list instanceof efc) {
            efc efcVar = (efc) list;
            int iB = ehu.b(this.a);
            if (iB != 0) {
                if (iB != 2) {
                    throw new efo();
                }
                Object obj = this.c;
                int iD = ((eee) obj).d() + ((eee) obj).n();
                do {
                    efcVar.g(((eee) this.c).h());
                } while (((eee) this.c).d() < iD);
                W(iD);
                return;
            }
            do {
                efcVar.g(((eee) this.c).h());
                if (((eee) this.c).C()) {
                    return;
                } else {
                    iM2 = ((eee) this.c).m();
                }
            } while (iM2 == this.a);
        } else {
            int iB2 = ehu.b(this.a);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new efo();
                }
                Object obj2 = this.c;
                int iD2 = ((eee) obj2).d() + ((eee) obj2).n();
                do {
                    list.add(Integer.valueOf(((eee) this.c).h()));
                } while (((eee) this.c).d() < iD2);
                W(iD2);
                return;
            }
            do {
                list.add(Integer.valueOf(((eee) this.c).h()));
                if (((eee) this.c).C()) {
                    return;
                } else {
                    iM = ((eee) this.c).m();
                }
            } while (iM == this.a);
            iM2 = iM;
        }
        this.b = iM2;
    }

    public final void I(List list) throws efp {
        int iM;
        int iM2;
        if (list instanceof efy) {
            efy efyVar = (efy) list;
            int iB = ehu.b(this.a);
            if (iB != 0) {
                if (iB != 2) {
                    throw new efo();
                }
                Object obj = this.c;
                int iD = ((eee) obj).d() + ((eee) obj).n();
                do {
                    efyVar.f(((eee) this.c).p());
                } while (((eee) this.c).d() < iD);
                W(iD);
                return;
            }
            do {
                efyVar.f(((eee) this.c).p());
                if (((eee) this.c).C()) {
                    return;
                } else {
                    iM2 = ((eee) this.c).m();
                }
            } while (iM2 == this.a);
        } else {
            int iB2 = ehu.b(this.a);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new efo();
                }
                Object obj2 = this.c;
                int iD2 = ((eee) obj2).d() + ((eee) obj2).n();
                do {
                    list.add(Long.valueOf(((eee) this.c).p()));
                } while (((eee) this.c).d() < iD2);
                W(iD2);
                return;
            }
            do {
                list.add(Long.valueOf(((eee) this.c).p()));
                if (((eee) this.c).C()) {
                    return;
                } else {
                    iM = ((eee) this.c).m();
                }
            } while (iM == this.a);
            iM2 = iM;
        }
        this.b = iM2;
    }

    public final void J(List list) throws efp {
        int iM;
        int iM2;
        if (list instanceof efc) {
            efc efcVar = (efc) list;
            int iB = ehu.b(this.a);
            if (iB == 2) {
                int iN = ((eee) this.c).n();
                X(iN);
                int iD = ((eee) this.c).d() + iN;
                do {
                    efcVar.g(((eee) this.c).k());
                } while (((eee) this.c).d() < iD);
                return;
            }
            if (iB != 5) {
                throw new efo();
            }
            do {
                efcVar.g(((eee) this.c).k());
                if (((eee) this.c).C()) {
                    return;
                } else {
                    iM2 = ((eee) this.c).m();
                }
            } while (iM2 == this.a);
        } else {
            int iB2 = ehu.b(this.a);
            if (iB2 == 2) {
                int iN2 = ((eee) this.c).n();
                X(iN2);
                int iD2 = ((eee) this.c).d() + iN2;
                do {
                    list.add(Integer.valueOf(((eee) this.c).k()));
                } while (((eee) this.c).d() < iD2);
                return;
            }
            if (iB2 != 5) {
                throw new efo();
            }
            do {
                list.add(Integer.valueOf(((eee) this.c).k()));
                if (((eee) this.c).C()) {
                    return;
                } else {
                    iM = ((eee) this.c).m();
                }
            } while (iM == this.a);
            iM2 = iM;
        }
        this.b = iM2;
    }

    public final void K(List list) throws efp {
        int iM;
        int iM2;
        if (list instanceof efy) {
            efy efyVar = (efy) list;
            int iB = ehu.b(this.a);
            if (iB != 1) {
                if (iB != 2) {
                    throw new efo();
                }
                int iN = ((eee) this.c).n();
                Y(iN);
                int iD = ((eee) this.c).d() + iN;
                do {
                    efyVar.f(((eee) this.c).t());
                } while (((eee) this.c).d() < iD);
                return;
            }
            do {
                efyVar.f(((eee) this.c).t());
                if (((eee) this.c).C()) {
                    return;
                } else {
                    iM2 = ((eee) this.c).m();
                }
            } while (iM2 == this.a);
        } else {
            int iB2 = ehu.b(this.a);
            if (iB2 != 1) {
                if (iB2 != 2) {
                    throw new efo();
                }
                int iN2 = ((eee) this.c).n();
                Y(iN2);
                int iD2 = ((eee) this.c).d() + iN2;
                do {
                    list.add(Long.valueOf(((eee) this.c).t()));
                } while (((eee) this.c).d() < iD2);
                return;
            }
            do {
                list.add(Long.valueOf(((eee) this.c).t()));
                if (((eee) this.c).C()) {
                    return;
                } else {
                    iM = ((eee) this.c).m();
                }
            } while (iM == this.a);
            iM2 = iM;
        }
        this.b = iM2;
    }

    public final void L(List list) throws efp {
        int iM;
        int iM2;
        if (list instanceof efc) {
            efc efcVar = (efc) list;
            int iB = ehu.b(this.a);
            if (iB != 0) {
                if (iB != 2) {
                    throw new efo();
                }
                Object obj = this.c;
                int iD = ((eee) obj).d() + ((eee) obj).n();
                do {
                    efcVar.g(((eee) this.c).l());
                } while (((eee) this.c).d() < iD);
                W(iD);
                return;
            }
            do {
                efcVar.g(((eee) this.c).l());
                if (((eee) this.c).C()) {
                    return;
                } else {
                    iM2 = ((eee) this.c).m();
                }
            } while (iM2 == this.a);
        } else {
            int iB2 = ehu.b(this.a);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new efo();
                }
                Object obj2 = this.c;
                int iD2 = ((eee) obj2).d() + ((eee) obj2).n();
                do {
                    list.add(Integer.valueOf(((eee) this.c).l()));
                } while (((eee) this.c).d() < iD2);
                W(iD2);
                return;
            }
            do {
                list.add(Integer.valueOf(((eee) this.c).l()));
                if (((eee) this.c).C()) {
                    return;
                } else {
                    iM = ((eee) this.c).m();
                }
            } while (iM == this.a);
            iM2 = iM;
        }
        this.b = iM2;
    }

    public final void M(List list) throws efp {
        int iM;
        int iM2;
        if (list instanceof efy) {
            efy efyVar = (efy) list;
            int iB = ehu.b(this.a);
            if (iB != 0) {
                if (iB != 2) {
                    throw new efo();
                }
                Object obj = this.c;
                int iD = ((eee) obj).d() + ((eee) obj).n();
                do {
                    efyVar.f(((eee) this.c).u());
                } while (((eee) this.c).d() < iD);
                W(iD);
                return;
            }
            do {
                efyVar.f(((eee) this.c).u());
                if (((eee) this.c).C()) {
                    return;
                } else {
                    iM2 = ((eee) this.c).m();
                }
            } while (iM2 == this.a);
        } else {
            int iB2 = ehu.b(this.a);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new efo();
                }
                Object obj2 = this.c;
                int iD2 = ((eee) obj2).d() + ((eee) obj2).n();
                do {
                    list.add(Long.valueOf(((eee) this.c).u()));
                } while (((eee) this.c).d() < iD2);
                W(iD2);
                return;
            }
            do {
                list.add(Long.valueOf(((eee) this.c).u()));
                if (((eee) this.c).C()) {
                    return;
                } else {
                    iM = ((eee) this.c).m();
                }
            } while (iM == this.a);
            iM2 = iM;
        }
        this.b = iM2;
    }

    public final void N(List list, boolean z) throws efo {
        int iM;
        int iM2;
        if (ehu.b(this.a) != 2) {
            throw new efo();
        }
        if ((list instanceof efw) && !z) {
            efw efwVar = (efw) list;
            do {
                s();
                efwVar.b();
                if (((eee) this.c).C()) {
                    return;
                } else {
                    iM2 = ((eee) this.c).m();
                }
            } while (iM2 == this.a);
        } else {
            do {
                list.add(z ? y() : x());
                if (((eee) this.c).C()) {
                    return;
                } else {
                    iM = ((eee) this.c).m();
                }
            } while (iM == this.a);
            iM2 = iM;
        }
        this.b = iM2;
    }

    public final void O(List list) throws efp {
        int iM;
        int iM2;
        if (list instanceof efc) {
            efc efcVar = (efc) list;
            int iB = ehu.b(this.a);
            if (iB != 0) {
                if (iB != 2) {
                    throw new efo();
                }
                Object obj = this.c;
                int iD = ((eee) obj).d() + ((eee) obj).n();
                do {
                    efcVar.g(((eee) this.c).n());
                } while (((eee) this.c).d() < iD);
                W(iD);
                return;
            }
            do {
                efcVar.g(((eee) this.c).n());
                if (((eee) this.c).C()) {
                    return;
                } else {
                    iM2 = ((eee) this.c).m();
                }
            } while (iM2 == this.a);
        } else {
            int iB2 = ehu.b(this.a);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new efo();
                }
                Object obj2 = this.c;
                int iD2 = ((eee) obj2).d() + ((eee) obj2).n();
                do {
                    list.add(Integer.valueOf(((eee) this.c).n()));
                } while (((eee) this.c).d() < iD2);
                W(iD2);
                return;
            }
            do {
                list.add(Integer.valueOf(((eee) this.c).n()));
                if (((eee) this.c).C()) {
                    return;
                } else {
                    iM = ((eee) this.c).m();
                }
            } while (iM == this.a);
            iM2 = iM;
        }
        this.b = iM2;
    }

    public final void P(List list) throws efp {
        int iM;
        int iM2;
        if (list instanceof efy) {
            efy efyVar = (efy) list;
            int iB = ehu.b(this.a);
            if (iB != 0) {
                if (iB != 2) {
                    throw new efo();
                }
                Object obj = this.c;
                int iD = ((eee) obj).d() + ((eee) obj).n();
                do {
                    efyVar.f(((eee) this.c).v());
                } while (((eee) this.c).d() < iD);
                W(iD);
                return;
            }
            do {
                efyVar.f(((eee) this.c).v());
                if (((eee) this.c).C()) {
                    return;
                } else {
                    iM2 = ((eee) this.c).m();
                }
            } while (iM2 == this.a);
        } else {
            int iB2 = ehu.b(this.a);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new efo();
                }
                Object obj2 = this.c;
                int iD2 = ((eee) obj2).d() + ((eee) obj2).n();
                do {
                    list.add(Long.valueOf(((eee) this.c).v()));
                } while (((eee) this.c).d() < iD2);
                W(iD2);
                return;
            }
            do {
                list.add(Long.valueOf(((eee) this.c).v()));
                if (((eee) this.c).C()) {
                    return;
                } else {
                    iM = ((eee) this.c).m();
                }
            } while (iM == this.a);
            iM2 = iM;
        }
        this.b = iM2;
    }

    public final void Q(int i) throws efo {
        if (ehu.b(this.a) != i) {
            throw new efo();
        }
    }

    public final boolean R() {
        Q(0);
        return ((eee) this.c).D();
    }

    public final boolean S() {
        int i;
        if (((eee) this.c).C() || (i = this.a) == this.d) {
            return false;
        }
        return ((eee) this.c).E(i);
    }

    public final int a(int i) {
        return ((int[]) this.c)[i];
    }

    public final int b() {
        if ((this.a & 2) != 0) {
            return ((int[]) this.c)[1];
        }
        return -1;
    }

    public final boolean c(int i) {
        return (this.a & (1 << i)) != 0;
    }

    public final void d(int i, int i2) {
        if (i >= 10) {
            return;
        }
        this.a = (1 << i) | this.a;
        this.d = 0;
        this.b = 0;
        ((int[]) this.c)[i] = i2;
    }

    public final double e() {
        Q(1);
        return ((eee) this.c).b();
    }

    public final float f() {
        Q(5);
        return ((eee) this.c).c();
    }

    public final int g() {
        int iM = this.b;
        if (iM != 0) {
            this.a = iM;
            this.b = 0;
        } else {
            iM = ((eee) this.c).m();
            this.a = iM;
        }
        if (iM == 0 || iM == this.d) {
            return Integer.MAX_VALUE;
        }
        return ehu.a(iM);
    }

    public final int h() throws efo {
        Q(0);
        return ((eee) this.c).f();
    }

    public final int i() {
        Q(5);
        return ((eee) this.c).g();
    }

    public final int j() {
        Q(0);
        return ((eee) this.c).h();
    }

    public final int k() {
        Q(5);
        return ((eee) this.c).k();
    }

    public final int l() {
        Q(0);
        return ((eee) this.c).l();
    }

    public final int m() {
        Q(0);
        return ((eee) this.c).n();
    }

    public final long n() {
        Q(1);
        return ((eee) this.c).o();
    }

    public final long o() {
        Q(0);
        return ((eee) this.c).p();
    }

    public final long p() {
        Q(1);
        return ((eee) this.c).t();
    }

    public final long q() {
        Q(0);
        return ((eee) this.c).u();
    }

    public final long r() {
        Q(0);
        return ((eee) this.c).v();
    }

    public final eea s() {
        Q(2);
        return ((eee) this.c).w();
    }

    public final Object t(ehs ehsVar, Class cls, een eenVar) {
        ehs ehsVar2 = ehs.DOUBLE;
        switch (ehsVar) {
            case DOUBLE:
                return Double.valueOf(e());
            case FLOAT:
                return Float.valueOf(f());
            case INT64:
                return Long.valueOf(o());
            case UINT64:
                return Long.valueOf(r());
            case INT32:
                return Integer.valueOf(j());
            case FIXED64:
                return Long.valueOf(n());
            case FIXED32:
                return Integer.valueOf(i());
            case BOOL:
                return Boolean.valueOf(R());
            case STRING:
                return y();
            case GROUP:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case MESSAGE:
                return w(cls, eenVar);
            case BYTES:
                return s();
            case UINT32:
                return Integer.valueOf(m());
            case ENUM:
                return Integer.valueOf(h());
            case SFIXED32:
                return Integer.valueOf(k());
            case SFIXED64:
                return Long.valueOf(p());
            case SINT32:
                return Integer.valueOf(l());
            case SINT64:
                return Long.valueOf(q());
        }
    }

    public final Object u(egx egxVar, een eenVar) {
        Object objE = egxVar.e();
        U(objE, egxVar, eenVar);
        egxVar.f(objE);
        return objE;
    }

    public final Object v(egx egxVar, een eenVar) throws efp {
        Object objE = egxVar.e();
        V(objE, egxVar, eenVar);
        egxVar.f(objE);
        return objE;
    }

    public final Object w(Class cls, een eenVar) throws efo {
        Q(2);
        return v(egr.a.a(cls), eenVar);
    }

    public final String x() {
        Q(2);
        return ((eee) this.c).x();
    }

    public final String y() throws efo {
        Q(2);
        return ((eee) this.c).y();
    }

    public final void z(Object obj, egx egxVar, een eenVar) throws efo {
        Q(3);
        U(obj, egxVar, eenVar);
    }

    private fdu(eee eeeVar) {
        this.b = 0;
        byte[] bArr = efn.b;
        this.c = eeeVar;
        eeeVar.e = this;
    }
}
