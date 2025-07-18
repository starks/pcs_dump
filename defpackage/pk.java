package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class pk extends pg {
    public pg[] as = new pg[4];
    public int at = 0;

    public final void T(ArrayList arrayList, int i, pz pzVar) {
        for (int i2 = 0; i2 < this.at; i2++) {
            pzVar.d(this.as[i2]);
        }
        for (int i3 = 0; i3 < this.at; i3++) {
            qy.y(this.as[i3], i, arrayList, pzVar);
        }
    }
}
