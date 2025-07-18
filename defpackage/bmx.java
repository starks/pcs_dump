package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmx extends biz implements bmp {
    private static final bfe a;
    private static final yt l;
    private static final fcy m;

    static {
        bfe bfeVar = new bfe(null, null);
        a = bfeVar;
        bmw bmwVar = new bmw();
        l = bmwVar;
        m = new fcy("ClientTelemetry.API", bmwVar, bfeVar);
    }

    public bmx(Context context, bmq bmqVar) {
        super(context, m, bmqVar, biy.a);
    }

    @Override // defpackage.bmp
    public final cag a(bmo bmoVar) {
        bku bkuVar = new bku();
        bkuVar.b = new bhq[]{bhn.a};
        bkuVar.b();
        bkuVar.a = new byr(bmoVar, 1);
        return e(bkuVar.a());
    }
}
