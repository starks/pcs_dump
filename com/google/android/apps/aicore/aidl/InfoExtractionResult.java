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
public class InfoExtractionResult extends bmr implements DecoratableResult {
    public static final Parcelable.Creator CREATOR = new InfoExtractionResultParcelableCreator();
    public static final Bundleable.Reader READER = new Bundleable.Reader() { // from class: com.google.android.apps.aicore.aidl.InfoExtractionResult.1
        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public /* synthetic */ Bundleable createFromBundle(Bundle bundle, String str, Parcelable.Creator creator) {
            return Bundleable.Reader.CC.$default$createFromBundle(this, bundle, str, creator);
        }

        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public InfoExtractionResult readFromBundle(Bundle bundle, String str) {
            return (InfoExtractionResult) createFromBundle(bundle, str, InfoExtractionResult.CREATOR);
        }
    };
    private final InferenceEventTraceResult inferenceEventTraceResult;
    private final cxc infos;

    public InfoExtractionResult(List list, InferenceEventTraceResult inferenceEventTraceResult) {
        this.infos = cxc.o(list);
        this.inferenceEventTraceResult = inferenceEventTraceResult;
    }

    public static InfoExtractionResult create(List list) {
        return new InfoExtractionResult(list, null);
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
        Stream streamFlatMap = Collection.EL.stream(getInfos()).flatMap(new Function() { // from class: com.google.android.apps.aicore.aidl.InfoExtractionResult$$ExternalSyntheticLambda0
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Stream.CC.ofNullable(((InfoExtractionInfo) obj).getText());
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = cxc.d;
        return (cxc) streamFlatMap.collect(cvu.a);
    }

    public cxc getInfos() {
        return this.infos;
    }

    @Override // com.google.android.apps.aicore.aidl.Bundleable
    public /* synthetic */ void writeToBundle(Bundle bundle, String str) {
        Bundleable.CC.writeParcelableToBundle(this, bundle, str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        InfoExtractionResultParcelableCreator.writeToParcel(this, parcel, i);
    }

    @Override // com.google.android.apps.aicore.aidl.DecoratableResult
    public InfoExtractionResult withInferenceEventTraceResult(InferenceEventTraceResult inferenceEventTraceResult) {
        return new InfoExtractionResult(this.infos, inferenceEventTraceResult);
    }
}
