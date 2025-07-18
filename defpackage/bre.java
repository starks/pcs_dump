package defpackage;

import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bre implements crp {
    private final /* synthetic */ int a;

    public /* synthetic */ bre(int i) {
        this.a = i;
    }

    @Override // defpackage.crp
    public final Object a(Object obj) {
        bsp bspVarA;
        Object obj2;
        switch (this.a) {
            case 0:
                if (!((bpz) ((cbq) obj).c(bpz.class)).h() || (bspVarA = bpx.a()) == null || (obj2 = bspVarA.a) == null) {
                    return null;
                }
                return obj2;
            case 1:
                return new brb(((cbq) obj).a());
            case 2:
                return new bur(((cbq) obj).a());
            case 3:
                return new cbs();
            case 4:
                return null;
            case 5:
                return null;
            case 6:
                return Integer.valueOf(Log.w("AccountRemovedRecv", "Failed to remove account snapshot: ", (IOException) obj));
            case 7:
                cfe cfeVar = (cfe) obj;
                if (cfeVar.a != 29514) {
                    throw cfeVar;
                }
                asr asrVar = (asr) cfv.a.createBuilder();
                asr asrVar2 = (asr) cfr.b.createBuilder();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (!asrVar2.a.isMutable()) {
                    asrVar2.B();
                }
                cfr cfrVar = (cfr) asrVar2.a;
                cfrVar.c |= 8;
                cfrVar.g = jCurrentTimeMillis;
                if (!asrVar.a.isMutable()) {
                    asrVar.B();
                }
                cfv cfvVar = (cfv) asrVar.a;
                cfr cfrVar2 = (cfr) asrVar2.z();
                cfrVar2.getClass();
                cfvVar.c = cfrVar2;
                cfvVar.b |= 1;
                return (cfv) asrVar.z();
            case 8:
                int i = djq.a;
                return Boolean.valueOf(((List) obj).contains(String.class));
            case 9:
                int i2 = djq.a;
                return Boolean.valueOf(((List) obj).contains(Throwable.class));
            default:
                int i3 = djq.a;
                return Arrays.asList(((Constructor) obj).getParameterTypes());
        }
    }
}
