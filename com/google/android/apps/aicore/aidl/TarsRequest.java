package com.google.android.apps.aicore.aidl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.Bundleable;
import defpackage.akm;
import defpackage.ako;
import defpackage.bmr;
import defpackage.cvu;
import defpackage.cxc;
import defpackage.cyp;
import defpackage.eia;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public class TarsRequest extends bmr implements Request {
    public static final Parcelable.Creator CREATOR = new TarsRequestParcelableCreator();
    public static final Bundleable.Reader READER = new Bundleable.Reader() { // from class: com.google.android.apps.aicore.aidl.TarsRequest.1
        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public /* synthetic */ Bundleable createFromBundle(Bundle bundle, String str, Parcelable.Creator creator) {
            return Bundleable.Reader.CC.$default$createFromBundle(this, bundle, str, creator);
        }

        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public TarsRequest readFromBundle(Bundle bundle, String str) {
            return (TarsRequest) createFromBundle(bundle, str, TarsRequest.CREATOR);
        }
    };
    public cxc inputs;

    public TarsRequest(List list) {
        this.inputs = cxc.o(list);
    }

    public static TarsRequest create(List list) {
        return new TarsRequest(list);
    }

    public cxc getInferenceImageRequestsForSafety(akm akmVar, eia eiaVar) {
        int i = cxc.d;
        return cyp.a;
    }

    public cxc getInferenceRequestsForSafety(akm akmVar, eia eiaVar) {
        Stream streamFlatMap = Collection.EL.stream(getInputs()).flatMap(new Function() { // from class: com.google.android.apps.aicore.aidl.TarsRequest$$ExternalSyntheticLambda0
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Stream.CC.ofNullable(((TarsInput) obj).getText());
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = cxc.d;
        return (cxc) streamFlatMap.collect(cvu.a);
    }

    public cxc getInputs() {
        return this.inputs;
    }

    public String getRequestContentForSafety(akm akmVar, eia eiaVar) {
        if ((eiaVar.b & 2) == 0) {
            return (String) Collection.EL.stream(getInputs()).flatMap(new Function() { // from class: com.google.android.apps.aicore.aidl.TarsRequest$$ExternalSyntheticLambda2
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Stream.CC.ofNullable(((TarsInput) obj).getText());
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.joining((eiaVar.b & 1) != 0 ? eiaVar.c : "\n"));
        }
        return ako.b(eiaVar, Collection.EL.stream(getInputs()).map(new Function() { // from class: com.google.android.apps.aicore.aidl.TarsRequest$$ExternalSyntheticLambda1
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (TarsInput) obj;
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }));
    }

    public int getSafetyClassificationMode() {
        return 1;
    }

    public boolean hasStreamingCallback() {
        return false;
    }

    @Override // com.google.android.apps.aicore.aidl.Bundleable
    public /* synthetic */ void writeToBundle(Bundle bundle, String str) {
        Bundleable.CC.writeParcelableToBundle(this, bundle, str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        TarsRequestParcelableCreator.writeToParcel(this, parcel, i);
    }

    static /* synthetic */ bmr lambda$getRequestContentForSafety$0(TarsInput tarsInput) {
        return tarsInput;
    }
}
