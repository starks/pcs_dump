package com.google.android.apps.aicore.aidl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.Bundleable;
import defpackage.akm;
import defpackage.bmr;
import defpackage.cvu;
import defpackage.cxc;
import defpackage.cyp;
import defpackage.eia;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ProofreadingResult extends bmr implements DecoratableResult {
    public static final Parcelable.Creator CREATOR = new ProofreadingResultParcelableCreator();
    public static final Bundleable.Reader READER = new Bundleable.Reader() { // from class: com.google.android.apps.aicore.aidl.ProofreadingResult.1
        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public /* synthetic */ Bundleable createFromBundle(Bundle bundle, String str, Parcelable.Creator creator) {
            return Bundleable.Reader.CC.$default$createFromBundle(this, bundle, str, creator);
        }

        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public ProofreadingResult readFromBundle(Bundle bundle, String str) {
            return (ProofreadingResult) createFromBundle(bundle, str, ProofreadingResult.CREATOR);
        }
    };
    private final InferenceEventTraceResult inferenceEventTraceResult;
    private final cxc results;

    public ProofreadingResult(List list, InferenceEventTraceResult inferenceEventTraceResult) {
        this.results = cxc.o(list);
        this.inferenceEventTraceResult = inferenceEventTraceResult;
    }

    public static ProofreadingResult create(List list) {
        return new ProofreadingResult(cxc.o(list), null);
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
        Stream map = Collection.EL.stream(getResults()).map(new Function() { // from class: com.google.android.apps.aicore.aidl.ProofreadingResult$$ExternalSyntheticLambda0
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((LLMReply) obj).getText();
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

    @Override // com.google.android.apps.aicore.aidl.Bundleable
    public /* synthetic */ void writeToBundle(Bundle bundle, String str) {
        Bundleable.CC.writeParcelableToBundle(this, bundle, str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ProofreadingResultParcelableCreator.writeToParcel(this, parcel, i);
    }

    @Override // com.google.android.apps.aicore.aidl.DecoratableResult
    public ProofreadingResult withInferenceEventTraceResult(InferenceEventTraceResult inferenceEventTraceResult) {
        return new ProofreadingResult(this.results, inferenceEventTraceResult);
    }
}
