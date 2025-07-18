package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class afi implements fin {
    private final /* synthetic */ int a;

    public /* synthetic */ afi(int i) {
        this.a = i;
    }

    @Override // defpackage.fin
    public final Object a() {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                return afj.l();
            }
            zl zlVar = adu.f;
            return true;
        }
        ffo ffoVar = afj.a;
        try {
            Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }
}
