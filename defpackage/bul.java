package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bul extends akh implements bum {
    final /* synthetic */ bqe a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bul(bqe bqeVar) {
        this();
        this.a = bqeVar;
    }

    @Override // defpackage.bum
    public final void a(String str, bpf bpfVar, bpf bpfVar2, buj bujVar) {
        this.a.c(str, (byte[]) bpe.a(bpfVar), (byte[]) bpe.a(bpfVar2), new bua(bujVar), dzi.a);
    }

    @Override // defpackage.bum
    public final void b(String str, bpf bpfVar, bpf bpfVar2, buj bujVar, bpf bpfVar3) {
        dzi dziVar = dzi.a;
        byte[] bArr = (byte[]) bpe.a(bpfVar3);
        if (bArr != null) {
            try {
                dziVar = (dzi) efb.parseFrom(dzi.a, bArr, een.a());
            } catch (efp e) {
                new bua(bujVar).a(8, e.getMessage());
                return;
            }
        }
        this.a.c(str, (byte[]) bpe.a(bpfVar), (byte[]) bpe.a(bpfVar2), new bua(bujVar), dziVar);
    }

    @Override // defpackage.bum
    public final boolean c() {
        return true;
    }

    @Override // defpackage.akh
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        bpf bpdVar;
        bpf bpdVar2;
        buj bujVar;
        bpf bpdVar3;
        bpf bpdVar4;
        buj buhVar;
        if (i == 2) {
            buh buhVar2 = null;
            String string = parcel.readString();
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                bpdVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                bpdVar = iInterfaceQueryLocalInterface instanceof bpf ? (bpf) iInterfaceQueryLocalInterface : new bpd(strongBinder);
            }
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 == null) {
                bpdVar2 = null;
            } else {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                bpdVar2 = iInterfaceQueryLocalInterface2 instanceof bpf ? (bpf) iInterfaceQueryLocalInterface2 : new bpd(strongBinder2);
            }
            IBinder strongBinder3 = parcel.readStrongBinder();
            if (strongBinder3 == null) {
                bujVar = buhVar2;
                enforceNoDataAvail(parcel);
                a(string, bpdVar, bpdVar2, bujVar);
                parcel2.writeNoException();
            } else {
                IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.learning.internal.IExampleStoreQueryCallbackV2");
                if (iInterfaceQueryLocalInterface3 instanceof buj) {
                    bujVar = (buj) iInterfaceQueryLocalInterface3;
                    enforceNoDataAvail(parcel);
                    a(string, bpdVar, bpdVar2, bujVar);
                    parcel2.writeNoException();
                } else {
                    buhVar2 = new buh(strongBinder3);
                    bujVar = buhVar2;
                    enforceNoDataAvail(parcel);
                    a(string, bpdVar, bpdVar2, bujVar);
                    parcel2.writeNoException();
                }
            }
        } else if (i == 3) {
            parcel2.writeNoException();
            int i3 = aki.a;
            parcel2.writeInt(1);
        } else {
            if (i != 4) {
                return false;
            }
            bpf bpdVar5 = null;
            String string2 = parcel.readString();
            IBinder strongBinder4 = parcel.readStrongBinder();
            if (strongBinder4 == null) {
                bpdVar3 = null;
            } else {
                IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                bpdVar3 = iInterfaceQueryLocalInterface4 instanceof bpf ? (bpf) iInterfaceQueryLocalInterface4 : new bpd(strongBinder4);
            }
            IBinder strongBinder5 = parcel.readStrongBinder();
            if (strongBinder5 == null) {
                bpdVar4 = null;
            } else {
                IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                bpdVar4 = iInterfaceQueryLocalInterface5 instanceof bpf ? (bpf) iInterfaceQueryLocalInterface5 : new bpd(strongBinder5);
            }
            IBinder strongBinder6 = parcel.readStrongBinder();
            if (strongBinder6 == null) {
                buhVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.learning.internal.IExampleStoreQueryCallbackV2");
                buhVar = iInterfaceQueryLocalInterface6 instanceof buj ? (buj) iInterfaceQueryLocalInterface6 : new buh(strongBinder6);
            }
            IBinder strongBinder7 = parcel.readStrongBinder();
            if (strongBinder7 != null) {
                IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                bpdVar5 = iInterfaceQueryLocalInterface7 instanceof bpf ? (bpf) iInterfaceQueryLocalInterface7 : new bpd(strongBinder7);
            }
            bpf bpfVar = bpdVar5;
            enforceNoDataAvail(parcel);
            b(string2, bpdVar3, bpdVar4, buhVar, bpfVar);
            parcel2.writeNoException();
        }
        return true;
    }

    public bul() {
        super("com.google.android.gms.learning.internal.IExampleStoreV2");
    }
}
