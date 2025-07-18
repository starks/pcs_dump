package com.google.android.apps.miphone.astrea.common.broadcastreceivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.czl;
import defpackage.czn;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class BootCompletedBroadcastReceiver extends BroadcastReceiver {
    private static final czn a = czn.j("com/google/android/apps/miphone/astrea/common/broadcastreceivers/BootCompletedBroadcastReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        ((czl) ((czl) a.c()).i("com/google/android/apps/miphone/astrea/common/broadcastreceivers/BootCompletedBroadcastReceiver", "onReceive", 27, "BootCompletedBroadcastReceiver.java")).r("Received intent: %s", action);
    }
}
