package defpackage;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class epg {
    public final epf a;
    public final String b;
    public final String c;
    public final epe d;
    public final epe e;
    public final boolean f;

    public epg(epf epfVar, String str, epe epeVar, epe epeVar2, boolean z) {
        new AtomicReferenceArray(2);
        epfVar.getClass();
        this.a = epfVar;
        str.getClass();
        this.b = str;
        int iLastIndexOf = str.lastIndexOf(47);
        this.c = iLastIndexOf == -1 ? null : str.substring(0, iLastIndexOf);
        epeVar.getClass();
        this.d = epeVar;
        epeVar2.getClass();
        this.e = epeVar2;
        this.f = z;
    }

    public static epd a() {
        epd epdVar = new epd();
        epdVar.a = null;
        epdVar.b = null;
        return epdVar;
    }

    public static String c(String str, String str2) {
        str.getClass();
        str2.getClass();
        return str + "/" + str2;
    }

    public final InputStream b(Object obj) {
        return this.d.a(obj);
    }

    public final String toString() {
        crt crtVarQ = clq.Q(this);
        crtVarQ.e("fullMethodName", this.b);
        crtVarQ.e("type", this.a);
        crt crtVarC = crtVarQ.c("idempotent", false).c("safe", false).c("sampledToLocalTracing", this.f);
        crtVarC.e("requestMarshaller", this.d);
        crtVarC.e("responseMarshaller", this.e);
        crtVarC.e("schemaDescriptor", null);
        crtVarC.g();
        return crtVarC.toString();
    }
}
