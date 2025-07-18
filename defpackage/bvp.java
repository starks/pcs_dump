package defpackage;

import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bvp extends akg implements bvr {
    public bvp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.internal.training.IInAppJobService");
    }

    @Override // defpackage.bvr
    public final boolean init(bpf bpfVar, bpf bpfVar2) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        aki.d(parcelObtainAndWriteInterfaceToken, bpfVar);
        aki.d(parcelObtainAndWriteInterfaceToken, bpfVar2);
        Parcel parcelTransactAndReadException = transactAndReadException(9, parcelObtainAndWriteInterfaceToken);
        boolean zE = aki.e(parcelTransactAndReadException);
        parcelTransactAndReadException.recycle();
        return zE;
    }

    @Override // defpackage.bvr
    public final void onDestroy() {
        transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken());
    }

    @Override // defpackage.bvr
    public final void onRebind(Intent intent) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        aki.b(parcelObtainAndWriteInterfaceToken, intent);
        transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
    }

    @Override // defpackage.bvr
    public final int onStartCommand(Intent intent, int i, int i2) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        aki.b(parcelObtainAndWriteInterfaceToken, intent);
        parcelObtainAndWriteInterfaceToken.writeInt(i);
        parcelObtainAndWriteInterfaceToken.writeInt(i2);
        Parcel parcelTransactAndReadException = transactAndReadException(4, parcelObtainAndWriteInterfaceToken);
        int i3 = parcelTransactAndReadException.readInt();
        parcelTransactAndReadException.recycle();
        return i3;
    }

    @Override // defpackage.bvr
    public final boolean onStartJob(JobParameters jobParameters) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        aki.b(parcelObtainAndWriteInterfaceToken, jobParameters);
        Parcel parcelTransactAndReadException = transactAndReadException(7, parcelObtainAndWriteInterfaceToken);
        boolean zE = aki.e(parcelTransactAndReadException);
        parcelTransactAndReadException.recycle();
        return zE;
    }

    @Override // defpackage.bvr
    public final boolean onStopJob(JobParameters jobParameters) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        aki.b(parcelObtainAndWriteInterfaceToken, jobParameters);
        Parcel parcelTransactAndReadException = transactAndReadException(8, parcelObtainAndWriteInterfaceToken);
        boolean zE = aki.e(parcelTransactAndReadException);
        parcelTransactAndReadException.recycle();
        return zE;
    }

    @Override // defpackage.bvr
    public final void onTrimMemory(int i) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeInt(i);
        transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
    }

    @Override // defpackage.bvr
    public final boolean onUnbind(Intent intent) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        aki.b(parcelObtainAndWriteInterfaceToken, intent);
        Parcel parcelTransactAndReadException = transactAndReadException(5, parcelObtainAndWriteInterfaceToken);
        boolean zE = aki.e(parcelTransactAndReadException);
        parcelTransactAndReadException.recycle();
        return zE;
    }
}
