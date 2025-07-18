package com.google.android.apps.aicore.aidl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.Bundleable;
import defpackage.bmr;

/* compiled from: PG */
/* loaded from: classes.dex */
public class OptimusRequest extends bmr implements Request {
    public static final Parcelable.Creator CREATOR = new OptimusRequestParcelableCreator();
    public static final Bundleable.Reader READER = new Bundleable.Reader() { // from class: com.google.android.apps.aicore.aidl.OptimusRequest.1
        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public /* synthetic */ Bundleable createFromBundle(Bundle bundle, String str, Parcelable.Creator creator) {
            return Bundleable.Reader.CC.$default$createFromBundle(this, bundle, str, creator);
        }

        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public OptimusRequest readFromBundle(Bundle bundle, String str) {
            return (OptimusRequest) createFromBundle(bundle, str, OptimusRequest.CREATOR);
        }
    };
    private final OptimusInput input;
    private final String sourceLanguage;
    private final String targetLanguage;

    public OptimusRequest(String str, String str2, OptimusInput optimusInput) {
        this.sourceLanguage = str;
        this.targetLanguage = str2;
        this.input = optimusInput;
    }

    public static OptimusRequest create(String str, String str2, OptimusInput optimusInput) {
        return new OptimusRequest(str, str2, optimusInput);
    }

    public OptimusInput getInput() {
        return this.input;
    }

    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    @Override // com.google.android.apps.aicore.aidl.Bundleable
    public /* synthetic */ void writeToBundle(Bundle bundle, String str) {
        Bundleable.CC.writeParcelableToBundle(this, bundle, str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        OptimusRequestParcelableCreator.writeToParcel(this, parcel, i);
    }
}
