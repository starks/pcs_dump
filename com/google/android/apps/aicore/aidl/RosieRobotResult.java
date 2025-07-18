package com.google.android.apps.aicore.aidl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.Bundleable;
import defpackage.akm;
import defpackage.bmt;
import defpackage.cvu;
import defpackage.cxc;
import defpackage.cyp;
import defpackage.eia;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RosieRobotResult implements DecoratableResult, bmt {
    public static final Parcelable.Creator CREATOR = new RosieRobotResultParcelableCreator();
    public static final Bundleable.Reader READER = new Bundleable.Reader() { // from class: com.google.android.apps.aicore.aidl.RosieRobotResult.1
        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public /* synthetic */ Bundleable createFromBundle(Bundle bundle, String str, Parcelable.Creator creator) {
            return Bundleable.Reader.CC.$default$createFromBundle(this, bundle, str, creator);
        }

        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public RosieRobotResult readFromBundle(Bundle bundle, String str) {
            return (RosieRobotResult) createFromBundle(bundle, str, RosieRobotResult.CREATOR);
        }
    };
    private final InferenceEventTraceResult inferenceEventTraceResult;
    private final cxc results;

    public RosieRobotResult(List list, InferenceEventTraceResult inferenceEventTraceResult) {
        this.results = cxc.o(list);
        this.inferenceEventTraceResult = inferenceEventTraceResult;
    }

    public static RosieRobotResult create(List list) {
        return new RosieRobotResult(list, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RosieRobotResult)) {
            return false;
        }
        RosieRobotResult rosieRobotResult = (RosieRobotResult) obj;
        return Objects.equals(this.results, rosieRobotResult.results) && Objects.equals(this.inferenceEventTraceResult, rosieRobotResult.inferenceEventTraceResult);
    }

    @Override // com.google.android.apps.aicore.aidl.DecoratableResult
    public InferenceEventTraceResult getInferenceEventTraceResult() {
        return this.inferenceEventTraceResult;
    }

    public cxc getInferenceImageResultsForSafety(akm akmVar, eia eiaVar) {
        int i = cxc.d;
        return cyp.a;
    }

    public cxc getInferenceResultsForSafety(akm akmVar, eia eiaVar) {
        Stream map = Collection.EL.stream(getResults()).map(new Function() { // from class: com.google.android.apps.aicore.aidl.RosieRobotResult$$ExternalSyntheticLambda0
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((RosieRobotReply) obj).getText();
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = cxc.d;
        return (cxc) map.collect(cvu.a);
    }

    public cxc getResults() {
        return this.results;
    }

    public int hashCode() {
        return Objects.hash(this.results, this.inferenceEventTraceResult);
    }

    @Override // com.google.android.apps.aicore.aidl.Bundleable
    public /* synthetic */ void writeToBundle(Bundle bundle, String str) {
        Bundleable.CC.writeParcelableToBundle(this, bundle, str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        RosieRobotResultParcelableCreator.writeToParcel(this, parcel, i);
    }

    @Override // com.google.android.apps.aicore.aidl.DecoratableResult
    public RosieRobotResult withInferenceEventTraceResult(InferenceEventTraceResult inferenceEventTraceResult) {
        return new RosieRobotResult(this.results, inferenceEventTraceResult);
    }
}
