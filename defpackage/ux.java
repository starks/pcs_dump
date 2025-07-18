package defpackage;

import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ux implements fku {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ux(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [fjc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, java.util.Iterator] */
    @Override // defpackage.fku
    public final Iterator a() {
        int i = this.b;
        if (i == 0) {
            return new uc(new ux(this.a, 1).a(), uv.a);
        }
        if (i == 1) {
            return new uw((ViewGroup) this.a);
        }
        if (i == 2) {
            return this.a.iterator();
        }
        if (i != 3) {
            return this.a;
        }
        fkv fkvVar = new fkv();
        fkvVar.a = fjp.B(this.a, fkvVar, fkvVar);
        return fkvVar;
    }
}
