package defpackage;

import com.google.android.apps.aicore.aidl.AIFeature;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum ats implements eff {
    TRAIN_UNDEFINED(0),
    TRAIN_STARTED(1),
    TRAIN_COMPLETED(2),
    TRAIN_INTERRUPTED(4),
    TRAIN_ERROR(8),
    TRAIN_NOT_STARTED(10),
    TRAIN_DOWNLOADED(12),
    TRAIN_UPLOADED(13),
    TRAIN_TURNED_AWAY(14),
    TRAIN_DOWNLOAD_STARTED(15),
    TRAIN_UPLOAD_STARTED(16),
    TRAIN_ELIGIBILITY_EVAL_DOWNLOAD_STARTED(17),
    TRAIN_ELIGIBILITY_EVAL_PLAN_URI_RECEIVED(55),
    TRAIN_ELIGIBILITY_EVAL_PLAN_RECEIVED(18),
    TRAIN_ELIGIBILITY_EVAL_NOT_CONFIGURED(19),
    TRAIN_ELIGIBILITY_EVAL_TURNED_AWAY(20),
    TRAIN_ELIGIBILITY_EVAL_DOWNLOAD_ERROR_IO(21),
    TRAIN_ELIGIBILITY_EVAL_DOWNLOAD_ERROR_INVALID_PAYLOAD(22),
    TRAIN_ELIGIBILITY_EVAL_DOWNLOAD_CLIENT_INTERRUPTED(23),
    TRAIN_ELIGIBILITY_EVAL_DOWNLOAD_SERVER_ABORTED(24),
    TRAIN_DOWNLOAD_ERROR_IO(25),
    TRAIN_DOWNLOAD_ERROR_INVALID_PAYLOAD(26),
    TRAIN_DOWNLOAD_CLIENT_INTERRUPTED(27),
    TRAIN_DOWNLOAD_SERVER_ABORTED(28),
    TRAIN_DOWNLOAD_PLAN_URI_RECEIVED(56),
    TRAIN_DOWNLOAD_PLAN_RECEIVED(29),
    TRAIN_DOWNLOAD_TURNED_AWAY(30),
    TRAIN_ELIGIBILITY_EVAL_COMPUTATION_STARTED(31),
    TRAIN_ELIGIBILITY_EVAL_COMPUTATION_ERROR_TENSORFLOW(32),
    TRAIN_ELIGIBILITY_EVAL_COMPUTATION_ERROR_IO(33),
    TRAIN_ELIGIBILITY_EVAL_COMPUTATION_ERROR_INVALID_ARGUMENT(34),
    TRAIN_ELIGIBILITY_EVAL_COMPUTATION_ERROR_EXAMPLE_ITERATOR(35),
    TRAIN_ELIGIBILITY_EVAL_COMPUTATION_CLIENT_INTERRUPTED(36),
    TRAIN_ELIGIBILITY_EVAL_COMPUTATION_COMPLETED(37),
    TRAIN_COMPUTATION_STARTED(38),
    TRAIN_COMPUTATION_ERROR_TENSORFLOW(39),
    TRAIN_COMPUTATION_ERROR_IO(40),
    TRAIN_COMPUTATION_ERROR_INVALID_ARGUMENT(41),
    TRAIN_COMPUTATION_ERROR_EXAMPLE_ITERATOR(42),
    TRAIN_COMPUTATION_CLIENT_INTERRUPTED(43),
    TRAIN_COMPUTATION_COMPLETED(44),
    TRAIN_RESULT_UPLOAD_STARTED(45),
    TRAIN_RESULT_UPLOAD_ERROR_IO(46),
    TRAIN_RESULT_UPLOAD_CLIENT_INTERRUPTED(47),
    TRAIN_RESULT_UPLOAD_SERVER_ABORTED(48),
    TRAIN_RESULT_UPLOADED(49),
    TRAIN_FAILURE_UPLOAD_STARTED(50),
    TRAIN_FAILURE_UPLOAD_ERROR_IO(51),
    TRAIN_FAILURE_UPLOAD_CLIENT_INTERRUPTED(52),
    TRAIN_FAILURE_UPLOAD_SERVER_ABORTED(53),
    TRAIN_FAILURE_UPLOADED(54);

    public final int Z;

    ats(int i) {
        this.Z = i;
    }

    public static ats b(int i) {
        if (i == 0) {
            return TRAIN_UNDEFINED;
        }
        if (i == 1) {
            return TRAIN_STARTED;
        }
        if (i == 2) {
            return TRAIN_COMPLETED;
        }
        if (i == 4) {
            return TRAIN_INTERRUPTED;
        }
        if (i == 8) {
            return TRAIN_ERROR;
        }
        if (i == 10) {
            return TRAIN_NOT_STARTED;
        }
        switch (i) {
            case 12:
                return TRAIN_DOWNLOADED;
            case 13:
                return TRAIN_UPLOADED;
            case 14:
                return TRAIN_TURNED_AWAY;
            case 15:
                return TRAIN_DOWNLOAD_STARTED;
            case 16:
                return TRAIN_UPLOAD_STARTED;
            case 17:
                return TRAIN_ELIGIBILITY_EVAL_DOWNLOAD_STARTED;
            case 18:
                return TRAIN_ELIGIBILITY_EVAL_PLAN_RECEIVED;
            case AIFeature.Type.IMAGE_DESCRIPTION /* 19 */:
                return TRAIN_ELIGIBILITY_EVAL_NOT_CONFIGURED;
            case 20:
                return TRAIN_ELIGIBILITY_EVAL_TURNED_AWAY;
            case 21:
                return TRAIN_ELIGIBILITY_EVAL_DOWNLOAD_ERROR_IO;
            case 22:
                return TRAIN_ELIGIBILITY_EVAL_DOWNLOAD_ERROR_INVALID_PAYLOAD;
            case 23:
                return TRAIN_ELIGIBILITY_EVAL_DOWNLOAD_CLIENT_INTERRUPTED;
            case 24:
                return TRAIN_ELIGIBILITY_EVAL_DOWNLOAD_SERVER_ABORTED;
            case 25:
                return TRAIN_DOWNLOAD_ERROR_IO;
            case 26:
                return TRAIN_DOWNLOAD_ERROR_INVALID_PAYLOAD;
            case 27:
                return TRAIN_DOWNLOAD_CLIENT_INTERRUPTED;
            case 28:
                return TRAIN_DOWNLOAD_SERVER_ABORTED;
            case 29:
                return TRAIN_DOWNLOAD_PLAN_RECEIVED;
            case 30:
                return TRAIN_DOWNLOAD_TURNED_AWAY;
            case 31:
                return TRAIN_ELIGIBILITY_EVAL_COMPUTATION_STARTED;
            case 32:
                return TRAIN_ELIGIBILITY_EVAL_COMPUTATION_ERROR_TENSORFLOW;
            case 33:
                return TRAIN_ELIGIBILITY_EVAL_COMPUTATION_ERROR_IO;
            case 34:
                return TRAIN_ELIGIBILITY_EVAL_COMPUTATION_ERROR_INVALID_ARGUMENT;
            case 35:
                return TRAIN_ELIGIBILITY_EVAL_COMPUTATION_ERROR_EXAMPLE_ITERATOR;
            case 36:
                return TRAIN_ELIGIBILITY_EVAL_COMPUTATION_CLIENT_INTERRUPTED;
            case 37:
                return TRAIN_ELIGIBILITY_EVAL_COMPUTATION_COMPLETED;
            case 38:
                return TRAIN_COMPUTATION_STARTED;
            case 39:
                return TRAIN_COMPUTATION_ERROR_TENSORFLOW;
            case 40:
                return TRAIN_COMPUTATION_ERROR_IO;
            case 41:
                return TRAIN_COMPUTATION_ERROR_INVALID_ARGUMENT;
            case 42:
                return TRAIN_COMPUTATION_ERROR_EXAMPLE_ITERATOR;
            case 43:
                return TRAIN_COMPUTATION_CLIENT_INTERRUPTED;
            case 44:
                return TRAIN_COMPUTATION_COMPLETED;
            case 45:
                return TRAIN_RESULT_UPLOAD_STARTED;
            case 46:
                return TRAIN_RESULT_UPLOAD_ERROR_IO;
            case 47:
                return TRAIN_RESULT_UPLOAD_CLIENT_INTERRUPTED;
            case 48:
                return TRAIN_RESULT_UPLOAD_SERVER_ABORTED;
            case 49:
                return TRAIN_RESULT_UPLOADED;
            case 50:
                return TRAIN_FAILURE_UPLOAD_STARTED;
            case 51:
                return TRAIN_FAILURE_UPLOAD_ERROR_IO;
            case 52:
                return TRAIN_FAILURE_UPLOAD_CLIENT_INTERRUPTED;
            case 53:
                return TRAIN_FAILURE_UPLOAD_SERVER_ABORTED;
            case 54:
                return TRAIN_FAILURE_UPLOADED;
            case 55:
                return TRAIN_ELIGIBILITY_EVAL_PLAN_URI_RECEIVED;
            case 56:
                return TRAIN_DOWNLOAD_PLAN_URI_RECEIVED;
            default:
                return null;
        }
    }

    @Override // defpackage.eff
    public final int a() {
        return this.Z;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.Z);
    }
}
