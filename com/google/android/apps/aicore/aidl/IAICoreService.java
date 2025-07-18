package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.apps.aicore.aidl.IAstroboyService;
import com.google.android.apps.aicore.aidl.IBaymaxService;
import com.google.android.apps.aicore.aidl.IDownloadListener;
import com.google.android.apps.aicore.aidl.IDownloadListener2;
import com.google.android.apps.aicore.aidl.IImageDescriptionService;
import com.google.android.apps.aicore.aidl.IInfoExtractionService;
import com.google.android.apps.aicore.aidl.ILLMService;
import com.google.android.apps.aicore.aidl.IMagicRewriteService;
import com.google.android.apps.aicore.aidl.IMockService;
import com.google.android.apps.aicore.aidl.IOcrService;
import com.google.android.apps.aicore.aidl.IOptimusService;
import com.google.android.apps.aicore.aidl.IProofreadingService;
import com.google.android.apps.aicore.aidl.IQuestionToAnswerService;
import com.google.android.apps.aicore.aidl.IRosieRobotService;
import com.google.android.apps.aicore.aidl.ISmartReplyService;
import com.google.android.apps.aicore.aidl.ISonnyService;
import com.google.android.apps.aicore.aidl.ISuggestedTextService;
import com.google.android.apps.aicore.aidl.ISummarizationService;
import com.google.android.apps.aicore.aidl.ITarsService;
import com.google.android.apps.aicore.aidl.ITextClassificationService;
import com.google.android.apps.aicore.aidl.ITextEmbeddingService;
import com.google.android.apps.aicore.aidl.ITextToImageService;
import defpackage.akg;
import defpackage.akh;
import defpackage.aki;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface IAICoreService extends IInterface {

    /* compiled from: PG */
    public abstract class Stub extends akh implements IAICoreService {
        private static final String DESCRIPTOR = "com.google.android.apps.aicore.aidl.IAICoreService";
        static final int TRANSACTION_getApiVersion = 11;
        static final int TRANSACTION_getAstroboyService = 28;
        static final int TRANSACTION_getBaymaxService = 25;
        static final int TRANSACTION_getDownloadableSizeInBytes = 19;
        static final int TRANSACTION_getFeature = 14;
        static final int TRANSACTION_getFeatureOrControl = 32;
        static final int TRANSACTION_getFeatureStatus = 3;
        static final int TRANSACTION_getImageDescriptionService = 30;
        static final int TRANSACTION_getInfoExtractionService = 24;
        static final int TRANSACTION_getLLMService = 5;
        static final int TRANSACTION_getMagicRewriteService = 15;
        static final int TRANSACTION_getMockService = 20;
        static final int TRANSACTION_getOcrService = 18;
        static final int TRANSACTION_getOptimusService = 29;
        static final int TRANSACTION_getProofreadingService = 9;
        static final int TRANSACTION_getQuestionToAnswerService = 23;
        static final int TRANSACTION_getRosieRobotService = 27;
        static final int TRANSACTION_getSmartReplyService = 8;
        static final int TRANSACTION_getSonnyService = 31;
        static final int TRANSACTION_getSuggestedTextService = 16;
        static final int TRANSACTION_getSummarizationService = 6;
        static final int TRANSACTION_getTarsService = 26;
        static final int TRANSACTION_getTextClassificationService = 21;
        static final int TRANSACTION_getTextEmbeddingService = 17;
        static final int TRANSACTION_getTextToImageService = 10;
        static final int TRANSACTION_getTokenCapacity = 22;
        static final int TRANSACTION_initializeSafety = 33;
        static final int TRANSACTION_isPersistentModeEnabled = 13;
        static final int TRANSACTION_listFeatures = 2;
        static final int TRANSACTION_requestDownloadableFeature = 4;
        static final int TRANSACTION_requestDownloadableFeatureWithDownloadListener = 7;
        static final int TRANSACTION_requestDownloadableFeatureWithDownloadListener2 = 12;

        /* compiled from: PG */
        public class Proxy extends akg implements IAICoreService {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public int getApiVersion() {
                Parcel parcelTransactAndReadException = transactAndReadException(11, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public IAstroboyService getAstroboyService(AIFeature aIFeature) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, aIFeature);
                Parcel parcelTransactAndReadException = transactAndReadException(Stub.TRANSACTION_getAstroboyService, parcelObtainAndWriteInterfaceToken);
                IAstroboyService iAstroboyServiceAsInterface = IAstroboyService.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iAstroboyServiceAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public IBaymaxService getBaymaxService(AIFeature aIFeature) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, aIFeature);
                Parcel parcelTransactAndReadException = transactAndReadException(Stub.TRANSACTION_getBaymaxService, parcelObtainAndWriteInterfaceToken);
                IBaymaxService iBaymaxServiceAsInterface = IBaymaxService.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iBaymaxServiceAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public long getDownloadableSizeInBytes(AIFeature aIFeature) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, aIFeature);
                Parcel parcelTransactAndReadException = transactAndReadException(19, parcelObtainAndWriteInterfaceToken);
                long j = parcelTransactAndReadException.readLong();
                parcelTransactAndReadException.recycle();
                return j;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public AIFeature getFeature(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                Parcel parcelTransactAndReadException = transactAndReadException(14, parcelObtainAndWriteInterfaceToken);
                AIFeature aIFeature = (AIFeature) aki.a(parcelTransactAndReadException, AIFeature.CREATOR);
                parcelTransactAndReadException.recycle();
                return aIFeature;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public AIFeature getFeatureOrControl(int i, int i2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeInt(i2);
                Parcel parcelTransactAndReadException = transactAndReadException(Stub.TRANSACTION_getFeatureOrControl, parcelObtainAndWriteInterfaceToken);
                AIFeature aIFeature = (AIFeature) aki.a(parcelTransactAndReadException, AIFeature.CREATOR);
                parcelTransactAndReadException.recycle();
                return aIFeature;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public int getFeatureStatus(AIFeature aIFeature) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, aIFeature);
                Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public IImageDescriptionService getImageDescriptionService(AIFeature aIFeature) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, aIFeature);
                Parcel parcelTransactAndReadException = transactAndReadException(Stub.TRANSACTION_getImageDescriptionService, parcelObtainAndWriteInterfaceToken);
                IImageDescriptionService iImageDescriptionServiceAsInterface = IImageDescriptionService.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iImageDescriptionServiceAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public IInfoExtractionService getInfoExtractionService(AIFeature aIFeature) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, aIFeature);
                Parcel parcelTransactAndReadException = transactAndReadException(Stub.TRANSACTION_getInfoExtractionService, parcelObtainAndWriteInterfaceToken);
                IInfoExtractionService iInfoExtractionServiceAsInterface = IInfoExtractionService.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iInfoExtractionServiceAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public ILLMService getLLMService(AIFeature aIFeature) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, aIFeature);
                Parcel parcelTransactAndReadException = transactAndReadException(5, parcelObtainAndWriteInterfaceToken);
                ILLMService iLLMServiceAsInterface = ILLMService.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iLLMServiceAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public IMagicRewriteService getMagicRewriteService(AIFeature aIFeature) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, aIFeature);
                Parcel parcelTransactAndReadException = transactAndReadException(15, parcelObtainAndWriteInterfaceToken);
                IMagicRewriteService iMagicRewriteServiceAsInterface = IMagicRewriteService.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iMagicRewriteServiceAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public IMockService getMockService() {
                Parcel parcelTransactAndReadException = transactAndReadException(20, obtainAndWriteInterfaceToken());
                IMockService iMockServiceAsInterface = IMockService.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iMockServiceAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public IOcrService getOcrService(AIFeature aIFeature) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, aIFeature);
                Parcel parcelTransactAndReadException = transactAndReadException(18, parcelObtainAndWriteInterfaceToken);
                IOcrService iOcrServiceAsInterface = IOcrService.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iOcrServiceAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public IOptimusService getOptimusService(AIFeature aIFeature) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, aIFeature);
                Parcel parcelTransactAndReadException = transactAndReadException(Stub.TRANSACTION_getOptimusService, parcelObtainAndWriteInterfaceToken);
                IOptimusService iOptimusServiceAsInterface = IOptimusService.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iOptimusServiceAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public IProofreadingService getProofreadingService(AIFeature aIFeature) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, aIFeature);
                Parcel parcelTransactAndReadException = transactAndReadException(9, parcelObtainAndWriteInterfaceToken);
                IProofreadingService iProofreadingServiceAsInterface = IProofreadingService.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iProofreadingServiceAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public IQuestionToAnswerService getQuestionToAnswerService(AIFeature aIFeature) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, aIFeature);
                Parcel parcelTransactAndReadException = transactAndReadException(Stub.TRANSACTION_getQuestionToAnswerService, parcelObtainAndWriteInterfaceToken);
                IQuestionToAnswerService iQuestionToAnswerServiceAsInterface = IQuestionToAnswerService.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iQuestionToAnswerServiceAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public IRosieRobotService getRosieRobotService(AIFeature aIFeature) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, aIFeature);
                Parcel parcelTransactAndReadException = transactAndReadException(Stub.TRANSACTION_getRosieRobotService, parcelObtainAndWriteInterfaceToken);
                IRosieRobotService iRosieRobotServiceAsInterface = IRosieRobotService.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iRosieRobotServiceAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public ISmartReplyService getSmartReplyService(AIFeature aIFeature) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, aIFeature);
                Parcel parcelTransactAndReadException = transactAndReadException(8, parcelObtainAndWriteInterfaceToken);
                ISmartReplyService iSmartReplyServiceAsInterface = ISmartReplyService.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iSmartReplyServiceAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public ISonnyService getSonnyService(AIFeature aIFeature) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, aIFeature);
                Parcel parcelTransactAndReadException = transactAndReadException(Stub.TRANSACTION_getSonnyService, parcelObtainAndWriteInterfaceToken);
                ISonnyService iSonnyServiceAsInterface = ISonnyService.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iSonnyServiceAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public ISuggestedTextService getSuggestedTextService(AIFeature aIFeature) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, aIFeature);
                Parcel parcelTransactAndReadException = transactAndReadException(16, parcelObtainAndWriteInterfaceToken);
                ISuggestedTextService iSuggestedTextServiceAsInterface = ISuggestedTextService.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iSuggestedTextServiceAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public ISummarizationService getSummarizationService(AIFeature aIFeature) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, aIFeature);
                Parcel parcelTransactAndReadException = transactAndReadException(6, parcelObtainAndWriteInterfaceToken);
                ISummarizationService iSummarizationServiceAsInterface = ISummarizationService.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iSummarizationServiceAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public ITarsService getTarsService(AIFeature aIFeature) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, aIFeature);
                Parcel parcelTransactAndReadException = transactAndReadException(Stub.TRANSACTION_getTarsService, parcelObtainAndWriteInterfaceToken);
                ITarsService iTarsServiceAsInterface = ITarsService.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iTarsServiceAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public ITextClassificationService getTextClassificationService(AIFeature aIFeature) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, aIFeature);
                Parcel parcelTransactAndReadException = transactAndReadException(Stub.TRANSACTION_getTextClassificationService, parcelObtainAndWriteInterfaceToken);
                ITextClassificationService iTextClassificationServiceAsInterface = ITextClassificationService.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iTextClassificationServiceAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public ITextEmbeddingService getTextEmbeddingService(AIFeature aIFeature) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, aIFeature);
                Parcel parcelTransactAndReadException = transactAndReadException(17, parcelObtainAndWriteInterfaceToken);
                ITextEmbeddingService iTextEmbeddingServiceAsInterface = ITextEmbeddingService.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iTextEmbeddingServiceAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public ITextToImageService getTextToImageService(AIFeature aIFeature) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, aIFeature);
                Parcel parcelTransactAndReadException = transactAndReadException(10, parcelObtainAndWriteInterfaceToken);
                ITextToImageService iTextToImageServiceAsInterface = ITextToImageService.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iTextToImageServiceAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public int getTokenCapacity(AIFeature aIFeature) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, aIFeature);
                Parcel parcelTransactAndReadException = transactAndReadException(Stub.TRANSACTION_getTokenCapacity, parcelObtainAndWriteInterfaceToken);
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public void initializeSafety(AIFeature aIFeature, IDownloadListener2 iDownloadListener2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, aIFeature);
                aki.d(parcelObtainAndWriteInterfaceToken, iDownloadListener2);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_initializeSafety, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public boolean isPersistentModeEnabled() {
                Parcel parcelTransactAndReadException = transactAndReadException(13, obtainAndWriteInterfaceToken());
                boolean zE = aki.e(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zE;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public AIFeature[] listFeatures() {
                Parcel parcelTransactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                AIFeature[] aIFeatureArr = (AIFeature[]) parcelTransactAndReadException.createTypedArray(AIFeature.CREATOR);
                parcelTransactAndReadException.recycle();
                return aIFeatureArr;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public int requestDownloadableFeature(AIFeature aIFeature) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, aIFeature);
                Parcel parcelTransactAndReadException = transactAndReadException(4, parcelObtainAndWriteInterfaceToken);
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public int requestDownloadableFeatureWithDownloadListener(AIFeature aIFeature, IDownloadListener iDownloadListener) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, aIFeature);
                aki.d(parcelObtainAndWriteInterfaceToken, iDownloadListener);
                Parcel parcelTransactAndReadException = transactAndReadException(7, parcelObtainAndWriteInterfaceToken);
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public int requestDownloadableFeatureWithDownloadListener2(AIFeature aIFeature, IDownloadListener2 iDownloadListener2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                aki.b(parcelObtainAndWriteInterfaceToken, aIFeature);
                aki.d(parcelObtainAndWriteInterfaceToken, iDownloadListener2);
                Parcel parcelTransactAndReadException = transactAndReadException(12, parcelObtainAndWriteInterfaceToken);
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static IAICoreService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof IAICoreService ? (IAICoreService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.akh
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    AIFeature[] aIFeatureArrListFeatures = listFeatures();
                    parcel2.writeNoException();
                    parcel2.writeTypedArray(aIFeatureArrListFeatures, 1);
                    return true;
                case 3:
                    AIFeature aIFeature = (AIFeature) aki.a(parcel, AIFeature.CREATOR);
                    enforceNoDataAvail(parcel);
                    int featureStatus = getFeatureStatus(aIFeature);
                    parcel2.writeNoException();
                    parcel2.writeInt(featureStatus);
                    return true;
                case 4:
                    AIFeature aIFeature2 = (AIFeature) aki.a(parcel, AIFeature.CREATOR);
                    enforceNoDataAvail(parcel);
                    int iRequestDownloadableFeature = requestDownloadableFeature(aIFeature2);
                    parcel2.writeNoException();
                    parcel2.writeInt(iRequestDownloadableFeature);
                    return true;
                case 5:
                    AIFeature aIFeature3 = (AIFeature) aki.a(parcel, AIFeature.CREATOR);
                    enforceNoDataAvail(parcel);
                    ILLMService lLMService = getLLMService(aIFeature3);
                    parcel2.writeNoException();
                    aki.d(parcel2, lLMService);
                    return true;
                case 6:
                    AIFeature aIFeature4 = (AIFeature) aki.a(parcel, AIFeature.CREATOR);
                    enforceNoDataAvail(parcel);
                    ISummarizationService summarizationService = getSummarizationService(aIFeature4);
                    parcel2.writeNoException();
                    aki.d(parcel2, summarizationService);
                    return true;
                case 7:
                    AIFeature aIFeature5 = (AIFeature) aki.a(parcel, AIFeature.CREATOR);
                    IDownloadListener iDownloadListenerAsInterface = IDownloadListener.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    int iRequestDownloadableFeatureWithDownloadListener = requestDownloadableFeatureWithDownloadListener(aIFeature5, iDownloadListenerAsInterface);
                    parcel2.writeNoException();
                    parcel2.writeInt(iRequestDownloadableFeatureWithDownloadListener);
                    return true;
                case 8:
                    AIFeature aIFeature6 = (AIFeature) aki.a(parcel, AIFeature.CREATOR);
                    enforceNoDataAvail(parcel);
                    ISmartReplyService smartReplyService = getSmartReplyService(aIFeature6);
                    parcel2.writeNoException();
                    aki.d(parcel2, smartReplyService);
                    return true;
                case 9:
                    AIFeature aIFeature7 = (AIFeature) aki.a(parcel, AIFeature.CREATOR);
                    enforceNoDataAvail(parcel);
                    IProofreadingService proofreadingService = getProofreadingService(aIFeature7);
                    parcel2.writeNoException();
                    aki.d(parcel2, proofreadingService);
                    return true;
                case 10:
                    AIFeature aIFeature8 = (AIFeature) aki.a(parcel, AIFeature.CREATOR);
                    enforceNoDataAvail(parcel);
                    ITextToImageService textToImageService = getTextToImageService(aIFeature8);
                    parcel2.writeNoException();
                    aki.d(parcel2, textToImageService);
                    return true;
                case 11:
                    int apiVersion = getApiVersion();
                    parcel2.writeNoException();
                    parcel2.writeInt(apiVersion);
                    return true;
                case 12:
                    AIFeature aIFeature9 = (AIFeature) aki.a(parcel, AIFeature.CREATOR);
                    IDownloadListener2 iDownloadListener2AsInterface = IDownloadListener2.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    int iRequestDownloadableFeatureWithDownloadListener2 = requestDownloadableFeatureWithDownloadListener2(aIFeature9, iDownloadListener2AsInterface);
                    parcel2.writeNoException();
                    parcel2.writeInt(iRequestDownloadableFeatureWithDownloadListener2);
                    return true;
                case 13:
                    boolean zIsPersistentModeEnabled = isPersistentModeEnabled();
                    parcel2.writeNoException();
                    int i3 = aki.a;
                    parcel2.writeInt(zIsPersistentModeEnabled ? 1 : 0);
                    return true;
                case 14:
                    int i4 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    AIFeature feature = getFeature(i4);
                    parcel2.writeNoException();
                    aki.c(parcel2, feature);
                    return true;
                case 15:
                    AIFeature aIFeature10 = (AIFeature) aki.a(parcel, AIFeature.CREATOR);
                    enforceNoDataAvail(parcel);
                    IMagicRewriteService magicRewriteService = getMagicRewriteService(aIFeature10);
                    parcel2.writeNoException();
                    aki.d(parcel2, magicRewriteService);
                    return true;
                case 16:
                    AIFeature aIFeature11 = (AIFeature) aki.a(parcel, AIFeature.CREATOR);
                    enforceNoDataAvail(parcel);
                    ISuggestedTextService suggestedTextService = getSuggestedTextService(aIFeature11);
                    parcel2.writeNoException();
                    aki.d(parcel2, suggestedTextService);
                    return true;
                case 17:
                    AIFeature aIFeature12 = (AIFeature) aki.a(parcel, AIFeature.CREATOR);
                    enforceNoDataAvail(parcel);
                    ITextEmbeddingService textEmbeddingService = getTextEmbeddingService(aIFeature12);
                    parcel2.writeNoException();
                    aki.d(parcel2, textEmbeddingService);
                    return true;
                case 18:
                    AIFeature aIFeature13 = (AIFeature) aki.a(parcel, AIFeature.CREATOR);
                    enforceNoDataAvail(parcel);
                    IOcrService ocrService = getOcrService(aIFeature13);
                    parcel2.writeNoException();
                    aki.d(parcel2, ocrService);
                    return true;
                case 19:
                    AIFeature aIFeature14 = (AIFeature) aki.a(parcel, AIFeature.CREATOR);
                    enforceNoDataAvail(parcel);
                    long downloadableSizeInBytes = getDownloadableSizeInBytes(aIFeature14);
                    parcel2.writeNoException();
                    parcel2.writeLong(downloadableSizeInBytes);
                    return true;
                case 20:
                    IMockService mockService = getMockService();
                    parcel2.writeNoException();
                    aki.d(parcel2, mockService);
                    return true;
                case TRANSACTION_getTextClassificationService /* 21 */:
                    AIFeature aIFeature15 = (AIFeature) aki.a(parcel, AIFeature.CREATOR);
                    enforceNoDataAvail(parcel);
                    ITextClassificationService textClassificationService = getTextClassificationService(aIFeature15);
                    parcel2.writeNoException();
                    aki.d(parcel2, textClassificationService);
                    return true;
                case TRANSACTION_getTokenCapacity /* 22 */:
                    AIFeature aIFeature16 = (AIFeature) aki.a(parcel, AIFeature.CREATOR);
                    enforceNoDataAvail(parcel);
                    int tokenCapacity = getTokenCapacity(aIFeature16);
                    parcel2.writeNoException();
                    parcel2.writeInt(tokenCapacity);
                    return true;
                case TRANSACTION_getQuestionToAnswerService /* 23 */:
                    AIFeature aIFeature17 = (AIFeature) aki.a(parcel, AIFeature.CREATOR);
                    enforceNoDataAvail(parcel);
                    IQuestionToAnswerService questionToAnswerService = getQuestionToAnswerService(aIFeature17);
                    parcel2.writeNoException();
                    aki.d(parcel2, questionToAnswerService);
                    return true;
                case TRANSACTION_getInfoExtractionService /* 24 */:
                    AIFeature aIFeature18 = (AIFeature) aki.a(parcel, AIFeature.CREATOR);
                    enforceNoDataAvail(parcel);
                    IInfoExtractionService infoExtractionService = getInfoExtractionService(aIFeature18);
                    parcel2.writeNoException();
                    aki.d(parcel2, infoExtractionService);
                    return true;
                case TRANSACTION_getBaymaxService /* 25 */:
                    AIFeature aIFeature19 = (AIFeature) aki.a(parcel, AIFeature.CREATOR);
                    enforceNoDataAvail(parcel);
                    IBaymaxService baymaxService = getBaymaxService(aIFeature19);
                    parcel2.writeNoException();
                    aki.d(parcel2, baymaxService);
                    return true;
                case TRANSACTION_getTarsService /* 26 */:
                    AIFeature aIFeature20 = (AIFeature) aki.a(parcel, AIFeature.CREATOR);
                    enforceNoDataAvail(parcel);
                    ITarsService tarsService = getTarsService(aIFeature20);
                    parcel2.writeNoException();
                    aki.d(parcel2, tarsService);
                    return true;
                case TRANSACTION_getRosieRobotService /* 27 */:
                    AIFeature aIFeature21 = (AIFeature) aki.a(parcel, AIFeature.CREATOR);
                    enforceNoDataAvail(parcel);
                    IRosieRobotService rosieRobotService = getRosieRobotService(aIFeature21);
                    parcel2.writeNoException();
                    aki.d(parcel2, rosieRobotService);
                    return true;
                case TRANSACTION_getAstroboyService /* 28 */:
                    AIFeature aIFeature22 = (AIFeature) aki.a(parcel, AIFeature.CREATOR);
                    enforceNoDataAvail(parcel);
                    IAstroboyService astroboyService = getAstroboyService(aIFeature22);
                    parcel2.writeNoException();
                    aki.d(parcel2, astroboyService);
                    return true;
                case TRANSACTION_getOptimusService /* 29 */:
                    AIFeature aIFeature23 = (AIFeature) aki.a(parcel, AIFeature.CREATOR);
                    enforceNoDataAvail(parcel);
                    IOptimusService optimusService = getOptimusService(aIFeature23);
                    parcel2.writeNoException();
                    aki.d(parcel2, optimusService);
                    return true;
                case TRANSACTION_getImageDescriptionService /* 30 */:
                    AIFeature aIFeature24 = (AIFeature) aki.a(parcel, AIFeature.CREATOR);
                    enforceNoDataAvail(parcel);
                    IImageDescriptionService imageDescriptionService = getImageDescriptionService(aIFeature24);
                    parcel2.writeNoException();
                    aki.d(parcel2, imageDescriptionService);
                    return true;
                case TRANSACTION_getSonnyService /* 31 */:
                    AIFeature aIFeature25 = (AIFeature) aki.a(parcel, AIFeature.CREATOR);
                    enforceNoDataAvail(parcel);
                    ISonnyService sonnyService = getSonnyService(aIFeature25);
                    parcel2.writeNoException();
                    aki.d(parcel2, sonnyService);
                    return true;
                case TRANSACTION_getFeatureOrControl /* 32 */:
                    int i5 = parcel.readInt();
                    int i6 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    AIFeature featureOrControl = getFeatureOrControl(i5, i6);
                    parcel2.writeNoException();
                    aki.c(parcel2, featureOrControl);
                    return true;
                case TRANSACTION_initializeSafety /* 33 */:
                    AIFeature aIFeature26 = (AIFeature) aki.a(parcel, AIFeature.CREATOR);
                    IDownloadListener2 iDownloadListener2AsInterface2 = IDownloadListener2.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    initializeSafety(aIFeature26, iDownloadListener2AsInterface2);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    int getApiVersion();

    IAstroboyService getAstroboyService(AIFeature aIFeature);

    IBaymaxService getBaymaxService(AIFeature aIFeature);

    long getDownloadableSizeInBytes(AIFeature aIFeature);

    AIFeature getFeature(int i);

    AIFeature getFeatureOrControl(int i, int i2);

    int getFeatureStatus(AIFeature aIFeature);

    IImageDescriptionService getImageDescriptionService(AIFeature aIFeature);

    IInfoExtractionService getInfoExtractionService(AIFeature aIFeature);

    ILLMService getLLMService(AIFeature aIFeature);

    IMagicRewriteService getMagicRewriteService(AIFeature aIFeature);

    IMockService getMockService();

    IOcrService getOcrService(AIFeature aIFeature);

    IOptimusService getOptimusService(AIFeature aIFeature);

    IProofreadingService getProofreadingService(AIFeature aIFeature);

    IQuestionToAnswerService getQuestionToAnswerService(AIFeature aIFeature);

    IRosieRobotService getRosieRobotService(AIFeature aIFeature);

    ISmartReplyService getSmartReplyService(AIFeature aIFeature);

    ISonnyService getSonnyService(AIFeature aIFeature);

    ISuggestedTextService getSuggestedTextService(AIFeature aIFeature);

    ISummarizationService getSummarizationService(AIFeature aIFeature);

    ITarsService getTarsService(AIFeature aIFeature);

    ITextClassificationService getTextClassificationService(AIFeature aIFeature);

    ITextEmbeddingService getTextEmbeddingService(AIFeature aIFeature);

    ITextToImageService getTextToImageService(AIFeature aIFeature);

    int getTokenCapacity(AIFeature aIFeature);

    void initializeSafety(AIFeature aIFeature, IDownloadListener2 iDownloadListener2);

    boolean isPersistentModeEnabled();

    AIFeature[] listFeatures();

    int requestDownloadableFeature(AIFeature aIFeature);

    @Deprecated
    int requestDownloadableFeatureWithDownloadListener(AIFeature aIFeature, IDownloadListener iDownloadListener);

    int requestDownloadableFeatureWithDownloadListener2(AIFeature aIFeature, IDownloadListener2 iDownloadListener2);
}
