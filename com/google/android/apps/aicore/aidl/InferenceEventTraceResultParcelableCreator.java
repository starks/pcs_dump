package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.AIFeature;
import defpackage.aso;
import defpackage.bnh;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class InferenceEventTraceResultParcelableCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    static void writeToParcel(InferenceEventTraceResult inferenceEventTraceResult, Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.j(parcel, 1, inferenceEventTraceResult.getCustomerId());
        bnh.j(parcel, 2, inferenceEventTraceResult.getFeatureType());
        bnh.j(parcel, 3, inferenceEventTraceResult.getFeatureVariant());
        bnh.j(parcel, 4, inferenceEventTraceResult.getStatus());
        bnh.k(parcel, 5, inferenceEventTraceResult.getInferenceLatencyTotalMillis());
        bnh.j(parcel, 6, inferenceEventTraceResult.getNumInputTokens());
        bnh.j(parcel, 7, inferenceEventTraceResult.getNumOutputTokens());
        bnh.j(parcel, 8, inferenceEventTraceResult.getNumDecodeSteps());
        bnh.k(parcel, 9, inferenceEventTraceResult.getInferenceServiceStartLatencyMillis());
        bnh.k(parcel, 10, inferenceEventTraceResult.getInferenceApiCallHandlingLatencyMillis());
        bnh.k(parcel, 11, inferenceEventTraceResult.getInferenceInputSafetyCheckLatencyMillis());
        bnh.k(parcel, 12, inferenceEventTraceResult.getInferenceInputEncodingLatencyMillis());
        bnh.k(parcel, 13, inferenceEventTraceResult.getInferenceOverallOutputLatencyMillis());
        bnh.k(parcel, 14, inferenceEventTraceResult.getInferenceOutputSafetyCheckLatencyMillis());
        bnh.j(parcel, 15, inferenceEventTraceResult.getInputSafetyCheckPolicyViolationType());
        bnh.j(parcel, 16, inferenceEventTraceResult.getInputSafetyCheckSuggestedActionType());
        bnh.j(parcel, 17, inferenceEventTraceResult.getOutputSafetyCheckPolicyViolationType());
        bnh.j(parcel, 18, inferenceEventTraceResult.getOutputSafetyCheckSuggestedActionType());
        bnh.f(parcel, 19, inferenceEventTraceResult.isModelLoaded());
        bnh.j(parcel, 20, inferenceEventTraceResult.getFeatureId());
        bnh.k(parcel, 21, inferenceEventTraceResult.getModelInferenceLatencyMillis());
        bnh.g(parcel, 22, inferenceEventTraceResult.getOutputTokensPerSecond());
        bnh.g(parcel, 23, inferenceEventTraceResult.getInputTokensPerSecond());
        bnh.j(parcel, 24, inferenceEventTraceResult.getNumSamples());
        bnh.h(parcel, 25, inferenceEventTraceResult.getCannedResponsesRatio());
        bnh.m(parcel, 26, inferenceEventTraceResult.getSpeculativeDecodeStatisticsBytes());
        bnh.j(parcel, 27, inferenceEventTraceResult.getNumSuffixScoreFiltered());
        bnh.j(parcel, 28, inferenceEventTraceResult.getNumPostDeduped());
        bnh.k(parcel, 29, inferenceEventTraceResult.getInferenceStatefulSuspensionLatencyMillis());
        bnh.k(parcel, 30, inferenceEventTraceResult.getInferenceStatelessSuspensionLatencyMillis());
        bnh.j(parcel, 31, inferenceEventTraceResult.getTopCannedResponseIndex());
        bnh.j(parcel, 32, inferenceEventTraceResult.getInferenceStatefulSuspensionCount());
        bnh.j(parcel, 33, inferenceEventTraceResult.getInferenceStatefulResumptionCount());
        bnh.j(parcel, 34, inferenceEventTraceResult.getInferenceStatelessSuspensionCount());
        bnh.j(parcel, 35, inferenceEventTraceResult.getInferenceStatelessResumptionCount());
        bnh.j(parcel, 36, inferenceEventTraceResult.getRequestKind());
        bnh.j(parcel, 37, inferenceEventTraceResult.getInitialQueuePosition());
        bnh.j(parcel, 38, inferenceEventTraceResult.getFeatureVersion());
        bnh.k(parcel, 39, inferenceEventTraceResult.getInferenceStartTimestampMillis());
        bnh.k(parcel, 40, inferenceEventTraceResult.getCallingUserId());
        bnh.p(parcel, 41, inferenceEventTraceResult.getAuxiliaryFileTypes());
        bnh.e(parcel, iC);
    }

    @Override // android.os.Parcelable.Creator
    public InferenceEventTraceResult createFromParcel(Parcel parcel) {
        int iG = aso.g(parcel);
        byte[] bArrS = null;
        int[] iArrT = null;
        long jH = 0;
        long jH2 = 0;
        long jH3 = 0;
        long jH4 = 0;
        long jH5 = 0;
        long jH6 = 0;
        long jH7 = 0;
        long jH8 = 0;
        long jH9 = 0;
        long jH10 = 0;
        long jH11 = 0;
        long jH12 = 0;
        int iE = 0;
        int iE2 = 0;
        int iE3 = 0;
        int iE4 = 0;
        int iE5 = 0;
        int iE6 = 0;
        int iE7 = 0;
        int iE8 = 0;
        int iE9 = 0;
        int iE10 = 0;
        int iE11 = 0;
        boolean zR = false;
        int iE12 = 0;
        int iE13 = 0;
        int iE14 = 0;
        int iE15 = 0;
        int iE16 = 0;
        int iE17 = 0;
        int iE18 = 0;
        int iE19 = 0;
        int iE20 = 0;
        int iE21 = 0;
        int iE22 = -1;
        int iE23 = -1;
        float fC = 0.0f;
        double dB = 0.0d;
        double dB2 = 0.0d;
        while (parcel.dataPosition() < iG) {
            int i = parcel.readInt();
            switch (aso.d(i)) {
                case 1:
                    iE = aso.e(parcel, i);
                    break;
                case 2:
                    iE2 = aso.e(parcel, i);
                    break;
                case 3:
                    iE3 = aso.e(parcel, i);
                    break;
                case 4:
                    iE4 = aso.e(parcel, i);
                    break;
                case 5:
                    jH = aso.h(parcel, i);
                    break;
                case 6:
                    iE5 = aso.e(parcel, i);
                    break;
                case 7:
                    iE6 = aso.e(parcel, i);
                    break;
                case 8:
                    iE7 = aso.e(parcel, i);
                    break;
                case 9:
                    jH2 = aso.h(parcel, i);
                    break;
                case 10:
                    jH3 = aso.h(parcel, i);
                    break;
                case 11:
                    jH4 = aso.h(parcel, i);
                    break;
                case 12:
                    jH5 = aso.h(parcel, i);
                    break;
                case 13:
                    jH6 = aso.h(parcel, i);
                    break;
                case 14:
                    jH7 = aso.h(parcel, i);
                    break;
                case 15:
                    iE8 = aso.e(parcel, i);
                    break;
                case 16:
                    iE9 = aso.e(parcel, i);
                    break;
                case 17:
                    iE10 = aso.e(parcel, i);
                    break;
                case 18:
                    iE11 = aso.e(parcel, i);
                    break;
                case AIFeature.Type.IMAGE_DESCRIPTION /* 19 */:
                    zR = aso.r(parcel, i);
                    break;
                case 20:
                    iE12 = aso.e(parcel, i);
                    break;
                case 21:
                    jH8 = aso.h(parcel, i);
                    break;
                case 22:
                    dB = aso.b(parcel, i);
                    break;
                case 23:
                    dB2 = aso.b(parcel, i);
                    break;
                case 24:
                    iE13 = aso.e(parcel, i);
                    break;
                case 25:
                    fC = aso.c(parcel, i);
                    break;
                case 26:
                    bArrS = aso.s(parcel, i);
                    break;
                case 27:
                    iE14 = aso.e(parcel, i);
                    break;
                case 28:
                    iE15 = aso.e(parcel, i);
                    break;
                case 29:
                    jH9 = aso.h(parcel, i);
                    break;
                case 30:
                    jH10 = aso.h(parcel, i);
                    break;
                case 31:
                    iE22 = aso.e(parcel, i);
                    break;
                case 32:
                    iE16 = aso.e(parcel, i);
                    break;
                case 33:
                    iE17 = aso.e(parcel, i);
                    break;
                case 34:
                    iE18 = aso.e(parcel, i);
                    break;
                case 35:
                    iE19 = aso.e(parcel, i);
                    break;
                case 36:
                    iE20 = aso.e(parcel, i);
                    break;
                case 37:
                    iE23 = aso.e(parcel, i);
                    break;
                case 38:
                    iE21 = aso.e(parcel, i);
                    break;
                case 39:
                    jH11 = aso.h(parcel, i);
                    break;
                case 40:
                    jH12 = aso.h(parcel, i);
                    break;
                case 41:
                    iArrT = aso.t(parcel, i);
                    break;
                default:
                    aso.q(parcel, i);
                    break;
            }
        }
        aso.p(parcel, iG);
        return new InferenceEventTraceResult(iE, iE2, iE3, iE4, jH, iE5, iE6, iE7, jH2, jH3, jH4, jH5, jH6, jH7, iE8, iE9, iE10, iE11, zR, iE12, jH8, dB, dB2, iE13, fC, bArrS, iE14, iE15, jH9, jH10, iE22, iE16, iE17, iE18, iE19, iE20, iE23, iE21, jH11, jH12, iArrT);
    }

    @Override // android.os.Parcelable.Creator
    public InferenceEventTraceResult[] newArray(int i) {
        return new InferenceEventTraceResult[i];
    }
}
