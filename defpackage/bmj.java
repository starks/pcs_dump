package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmj extends bmr {
    public static final Parcelable.Creator CREATOR = new bji(7);
    final int a;
    public final Account b;
    public final int c;
    public final GoogleSignInAccount d;

    public bmj(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.a = i;
        this.b = account;
        this.c = i2;
        this.d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.j(parcel, 1, this.a);
        bnh.r(parcel, 2, this.b, i);
        bnh.j(parcel, 3, this.c);
        bnh.r(parcel, 4, this.d, i);
        bnh.e(parcel, iC);
    }
}
