package com.google.android.apps.aicore.aidl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.Bundleable;
import defpackage.bmr;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Hint extends bmr implements Bundleable {
    public static final Parcelable.Creator CREATOR = new HintParcelableCreator();
    public static final Bundleable.Reader READER = new Bundleable.Reader() { // from class: com.google.android.apps.aicore.aidl.Hint.1
        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public /* synthetic */ Bundleable createFromBundle(Bundle bundle, String str, Parcelable.Creator creator) {
            return Bundleable.Reader.CC.$default$createFromBundle(this, bundle, str, creator);
        }

        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public Hint readFromBundle(Bundle bundle, String str) {
            return (Hint) createFromBundle(bundle, str, Hint.CREATOR);
        }
    };
    private final int type;

    public Hint(int i) {
        this.type = i;
    }

    public static Hint create(int i) {
        return new Hint(i);
    }

    public int getType() {
        return this.type;
    }

    @Override // com.google.android.apps.aicore.aidl.Bundleable
    public void writeToBundle(Bundle bundle, String str) {
        Bundleable.CC.writeParcelableToBundle(this, bundle, str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        HintParcelableCreator.writeToParcel(this, parcel, i);
    }
}
