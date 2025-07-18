package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.akg;
import defpackage.akh;
import defpackage.aki;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface IMockService extends IInterface {

    /* compiled from: PG */
    public abstract class Stub extends akh implements IMockService {
        private static final String DESCRIPTOR = "com.google.android.apps.aicore.aidl.IMockService";
        static final int TRANSACTION_queueImageDescriptionResult = 4;
        static final int TRANSACTION_queueLLMResult = 2;
        static final int TRANSACTION_queueRosieRobotResult = 5;
        static final int TRANSACTION_queueSummarizationResult = 3;
        static final int TRANSACTION_reset = 1;

        /* compiled from: PG */
        public class Proxy extends akg implements IMockService {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.apps.aicore.aidl.IMockService
            public void queueImageDescriptionResult(ImageDescriptionResult imageDescriptionResult) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, imageDescriptionResult);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IMockService
            public void queueLLMResult(LLMResult lLMResult) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, lLMResult);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IMockService
            public void queueRosieRobotResult(RosieRobotResult rosieRobotResult) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, rosieRobotResult);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IMockService
            public void queueSummarizationResult(SummarizationResult summarizationResult) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, summarizationResult);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IMockService
            public void reset() {
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken());
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static IMockService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof IMockService ? (IMockService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.akh
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                reset();
            } else if (i == 2) {
                LLMResult lLMResult = (LLMResult) aki.a(parcel, LLMResult.CREATOR);
                enforceNoDataAvail(parcel);
                queueLLMResult(lLMResult);
            } else if (i == 3) {
                SummarizationResult summarizationResult = (SummarizationResult) aki.a(parcel, SummarizationResult.CREATOR);
                enforceNoDataAvail(parcel);
                queueSummarizationResult(summarizationResult);
            } else if (i == 4) {
                ImageDescriptionResult imageDescriptionResult = (ImageDescriptionResult) aki.a(parcel, ImageDescriptionResult.CREATOR);
                enforceNoDataAvail(parcel);
                queueImageDescriptionResult(imageDescriptionResult);
            } else {
                if (i != 5) {
                    return false;
                }
                RosieRobotResult rosieRobotResult = (RosieRobotResult) aki.a(parcel, RosieRobotResult.CREATOR);
                enforceNoDataAvail(parcel);
                queueRosieRobotResult(rosieRobotResult);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void queueImageDescriptionResult(ImageDescriptionResult imageDescriptionResult);

    void queueLLMResult(LLMResult lLMResult);

    void queueRosieRobotResult(RosieRobotResult rosieRobotResult);

    void queueSummarizationResult(SummarizationResult summarizationResult);

    void reset();
}
