package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.apps.aicore.aidl.AIFeature;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class f implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public f(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new g(parcel);
            case 1:
                return new e(parcel);
            case 2:
                return new as(parcel);
            case 3:
                return new ay(parcel);
            case 4:
                return new bb(parcel);
            case 5:
                return new hp(parcel);
            case 6:
                return new jg(parcel);
            case 7:
                return new kv(parcel);
            case 8:
                return new kw(parcel);
            case 9:
                parcel.getClass();
                return new mp(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
            case 10:
                return new wk(parcel);
            case 11:
                return new aax(parcel);
            case 12:
                return new aba(parcel);
            case 13:
                return new abd(parcel);
            case 14:
                return new abg(parcel);
            case 15:
                return new abq(parcel);
            case 16:
                return new ace(parcel);
            case 17:
                return new acg(parcel);
            case 18:
                return new age(parcel);
            case AIFeature.Type.IMAGE_DESCRIPTION /* 19 */:
                return new ParcelImpl(parcel);
            default:
                return new akb(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new g[i];
            case 1:
                return new e[i];
            case 2:
                return new as[i];
            case 3:
                return new ay[i];
            case 4:
                return new bb[i];
            case 5:
                return new hp[i];
            case 6:
                return new jg[i];
            case 7:
                return new kv[i];
            case 8:
                return new kw[i];
            case 9:
                return new mp[i];
            case 10:
                return new wk[i];
            case 11:
                return new aax[i];
            case 12:
                return new aba[i];
            case 13:
                return new abd[i];
            case 14:
                return new abg[i];
            case 15:
                return new abq[i];
            case 16:
                return new ace[i];
            case 17:
                return new acg[i];
            case 18:
                return new age[i];
            case AIFeature.Type.IMAGE_DESCRIPTION /* 19 */:
                return new ParcelImpl[i];
            default:
                return new akb[i];
        }
    }
}
