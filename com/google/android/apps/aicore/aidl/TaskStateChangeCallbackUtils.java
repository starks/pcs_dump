package com.google.android.apps.aicore.aidl;

import android.os.Bundle;
import com.google.android.apps.aicore.aidl.ITaskStateChangeCallback;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class TaskStateChangeCallbackUtils {
    private static final String INFERENCE_PROGRESS_KEY = "inference_progress";
    private static final String TASK_STATE_BUNDLE_KEY = "task_state";

    private TaskStateChangeCallbackUtils() {
    }

    public static ITaskStateChangeCallback.Stub createTaskStateChangeCallback(final Consumer consumer) {
        return new ITaskStateChangeCallback.Stub() { // from class: com.google.android.apps.aicore.aidl.TaskStateChangeCallbackUtils.1
            @Override // com.google.android.apps.aicore.aidl.ITaskStateChangeCallback
            public void onInferenceProgress(float f) {
                Bundle bundle = new Bundle();
                bundle.putFloat(TaskStateChangeCallbackUtils.INFERENCE_PROGRESS_KEY, f);
                consumer.accept(bundle);
            }

            @Override // com.google.android.apps.aicore.aidl.ITaskStateChangeCallback
            public void onTaskStateChange(int i) {
                Bundle bundle = new Bundle();
                bundle.putInt(TaskStateChangeCallbackUtils.TASK_STATE_BUNDLE_KEY, i);
                consumer.accept(bundle);
            }
        };
    }

    public static void forwardOnDeviceTaskStateChangeCallbackResults(ITaskStateChangeCallback iTaskStateChangeCallback, Bundle bundle) {
        if (bundle.containsKey(TASK_STATE_BUNDLE_KEY)) {
            iTaskStateChangeCallback.onTaskStateChange(bundle.getInt(TASK_STATE_BUNDLE_KEY));
        }
        if (bundle.containsKey(INFERENCE_PROGRESS_KEY)) {
            iTaskStateChangeCallback.onInferenceProgress(bundle.getFloat(INFERENCE_PROGRESS_KEY));
        }
    }
}
