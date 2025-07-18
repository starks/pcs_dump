package com.google.android.apps.aicore.aidl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.Bundleable;
import defpackage.bmr;

/* compiled from: PG */
/* loaded from: classes.dex */
public class QuestionToAnswerResponse extends bmr implements Request {
    public static final Parcelable.Creator CREATOR = new QuestionToAnswerResponseParcelableCreator();
    public static final Bundleable.Reader READER = new Bundleable.Reader() { // from class: com.google.android.apps.aicore.aidl.QuestionToAnswerResponse.1
        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public /* synthetic */ Bundleable createFromBundle(Bundle bundle, String str, Parcelable.Creator creator) {
            return Bundleable.Reader.CC.$default$createFromBundle(this, bundle, str, creator);
        }

        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public QuestionToAnswerResponse readFromBundle(Bundle bundle, String str) {
            return (QuestionToAnswerResponse) createFromBundle(bundle, str, QuestionToAnswerResponse.CREATOR);
        }
    };
    private final String text;

    public QuestionToAnswerResponse(String str) {
        this.text = str;
    }

    public static QuestionToAnswerResponse create(String str) {
        return new QuestionToAnswerResponse(str);
    }

    public String getText() {
        return this.text;
    }

    @Override // com.google.android.apps.aicore.aidl.Bundleable
    public /* synthetic */ void writeToBundle(Bundle bundle, String str) {
        Bundleable.CC.writeParcelableToBundle(this, bundle, str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        QuestionToAnswerResponseParcelableCreator.writeToParcel(this, parcel, i);
    }
}
