package defpackage;

import android.content.Context;
import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byw extends biz {
    public static final /* synthetic */ int a = 0;

    static {
        Pair.create(new uo(null), up.o(null));
    }

    public byw(Context context) {
        super(context, byq.a, biv.m, biy.a);
    }

    public final cag a(String str) {
        bku bkuVar = new bku();
        bkuVar.a = new byr(str, 2);
        return f(bkuVar.a());
    }

    public final cag b(final String str, final int i, final String[] strArr, final byte[] bArr) {
        bku bkuVar = new bku();
        bkuVar.a = new bkr() { // from class: byv
            @Override // defpackage.bkr
            public final void a(Object obj, Object obj2) {
                int i2 = byw.a;
                ((bze) ((bzf) obj).t()).d(new bzb((brb) obj2), str, i, strArr, bArr);
            }
        };
        return f(bkuVar.a());
    }
}
