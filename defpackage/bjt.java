package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjt extends BasePendingResult {
    final /* synthetic */ bhc a;
    private final bfx j;
    private final bgv k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bjt(bhc bhcVar, bfx bfxVar, bjd bjdVar, bgv bgvVar) {
        this(bga.m, bjdVar);
        this.a = bhcVar;
        this.j = bfxVar;
        this.k = bgvVar;
    }

    private final void p(RemoteException remoteException) {
        i(new Status(8, remoteException.getLocalizedMessage(), null));
    }

    public final void h(bir birVar) throws DeadObjectException {
        try {
            k(birVar);
        } catch (DeadObjectException e) {
            p(e);
            throw e;
        } catch (RemoteException e2) {
            p(e2);
        }
    }

    public final void i(Status status) {
        aso.z(!status.a(), "Failed result must not be success");
        n(j(status));
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x037d A[Catch: all -> 0x037f, DONT_GENERATE, TryCatch #7 {, blocks: (B:124:0x02aa, B:126:0x02ae, B:128:0x02bc, B:130:0x02c8, B:132:0x02d4, B:165:0x036d, B:167:0x0371, B:168:0x0378, B:133:0x02dc, B:135:0x02e6, B:136:0x02ea, B:138:0x02f0, B:160:0x035b, B:162:0x035f, B:140:0x02fb, B:141:0x0308, B:143:0x0310, B:144:0x0317, B:146:0x031b, B:149:0x0321, B:151:0x0338, B:153:0x033c, B:155:0x0344, B:157:0x034c, B:159:0x0355, B:164:0x0363, B:170:0x037a, B:171:0x037d), top: B:228:0x02aa, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final /* bridge */ /* synthetic */ void k(defpackage.bir r26) {
        /*
            Method dump skipped, instructions count: 1125
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bjt.k(bir):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected bjt(fcy fcyVar, bjd bjdVar) {
        super(bjdVar);
        aso.G(bjdVar, "GoogleApiClient must not be null");
        aso.G(fcyVar, "Api must not be null");
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ bjh j(Status status) {
        return status;
    }
}
