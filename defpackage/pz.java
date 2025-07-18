package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pz {
    static int a;
    public final int c;
    public int d;
    final ArrayList b = new ArrayList();
    ArrayList e = null;
    private int f = -1;

    public pz(int i) {
        int i2 = a;
        a = i2 + 1;
        this.c = i2;
        this.d = i;
    }

    public final int a(oy oyVar, int i) {
        int iP;
        int iP2;
        if (this.b.size() == 0) {
            return 0;
        }
        ArrayList arrayList = this.b;
        pg pgVar = ((pg) arrayList.get(0)).V;
        oyVar.l();
        pgVar.b(oyVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((pg) arrayList.get(i2)).b(oyVar, false);
        }
        if (i == 0) {
            ph phVar = (ph) pgVar;
            if (phVar.au > 0) {
                qy.C(phVar, oyVar, arrayList, 0);
            }
        }
        if (i == 1) {
            ph phVar2 = (ph) pgVar;
            if (phVar2.av > 0) {
                qy.C(phVar2, oyVar, arrayList, 1);
            }
        }
        try {
            oyVar.k();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.e = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.e.add(new qy((pg) arrayList.get(i3), oyVar));
        }
        if (i == 0) {
            ph phVar3 = (ph) pgVar;
            iP = oy.p(phVar3.K);
            iP2 = oy.p(phVar3.M);
            oyVar.l();
        } else {
            ph phVar4 = (ph) pgVar;
            iP = oy.p(phVar4.L);
            iP2 = oy.p(phVar4.N);
            oyVar.l();
        }
        return iP2 - iP;
    }

    public final void b(ArrayList arrayList) {
        int size = this.b.size();
        if (this.f != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                pz pzVar = (pz) arrayList.get(i);
                if (this.f == pzVar.c) {
                    c(this.d, pzVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final void c(int i, pz pzVar) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            pg pgVar = (pg) arrayList.get(i2);
            pzVar.d(pgVar);
            if (i == 0) {
                pgVar.ap = pzVar.c;
            } else {
                pgVar.aq = pzVar.c;
            }
        }
        this.f = pzVar.c;
    }

    public final boolean d(pg pgVar) {
        if (this.b.contains(pgVar)) {
            return false;
        }
        this.b.add(pgVar);
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.d;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : "Both");
        sb.append(" [");
        sb.append(this.c);
        sb.append("] <");
        String string = sb.toString();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            string = string + " " + ((pg) arrayList.get(i2)).aj;
        }
        return String.valueOf(string).concat(" >");
    }
}
