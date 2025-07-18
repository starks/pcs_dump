package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class zk implements yx {
    private final Object a;
    private final ym b;

    public zk(Object obj) {
        this.a = obj;
        this.b = yo.a.b(obj.getClass());
    }

    @Override // defpackage.yx
    public final void g(yz yzVar, yu yuVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ym ymVar = this.b;
        List list = (List) ymVar.a.get(yuVar);
        Object obj = this.a;
        ym.a(list, yzVar, yuVar, obj);
        ym.a((List) ymVar.a.get(yu.ON_ANY), yzVar, yuVar, obj);
    }
}
