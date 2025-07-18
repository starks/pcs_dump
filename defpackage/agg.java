package defpackage;

import android.graphics.PointF;
import android.util.Property;

/* compiled from: PG */
/* loaded from: classes.dex */
final class agg extends Property {
    public agg(Class cls) {
        super(cls, "topLeft");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        agn agnVar = (agn) obj;
        PointF pointF = (PointF) obj2;
        agnVar.a = Math.round(pointF.x);
        agnVar.b = Math.round(pointF.y);
        int i = agnVar.e + 1;
        agnVar.e = i;
        if (i == agnVar.f) {
            agnVar.a();
        }
    }
}
