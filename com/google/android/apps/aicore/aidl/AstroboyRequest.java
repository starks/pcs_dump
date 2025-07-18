package com.google.android.apps.aicore.aidl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.Bundleable;
import defpackage.bmr;
import defpackage.cxc;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AstroboyRequest extends bmr implements Request {
    public static final Parcelable.Creator CREATOR = new AstroboyRequestParcelableCreator();
    public static final Bundleable.Reader READER = new Bundleable.Reader() { // from class: com.google.android.apps.aicore.aidl.AstroboyRequest.1
        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public /* synthetic */ Bundleable createFromBundle(Bundle bundle, String str, Parcelable.Creator creator) {
            return Bundleable.Reader.CC.$default$createFromBundle(this, bundle, str, creator);
        }

        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public AstroboyRequest readFromBundle(Bundle bundle, String str) {
            return (AstroboyRequest) createFromBundle(bundle, str, AstroboyRequest.CREATOR);
        }
    };
    public cxc inputs;

    public AstroboyRequest(List list) {
        this.inputs = cxc.o(list);
    }

    public static AstroboyRequest create(List list) {
        return new AstroboyRequest(list);
    }

    public cxc getInputs() {
        return this.inputs;
    }

    @Override // com.google.android.apps.aicore.aidl.Bundleable
    public /* synthetic */ void writeToBundle(Bundle bundle, String str) {
        Bundleable.CC.writeParcelableToBundle(this, bundle, str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AstroboyRequestParcelableCreator.writeToParcel(this, parcel, i);
    }
}
