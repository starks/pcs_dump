package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class pn extends pg {
    public ArrayList aJ = new ArrayList();

    @Override // defpackage.pg
    public final void S(zw zwVar) {
        super.S(zwVar);
        int size = this.aJ.size();
        for (int i = 0; i < size; i++) {
            ((pg) this.aJ.get(i)).S(zwVar);
        }
    }

    public void T() {
        ArrayList arrayList = this.aJ;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            pg pgVar = (pg) this.aJ.get(i);
            if (pgVar instanceof pn) {
                ((pn) pgVar).T();
            }
        }
    }

    public final void Z(pg pgVar) {
        this.aJ.remove(pgVar);
        pgVar.s();
    }

    @Override // defpackage.pg
    public void s() {
        this.aJ.clear();
        super.s();
    }
}
