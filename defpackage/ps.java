package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ps implements pq {
    public final qa d;
    public int e;
    public int f;
    public pq a = null;
    public boolean b = false;
    public boolean c = false;
    int l = 1;
    int g = 1;
    pt h = null;
    public boolean i = false;
    public final List j = new ArrayList();
    final List k = new ArrayList();

    public ps(qa qaVar) {
        this.d = qaVar;
    }

    public final void a(pq pqVar) {
        this.j.add(pqVar);
        if (this.i) {
            pqVar.e(pqVar);
        }
    }

    public final void b() {
        this.k.clear();
        this.j.clear();
        this.i = false;
        this.f = 0;
        this.c = false;
        this.b = false;
    }

    public void c(int i) {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f = i;
        for (pq pqVar : this.j) {
            pqVar.e(pqVar);
        }
    }

    @Override // defpackage.pq
    public final void e(pq pqVar) {
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            if (!((ps) it.next()).i) {
                return;
            }
        }
        this.c = true;
        pq pqVar2 = this.a;
        if (pqVar2 != null) {
            pqVar2.e(this);
        }
        if (this.b) {
            this.d.e(this);
            return;
        }
        int i = 0;
        ps psVar = null;
        for (ps psVar2 : this.k) {
            if (!(psVar2 instanceof pt)) {
                i++;
                psVar = psVar2;
            }
        }
        if (psVar != null && i == 1 && psVar.i) {
            pt ptVar = this.h;
            if (ptVar != null) {
                if (!ptVar.i) {
                    return;
                } else {
                    this.e = this.g * ptVar.f;
                }
            }
            c(psVar.f + this.e);
        }
        pq pqVar3 = this.a;
        if (pqVar3 != null) {
            pqVar3.e(this);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.d.aj);
        sb.append(":");
        switch (this.l) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append((Object) str);
        sb.append("(");
        sb.append(this.i ? Integer.valueOf(this.f) : "unresolved");
        sb.append(") <t=");
        sb.append(this.k.size());
        sb.append(":d=");
        sb.append(this.j.size());
        sb.append(">");
        return sb.toString();
    }
}
