package com.google.android.apps.aicore.aidl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bmt;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface Bundleable extends bmt {

    /* compiled from: PG */
    /* renamed from: com.google.android.apps.aicore.aidl.Bundleable$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void writeParcelableToBundle(bmt bmtVar, Bundle bundle, String str) {
            Parcel parcelObtain = Parcel.obtain();
            bmtVar.writeToParcel(parcelObtain, 0);
            bundle.putByteArray(str, parcelObtain.marshall());
            parcelObtain.recycle();
        }
    }

    /* compiled from: PG */
    public interface Reader {

        /* compiled from: PG */
        /* renamed from: com.google.android.apps.aicore.aidl.Bundleable$Reader$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static Bundleable $default$createFromBundle(Reader reader, Bundle bundle, String str, Parcelable.Creator creator) {
                byte[] byteArray = bundle.getByteArray(str);
                byteArray.getClass();
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.unmarshall(byteArray, 0, byteArray.length);
                    parcelObtain.setDataPosition(0);
                    return (Bundleable) creator.createFromParcel(parcelObtain);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        Bundleable createFromBundle(Bundle bundle, String str, Parcelable.Creator creator);

        Bundleable readFromBundle(Bundle bundle, String str);
    }

    void writeToBundle(Bundle bundle, String str);
}
