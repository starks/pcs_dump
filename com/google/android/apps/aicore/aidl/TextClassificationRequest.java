package com.google.android.apps.aicore.aidl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.Bundleable;
import defpackage.bmr;

/* compiled from: PG */
/* loaded from: classes.dex */
public class TextClassificationRequest extends bmr implements Request {
    public static final Parcelable.Creator CREATOR = new TextClassificationRequestParcelableCreator();
    public static final Bundleable.Reader READER = new Bundleable.Reader() { // from class: com.google.android.apps.aicore.aidl.TextClassificationRequest.1
        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public /* synthetic */ Bundleable createFromBundle(Bundle bundle, String str, Parcelable.Creator creator) {
            return Bundleable.Reader.CC.$default$createFromBundle(this, bundle, str, creator);
        }

        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public TextClassificationRequest readFromBundle(Bundle bundle, String str) {
            return (TextClassificationRequest) createFromBundle(bundle, str, TextClassificationRequest.CREATOR);
        }
    };
    private final String message;

    public TextClassificationRequest(String str) {
        this.message = str;
    }

    public static TextClassificationRequest create(String str) {
        return new TextClassificationRequest(str);
    }

    public String getMessage() {
        return this.message;
    }

    @Override // com.google.android.apps.aicore.aidl.Bundleable
    public /* synthetic */ void writeToBundle(Bundle bundle, String str) {
        Bundleable.CC.writeParcelableToBundle(this, bundle, str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        TextClassificationRequestParcelableCreator.writeToParcel(this, parcel, i);
    }
}
