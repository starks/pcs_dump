package defpackage;

import dalvik.system.VMStack;

/* compiled from: PG */
/* loaded from: classes.dex */
class dch extends dbz {
    @Override // defpackage.dbz
    public czw a(Class cls, int i) {
        return czw.a;
    }

    @Override // defpackage.dbz
    public String b(Class cls) {
        if (dcj.a) {
            try {
                if (cls.equals(dcj.p())) {
                    return VMStack.getStackClass2().getName();
                }
            } catch (Throwable unused) {
            }
        }
        if (!dcj.b) {
            return null;
        }
        ddm ddmVar = ddj.a;
        cls.getClass();
        StackTraceElement stackTraceElementA = ddj.a.a(cls);
        if (stackTraceElementA != null) {
            return stackTraceElementA.getClassName();
        }
        return null;
    }
}
