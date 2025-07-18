package defpackage;

import com.google.android.apps.aicore.aidl.AIFeature;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aub implements Function {
    public aub() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        ats atsVar = (ats) obj;
        switch (atsVar.ordinal()) {
            case 0:
                return ein.TRAIN_UNDEFINED;
            case 1:
                return ein.TRAIN_STARTED;
            case 2:
                return ein.TRAIN_COMPLETED;
            case 3:
                return ein.TRAIN_INTERRUPTED;
            case 4:
                return ein.TRAIN_ERROR;
            case 5:
                return ein.TRAIN_NOT_STARTED;
            case 6:
                return ein.TRAIN_DOWNLOADED;
            case 7:
                return ein.TRAIN_UPLOADED;
            case 8:
                return ein.TRAIN_TURNED_AWAY;
            case 9:
                return ein.TRAIN_DOWNLOAD_STARTED;
            case 10:
                return ein.TRAIN_UPLOAD_STARTED;
            case 11:
                return ein.TRAIN_ELIGIBILITY_EVAL_DOWNLOAD_STARTED;
            case 12:
                return ein.TRAIN_ELIGIBILITY_EVAL_PLAN_URI_RECEIVED;
            case 13:
                return ein.TRAIN_ELIGIBILITY_EVAL_PLAN_RECEIVED;
            case 14:
                return ein.TRAIN_ELIGIBILITY_EVAL_NOT_CONFIGURED;
            case 15:
                return ein.TRAIN_ELIGIBILITY_EVAL_TURNED_AWAY;
            case 16:
                return ein.TRAIN_ELIGIBILITY_EVAL_DOWNLOAD_ERROR_IO;
            case 17:
                return ein.TRAIN_ELIGIBILITY_EVAL_DOWNLOAD_ERROR_INVALID_PAYLOAD;
            case 18:
                return ein.TRAIN_ELIGIBILITY_EVAL_DOWNLOAD_CLIENT_INTERRUPTED;
            case AIFeature.Type.IMAGE_DESCRIPTION /* 19 */:
                return ein.TRAIN_ELIGIBILITY_EVAL_DOWNLOAD_SERVER_ABORTED;
            case 20:
                return ein.TRAIN_DOWNLOAD_ERROR_IO;
            case 21:
                return ein.TRAIN_DOWNLOAD_ERROR_INVALID_PAYLOAD;
            case 22:
                return ein.TRAIN_DOWNLOAD_CLIENT_INTERRUPTED;
            case 23:
                return ein.TRAIN_DOWNLOAD_SERVER_ABORTED;
            case 24:
                return ein.TRAIN_DOWNLOAD_PLAN_URI_RECEIVED;
            case 25:
                return ein.TRAIN_DOWNLOAD_PLAN_RECEIVED;
            case 26:
                return ein.TRAIN_DOWNLOAD_TURNED_AWAY;
            case 27:
                return ein.TRAIN_ELIGIBILITY_EVAL_COMPUTATION_STARTED;
            case 28:
                return ein.TRAIN_ELIGIBILITY_EVAL_COMPUTATION_ERROR_TENSORFLOW;
            case 29:
                return ein.TRAIN_ELIGIBILITY_EVAL_COMPUTATION_ERROR_IO;
            case 30:
                return ein.TRAIN_ELIGIBILITY_EVAL_COMPUTATION_ERROR_INVALID_ARGUMENT;
            case 31:
                return ein.TRAIN_ELIGIBILITY_EVAL_COMPUTATION_ERROR_EXAMPLE_ITERATOR;
            case 32:
                return ein.TRAIN_ELIGIBILITY_EVAL_COMPUTATION_CLIENT_INTERRUPTED;
            case 33:
                return ein.TRAIN_ELIGIBILITY_EVAL_COMPUTATION_COMPLETED;
            case 34:
                return ein.TRAIN_COMPUTATION_STARTED;
            case 35:
                return ein.TRAIN_COMPUTATION_ERROR_TENSORFLOW;
            case 36:
                return ein.TRAIN_COMPUTATION_ERROR_IO;
            case 37:
                return ein.TRAIN_COMPUTATION_ERROR_INVALID_ARGUMENT;
            case 38:
                return ein.TRAIN_COMPUTATION_ERROR_EXAMPLE_ITERATOR;
            case 39:
                return ein.TRAIN_COMPUTATION_CLIENT_INTERRUPTED;
            case 40:
                return ein.TRAIN_COMPUTATION_COMPLETED;
            case 41:
                return ein.TRAIN_RESULT_UPLOAD_STARTED;
            case 42:
                return ein.TRAIN_RESULT_UPLOAD_ERROR_IO;
            case 43:
                return ein.TRAIN_RESULT_UPLOAD_CLIENT_INTERRUPTED;
            case 44:
                return ein.TRAIN_RESULT_UPLOAD_SERVER_ABORTED;
            case 45:
                return ein.TRAIN_RESULT_UPLOADED;
            case 46:
                return ein.TRAIN_FAILURE_UPLOAD_STARTED;
            case 47:
                return ein.TRAIN_FAILURE_UPLOAD_ERROR_IO;
            case 48:
                return ein.TRAIN_FAILURE_UPLOAD_CLIENT_INTERRUPTED;
            case 49:
                return ein.TRAIN_FAILURE_UPLOAD_SERVER_ABORTED;
            case 50:
                return ein.TRAIN_FAILURE_UPLOADED;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(atsVar))));
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    public aub(byte[] bArr) {
        this();
    }
}
