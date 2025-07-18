package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gq {
    final fuu d;
    private final tl f = new tl(30);
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public int c = 0;
    final fsc e = new fsc(this);

    public gq(fuu fuuVar) {
        this.d = fuuVar;
    }

    private final int m(int i, int i2) {
        int size = this.b.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            gp gpVar = (gp) this.b.get(size);
            int i3 = gpVar.a;
            if (i3 == 8) {
                int i4 = gpVar.b;
                int i5 = gpVar.d;
                int i6 = i4 < i5 ? i5 : i4;
                int i7 = i4 < i5 ? i4 : i5;
                if (i < i7 || i > i6) {
                    if (i < i4) {
                        if (i2 == 1) {
                            gpVar.b = i4 + 1;
                            gpVar.d = i5 + 1;
                        } else if (i2 == 2) {
                            gpVar.b = i4 - 1;
                            gpVar.d = i5 - 1;
                        }
                    }
                } else if (i7 == i4) {
                    if (i2 == 1) {
                        gpVar.d = i5 + 1;
                    } else if (i2 == 2) {
                        gpVar.d = i5 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        gpVar.b = i4 + 1;
                    } else if (i2 == 2) {
                        gpVar.b = i4 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = gpVar.b;
                if (i8 <= i) {
                    if (i3 == 1) {
                        i -= gpVar.d;
                    } else if (i3 == 2) {
                        i += gpVar.d;
                    }
                } else if (i2 == 1) {
                    gpVar.b = i8 + 1;
                } else if (i2 == 2) {
                    gpVar.b = i8 - 1;
                }
            }
        }
        int size2 = this.b.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return i;
            }
            gp gpVar2 = (gp) this.b.get(size2);
            if (gpVar2.a == 8) {
                int i9 = gpVar2.d;
                if (i9 == gpVar2.b || i9 < 0) {
                    this.b.remove(size2);
                    h(gpVar2);
                }
            } else if (gpVar2.d <= 0) {
                this.b.remove(size2);
                h(gpVar2);
            }
        }
    }

    private final void n(gp gpVar) {
        int i;
        int i2 = gpVar.a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iM = m(gpVar.b, i2);
        int i3 = gpVar.b;
        int i4 = gpVar.a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                Objects.toString(gpVar);
                throw new IllegalArgumentException("op should be remove or update.".concat(String.valueOf(gpVar)));
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < gpVar.d; i6++) {
            int iM2 = m(gpVar.b + (i * i6), gpVar.a);
            int i7 = gpVar.a;
            if (i7 == 2 ? iM2 != iM : !(i7 == 4 && iM2 == iM + 1)) {
                gp gpVarC = c(i7, iM, i5, gpVar.c);
                f(gpVarC, i3);
                h(gpVarC);
                if (gpVar.a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                iM = iM2;
            } else {
                i5++;
            }
        }
        Object obj = gpVar.c;
        h(gpVar);
        if (i5 > 0) {
            gp gpVarC2 = c(gpVar.a, iM, i5, obj);
            f(gpVarC2, i3);
            h(gpVarC2);
        }
    }

    private final void o(gp gpVar) {
        this.b.add(gpVar);
        int i = gpVar.a;
        if (i == 1) {
            this.d.D(gpVar.b, gpVar.d);
            return;
        }
        if (i == 2) {
            fuu fuuVar = this.d;
            ((RecyclerView) fuuVar.a).J(gpVar.b, gpVar.d, false);
            ((RecyclerView) fuuVar.a).M = true;
            return;
        }
        if (i == 4) {
            this.d.C(gpVar.b, gpVar.d, gpVar.c);
        } else if (i == 8) {
            this.d.E(gpVar.b, gpVar.d);
        } else {
            Objects.toString(gpVar);
            throw new IllegalArgumentException("Unknown update op type for ".concat(String.valueOf(gpVar)));
        }
    }

    private final boolean p(int i) {
        int size = this.b.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            gp gpVar = (gp) this.b.get(i2);
            int i4 = gpVar.a;
            if (i4 == 8) {
                if (b(gpVar.d, i3) == i) {
                    return true;
                }
            } else if (i4 == 1) {
                int i5 = gpVar.b;
                int i6 = gpVar.d + i5;
                while (i5 < i6) {
                    if (b(i5, i3) == i) {
                        return true;
                    }
                    i5++;
                }
            } else {
                continue;
            }
            i2 = i3;
        }
        return false;
    }

    final int a(int i) {
        return b(i, 0);
    }

    final int b(int i, int i2) {
        int size = this.b.size();
        while (i2 < size) {
            gp gpVar = (gp) this.b.get(i2);
            int i3 = gpVar.a;
            if (i3 == 8) {
                int i4 = gpVar.b;
                if (i4 == i) {
                    i = gpVar.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (gpVar.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = gpVar.b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = gpVar.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += gpVar.d;
                }
            }
            i2++;
        }
        return i;
    }

    public final gp c(int i, int i2, int i3, Object obj) {
        gp gpVar = (gp) this.f.a();
        if (gpVar == null) {
            return new gp(i, i2, i3, obj);
        }
        gpVar.a = i;
        gpVar.b = i2;
        gpVar.d = i3;
        gpVar.c = obj;
        return gpVar;
    }

    public final void d() {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            this.d.B((gp) this.b.get(i));
        }
        i(this.b);
        this.c = 0;
    }

    public final void e() {
        d();
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            gp gpVar = (gp) this.a.get(i);
            int i2 = gpVar.a;
            if (i2 == 1) {
                this.d.B(gpVar);
                this.d.D(gpVar.b, gpVar.d);
            } else if (i2 == 2) {
                this.d.B(gpVar);
                this.d.F(gpVar.b, gpVar.d);
            } else if (i2 == 4) {
                this.d.B(gpVar);
                this.d.C(gpVar.b, gpVar.d, gpVar.c);
            } else if (i2 == 8) {
                this.d.B(gpVar);
                this.d.E(gpVar.b, gpVar.d);
            }
        }
        i(this.a);
        this.c = 0;
    }

    final void f(gp gpVar, int i) {
        this.d.B(gpVar);
        int i2 = gpVar.a;
        if (i2 == 2) {
            this.d.F(i, gpVar.d);
        } else {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.d.C(i, gpVar.d, gpVar.c);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:183:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 669
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gq.g():void");
    }

    public final void h(gp gpVar) {
        gpVar.c = null;
        this.f.b(gpVar);
    }

    final void i(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            h((gp) list.get(i));
        }
        list.clear();
    }

    public final void j() {
        i(this.a);
        i(this.b);
        this.c = 0;
    }

    public final boolean k(int i) {
        return (this.c & i) != 0;
    }

    public final boolean l() {
        return this.a.size() > 0;
    }
}
