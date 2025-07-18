package defpackage;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bls extends akg implements blt {
    public bls(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // defpackage.blt
    public final Account a() {
        Parcel parcelTransactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
        Account account = (Account) aki.a(parcelTransactAndReadException, Account.CREATOR);
        parcelTransactAndReadException.recycle();
        return account;
    }
}
