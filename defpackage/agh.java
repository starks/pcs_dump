package defpackage;

import android.graphics.PointF;
import android.util.Property;

/* compiled from: PG */
/* loaded from: classes.dex */
final class agh extends Property {
    public agh(Class cls) {
        super(cls, "bottomRight");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        agn agnVar = (agn) obj;
        PointF pointF = (PointF) obj2;
        agnVar.c = Math.round(pointF.x);
        agnVar.d = Math.round(pointF.y);
        int i = agnVar.f + 1;
        agnVar.f = i;
        if (agnVar.e == i) {
            agnVar.a();
        }
    }
}
