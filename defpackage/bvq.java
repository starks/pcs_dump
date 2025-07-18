package defpackage;

import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bvq extends akh implements bvr {
    public bvq() {
        super("com.google.android.gms.learning.internal.training.IInAppJobService");
    }

    public static bvr asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.training.IInAppJobService");
        return iInterfaceQueryLocalInterface instanceof bvr ? (bvr) iInterfaceQueryLocalInterface : new bvp(iBinder);
    }

    @Override // defpackage.akh
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        bpf bpdVar;
        switch (i) {
            case 2:
                onDestroy();
                parcel2.writeNoException();
                return true;
            case 3:
                int i3 = parcel.readInt();
                enforceNoDataAvail(parcel);
                onTrimMemory(i3);
                parcel2.writeNoException();
                return true;
            case 4:
                Intent intent = (Intent) aki.a(parcel, Intent.CREATOR);
                int i4 = parcel.readInt();
                int i5 = parcel.readInt();
                enforceNoDataAvail(parcel);
                int iOnStartCommand = onStartCommand(intent, i4, i5);
                parcel2.writeNoException();
                parcel2.writeInt(iOnStartCommand);
                return true;
            case 5:
                Intent intent2 = (Intent) aki.a(parcel, Intent.CREATOR);
                enforceNoDataAvail(parcel);
                boolean zOnUnbind = onUnbind(intent2);
                parcel2.writeNoException();
                parcel2.writeInt(zOnUnbind ? 1 : 0);
                return true;
            case 6:
                Intent intent3 = (Intent) aki.a(parcel, Intent.CREATOR);
                enforceNoDataAvail(parcel);
                onRebind(intent3);
                parcel2.writeNoException();
                return true;
            case 7:
                JobParameters jobParameters = (JobParameters) aki.a(parcel, JobParameters.CREATOR);
                enforceNoDataAvail(parcel);
                boolean zOnStartJob = onStartJob(jobParameters);
                parcel2.writeNoException();
                parcel2.writeInt(zOnStartJob ? 1 : 0);
                return true;
            case 8:
                JobParameters jobParameters2 = (JobParameters) aki.a(parcel, JobParameters.CREATOR);
                enforceNoDataAvail(parcel);
                boolean zOnStopJob = onStopJob(jobParameters2);
                parcel2.writeNoException();
                parcel2.writeInt(zOnStopJob ? 1 : 0);
                return true;
            case 9:
                IBinder strongBinder = parcel.readStrongBinder();
                bpf bpdVar2 = null;
                if (strongBinder == null) {
                    bpdVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bpdVar = iInterfaceQueryLocalInterface instanceof bpf ? (bpf) iInterfaceQueryLocalInterface : new bpd(strongBinder);
                }
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bpdVar2 = iInterfaceQueryLocalInterface2 instanceof bpf ? (bpf) iInterfaceQueryLocalInterface2 : new bpd(strongBinder2);
                }
                enforceNoDataAvail(parcel);
                boolean zInit = init(bpdVar, bpdVar2);
                parcel2.writeNoException();
                int i6 = aki.a;
                parcel2.writeInt(zInit ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
