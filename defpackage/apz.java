package defpackage;

import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.AIFeature;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apz implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public apz(int i) {
        this.a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:190:0x03da  */
    @Override // android.os.Parcelable.Creator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r26) {
        /*
            Method dump skipped, instructions count: 1656
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apz.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new apy[i];
            case 1:
                return new apk[i];
            case 2:
                return new aqa[i];
            case 3:
                return new aqd[i];
            case 4:
                return new auu[i];
            case 5:
                return new auv[i];
            case 6:
                return new aww[i];
            case 7:
                return new bdp[i];
            case 8:
                return new GoogleSignInAccount[i];
            case 9:
                return new bgu[i];
            case 10:
                return new bgy[i];
            case 11:
                return new bhe[i];
            case 12:
                return new bhj[i];
            case 13:
                return new bhl[i];
            case 14:
                return new bhm[i];
            case 15:
                return new bif[i];
            case 16:
                return new bho[i];
            case 17:
                return new bhq[i];
            case 18:
                return new big[i];
            case AIFeature.Type.IMAGE_DESCRIPTION /* 19 */:
                return new bih[i];
            default:
                return new bii[i];
        }
    }
}
