package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acn extends Binder implements aco {
    final /* synthetic */ MultiInstanceInvalidationService a;

    public acn() {
        attachInterface(this, b);
    }

    public final int a(acm acmVar, String str) {
        acmVar.getClass();
        int i = 0;
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.a;
        synchronized (multiInstanceInvalidationService.c) {
            int i2 = multiInstanceInvalidationService.a + 1;
            multiInstanceInvalidationService.a = i2;
            RemoteCallbackList remoteCallbackList = multiInstanceInvalidationService.c;
            Integer numValueOf = Integer.valueOf(i2);
            if (remoteCallbackList.register(acmVar, numValueOf)) {
                multiInstanceInvalidationService.b.put(numValueOf, str);
                i = i2;
            } else {
                multiInstanceInvalidationService.a--;
            }
        }
        return i;
    }

    public final void b(int i, String[] strArr) {
        strArr.getClass();
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.a;
        synchronized (multiInstanceInvalidationService.c) {
            String str = (String) multiInstanceInvalidationService.b.get(Integer.valueOf(i));
            if (str == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int iBeginBroadcast = multiInstanceInvalidationService.c.beginBroadcast();
            for (int i2 = 0; i2 < iBeginBroadcast; i2++) {
                try {
                    Object broadcastCookie = multiInstanceInvalidationService.c.getBroadcastCookie(i2);
                    broadcastCookie.getClass();
                    Integer num = (Integer) broadcastCookie;
                    int iIntValue = num.intValue();
                    String str2 = (String) multiInstanceInvalidationService.b.get(num);
                    if (i != iIntValue && fjs.c(str, str2)) {
                        try {
                            ((acm) multiInstanceInvalidationService.c.getBroadcastItem(i2)).a(strArr);
                        } catch (RemoteException e) {
                            Log.w("ROOM", "Error invoking a remote callback", e);
                        }
                    }
                } finally {
                    multiInstanceInvalidationService.c.finishBroadcast();
                }
            }
        }
    }

    public final void c(acm acmVar, int i) {
        acmVar.getClass();
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.a;
        synchronized (multiInstanceInvalidationService.c) {
            multiInstanceInvalidationService.c.unregister(acmVar);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = b;
        if (i > 0 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        acm ackVar = null;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            int i3 = acl.a;
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(acl.b);
                ackVar = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof acm)) ? new ack(strongBinder) : (acm) iInterfaceQueryLocalInterface;
            }
            int iA = a(ackVar, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(iA);
        } else if (i == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            int i4 = acl.a;
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(acl.b);
                ackVar = (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof acm)) ? new ack(strongBinder2) : (acm) iInterfaceQueryLocalInterface2;
            }
            c(ackVar, parcel.readInt());
            parcel2.writeNoException();
        } else {
            if (i != 3) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            b(parcel.readInt(), parcel.createStringArray());
        }
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public acn(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this();
        this.a = multiInstanceInvalidationService;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
